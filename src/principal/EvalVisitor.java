package principal;

import antlrGenerateFiles.PostSQLBaseVisitor;
import antlrGenerateFiles.PostSQLParser;
import fileManagement.Manejador;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import java.util.ArrayList;
import java.util.Optional;

public class EvalVisitor extends PostSQLBaseVisitor<String>{

    public Manejador manejador  = new Manejador("master");
    public String error = "";
    public String log = "";
    public String verbose = "";
    public boolean verboseEnable =  false;

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
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("User Confirmation");
            alert.setHeaderText("Drop \""+ctx.ID().getText()+"\" database?");
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
            verbose += "Show Databases displayed succesfully";
        }
        return log += "Show done succesfully";

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
        String id = ctx.ID().getText();
        ArrayList<String> encabezados = new ArrayList<>();
        ArrayList<String> tipos = new ArrayList<>();
        ArrayList<String> pk = new ArrayList<>();
        ArrayList<String> fk = new ArrayList<>();
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
        return super.visitPrimaryKeyDeclConstr(ctx);
    }

    @Override
    public String visitForeignKeyDeclConstr(PostSQLParser.ForeignKeyDeclConstrContext ctx) {
        return super.visitForeignKeyDeclConstr(ctx);
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


    @Override public String visitRenameTable(PostSQLParser.RenameTableContext ctx) {
        String idTabla = ctx.ID().getText();

        if(manejador.getCurrentDB()!=null){
            String idDb = manejador.getCurrentDB();
            if(manejador.getASpecificDb(idDb).getNombresDeTablas().contains(idTabla)){


            }
            else{
                return error+="Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+ ".Table \""+ctx.ID().getText()+"\". doesn't exist!-\n";
            }
        }
        else{
            return error += "Error in line:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+ ". \""+ctx.ID().getText()+"\". No Database selected yet!-\n";
        }

        return visitChildren(ctx);
    }


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

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}