// Generated from PostSQL.g4 by ANTLR 4.7.1
package antlrGenerateFiles;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PostSQLParser}.
 */
public interface PostSQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code initProgram}
	 * labeled alternative in {@link PostSQLParser#program}.
	 * @param ctx the parse tree
	 */
	void enterInitProgram(PostSQLParser.InitProgramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initProgram}
	 * labeled alternative in {@link PostSQLParser#program}.
	 * @param ctx the parse tree
	 */
	void exitInitProgram(PostSQLParser.InitProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code initProgramVerbose}
	 * labeled alternative in {@link PostSQLParser#program}.
	 * @param ctx the parse tree
	 */
	void enterInitProgramVerbose(PostSQLParser.InitProgramVerboseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initProgramVerbose}
	 * labeled alternative in {@link PostSQLParser#program}.
	 * @param ctx the parse tree
	 */
	void exitInitProgramVerbose(PostSQLParser.InitProgramVerboseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STMcreateDB}
	 * labeled alternative in {@link PostSQLParser#unitStatement}.
	 * @param ctx the parse tree
	 */
	void enterSTMcreateDB(PostSQLParser.STMcreateDBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STMcreateDB}
	 * labeled alternative in {@link PostSQLParser#unitStatement}.
	 * @param ctx the parse tree
	 */
	void exitSTMcreateDB(PostSQLParser.STMcreateDBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STMdropDB}
	 * labeled alternative in {@link PostSQLParser#unitStatement}.
	 * @param ctx the parse tree
	 */
	void enterSTMdropDB(PostSQLParser.STMdropDBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STMdropDB}
	 * labeled alternative in {@link PostSQLParser#unitStatement}.
	 * @param ctx the parse tree
	 */
	void exitSTMdropDB(PostSQLParser.STMdropDBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STMshowDB}
	 * labeled alternative in {@link PostSQLParser#unitStatement}.
	 * @param ctx the parse tree
	 */
	void enterSTMshowDB(PostSQLParser.STMshowDBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STMshowDB}
	 * labeled alternative in {@link PostSQLParser#unitStatement}.
	 * @param ctx the parse tree
	 */
	void exitSTMshowDB(PostSQLParser.STMshowDBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STMshowTable}
	 * labeled alternative in {@link PostSQLParser#unitStatement}.
	 * @param ctx the parse tree
	 */
	void enterSTMshowTable(PostSQLParser.STMshowTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STMshowTable}
	 * labeled alternative in {@link PostSQLParser#unitStatement}.
	 * @param ctx the parse tree
	 */
	void exitSTMshowTable(PostSQLParser.STMshowTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STMuseDB}
	 * labeled alternative in {@link PostSQLParser#unitStatement}.
	 * @param ctx the parse tree
	 */
	void enterSTMuseDB(PostSQLParser.STMuseDBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STMuseDB}
	 * labeled alternative in {@link PostSQLParser#unitStatement}.
	 * @param ctx the parse tree
	 */
	void exitSTMuseDB(PostSQLParser.STMuseDBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STMalterDB}
	 * labeled alternative in {@link PostSQLParser#unitStatement}.
	 * @param ctx the parse tree
	 */
	void enterSTMalterDB(PostSQLParser.STMalterDBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STMalterDB}
	 * labeled alternative in {@link PostSQLParser#unitStatement}.
	 * @param ctx the parse tree
	 */
	void exitSTMalterDB(PostSQLParser.STMalterDBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STMdropTable}
	 * labeled alternative in {@link PostSQLParser#unitStatement}.
	 * @param ctx the parse tree
	 */
	void enterSTMdropTable(PostSQLParser.STMdropTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STMdropTable}
	 * labeled alternative in {@link PostSQLParser#unitStatement}.
	 * @param ctx the parse tree
	 */
	void exitSTMdropTable(PostSQLParser.STMdropTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STMfuckTable}
	 * labeled alternative in {@link PostSQLParser#unitStatement}.
	 * @param ctx the parse tree
	 */
	void enterSTMfuckTable(PostSQLParser.STMfuckTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STMfuckTable}
	 * labeled alternative in {@link PostSQLParser#unitStatement}.
	 * @param ctx the parse tree
	 */
	void exitSTMfuckTable(PostSQLParser.STMfuckTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STMcreateTable}
	 * labeled alternative in {@link PostSQLParser#unitStatement}.
	 * @param ctx the parse tree
	 */
	void enterSTMcreateTable(PostSQLParser.STMcreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STMcreateTable}
	 * labeled alternative in {@link PostSQLParser#unitStatement}.
	 * @param ctx the parse tree
	 */
	void exitSTMcreateTable(PostSQLParser.STMcreateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STMshowColumn}
	 * labeled alternative in {@link PostSQLParser#unitStatement}.
	 * @param ctx the parse tree
	 */
	void enterSTMshowColumn(PostSQLParser.STMshowColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STMshowColumn}
	 * labeled alternative in {@link PostSQLParser#unitStatement}.
	 * @param ctx the parse tree
	 */
	void exitSTMshowColumn(PostSQLParser.STMshowColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STMalterTable}
	 * labeled alternative in {@link PostSQLParser#unitStatement}.
	 * @param ctx the parse tree
	 */
	void enterSTMalterTable(PostSQLParser.STMalterTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STMalterTable}
	 * labeled alternative in {@link PostSQLParser#unitStatement}.
	 * @param ctx the parse tree
	 */
	void exitSTMalterTable(PostSQLParser.STMalterTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STMinsertInto}
	 * labeled alternative in {@link PostSQLParser#unitStatement}.
	 * @param ctx the parse tree
	 */
	void enterSTMinsertInto(PostSQLParser.STMinsertIntoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STMinsertInto}
	 * labeled alternative in {@link PostSQLParser#unitStatement}.
	 * @param ctx the parse tree
	 */
	void exitSTMinsertInto(PostSQLParser.STMinsertIntoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STMupdate}
	 * labeled alternative in {@link PostSQLParser#unitStatement}.
	 * @param ctx the parse tree
	 */
	void enterSTMupdate(PostSQLParser.STMupdateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STMupdate}
	 * labeled alternative in {@link PostSQLParser#unitStatement}.
	 * @param ctx the parse tree
	 */
	void exitSTMupdate(PostSQLParser.STMupdateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STMdelete}
	 * labeled alternative in {@link PostSQLParser#unitStatement}.
	 * @param ctx the parse tree
	 */
	void enterSTMdelete(PostSQLParser.STMdeleteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STMdelete}
	 * labeled alternative in {@link PostSQLParser#unitStatement}.
	 * @param ctx the parse tree
	 */
	void exitSTMdelete(PostSQLParser.STMdeleteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STMselect}
	 * labeled alternative in {@link PostSQLParser#unitStatement}.
	 * @param ctx the parse tree
	 */
	void enterSTMselect(PostSQLParser.STMselectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STMselect}
	 * labeled alternative in {@link PostSQLParser#unitStatement}.
	 * @param ctx the parse tree
	 */
	void exitSTMselect(PostSQLParser.STMselectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryKeyDeclConstr}
	 * labeled alternative in {@link PostSQLParser#constraints}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKeyDeclConstr(PostSQLParser.PrimaryKeyDeclConstrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryKeyDeclConstr}
	 * labeled alternative in {@link PostSQLParser#constraints}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKeyDeclConstr(PostSQLParser.PrimaryKeyDeclConstrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code foreignKeyDeclConstr}
	 * labeled alternative in {@link PostSQLParser#constraints}.
	 * @param ctx the parse tree
	 */
	void enterForeignKeyDeclConstr(PostSQLParser.ForeignKeyDeclConstrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code foreignKeyDeclConstr}
	 * labeled alternative in {@link PostSQLParser#constraints}.
	 * @param ctx the parse tree
	 */
	void exitForeignKeyDeclConstr(PostSQLParser.ForeignKeyDeclConstrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code checkDeclConstr}
	 * labeled alternative in {@link PostSQLParser#constraints}.
	 * @param ctx the parse tree
	 */
	void enterCheckDeclConstr(PostSQLParser.CheckDeclConstrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code checkDeclConstr}
	 * labeled alternative in {@link PostSQLParser#constraints}.
	 * @param ctx the parse tree
	 */
	void exitCheckDeclConstr(PostSQLParser.CheckDeclConstrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multipleColumn}
	 * labeled alternative in {@link PostSQLParser#columDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMultipleColumn(PostSQLParser.MultipleColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multipleColumn}
	 * labeled alternative in {@link PostSQLParser#columDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMultipleColumn(PostSQLParser.MultipleColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expDecl}
	 * labeled alternative in {@link PostSQLParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpDecl(PostSQLParser.ExpDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expDecl}
	 * labeled alternative in {@link PostSQLParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpDecl(PostSQLParser.ExpDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andOperation}
	 * labeled alternative in {@link PostSQLParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void enterAndOperation(PostSQLParser.AndOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andOperation}
	 * labeled alternative in {@link PostSQLParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void exitAndOperation(PostSQLParser.AndOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orOperation}
	 * labeled alternative in {@link PostSQLParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void enterOrOperation(PostSQLParser.OrOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orOperation}
	 * labeled alternative in {@link PostSQLParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void exitOrOperation(PostSQLParser.OrOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notOperation}
	 * labeled alternative in {@link PostSQLParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void enterNotOperation(PostSQLParser.NotOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notOperation}
	 * labeled alternative in {@link PostSQLParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void exitNotOperation(PostSQLParser.NotOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code menorQueOp}
	 * labeled alternative in {@link PostSQLParser#eq_sgn}.
	 * @param ctx the parse tree
	 */
	void enterMenorQueOp(PostSQLParser.MenorQueOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code menorQueOp}
	 * labeled alternative in {@link PostSQLParser#eq_sgn}.
	 * @param ctx the parse tree
	 */
	void exitMenorQueOp(PostSQLParser.MenorQueOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mayorQueOP}
	 * labeled alternative in {@link PostSQLParser#eq_sgn}.
	 * @param ctx the parse tree
	 */
	void enterMayorQueOP(PostSQLParser.MayorQueOPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mayorQueOP}
	 * labeled alternative in {@link PostSQLParser#eq_sgn}.
	 * @param ctx the parse tree
	 */
	void exitMayorQueOP(PostSQLParser.MayorQueOPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code menorIgualQueOp}
	 * labeled alternative in {@link PostSQLParser#eq_sgn}.
	 * @param ctx the parse tree
	 */
	void enterMenorIgualQueOp(PostSQLParser.MenorIgualQueOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code menorIgualQueOp}
	 * labeled alternative in {@link PostSQLParser#eq_sgn}.
	 * @param ctx the parse tree
	 */
	void exitMenorIgualQueOp(PostSQLParser.MenorIgualQueOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mayorIgualQueOp}
	 * labeled alternative in {@link PostSQLParser#eq_sgn}.
	 * @param ctx the parse tree
	 */
	void enterMayorIgualQueOp(PostSQLParser.MayorIgualQueOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mayorIgualQueOp}
	 * labeled alternative in {@link PostSQLParser#eq_sgn}.
	 * @param ctx the parse tree
	 */
	void exitMayorIgualQueOp(PostSQLParser.MayorIgualQueOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code diferenteOP}
	 * labeled alternative in {@link PostSQLParser#eq_sgn}.
	 * @param ctx the parse tree
	 */
	void enterDiferenteOP(PostSQLParser.DiferenteOPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code diferenteOP}
	 * labeled alternative in {@link PostSQLParser#eq_sgn}.
	 * @param ctx the parse tree
	 */
	void exitDiferenteOP(PostSQLParser.DiferenteOPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code igualOP}
	 * labeled alternative in {@link PostSQLParser#eq_sgn}.
	 * @param ctx the parse tree
	 */
	void enterIgualOP(PostSQLParser.IgualOPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code igualOP}
	 * labeled alternative in {@link PostSQLParser#eq_sgn}.
	 * @param ctx the parse tree
	 */
	void exitIgualOP(PostSQLParser.IgualOPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addColumn}
	 * labeled alternative in {@link PostSQLParser#action_alter_table}.
	 * @param ctx the parse tree
	 */
	void enterAddColumn(PostSQLParser.AddColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addColumn}
	 * labeled alternative in {@link PostSQLParser#action_alter_table}.
	 * @param ctx the parse tree
	 */
	void exitAddColumn(PostSQLParser.AddColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addConstraints}
	 * labeled alternative in {@link PostSQLParser#action_alter_table}.
	 * @param ctx the parse tree
	 */
	void enterAddConstraints(PostSQLParser.AddConstraintsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addConstraints}
	 * labeled alternative in {@link PostSQLParser#action_alter_table}.
	 * @param ctx the parse tree
	 */
	void exitAddConstraints(PostSQLParser.AddConstraintsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropColumn}
	 * labeled alternative in {@link PostSQLParser#action_alter_table}.
	 * @param ctx the parse tree
	 */
	void enterDropColumn(PostSQLParser.DropColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropColumn}
	 * labeled alternative in {@link PostSQLParser#action_alter_table}.
	 * @param ctx the parse tree
	 */
	void exitDropColumn(PostSQLParser.DropColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropConstraints}
	 * labeled alternative in {@link PostSQLParser#action_alter_table}.
	 * @param ctx the parse tree
	 */
	void enterDropConstraints(PostSQLParser.DropConstraintsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropConstraints}
	 * labeled alternative in {@link PostSQLParser#action_alter_table}.
	 * @param ctx the parse tree
	 */
	void exitDropConstraints(PostSQLParser.DropConstraintsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link PostSQLParser#action_alter_table}.
	 * @param ctx the parse tree
	 */
	void enterRenameTable(PostSQLParser.RenameTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link PostSQLParser#action_alter_table}.
	 * @param ctx the parse tree
	 */
	void exitRenameTable(PostSQLParser.RenameTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertInto}
	 * labeled alternative in {@link PostSQLParser#insert_into}.
	 * @param ctx the parse tree
	 */
	void enterInsertInto(PostSQLParser.InsertIntoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertInto}
	 * labeled alternative in {@link PostSQLParser#insert_into}.
	 * @param ctx the parse tree
	 */
	void exitInsertInto(PostSQLParser.InsertIntoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code updateDecl}
	 * labeled alternative in {@link PostSQLParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdateDecl(PostSQLParser.UpdateDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code updateDecl}
	 * labeled alternative in {@link PostSQLParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdateDecl(PostSQLParser.UpdateDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condicionDecl}
	 * labeled alternative in {@link PostSQLParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicionDecl(PostSQLParser.CondicionDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condicionDecl}
	 * labeled alternative in {@link PostSQLParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicionDecl(PostSQLParser.CondicionDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code deleteDecl}
	 * labeled alternative in {@link PostSQLParser#delete}.
	 * @param ctx the parse tree
	 */
	void enterDeleteDecl(PostSQLParser.DeleteDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code deleteDecl}
	 * labeled alternative in {@link PostSQLParser#delete}.
	 * @param ctx the parse tree
	 */
	void exitDeleteDecl(PostSQLParser.DeleteDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectDecl}
	 * labeled alternative in {@link PostSQLParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelectDecl(PostSQLParser.SelectDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectDecl}
	 * labeled alternative in {@link PostSQLParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelectDecl(PostSQLParser.SelectDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varint}
	 * labeled alternative in {@link PostSQLParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterVarint(PostSQLParser.VarintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varint}
	 * labeled alternative in {@link PostSQLParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitVarint(PostSQLParser.VarintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varchar}
	 * labeled alternative in {@link PostSQLParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterVarchar(PostSQLParser.VarcharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varchar}
	 * labeled alternative in {@link PostSQLParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitVarchar(PostSQLParser.VarcharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varfloat}
	 * labeled alternative in {@link PostSQLParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterVarfloat(PostSQLParser.VarfloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varfloat}
	 * labeled alternative in {@link PostSQLParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitVarfloat(PostSQLParser.VarfloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vardate}
	 * labeled alternative in {@link PostSQLParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterVardate(PostSQLParser.VardateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vardate}
	 * labeled alternative in {@link PostSQLParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitVardate(PostSQLParser.VardateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varnull}
	 * labeled alternative in {@link PostSQLParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterVarnull(PostSQLParser.VarnullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varnull}
	 * labeled alternative in {@link PostSQLParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitVarnull(PostSQLParser.VarnullContext ctx);
}