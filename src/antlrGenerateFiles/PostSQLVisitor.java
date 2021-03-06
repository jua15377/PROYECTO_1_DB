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
	 * Visit a parse tree produced by the {@code initProgram}
	 * labeled alternative in {@link PostSQLParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitProgram(PostSQLParser.InitProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code initProgramVerbose}
	 * labeled alternative in {@link PostSQLParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitProgramVerbose(PostSQLParser.InitProgramVerboseContext ctx);
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
	 * Visit a parse tree produced by the {@code STMalterDB}
	 * labeled alternative in {@link PostSQLParser#unitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSTMalterDB(PostSQLParser.STMalterDBContext ctx);
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
	 * Visit a parse tree produced by the {@code STMcreateTable}
	 * labeled alternative in {@link PostSQLParser#unitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSTMcreateTable(PostSQLParser.STMcreateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code STMshowColumn}
	 * labeled alternative in {@link PostSQLParser#unitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSTMshowColumn(PostSQLParser.STMshowColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code STMalterTable}
	 * labeled alternative in {@link PostSQLParser#unitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSTMalterTable(PostSQLParser.STMalterTableContext ctx);
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
	 * Visit a parse tree produced by the {@code stmcolumsid}
	 * labeled alternative in {@link PostSQLParser#columnsids}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmcolumsid(PostSQLParser.StmcolumsidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code STMselectIDS}
	 * labeled alternative in {@link PostSQLParser#selectIds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSTMselectIDS(PostSQLParser.STMselectIDSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code STMAscDscIDS}
	 * labeled alternative in {@link PostSQLParser#ascDscIds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSTMAscDscIDS(PostSQLParser.STMAscDscIDSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmvalues}
	 * labeled alternative in {@link PostSQLParser#valuesids}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmvalues(PostSQLParser.StmvaluesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code structid}
	 * labeled alternative in {@link PostSQLParser#struct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructid(PostSQLParser.StructidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code structnum}
	 * labeled alternative in {@link PostSQLParser#struct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructnum(PostSQLParser.StructnumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code structflt}
	 * labeled alternative in {@link PostSQLParser#struct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructflt(PostSQLParser.StructfltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code structdate}
	 * labeled alternative in {@link PostSQLParser#struct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructdate(PostSQLParser.StructdateContext ctx);
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
	 * Visit a parse tree produced by the {@code multipleColumn}
	 * labeled alternative in {@link PostSQLParser#columDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleColumn(PostSQLParser.MultipleColumnContext ctx);
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
	 * Visit a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link PostSQLParser#action_alter_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameTable(PostSQLParser.RenameTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condicionDecl}
	 * labeled alternative in {@link PostSQLParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionDecl(PostSQLParser.CondicionDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varint}
	 * labeled alternative in {@link PostSQLParser#varType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarint(PostSQLParser.VarintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varchar}
	 * labeled alternative in {@link PostSQLParser#varType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarchar(PostSQLParser.VarcharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varfloat}
	 * labeled alternative in {@link PostSQLParser#varType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarfloat(PostSQLParser.VarfloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vardate}
	 * labeled alternative in {@link PostSQLParser#varType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardate(PostSQLParser.VardateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varnull}
	 * labeled alternative in {@link PostSQLParser#varType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarnull(PostSQLParser.VarnullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typecharDeclaration}
	 * labeled alternative in {@link PostSQLParser#typechar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypecharDeclaration(PostSQLParser.TypecharDeclarationContext ctx);
}