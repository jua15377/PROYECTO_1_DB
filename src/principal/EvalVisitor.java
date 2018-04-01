package principal;

import antlrGenerateFiles.*;
import fileManagement.*;

public class EvalVisitor extends PostSQLBaseVisitor<String>{

    public String error = "";
    public String verbose = "";


    /**
     * Grammar: CREATE DATABASE ID
     * Metodo para la creacion de una base de datos.**/
    @Override public String visitSTMcreateDB(PostSQLParser.STMcreateDBContext ctx) {
        String id = ctx.ID().getText();
        verbose += "Base de Datos: " + id + ", creado con exito\n";
        return visitChildren(ctx);

    }

    /**
     * Grammar: DROP DATABASE ID
     * Metodo para la eliminacion de una base de datos.**/
    @Override public String visitSTMdropDB(PostSQLParser.STMdropDBContext ctx) {
        String id = ctx.ID().getText();
        System.out.println(id);
        System.out.println("Base de Datos: " + id + ", eliminada con exito");
        return "Base de Datos: " + id + ", eliminada con exito";
    }


    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}