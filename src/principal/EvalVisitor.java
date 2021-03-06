package principal;

import antlrGenerateFiles.PostSQLBaseVisitor;
import antlrGenerateFiles.PostSQLParser;
import fileManagement.*;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EvalVisitor extends PostSQLBaseVisitor<String>{

    public Manejador manejador  = new Manejador("master");
    public String error = "";
    public String log = "";
    public String verbose = "";
    public boolean verboseEnable =  false;
    public String currentTable = "";
    public ArrayList<String> encabezados;
    public ArrayList<String> tipos;
    public ArrayList<String> pk ;
    public ArrayList<String> fk;
    public ArrayList<String> columnsID = new ArrayList<>();
    public ArrayList<String> valuesID = new ArrayList<>();
    public ArrayList<String> selectID = new ArrayList<>();
    public ArrayList<String> AscID = new ArrayList<>();
    public ArrayList<Integer> maximo;

    /**
     * Grammar: CREATE DATABASE ID
     * Metodo para la creacion de una base de datos.**/
    @Override public String  visitInitProgramVerbose(PostSQLParser.InitProgramVerboseContext ctx) {
        verboseEnable = true;
        System.out.println("Se activo la opcion de Verbose");
        return visitChildren(ctx);
    }

    /**
     * Grammar: CREATE DATABASE ID
     * Metodo para la creacion de una base de datos.**/
    @Override public String visitSTMcreateDB(PostSQLParser.STMcreateDBContext ctx) {
        String id = ctx.ID().getText();
        ArrayList<String> nombres = manejador.getDbsNames();
        if(!nombres.contains(id) || !nombres.contains(id.toUpperCase()) || !nombres.contains(id.toLowerCase())){
            manejador.createDataBase(id);
            log += "Database \""+ctx.ID().getText()+"\" has been created succesfully!.\n";
            if(verboseEnable){
                verbose += "Base de Datos: " + id + ", creado con exito\n";
            }
        }
        else {
            return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+ ". \""+ctx.ID().getText()+"\" database already exists.\n";
        }
        return visitChildren(ctx);

    }

    /**
     * Grammar: DROP DATABASE ID
     * Metodo para la eliminacion de una base de datos.**/
    @Override public String visitSTMdropDB(PostSQLParser.STMdropDBContext ctx) {
        String id = ctx.ID().getText();
        ArrayList<String> nombres = manejador.getDbsNames();
        if(nombres.contains(id)){
            int nregistro = 0;
            for ( BaseDeDatos bd : manejador.getDbs()){
                for (Tabla t : bd.getTablas()){
                    nregistro += t.getContadorDeregistors();
                }

            }
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("User Confirmation");
            alert.setHeaderText("Drop \""+ctx.ID().getText()+"\" database with " + nregistro + "?");
            alert.setContentText("Choose your option.");
            ButtonType buttonTypeOne = new ButtonType("Yes");
            ButtonType buttonTypeCancel = new ButtonType("No");
            alert.getButtonTypes().setAll(buttonTypeOne, buttonTypeCancel);
            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == buttonTypeOne){
                // ... user chose "Drop"


                manejador.dropDatabase(id);
                log += "Database \""+ctx.ID().getText()+"\" has been dropped succesfully!.\n";
                if(verboseEnable){ verbose += "Base de Datos: " + id + ", eliminada con exito\n";}
            }

        }
        else {
            return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+ ". \""+ctx.ID().getText()+"\" database not found.\n";
        }
        return visitChildren(ctx);
    }

    /***
     * Grammar: ALTER DATABASE ID RENAME TO ID
     * Method to change the name  of one database*/
    @Override public String visitSTMalterDB(PostSQLParser.STMalterDBContext ctx) {
        String idViejo = ctx.ID(0).getText();
        String idNuevo = ctx.ID(1).getText();

        if (!manejador.getDbsNames().contains(idViejo)){
            //ERROR: No existe la base de datos inicial
            return error = "Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+
                    ". Database " + ctx.ID(0).getText()+" does not exists.\n";
        }

        else if(manejador.getDbsNames().contains(idNuevo) || manejador.getDbsNames().contains(idNuevo.toLowerCase()) || manejador.getDbsNames().contains(idNuevo.toUpperCase())){
            //Error
            return error = "Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+
                    ". Name  " + ctx.ID(1).getText()+" already in use .\n";
        }

        else{
            manejador.changeDBSname(idViejo, idNuevo);
            manejador.setCurrentDB(idNuevo);
            log += "Rename done succesfully";
            if(verboseEnable){
                 verbose += "Base de Datos: " + ctx.ID(0).getText() + " renombrada a " + ctx.ID(1).getText() +
                        "con exito\n";
            }
        }

        return visitChildren(ctx);


    }


    /**
     * Grammar: SHOW DATABASEs
     * Method to show every database in the manager**/
    @Override public String visitSTMshowDB(PostSQLParser.STMshowDBContext ctx) {
        log += "Active Databases: \n";
        for (String s: manejador.getDbsNames()){
            log += s + "\n";
        }
        if (verboseEnable){
            verbose += "Show Databases displayed succesfully\n";
        }
        return log += "Show done succesfully\n";

    }

    /**
     * Grammar: USE DATABASE ID
     * Method to change DataBase currently in use to a different one**/
    @Override public String visitSTMuseDB(PostSQLParser.STMuseDBContext ctx) {
        String id = ctx.ID().getText();
        ArrayList<String> nombres = manejador.getDbsNames();
        if(nombres.contains(id)){
            if (manejador.getCurrentDB()!= null) {
                if (manejador.getCurrentDB().equals(id)) {
                    log += "Database \"" + ctx.ID().getText() + "\" already in use!.\n";
                }
            }
            manejador.setCurrentDB(id);
            log += "Database \""+ctx.ID().getText()+"\" in use!.\n";
            if(verboseEnable){ verbose += "Base de Datos: " + id + ", eliminada con exito\n";}
        }
        else {
            return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+ ". \""+ctx.ID().getText()+"\". Not found!-\n";
        }
        return visitChildren(ctx);
    }
    /**
     * Gramar: CREATE TABLE ID ( columnDeclaration constraints*)
     * Method to create a fully flexed table to use, inside a specficic DataBase**/
    @Override public String visitSTMcreateTable(PostSQLParser.STMcreateTableContext ctx) {
        encabezados =   new ArrayList<>();
        tipos =new ArrayList<>();
        pk = new ArrayList<>();
        fk = new ArrayList<>();
        maximo = new ArrayList<>();
        String id = ctx.ID().getText();

        String result = visit(ctx.columDeclaration());
        if(result.contains(",")){
            String [] parametros = result.split(",");
            for (String s : parametros){
                //parte 0 = tipo  parte1 = id
                if(s.contains("INT")){
                    encabezados.add(s.substring(0,s.length()-3));
                    tipos.add("int");
                    maximo.add(-1);
                }
                else if(s.contains("CHAR")){
                    int indicedeChar  = s.indexOf("CHAR(");
                    encabezados.add(s.substring(0,indicedeChar));
                    tipos.add("char");
                    String cant =  s.substring(s.indexOf("(")+1,s.indexOf(")"));
                    maximo.add(Integer.parseInt(cant));
                }
                else if(s.contains("FLOAT")){
                    encabezados.add(s.substring(0,s.length()-5));
                    tipos.add("float");
                    maximo.add(-1);
                }
                else if(s.contains("DATE")){
                    encabezados.add(s.substring(0,s.length()-4));
                    tipos.add("date");
                    maximo.add(10);
                }
                else {
                    return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+ ". Expected INT, DATE, FLOAT or CHAR-\n";
                }

            }
        }
        else {
            //parte 0 = tipo  parte1 = id
            if(result.contains("INT")){
                encabezados.add(result.substring(0,result.length()-3));
                tipos.add("int");
                maximo.add(-1);
            }
            else if(result.contains("CHAR")){
                int indicedeChar  = result.indexOf("CHAR(");
                encabezados.add(result.substring(0,indicedeChar));
                tipos.add("char");
                String cant =  result.substring(result.indexOf("(")+1,result.indexOf(")"));
                maximo.add(Integer.parseInt(cant));
            }
            else if(result.contains("FLOAT")){
                encabezados.add(result.substring(0,result.length()-5));
                tipos.add("float");
                maximo.add(-1);
            }
            else if(result.contains("DATE")){
                encabezados.add(result.substring(0,result.length()-4));
                tipos.add("date");
                maximo.add(10);
            }
            else {
                return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+ ". Expected INT, DATE, FLOAT or CHAR-\n";
            }
        }

        //Checking if it has constraints
        int cantC = ctx.constraints().size();
        if(cantC!=0){
            for(int i=0; i<cantC;i++){
                if(ctx.constraints(i).getText().contains("PRIMARY")){
                    String primarykeys = visit(ctx.constraints(i));
                    String[] pks = primarykeys.split(", ");
                    for (int j=0;j<pks.length;j++) {
                        System.out.println(pks[j]);
                        if(!encabezados.contains(pks[j]) && j!=0){
                            return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+". Column \""+pks[j]+"\" is not defined.\n";
                        }else{
                            pk.add(pks[j]);
                        }
                    }
                }else if(ctx.constraints(i).getText().contains("FOREIGN")){
                    //String foreignkeys
                    String foreignKeys = visit(ctx.constraints(i));
                    String[] fks = foreignKeys.split(", ");
                    for (int j=0;j<fks.length;j++) {
                        System.out.println(fks[j]);
                            fk.add(fks[j]);

                    }
                }else if(ctx.constraints(i).getText().contains("CHECK")){

                }else{

                }
            }
        }
        if(manejador.getCurrentDB()!=null){
            String idDb= manejador.getCurrentDB();
            if(!manejador.getASpecificDb(idDb).getNombresDeTablas().contains(id)) {
                manejador.getASpecificDb(idDb).createTable(id, encabezados, tipos, pk, fk, maximo);
                log += "Table \"" + ctx.ID().getText() + "\" created succesfully!.\n";
                if (verboseEnable) {
                    verbose += "la tabla: " + id + ", fue creada con exito\n";
                }
            }
            else {
                return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+ ".Table+ \""+ctx.ID().getText()+"\". already exist!-\n";

            }
        }
        else {
            return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+ ". \""+ctx.ID().getText()+"\". No Database selected yet!-\n";
        }

        return visitChildren(ctx);
    }

    @Override
    public String visitMultipleColumn(PostSQLParser.MultipleColumnContext ctx) {
        visitChildren(ctx);
        return ctx.getText();
    }

    @Override
    public String visitPrimaryKeyDeclConstr(PostSQLParser.PrimaryKeyDeclConstrContext ctx) {
        int cantID = ctx.ID().size();
        String text = "";
        if(cantID!=0){
            for(int i=0; i<cantID;i++){
                System.out.println(ctx.ID().get(i));
                text+=ctx.ID().get(i)+", ";
            }
        }
        visitChildren(ctx);
        return text;
    }

    @Override
    public String visitForeignKeyDeclConstr(PostSQLParser.ForeignKeyDeclConstrContext ctx) {
        //Creating the string that will contain all of the info for the foreign keys
        String text = "";

        int cantID = ctx.ID().size();
        int c = (cantID/2)-1;

        //Creating two new List of terminal nodes that will store the name of a foreign key and table in which belongs.
        List<TerminalNode> fkeys = null;
        List<TerminalNode> fTable = null;

        //Checking that the amount of ID so it is even.
        if(cantID%2==0 && cantID>2){
            text+=ctx.ID().get(0)+", ";

            //Getting the name of the table referencing the Foreign key.
            String tableReference = ctx.ID((cantID/2)).getText();

            //Getting the currentDB thats being checked.
            BaseDeDatos currentDB = null;
            currentDB = manejador.getASpecificDb(manejador.getCurrentDB());

            //Tables of the current database
            ArrayList<String> tableNames = currentDB.getNombresDeTablas();
            ArrayList<String> namesOfCurrentTable = new ArrayList<>();
            ArrayList<String> namesOfReferencedTable = new ArrayList<>();
            ArrayList<String> typesOfCurrentTable = new ArrayList<>();
            ArrayList<String> typesOfReferencedTable = new ArrayList<>();

            if(tableNames.contains(tableReference)){
                Tabla referencedTable = null;
                //Getting the referenced table
                for (Tabla t:currentDB.getTablas()) {
                    if(t.getName().equals(tableReference)){
                        referencedTable=t;
                    }
                }
                //Getting the primary keys of that table
                for(int i=1; i<(cantID/2);i++){
                    if(encabezados.contains(ctx.ID(i).getText())){
                        int pkLocation = encabezados.indexOf(ctx.ID(i).getText());
                        typesOfCurrentTable.add(tipos.get(pkLocation));
                        namesOfCurrentTable.add(ctx.ID(i).getText());
                    }else{
                        return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+ ". Primary key \""+ ctx.ID(i).getText()+"\" not found.\n";
                    }
                }
                ArrayList<String> pkOfTable = referencedTable.getPk();
                for(int i=(cantID/2)+1; i<cantID;i++){
                    if(pkOfTable.contains(ctx.ID(i).getText())){
                        int pkLocation = referencedTable.getNombresDecolumnas().indexOf(ctx.ID(i).getText());
                        typesOfReferencedTable.add(referencedTable.getTiposDecolumnas().get(pkLocation));
                        namesOfReferencedTable.add(ctx.ID(i).getText());
                    }else{
                        return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+ ". Primary key \""+ ctx.ID(i).getText()+"\" not found.\n";
                    }
                }

                for (int i=0;i<typesOfCurrentTable.size();i++){
                    if(typesOfCurrentTable.get(i).equals(typesOfReferencedTable.get(i))){
                        text+=namesOfCurrentTable+", ";
                    }else{
                        return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+ ". Mismatch of types in ID given. \""+ namesOfCurrentTable.get(i)+"\" is type "+typesOfCurrentTable.get(i)+", \""+namesOfReferencedTable.get(i)+"\" is type "+typesOfReferencedTable.get(i)+".\n";
                    }
                }
            }else{
                return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+ ". Table \""+ tableReference+"\" not found.\n";
            }
        }else{
            return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+ ". Expected "+c+" foreign keys and "+c+" tables\n";
        }
        visitChildren(ctx);
        return text;
    }

    @Override
    public String visitCheckDeclConstr(PostSQLParser.CheckDeclConstrContext ctx) {
        return super.visitCheckDeclConstr(ctx);
    }

    @Override
    public String visitExpDecl(PostSQLParser.ExpDeclContext ctx) {
        return super.visitExpDecl(ctx);
    }

    //boolean es float
    @Override
    public String visitVarfloat(PostSQLParser.VarfloatContext ctx) {
        return "float";
    }

    @Override
    public String visitVarchar(PostSQLParser.VarcharContext ctx) {
        return "char";
    }

    @Override
    public String visitVarint(PostSQLParser.VarintContext ctx) {
        return "int";
    }

    /**
     * Grammar: DROP TABLE ID
     * Method to eliminate a table in a certain DataBase**/
    @Override public String visitSTMdropTable(PostSQLParser.STMdropTableContext ctx) {
        String id = ctx.ID().getText();
        if(manejador.getCurrentDB()!=null){
            String idDb= manejador.getCurrentDB();
            if(manejador.getASpecificDb(idDb).getNombresDeTablas().contains(id)) {
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("User Confirmation");
                alert.setHeaderText("Drop \""+ctx.ID().getText()+"\" table from " + idDb + "?");
                alert.setContentText("Choose your option.");
                ButtonType buttonTypeOne = new ButtonType("Yes");
                ButtonType buttonTypeCancel = new ButtonType("No");
                alert.getButtonTypes().setAll(buttonTypeOne, buttonTypeCancel);
                Optional<ButtonType> result = alert.showAndWait();
                if (result.get() == buttonTypeOne) {
                    //borra la tabla
                    manejador.getASpecificDb(idDb).dropTable(id);
                    log += "Table \"" + ctx.ID().getText() + "\" deleted succesfully!.\n";
                    if (verboseEnable) {
                        verbose += "la tabla: " + id + ", fue creada con exito\n";
                    }
                }
            }
            else {
                return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+ ".Table \""+ctx.ID().getText()+"\". doesn't exist!-\n";

            }
        }
        else {
            return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+ ". \""+ctx.ID().getText()+"\". No Database selected yet!-\n";
        }
        return visitChildren(ctx);
    }


    /***
     * Grammar: ALTER TABLE ID alter_action_table
     * alter_action_table: RENAME TO ID
     * Method to rename a table of a specific DataBase*/

    @Override public String visitRenameTable(PostSQLParser.RenameTableContext ctx) {
        String idTabla = ctx.ID().getText();

        if(manejador.getCurrentDB()!=null){
            String idDb = manejador.getCurrentDB();
            if(manejador.getASpecificDb(idDb).getNombresDeTablas().contains(currentTable)){
                manejador.getASpecificDb(idDb).renameTable(currentTable, idTabla);
                log += "Table \"" + currentTable + "\" renamed succesfully!.\n";
                if (verboseEnable) {
                    verbose += "La tabla: " + currentTable + ", fue renombrada a " + idTabla+ " con exito!\n";
                }
                currentTable = idTabla;
            }
            else{
                return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+ ".Table \""+currentTable+"\". doesn't exist!-\n";
            }
        }
        else{
            return error += "Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+ ". \""+ctx.ID().getText()+"\". No Database selected yet!-\n";
        }

        return visitChildren(ctx);
    }


    
    /**
     * Grammar: SHOW TABLES
     * Method to show every table from a specific DataBase
     * **/
    @Override
    public String visitSTMshowTable(PostSQLParser.STMshowTableContext ctx) {
        //que este seteada la base de datos
        if(manejador.getCurrentDB()!=null){
            String idDb= manejador.getCurrentDB();
            log += "Tables from "+idDb + ":\n";
            for (String s: manejador.getASpecificDb(idDb).getNombresDeTablas()){
                log += s + "\n";
            }

            if (verboseEnable) { verbose += "Mostrando las tablas de la base de datos" + manejador.getCurrentDB(); }
        }
        else {
            return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+ ". No Database selected yet!-\n";
        }
        return super.visitSTMshowTable(ctx);
    }

    /***
     * Grammar: ALTER TABLE ID alter_action_table
     * alter_action_table: ADD COLUMN ID varType constraints*
     * Method to add a new column with possible constraints to a table*/
    @Override
    public String visitAddColumn(PostSQLParser.AddColumnContext ctx) {
        String idColumn = ctx.ID().getText();

        if(manejador.getCurrentDB()!=null){
            String idDb = manejador.getCurrentDB();
            int indexTabla = manejador.getASpecificDb(idDb).getNombresDeTablas().indexOf(currentTable);
            Tabla tablaRefeerncia = manejador.getASpecificDb(idDb).getTablas().get(indexTabla);
            //If que revisara si ya existe el nombre de la columna en la tabla
            if(!tablaRefeerncia.getNombresDecolumnas().contains(ctx.ID().getText())){
                //Si no existe la columna
                String type = ctx.varType().getText();
                tablaRefeerncia.getNombresDecolumnas().add(idColumn);
                tablaRefeerncia.getTiposDecolumnas().add(type);

                //Revisa Constraints
                int numero = ctx.getChildCount();

                //Se hara siempre y cuando exista al menos 1 constraint
                if(numero > 4) {
                    //Por cada uno de los constraints encontrados
                    for (int i = 4; i < numero - 1; i++) {
                        /**
                         * AQUI VISITRARA A CADA CONSTRAINT
                         * POR CADA UNO QUE EXISTA**/
                        visit(ctx.getChild(i));
                    }
                }
                FolderManager.actualizarArchivo(manejador.getCurrentDB(), tablaRefeerncia);
                log += "Added column succesfully!\n";
                if(verboseEnable){
                    verbose += "Columna " + ctx.ID().getText() + " agregada existosamente en tabla " + currentTable + "\n";
                }
            }
            else{
                return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+ ".Column \""+ctx.ID().getText()+"\". already exists!-\n";
            }
        }
        else{
            return error += "Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+ ". \""+ctx.ID().getText()+"\". No Database selected yet!-\n";
        }

        return visitChildren(ctx);
    }

    /***
     * Grammar: ALTER TABLE ID alter_action_table
     * alter_action_table: ADD constraints*
     * Method to add a new constraint to the table*/
    @Override
    public String visitAddConstraints(PostSQLParser.AddConstraintsContext ctx) {
        int numeroConstraints = ctx.getChildCount();

        for(int i = 1; i< numeroConstraints; i++){
            String identificador = ctx.getChild(i).getChild(1).getText();
            if(identificador == "PK_"){
                /**
                 *VisitarConstraint
                 **/

            }
            else if(identificador == "FK_"){
                /**
                 *VisitarConstraint
                 **/
            }
            else{
                /**
                 *VisitarConstraint
                 **/

            }
        }
        return super.visitAddConstraints(ctx);
    }

    /***
     * Grammar: ALTER TABLE ID alter_action_table
     * alter_action_table: DROP COLUMN ID
     * Method to eliminate a column from a certain table*/
    @Override
    public String visitDropColumn(PostSQLParser.DropColumnContext ctx) {
        String idColumn = ctx.ID().getText();

        if(manejador.getCurrentDB()!=null){
            String idDb = manejador.getCurrentDB();
            int indexTabla = manejador.getASpecificDb(idDb).getNombresDeTablas().indexOf(currentTable);
            Tabla tablaReferncia = manejador.getASpecificDb(idDb).getTablas().get(indexTabla);
            //If que revisara si ya existe el nombre de la columna en la tabla
            if(tablaReferncia.getNombresDecolumnas().contains(idColumn)){
                //Si existe la columna

                int indexColumn = tablaReferncia.getNombresDecolumnas().indexOf(idColumn);
                tablaReferncia.getTiposDecolumnas().remove(indexColumn);
                tablaReferncia.getNombresDecolumnas().remove(indexColumn);

                FolderManager.actualizarArchivo(manejador.getCurrentDB(), tablaReferncia);
                log += "Column eliminated succesfully!\n";
                if(verboseEnable){
                    verbose += "Columna " + ctx.ID().getText() + " eliminada existosamente en tabla " + currentTable + "\n";
                }
            }
            else{
                return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+ ".Column \""+ctx.ID().getText()+"\". doesn't exists!-\n";
            }
        }
        else{
            return error += "Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+ ". \""+ctx.ID().getText()+"\". No Database selected yet!-\n";
        }

        return visitChildren(ctx);
    }

    /**
     * Grammar: ALTER TABLE ID action_alter_table
     * Method that allows the modification on certain table**/
    @Override
    public String visitSTMalterTable(PostSQLParser.STMalterTableContext ctx) {
        currentTable = ctx.ID().getText();
        return super.visitSTMalterTable(ctx);
    }

    /***
     * Grammar: SHOW COLUMNS FROM ID
     * Method to show every column in a specific table*/
    @Override
    public String visitSTMshowColumn(PostSQLParser.STMshowColumnContext ctx) {
        String id = ctx.ID().getText();
        if(manejador.getCurrentDB()!=null){
            String idDb= manejador.getCurrentDB();
            log += "Columns from "+ id + ":\n";
            log += manejador.getASpecificDb(idDb).getSpecificTable(id).getColumnsDescription();

            if (verboseEnable) { verbose += "Mostrando las tablas de la base de datos" + manejador.getCurrentDB(); }
        }
        else {
            return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+ ". No Database selected yet!-\n";
        }



        return super.visitSTMshowColumn(ctx);
    }

    /***
     * Grammar: DROP CONTRAINT ID
     * Method to eliminate a specific constraint of a table*/
    @Override
    public String visitDropConstraints(PostSQLParser.DropConstraintsContext ctx) {
        String idConstraint = ctx.ID().getText();

        if(manejador.getCurrentDB()!=null){
            String idDb = manejador.getCurrentDB();
            int indexTabla = manejador.getASpecificDb(idDb).getNombresDeTablas().indexOf(currentTable);
            Tabla tablaReferncia = manejador.getASpecificDb(idDb).getTablas().get(indexTabla);
            //If que revisara si ya existe el nombre de la columna en la tabla
            if(tablaReferncia.getPk().contains(idConstraint) | tablaReferncia.getFk().contains(idConstraint) | tablaReferncia.getCk().contains(idConstraint)){
                //buscar y eliminar el constraint, ya que existe

                if(tablaReferncia.getPk().contains(idConstraint)){
                    int indexConstraint = tablaReferncia.getPk().indexOf(idConstraint);
                    tablaReferncia.getPk().remove(indexConstraint);
                    FolderManager.actualizarArchivo(manejador.getCurrentDB(), tablaReferncia);
                }
                else if(tablaReferncia.getFk().contains(idConstraint)){
                    int indexConstraint = tablaReferncia.getFk().indexOf(idConstraint);
                    tablaReferncia.getFk().remove(indexConstraint);
                    tablaReferncia.getReferencesFK().remove(indexConstraint);
                    FolderManager.actualizarArchivo(manejador.getCurrentDB(), tablaReferncia);
                }
                else{
                    int indexContraint = tablaReferncia.getCk().indexOf(idConstraint);
                    tablaReferncia.getCk().remove(indexContraint);
                    FolderManager.actualizarArchivo(manejador.getCurrentDB(), tablaReferncia);

                }
                log += "Column eliminated succesfully!\n";
                if(verboseEnable){
                    verbose += "Constraint " + ctx.ID().getText() + " eliminada existosamente en tabla " + currentTable + "\n";
                }
            }
            else{
                return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+ ".Constraint \""+ctx.ID().getText()+"\". doesn't exists!-\n";
            }
        }
        else{
            return error += "Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+ ". \""+ctx.ID().getText()+"\". No Database selected yet!-\n";
        }

        return visitChildren(ctx);
    }

    /**
     * Grammar: inset_into
     * Method that allows the insert**/
    @Override
    public String visitSTMinsertInto(PostSQLParser.STMinsertIntoContext ctx) {
        String idTabla = ctx.ID().getText();


        if(manejador.getCurrentDB()!=null){
            String idDb = manejador.getCurrentDB();
            if(manejador.getASpecificDb(idDb).getNombresDeTablas().contains(idTabla)){
                currentTable = idTabla;
                Tabla tablaRef = manejador.getASpecificDb(idDb).getSpecificTable(currentTable);
                visit(ctx.columnsids());
                visit(ctx.valuesids());

                if(columnsID.size() >= valuesID.size()){
                    tablaRef.addRegistro(columnsID,valuesID);
                    FolderManager.actualizarArchivo(idDb,tablaRef);
                    /*int sizeColums = columnsID.size();
                    int sizeValues = valuesID.size();

                    ArrayList<String> tipoRegistros = new ArrayList<>();
                    ArrayList<String> valuesRegistros = new ArrayList<>();

                    for(String s: tablaRef.getNombresDecolumnas()){
                        if(columnsID.contains(s)){

                        }
                        else{
                            tipoRegistros.add("NULL");
                            valuesRegistros.add("NULL");
                        }
                    }*/




                }
                else{
                    return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+ ".Columns declared: " +columnsID.size()+", Values Declared: "+ valuesID.size()+". Values more than ID's!-\n";
                }



                log += "Table \"" + currentTable + "\" renamed succesfully!.\n";
                if (verboseEnable) {
                    verbose += "La tabla: " + currentTable + ", fue renombrada a " + idTabla+ " con exito!\n";
                }
            }
            else{
                return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+ ".Table \""+currentTable+"\". doesn't exist!-\n";
            }
        }
        else{
            return error += "Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+ ". \""+idTabla+"\". No Database selected yet!-\n";
        }

        return visitChildren(ctx);


    }

    /**
     * Grammar: 'INSERT' 'INTO' ID  ('(' columnsids ')')? 'VALUES' '(' valuesids')'
     * Specific: ID (',' ID)*
     * Production for columns in a table**/
    @Override
    public String visitStmcolumsid(PostSQLParser.StmcolumsidContext ctx) {
        columnsID.clear();

        /**Revisar si la cantidad de ID's es menor o igual a las columnas de la tabla**/
        Tabla tablaRef = manejador.getASpecificDb(manejador.getCurrentDB()).getSpecificTable(currentTable);
        int cantidadColumnas = tablaRef.getNombresDecolumnas().size();
        List<TerminalNode> addedColumns = ctx.ID();
        int cantidadColumnasRedactadas = addedColumns.size();
        if(cantidadColumnas >= cantidadColumnasRedactadas){

            /**Reviar si todos los ID's nombrados son columnas**/
            ArrayList<String> columasTabla = tablaRef.getNombresDecolumnas();
            boolean contenidas = true;
            ArrayList<String> noContenidas = new ArrayList<>();
            for(TerminalNode t: addedColumns){
                if(!columasTabla.contains(t.getText())){
                    contenidas = false;
                    noContenidas.add(t.getText());
                }
            }
            if(contenidas){
                columnsID = new ArrayList<>();
                List<TerminalNode> ids = ctx.ID();
                for(TerminalNode Tn: ids){
                    columnsID.add(Tn.getText());
                }

            }
            else{
                String noContenidasLiterales = "";
                for(String s: noContenidas){
                    noContenidasLiterales = noContenidasLiterales + s + "\n";
                }
                return error += "Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+ "." +
                        "Columns: " + noContenidasLiterales+" not found!-\n";
            }

        }
        else{
            return error += "Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+ ". Expected " + cantidadColumnas +" columns, recieved "+ cantidadColumnasRedactadas+" columns!-\n";
        }
        return visitChildren(ctx);
    }

    /**
     * Grammar: INSERT INTO ID ('(' columnsids ')')? 'VALUES' '(' valuesids')'
     * Specific: struct (',' struct)
     * Production to identify ID's to be added to a new register**/
    @Override
    public String visitStmvalues(PostSQLParser.StmvaluesContext ctx) {
        valuesID.clear();

        /**Revisar si la cantidad de ID's es menor o igual a las columnas de la tabla**/
        Tabla tablaRef = manejador.getASpecificDb(manejador.getCurrentDB()).getSpecificTable(currentTable);
        int cantidadColumnas = tablaRef.getNombresDecolumnas().size();
        int cantProvisional = ctx.getChildCount() -1;
        int cantStructs = (cantProvisional/2) +1;
        if(cantidadColumnas >= cantStructs){

            /**Revisar si el tipo de datos es igual a los esperados en columa**/
            for(int i = 0; i < cantidadColumnas; i++){
                String struct = ctx.struct(i).getText();
                valuesID.add(struct);
            }
        }
        else{
            return error += "Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+ ". Expected " + cantidadColumnas +" values, recieved "+ cantStructs+" values!-\n";

        }


        return visit(ctx);
    }

    /**
     * Grammar: 'DATE'
     * Production of a type dates**/
    @Override
    public String visitStructdate(PostSQLParser.StructdateContext ctx) {
        return ctx.DATE().getText();
    }

    /**
     * Grammar: FLT
     * Production of a type floats **/
    @Override
    public String visitStructflt(PostSQLParser.StructfltContext ctx) {
        return ctx.FLT().getText();
    }

    /**
     * Grammar: 'ID'
     * Production of a type Characters**/
    @Override
    public String visitStructid(PostSQLParser.StructidContext ctx) {
        return ctx.ID().getText();
    }

    /**
     * Grammar: NUM
     * Production of a type integers**/
    @Override
    public String visitStructnum(PostSQLParser.StructnumContext ctx) {
        return ctx.NUM().getText();
    }

    /**
     * Grammar  'SELECT' ('*'|ID (','ID)) 'FROM' ID 'WHERE' condicion 'ORDER' 'BY' ID ('ASC' |'DESC') (',' ID ('ASC' |'DESC'))
     * Method to select a specific piece of data if a condition is met**/
    @Override
    public String visitSTMselect(PostSQLParser.STMselectContext ctx) {
        String idTabla = ctx.ID().getText();

        if(manejador.getCurrentDB()!=null){
            String idDb = manejador.getCurrentDB();
            if(manejador.getASpecificDb(idDb).getNombresDeTablas().contains(currentTable)){
                currentTable = idTabla;
                visit(ctx.selectIds());
                visit(ctx.ascDscIds());

                Tabla tablaRef = manejador.getASpecificDb(idDb).getSpecificTable(currentTable);
                ArrayList<String> nuevasColums = new ArrayList<>();
                ArrayList<Integer> indices = new ArrayList<>();

                if(!selectID.contains("*")) {
                    for (String s : selectID) {
                        int index = tablaRef.getNombresDecolumnas().indexOf(s);
                        nuevasColums.add(tablaRef.getNombresDecolumnas().get(index));
                        indices.add(index);
                    }

                    log += nuevasColums + "\n";

                    for (int i = 0; i < tablaRef.getRegistros().size(); i++) {
                        ArrayList<String> datos = new ArrayList<>();
                        Registro prueba = tablaRef.getRegistros().get(i);
                        for (int x : indices) {
                            datos.add(prueba.valores.get(x));
                        }
                        log += datos + "\n";

                    }
                }
                else{


                }


                if (verboseEnable) {
                    verbose += "Select hecho con exito: !\n";
                }
                currentTable = idTabla;
            }
            else{
                return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+ ".Table \""+currentTable+"\". doesn't exist!-\n";
            }
        }
        else{
            return error += "Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+ ". \""+ctx.ID().getText()+"\". No Database selected yet!-\n";
        }





        return super.visitSTMselect(ctx);
    }

    /**
     * Grammar: ('*'|ID (','ID))
     * Method to separate specific ID's in select**/
    @Override
    public String visitSTMselectIDS(PostSQLParser.STMselectIDSContext ctx) {
        List<TerminalNode> temporal = ctx.ID();
        for(TerminalNode n: temporal){
            selectID.add(n.getText());
        }
        return super.visitSTMselectIDS(ctx);
    }

    /***
     * Grammar: ID ('ASC' |'DESC') (',' ID ('ASC' |'DESC'))
     * Method to separate specific ID's in select*/
    @Override
    public String visitSTMAscDscIDS(PostSQLParser.STMAscDscIDSContext ctx) {
        List<TerminalNode> temporal = ctx.ID();
        for(TerminalNode n: temporal){
            AscID.add(n.getText());
        }
        return super.visitSTMAscDscIDS(ctx);
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}