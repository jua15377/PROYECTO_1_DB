package principal;

import antlrGenerateFiles.*;
import fileManagement.*;

public class EvalVisitor extends PostSQLBaseVisitor<String>{

    public String error = "";
    Manejador contenedorPrincipal = new Manejador();

    /**
     * Grammar: CREATE DATABASE ID
     * Metodo para la creacion de una base de datos.**/
    @Override public String visitSTMcreateDB(PostSQLParser.STMcreateDBContext ctx) {
        String id = ctx.ID().getText();
        contenedorPrincipal.createDataBase(id);
        return "Base de Datos: " + id + ", creado con exito";
    }

    /**
     * Grammar: DROP DATABASE ID
     * Metodo para la eliminacion de una base de datos.**/
    @Override public String visitSTMdropDB(PostSQLParser.STMdropDBContext ctx) {
        String id = ctx.ID().getText();
        System.out.println(id);
        contenedorPrincipal.dropDatabase(id);
        System.out.println("Base de Datos: " + id + ", eliminada con exito");
        return "Base de Datos: " + id + ", eliminada con exito";
    }

    /**
     * Grammar: CREATE DATABASE ID
     * Metodo para la creacion de una base de datos.**/
    @Override public String visitCreateTable(PostSQLParser.CreateTableContext ctx) {
        String constraint = visitChildren(ctx.columDeclaration());
        return visitChildren(ctx);
    }

    /**
     * Grammar: CREATE DATABASE ID
     * Metodo para la creacion de una base de datos.**/
    @Override public String visitProgram(PostSQLParser.ProgramContext ctx) { return visitChildren(ctx); }

    /**
     * Grammar: CREATE DATABASE ID
     * Metodo para la creacion de una base de datos.**/
    @Override public String visitSTMshowDB(PostSQLParser.STMshowDBContext ctx) { return visitChildren(ctx); }

    /**
     * Grammar: CREATE DATABASE ID
     * Metodo para la creacion de una base de datos.**/
    @Override public String visitSTMalterTable(PostSQLParser.STMalterTableContext ctx) { return visitChildren(ctx); }

    /**
     * Grammar: CREATE DATABASE ID
     * Metodo para la creacion de una base de datos.**/
    @Override public String visitSTMshowTable(PostSQLParser.STMshowTableContext ctx) { return visitChildren(ctx); }

    /**
     * Grammar: CREATE DATABASE ID
     * Metodo para la creacion de una base de datos.**/
    @Override public String visitSTMuseDB(PostSQLParser.STMuseDBContext ctx) { return visitChildren(ctx); }

    /**
     * Grammar: CREATE DATABASE ID
     * Metodo para la creacion de una base de datos.**/
    @Override public String visitSTMdropTable(PostSQLParser.STMdropTableContext ctx) { return visitChildren(ctx); }

    /**
     * Grammar: CREATE DATABASE ID
     * Metodo para la creacion de una base de datos.**/
    @Override public String visitSTMfuckTable(PostSQLParser.STMfuckTableContext ctx) { return visitChildren(ctx); }

    /**
     * Grammar: CREATE DATABASE ID
     * Metodo para la creacion de una base de datos.**/
    @Override public String visitSTMinsertInto(PostSQLParser.STMinsertIntoContext ctx) { return visitChildren(ctx); }

    /**
     * Grammar: CREATE DATABASE ID
     * Metodo para la creacion de una base de datos.**/
    @Override public String visitSTMupdate(PostSQLParser.STMupdateContext ctx) { return visitChildren(ctx); }

    /**
     * Grammar: CREATE DATABASE ID
     * Metodo para la creacion de una base de datos.**/
    @Override public String visitSTMdelete(PostSQLParser.STMdeleteContext ctx) { return visitChildren(ctx); }

    /**
     * Grammar: CREATE DATABASE ID
     * Metodo para la creacion de una base de datos.**/
    @Override public String visitSTMselect(PostSQLParser.STMselectContext ctx) { return visitChildren(ctx); }

    /**
     * Grammar: CREATE DATABASE ID
     * Metodo para la creacion de una base de datos.**/
    @Override public String visitShowDatabase(PostSQLParser.ShowDatabaseContext ctx) { return visitChildren(ctx); }

