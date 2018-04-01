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
            log += "Rename done succesfully";
            if(verboseEnable){
                 verbose += "Base de Datos: " + ctx.ID(0).getText() + " renombrada a " + ctx.ID(1).getText() +
                        "con exito\n";
            }
        }

        return visitChildren(ctx);


    }


    /**
     * Grammar: SHOW DATABASE
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


    @Override public String visitSTMcreateTable(PostSQLParser.STMcreateTableContext ctx) {

        return visitChildren(ctx);
    }



    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}