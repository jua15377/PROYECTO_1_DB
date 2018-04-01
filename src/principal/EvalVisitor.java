package principal;

import antlrGenerateFiles.*;
import fileManagement.*;

import java.beans.Visibility;
import java.util.ArrayList;

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
            log += "La base de datos \""+ctx.ID().getText()+"\" se creo exitosamente!.\n";
            if(verboseEnable){
                verbose += "Base de Datos: " + id + ", creado con exito\n";
            }
        }
        else {
            return error+="Error en la linea:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+ ". La base de datos \""+ctx.ID().getText()+"\" ya existe.\n";
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
            manejador.dropDatabase(id);
            log += "La base de datos \""+ctx.ID().getText()+"\" se elimino exitosamente!.\n";
            if(verboseEnable){ verbose += "Base de Datos: " + id + ", eliminada con exito\n";}
        }
        else {
            return error+="Error en la linea:" + ctx.getStart().getLine()+", "+ ctx.getStart().getCharPositionInLine()+ ". No se encontro \""+ctx.ID().getText()+"\".\n";
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
                return verbose += "Base de Datos: " + ctx.ID(0).getText() + " renombrada a " + ctx.ID(1).getText() +
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
            return verbose += "Show Databases displayed succesfully";
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