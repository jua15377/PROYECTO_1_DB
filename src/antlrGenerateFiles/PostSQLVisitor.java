// Generated from PostSQL.g4 by ANTLR 4.7.1
package antlrGenerateFiles;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PostSQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PostSQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PostSQLParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PostSQLParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code STMcreateDB}
	 * labeled alternative in {@link PostSQLParser#unitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSTMcreateDB(PostSQLParser.STMcreateDBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code STMdropDB}
	 * labeled alternative in {@link PostSQLParser#unitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSTMdropDB(PostSQLParser.STMdropDBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code STMshowDB}
	 * labeled alternative in {@link PostSQLParser#unitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSTMshowDB(PostSQLParser.STMshowDBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code STMalterTable}
	 * labeled alternative in {@link PostSQLParser#unitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSTMalterTable(PostSQLParser.STMalterTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code STMshowTable}
	 * labeled alternative in {@link PostSQLParser#unitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSTMshowTable(PostSQLParser.STMshowTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code STMuseDB}
	 * labeled alternative in {@link PostSQLParser#unitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSTMuseDB(PostSQLParser.STMuseDBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code STMdropTable}
	 * labeled alternative in {@link PostSQLParser#unitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSTMdropTable(PostSQLParser.STMdropTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code STMfuckTable}
	 * labeled alternative in {@link PostSQLParser#unitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSTMfuckTable(PostSQLParser.STMfuckTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code STMinsertInto}
	 * labeled alternative in {@link PostSQLParser#unitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSTMinsertInto(PostSQLParser.STMinsertIntoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code STMupdate}
	 * labeled alternative in {@link PostSQLParser#unitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSTMupdate(PostSQLParser.STMupdateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code STMdelete}
	 * labeled alternative in {@link PostSQLParser#unitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSTMdelete(PostSQLParser.STMdeleteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code STMselect}
	 * labeled alternative in {@link PostSQLParser#unitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSTMselect(PostSQLParser.STMselectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showDatabase}
	 * labeled alternative in {@link PostSQLParser#show_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowDatabase(PostSQLParser.ShowDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code useDatabase}
	 * labeled alternative in {@link PostSQLParser#use_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseDatabase(PostSQLParser.UseDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link PostSQLParser#create_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTable(PostSQLParser.CreateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryKeyDeclConstr}
	 * labeled alternative in {@link PostSQLParser#constraints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryKeyDeclConstr(PostSQLParser.PrimaryKeyDeclConstrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code foreignKeyDeclConstr}
	 * labeled alternative in {@link PostSQLParser#constraints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeignKeyDeclConstr(PostSQLParser.ForeignKeyDeclConstrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code checkDeclConstr}
	 * labeled alternative in {@link PostSQLParser#constraints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckDeclConstr(PostSQLParser.CheckDeclConstrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleColumn}
	 * labeled alternative in {@link PostSQLParser#columDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleColumn(PostSQLParser.SimpleColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multipleColumn}
	 * labeled alternative in {@link PostSQLParser#columDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleColumn(PostSQLParser.MultipleColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryKeyDecl}
	 * labeled alternative in {@link PostSQLParser#primaryKeyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryKeyDecl(PostSQLParser.PrimaryKeyDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code foreignDecl}
	 * labeled alternative in {@link PostSQLParser#foreignKeyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeignDecl(PostSQLParser.ForeignDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code checkDecl}
	 * labeled alternative in {@link PostSQLParser#checkDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckDecl(PostSQLParser.CheckDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expDecl}
	 * labeled alternative in {@link PostSQLParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpDecl(PostSQLParser.ExpDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andOperation}
	 * labeled alternative in {@link PostSQLParser#eq_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOperation(PostSQLParser.AndOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orOperation}
	 * labeled alternative in {@link PostSQLParser#eq_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrOperation(PostSQLParser.OrOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notOperation}
	 * labeled alternative in {@link PostSQLParser#eq_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotOperation(PostSQLParser.NotOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code menorQueOp}
	 * labeled alternative in {@link PostSQLParser#eq_sgn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenorQueOp(PostSQLParser.MenorQueOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mayorQueOP}
	 * labeled alternative in {@link PostSQLParser#eq_sgn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMayorQueOP(PostSQLParser.MayorQueOPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code menorIgualQueOp}
	 * labeled alternative in {@link PostSQLParser#eq_sgn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenorIgualQueOp(PostSQLParser.MenorIgualQueOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mayorIgualQueOp}
	 * labeled alternative in {@link PostSQLParser#eq_sgn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMayorIgualQueOp(PostSQLParser.MayorIgualQueOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code diferenteOP}
	 * labeled alternative in {@link PostSQLParser#eq_sgn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiferenteOP(PostSQLParser.DiferenteOPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code igualOP}
	 * labeled alternative in {@link PostSQLParser#eq_sgn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgualOP(PostSQLParser.IgualOPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link PostSQLParser#alter_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameTable(PostSQLParser.RenameTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterTable}
	 * labeled alternative in {@link PostSQLParser#alter_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTable(PostSQLParser.AlterTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addColumn}
	 * labeled alternative in {@link PostSQLParser#action_alter_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddColumn(PostSQLParser.AddColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addConstraints}
	 * labeled alternative in {@link PostSQLParser#action_alter_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddConstraints(PostSQLParser.AddConstraintsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropColumn}
	 * labeled alternative in {@link PostSQLParser#action_alter_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropColumn(PostSQLParser.DropColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropConstraints}
	 * labeled alternative in {@link PostSQLParser#action_alter_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropConstraints(PostSQLParser.DropConstraintsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link PostSQLParser#drop_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTable(PostSQLParser.DropTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showTable}
	 * labeled alternative in {@link PostSQLParser#show_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTable(PostSQLParser.ShowTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showColumn}
	 * labeled alternative in {@link PostSQLParser#show_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowColumn(PostSQLParser.ShowColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fuckDatabase}
	 * labeled alternative in {@link PostSQLParser#fuck_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuckDatabase(PostSQLParser.FuckDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code insertInto}
	 * labeled alternative in {@link PostSQLParser#insert_into}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertInto(PostSQLParser.InsertIntoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code updateDecl}
	 * labeled alternative in {@link PostSQLParser#update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateDecl(PostSQLParser.UpdateDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condicionDecl}
	 * labeled alternative in {@link PostSQLParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionDecl(PostSQLParser.CondicionDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code deleteDecl}
	 * labeled alternative in {@link PostSQLParser#delete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteDecl(PostSQLParser.DeleteDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectDecl}
	 * labeled alternative in {@link PostSQLParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectDecl(PostSQLParser.SelectDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code var_int}
	 * labeled alternative in {@link PostSQLParser#varType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_int(PostSQLParser.Var_intContext ctx);
	/**
	 * Visit a parse tree produced by the {@code var_char}
	 * labeled alternative in {@link PostSQLParser#varType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_char(PostSQLParser.Var_charContext ctx);
	/**
	 * Visit a parse tree produced by the {@code var_boolean}
	 * labeled alternative in {@link PostSQLParser#varType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_boolean(PostSQLParser.Var_booleanContext ctx);
}