    /**
     * Grammar: CREATE DATABASE ID
     * Metodo para la creacion de una base de datos.**/
    @Override public String visitUseDatabase(PostSQLParser.UseDatabaseContext ctx) { return visitChildren(ctx); }


    /**
     * Grammar: CREATE DATABASE ID
     * Metodo para la creacion de una base de datos.**/
    @Override public String visitPrimaryKeyDeclConstr(PostSQLParser.PrimaryKeyDeclConstrContext ctx) { return visitChildren(ctx); }

    /**
     * Grammar: CREATE DATABASE ID
     * Metodo para la creacion de una base de datos.**/
    @Override public String visitForeignKeyDeclConstr(PostSQLParser.ForeignKeyDeclConstrContext ctx) { return visitChildren(ctx); }

    /**
     * Grammar: CREATE DATABASE ID
     * Metodo para la creacion de una base de datos.**/
    @Override public String visitCheckDeclConstr(PostSQLParser.CheckDeclConstrContext ctx) { return visitChildren(ctx); }

    /**
     * Grammar: CREATE DATABASE ID
     * Metodo para la creacion de una base de datos.**/
    @Override public String visitSimpleColumn(PostSQLParser.SimpleColumnContext ctx) { return visitChildren(ctx); }

    /**
     * Grammar: CREATE DATABASE ID
     * Metodo para la creacion de una base de datos.**/
    @Override public String visitMultipleColumn(PostSQLParser.MultipleColumnContext ctx) { return visitChildren(ctx); }

    /**
     * Grammar: CREATE DATABASE ID
     * Metodo para la creacion de una base de datos.**/
    @Override public String visitPrimaryKeyDecl(PostSQLParser.PrimaryKeyDeclContext ctx) { return visitChildren(ctx); }

    /**
     * Grammar: CREATE DATABASE ID
     * Metodo para la creacion de una base de datos.**/
    @Override public String visitForeignDecl(PostSQLParser.ForeignDeclContext ctx) { return visitChildren(ctx); }

    /**
     * Grammar: CREATE DATABASE ID
     * Metodo para la creacion de una base de datos.**/
    @Override public String visitCheckDecl(PostSQLParser.CheckDeclContext ctx) { return visitChildren(ctx); }

    /**
     * Grammar: CREATE DATABASE ID
     * Metodo para la creacion de una base de datos.**/
    @Override public String visitExpDecl(PostSQLParser.ExpDeclContext ctx) { return visitChildren(ctx); }

    /**
     * Grammar: CREATE DATABASE ID
     * Metodo para la creacion de una base de datos.**/
    @Override public String visitAndOperation(PostSQLParser.AndOperationContext ctx) { return visitChildren(ctx); }

    /**
     * Grammar: CREATE DATABASE ID
     * Metodo para la creacion de una base de datos.**/
    @Override public String visitOrOperation(PostSQLParser.OrOperationContext ctx) { return visitChildren(ctx); }

    /**
     * Grammar: CREATE DATABASE ID
     * Metodo para la creacion de una base de datos.**/
    @Override public String visitNotOperation(PostSQLParser.NotOperationContext ctx) { return visitChildren(ctx); }

    /**
     * Grammar: CREATE DATABASE ID
     * Metodo para la creacion de una base de datos.**/
    @Override public String visitMenorQueOp(PostSQLParser.MenorQueOpContext ctx) { return visitChildren(ctx); }

    /**
     * Grammar: CREATE DATABASE ID
     * Metodo para la creacion de una base de datos.**/
    @Override public String visitMayorQueOP(PostSQLParser.MayorQueOPContext ctx) { return visitChildren(ctx); }

    /**
     * Grammar: CREATE DATABASE ID
     * Metodo para la creacion de una base de datos.**/
    @Override public String visitMenorIgualQueOp(PostSQLParser.MenorIgualQueOpContext ctx) { return visitChildren(ctx); }

    /**
     * Grammar: CREATE DATABASE ID
     * Metodo para la creacion de una base de datos.**/
    @Override public String visitMayorIgualQueOp(PostSQLParser.MayorIgualQueOpContext ctx) { return visitChildren(ctx); }

    /**
     * Grammar: CREATE DATABASE ID
     * Metodo para la creacion de una base de datos.**/
    @Override public String visitDiferenteOP(PostSQLParser.DiferenteOPContext ctx) { return visitChildren(ctx); }

