package principal;

import antlrGenerateFiles.*;
import fileManagement.*;
;

public class EvalVisitor extends PostSQLBaseVisitor<String>{

    public Manejador manejador  = new Manejador("master");
    public String error = "";
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
        if(verboseEnable){
            verbose += "Base de Datos: " + id + ", creado con exito\n";
        }
        return visitChildren(ctx);

    }

    /**
     * Grammar: DROP DATABASE ID
     * Metodo para la eliminacion de una base de datos.**/
    @Override public String visitSTMdropDB(PostSQLParser.STMdropDBContext ctx) {
        String id = ctx.ID().getText();
        System.out.println(id);
        System.out.println("Base de Datos: " + id + ", eliminada con exito");
        if(verboseEnable){ verbose += "Base de Datos: " + id + ", eliminada con exito\n";}
        return visitChildren(ctx);
    }
    @Override public String visitSTMcreateTable(PostSQLParser.STMcreateTableContext ctx) {

        return visitChildren(ctx);
    }

    public void inicarDB(){


    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}