package principal;

import antlrGenerateFiles.*;
import fileManagement.*;

public class EvalVisitor extends PostSQLBaseVisitor<String>{
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     * GRAMMAR: ((unit_statement) SEMICOLON?)*;
     */
    @Override
    public T visitSqlScript(PostSQLParser.SqlScriptContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     * GRAMMAR: create_database;
     */
    @Override public T visitSTMcreateDB(PostSQLParser.STMcreateDBContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     * GRAMMAR: drop_database;
     */
    @Override public T visitSTMdropDB(PostSQLParser.STMdropDBContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     * GRAMMAR: show_database;
     */
    @Override public T visitSTMshowDB(PostSQLParser.STMshowDBContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     * GRAMMAR: alter_table;
     */
    @Override public T visitSTMalterTable(PostSQLParser.STMalterTableContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     * GRAMMAR: show_table;
     */
    @Override public T visitSTMshowTable(PostSQLParser.STMshowTableContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     * GRAMMAR: drop_table;
     */
    @Override public T visitSTMdropTable(PostSQLParser.STMdropTableContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     * GRAMMAR: fuck_database;
     */
    @Override public T visitSTMfuckTable(PostSQLParser.STMfuckTableContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     * GRAMMAR: insert_into;
     */
    @Override public T visitSTMinsertInto(PostSQLParser.STMinsertIntoContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     * GRAMMAR: update;
     */
    @Override public T visitSTMupdate(PostSQLParser.STMupdateContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     * GRAMMAR: delete;
     */
    @Override public T visitSTMdelete(PostSQLParser.STMdeleteContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     * GRAMMAR: select;
     */
    @Override public T visitSTMselect(PostSQLParser.STMselectContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     * GRAMMAR: CREATE DATABASE ID;
     */
    @Override public T visitCreateDatabase(PostSQLParser.CreateDatabaseContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     * GRAMMAR: DROP DATABASE ID;
     */
    @Override public T visitDropDatabase(PostSQLParser.DropDatabaseContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     * GRAMMAR: SHOW DATABASE;
     */
    @Override public T visitShowDatabase(PostSQLParser.ShowDatabaseContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     * GRAMMAR: CREATE TABLE ID '(' columDeclaration constraints* ')';
     */
    @Override public T visitCreateTable(PostSQLParser.CreateTableContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     * GRAMMAR: primaryKeyDeclaration
     *
     */
    @Override public T visitPrimaryKeyDeclConstr(PostSQLParser.PrimaryKeyDeclConstrContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     * GRAMMAR: foreignKeyDeclaration
     */
    @Override public T visitForeignKeyDeclConstr(PostSQLParser.ForeignKeyDeclConstrContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     * GRAMMAR: checkDeclaration
     */
    @Override public T visitCheckDeclConstr(PostSQLParser.CheckDeclConstrContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     * GRAMMAR: ID varType
     */
    @Override public T visitSimpleColumn(PostSQLParser.SimpleColumnContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     * GRAMMAR: ID verType (','ID  varType)*
     */
    @Override public T visitMultipleColumn(PostSQLParser.MultipleColumnContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     * GRAMMAR: CONSTRAINT 'PK_'ID PRIMARY KEY ('(' ID | ID(','ID)* ')')
     */
    @Override public T visitPrimaryKeyDecl(PostSQLParser.PrimaryKeyDeclContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     * GRAMMAR: CONSTRAINT 'FK_'ID FOREIGN KEY ('(' ID | ID(','ID)* ')' REFERENCES ID '(' ID | ID(','ID)* ')')
     */
    @Override public T visitForeignDecl(PostSQLParser.ForeignDeclContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     * GRAMMAR:  CONSTRAINT 'CH_'ID CHECK '(' exp ')'
     */
    @Override public T visitCheckDecl(PostSQLParser.CheckDeclContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     * GRAMMAR: (ID | NUM) (eq_op| eq_sgn) (ID | NUM)
     */
    @Override public T visitExpDecl(PostSQLParser.ExpDeclContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     * GRAMMAR: AND
     */
    @Override public T visitAndOperation(PostSQLParser.AndOperationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     * GRAMMAR: OR
     */
    @Override public T visitOrOperation(PostSQLParser.OrOperationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     * GRAMMAR: NOT
     */
    @Override public T visitNotOperation(PostSQLParser.NotOperationContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     * GRAMMAR : '<'
     */
    @Override public T visitMenorQueOp(PostSQLParser.MenorQueOpContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     * GRAMMAR: '>'
     */
    @Override public T visitMayorQueOP(PostSQLParser.MayorQueOPContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     * GRAMMAR: '<='
     */
    @Override public T visitMenorIgualQueOp(PostSQLParser.MenorIgualQueOpContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     * GRAMMAR: '>='
     */
    @Override public T visitMayorIgualQueOp(PostSQLParser.MayorIgualQueOpContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     * GRAMMAR: '<>'
     */
    @Override public T visitDiferenteOP(PostSQLParser.DiferenteOPContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     * GRAMMAR: '='
     */
    @Override public T visitIgualOP(PostSQLParser.IgualOPContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     * GRAMMAR: ALTER TABLE ID RENAME TO ID
     */
    @Override public T visitRenameTable(PostSQLParser.RenameTableContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     * GRAMMAR ALTER TABLE ID action_alter_table
     */
    @Override public T visitAlterTable(PostSQLParser.AlterTableContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     * GRAMMAR: ADD COLUMN ID varType constraints*
     */
    @Override public T visitAddColumn(PostSQLParser.AddColumnContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     * GRAMMAR: ADD constraints*
     */
    @Override public T visitAddConstraints(PostSQLParser.AddConstraintsContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     * GRAMMAR: DROP COLUMN ID
     */
    @Override public T visitDropColumn(PostSQLParser.DropColumnContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     * GRAMMAR: DROP CONSTRINT ID
     */
    @Override public T visitDropConstraints(PostSQLParser.DropConstraintsContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     * GRAMMAR: DROP TABLE ID
     */
    @Override public T visitDropTable(PostSQLParser.DropTableContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     * GRAMMAR: SHOW TABLE
     */
    @Override public T visitShowTable(PostSQLParser.ShowTableContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     * GRAMMAR: 'SHOW COLUMN' FROM ID
     */
    @Override public T visitShowColumn(PostSQLParser.ShowColumnContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     * GRAMMAR: 'FUCK DATABASE'
     */
    @Override public T visitFuckDatabase(PostSQLParser.FuckDatabaseContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     * GRAMMAR: INSERT_INTO ID '(' ID (',' ID)* ')' VALUES '(' varType (',' varType)* ')'
     */
    @Override public T visitInsertInto(PostSQLParser.InsertIntoContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     * GRAMMAR; UPDATE ID SET ID '=' '(' varType (',' varType)* ')' WHERE condicion (eq_op condicion)*
     */
    @Override public T visitUpdateDecl(PostSQLParser.UpdateDeclContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     * GRAMMAR: ID eq_sgn ID
     */
    @Override public T visitCondicionDecl(PostSQLParser.CondicionDeclContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     * GRAMMAR: DELETE FROM ID WHERE condicion (eq_op condicion)*
     */
    @Override public T visitDeleteDecl(PostSQLParser.DeleteDeclContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     * GRAMMAR: SELECT ('*'|ID (','ID)) FROM ID WHERE condicion ORDER_BY ID (ASC |DESC) (',' ID (ASC |DESC))
     */
    @Override public T visitSelectDecl(PostSQLParser.SelectDeclContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     * GRAMMAR: INT
     */
    @Override public T visitVar_int(PostSQLParser.Var_intContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     * GRAMMAR: CHAR
     */
    @Override public T visitVar_char(PostSQLParser.Var_charContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     * GRAMMAR: BOOLEAN
     */
    @Override public T visitVar_boolean(PostSQLParser.Var_booleanContext ctx) { return visitChildren(ctx); }
}