    /**
     * Grammar: CREATE DATABASE ID
     * Metodo para la creacion de una base de datos.**/
    @Override public String visitIgualOP(PostSQLParser.IgualOPContext ctx) { return visitChildren(ctx); }

    /**
     * Grammar: CREATE DATABASE ID
     * Metodo para la creacion de una base de datos.**/
    @Override public String visitRenameTable(PostSQLParser.RenameTableContext ctx) { return visitChildren(ctx); }

    /**
     * Grammar: CREATE DATABASE ID
     * Metodo para la creacion de una base de datos.**/
    @Override public String visitAlterTable(PostSQLParser.AlterTableContext ctx) { return visitChildren(ctx); }

    /**
     * Grammar: CREATE DATABASE ID
     * Metodo para la creacion de una base de datos.**/
    @Override public String visitAddColumn(PostSQLParser.AddColumnContext ctx) { return visitChildren(ctx); }

    /**
     * Grammar: CREATE DATABASE ID
     * Metodo para la creacion de una base de datos.**/
    @Override public String visitAddConstraints(PostSQLParser.AddConstraintsContext ctx) { return visitChildren(ctx); }

    /**
     * Grammar: CREATE DATABASE ID
     * Metodo para la creacion de una base de datos.**/
    @Override public String visitDropColumn(PostSQLParser.DropColumnContext ctx) { return visitChildren(ctx); }

    /**
     * Grammar: CREATE DATABASE ID
     * Metodo para la creacion de una base de datos.**/
    @Override public String visitDropConstraints(PostSQLParser.DropConstraintsContext ctx) { return visitChildren(ctx); }

    /**
     * Grammar: CREATE DATABASE ID
     * Metodo para la creacion de una base de datos.**/
    @Override public String visitDropTable(PostSQLParser.DropTableContext ctx) { return visitChildren(ctx); }

    /**
     * Grammar: CREATE DATABASE ID
     * Metodo para la creacion de una base de datos.**/
    @Override public String visitShowTable(PostSQLParser.ShowTableContext ctx) { return visitChildren(ctx); }

    /**
     * Grammar: CREATE DATABASE ID
     * Metodo para la creacion de una base de datos.**/
    @Override public String visitShowColumn(PostSQLParser.ShowColumnContext ctx) { return visitChildren(ctx); }

    /**
     * Grammar: CREATE DATABASE ID
     * Metodo para la creacion de una base de datos.**/
    @Override public String visitFuckDatabase(PostSQLParser.FuckDatabaseContext ctx) { return visitChildren(ctx); }

    /**
     * Grammar: CREATE DATABASE ID
     * Metodo para la creacion de una base de datos.**/
    @Override public String visitInsertInto(PostSQLParser.InsertIntoContext ctx) { return visitChildren(ctx); }

    /**
     * Grammar: CREATE DATABASE ID
     * Metodo para la creacion de una base de datos.**/
    @Override public String visitUpdateDecl(PostSQLParser.UpdateDeclContext ctx) { return visitChildren(ctx); }

    /**
     * Grammar: CREATE DATABASE ID
     * Metodo para la creacion de una base de datos.**/
    @Override public String visitCondicionDecl(PostSQLParser.CondicionDeclContext ctx) { return visitChildren(ctx); }

    /**
     * Grammar: CREATE DATABASE ID
     * Metodo para la creacion de una base de datos.**/
    @Override public String visitDeleteDecl(PostSQLParser.DeleteDeclContext ctx) { return visitChildren(ctx); }

    /**
     * Grammar: CREATE DATABASE ID
     * Metodo para la creacion de una base de datos.**/
    @Override public String visitSelectDecl(PostSQLParser.SelectDeclContext ctx) { return visitChildren(ctx); }

    /**
     * Grammar: CREATE DATABASE ID
     * Metodo para la creacion de una base de datos.**/
    @Override public String visitVar_int(PostSQLParser.Var_intContext ctx) { return visitChildren(ctx); }

    /**
     * Grammar: CREATE DATABASE ID
     * Metodo para la creacion de una base de datos.**/
    @Override public String visitVar_char(PostSQLParser.Var_charContext ctx) { return visitChildren(ctx); }

    /**
     * Grammar: CREATE DATABASE ID
     * Metodo para la creacion de una base de datos.**/
    @Override public String visitVar_boolean(PostSQLParser.Var_booleanContext ctx) { return visitChildren(ctx); }



    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}