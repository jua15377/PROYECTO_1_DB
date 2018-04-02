package principal;

import antlrGenerateFiles.PostSQLBaseVisitor;
import antlrGenerateFiles.PostSQLParser;
import fileManagement.BaseDeDatos;
import fileManagement.FolderManager;
import fileManagement.Manejador;
import fileManagement.Tabla;
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
        if(!nombres.contains(id)){
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

        else if(manejador.getDbsNames().contains(idNuevo)){
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
        String id = ctx.ID().getText();

        String result = visit(ctx.columDeclaration());
        if(result.contains(",")){
            String [] parametros = result.split(",");
            for (String s : parametros){
                //parte 0 = tipo  parte1 = id
                if(s.contains("INT")){
                    encabezados.add(s.substring(0,s.length()-3));
                    tipos.add("int");
                }
                else if(s.contains("CHAR")){
                    encabezados.add(s.substring(0,s.length()-4));
                    tipos.add("char");
                }
                else if(s.contains("FLOAT")){
                    encabezados.add(s.substring(0,s.length()-5));
                    tipos.add("float");
                }
                else if(s.contains("DATE")){
                    encabezados.add(s.substring(0,s.length()-4));
                    tipos.add("date");
                }
                else {
                    return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+ ". Expected INT, DATE, FLOAT or CHAR-\n";
                }

            }
        }
        else {
            //parte 0 = tipo  parte1 = id
            String[] partes = result.split(" ");
            encabezados.add(partes[1]);
            tipos.add(partes[0]);
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
                }else if(ctx.constraints(i).getText().contains("CHECK")){

                }else{

                }
            }
        }
        if(manejador.getCurrentDB()!=null){
            String idDb= manejador.getCurrentDB();
            if(!manejador.getASpecificDb(idDb).getNombresDeTablas().contains(id)) {
                manejador.getASpecificDb(idDb).createTable(id, encabezados, tipos, pk, fk);
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
            for (String s: manejador.getASpecificDb(idDb).getSpecificTable(id).getNombresDecolumnas()){
                log += s + "\n";
            }

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
        String idTabla = "";

        if(manejador.getCurrentDB()!=null){
            String idDb = manejador.getCurrentDB();
            if(manejador.getASpecificDb(idDb).getNombresDeTablas().contains(idTabla)){





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



    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}