// Generated from PostSQL.g4 by ANTLR 4.7.1
package antlrGenerateFiles;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PostSQLParser}.
 */
public interface PostSQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code sqlScript}
	 * labeled alternative in {@link PostSQLParser#sql_script}.
	 * @param ctx the parse tree
	 */
	void enterSqlScript(PostSQLParser.SqlScriptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sqlScript}
	 * labeled alternative in {@link PostSQLParser#sql_script}.
	 * @param ctx the parse tree
	 */
	void exitSqlScript(PostSQLParser.SqlScriptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STMcreateDB}
	 * labeled alternative in {@link PostSQLParser#unit_statement}.
	 * @param ctx the parse tree
	 */
	void enterSTMcreateDB(PostSQLParser.STMcreateDBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STMcreateDB}
	 * labeled alternative in {@link PostSQLParser#unit_statement}.
	 * @param ctx the parse tree
	 */
	void exitSTMcreateDB(PostSQLParser.STMcreateDBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STMdropDB}
	 * labeled alternative in {@link PostSQLParser#unit_statement}.
	 * @param ctx the parse tree
	 */
	void enterSTMdropDB(PostSQLParser.STMdropDBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STMdropDB}
	 * labeled alternative in {@link PostSQLParser#unit_statement}.
	 * @param ctx the parse tree
	 */
	void exitSTMdropDB(PostSQLParser.STMdropDBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STMshowDB}
	 * labeled alternative in {@link PostSQLParser#unit_statement}.
	 * @param ctx the parse tree
	 */
	void enterSTMshowDB(PostSQLParser.STMshowDBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STMshowDB}
	 * labeled alternative in {@link PostSQLParser#unit_statement}.
	 * @param ctx the parse tree
	 */
	void exitSTMshowDB(PostSQLParser.STMshowDBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STMalterTable}
	 * labeled alternative in {@link PostSQLParser#unit_statement}.
	 * @param ctx the parse tree
	 */
	void enterSTMalterTable(PostSQLParser.STMalterTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STMalterTable}
	 * labeled alternative in {@link PostSQLParser#unit_statement}.
	 * @param ctx the parse tree
	 */
	void exitSTMalterTable(PostSQLParser.STMalterTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STMshowTable}
	 * labeled alternative in {@link PostSQLParser#unit_statement}.
	 * @param ctx the parse tree
	 */
	void enterSTMshowTable(PostSQLParser.STMshowTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STMshowTable}
	 * labeled alternative in {@link PostSQLParser#unit_statement}.
	 * @param ctx the parse tree
	 */
	void exitSTMshowTable(PostSQLParser.STMshowTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STMuseDB}
	 * labeled alternative in {@link PostSQLParser#unit_statement}.
	 * @param ctx the parse tree
	 */
	void enterSTMuseDB(PostSQLParser.STMuseDBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STMuseDB}
	 * labeled alternative in {@link PostSQLParser#unit_statement}.
	 * @param ctx the parse tree
	 */
	void exitSTMuseDB(PostSQLParser.STMuseDBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STMdropTable}
	 * labeled alternative in {@link PostSQLParser#unit_statement}.
	 * @param ctx the parse tree
	 */
	void enterSTMdropTable(PostSQLParser.STMdropTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STMdropTable}
	 * labeled alternative in {@link PostSQLParser#unit_statement}.
	 * @param ctx the parse tree
	 */
	void exitSTMdropTable(PostSQLParser.STMdropTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STMfuckTable}
	 * labeled alternative in {@link PostSQLParser#unit_statement}.
	 * @param ctx the parse tree
	 */
	void enterSTMfuckTable(PostSQLParser.STMfuckTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STMfuckTable}
	 * labeled alternative in {@link PostSQLParser#unit_statement}.
	 * @param ctx the parse tree
	 */
	void exitSTMfuckTable(PostSQLParser.STMfuckTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STMinsertInto}
	 * labeled alternative in {@link PostSQLParser#unit_statement}.
	 * @param ctx the parse tree
	 */
	void enterSTMinsertInto(PostSQLParser.STMinsertIntoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STMinsertInto}
	 * labeled alternative in {@link PostSQLParser#unit_statement}.
	 * @param ctx the parse tree
	 */
	void exitSTMinsertInto(PostSQLParser.STMinsertIntoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STMupdate}
	 * labeled alternative in {@link PostSQLParser#unit_statement}.
	 * @param ctx the parse tree
	 */
	void enterSTMupdate(PostSQLParser.STMupdateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STMupdate}
	 * labeled alternative in {@link PostSQLParser#unit_statement}.
	 * @param ctx the parse tree
	 */
	void exitSTMupdate(PostSQLParser.STMupdateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STMdelete}
	 * labeled alternative in {@link PostSQLParser#unit_statement}.
	 * @param ctx the parse tree
	 */
	void enterSTMdelete(PostSQLParser.STMdeleteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STMdelete}
	 * labeled alternative in {@link PostSQLParser#unit_statement}.
	 * @param ctx the parse tree
	 */
	void exitSTMdelete(PostSQLParser.STMdeleteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STMselect}
	 * labeled alternative in {@link PostSQLParser#unit_statement}.
	 * @param ctx the parse tree
	 */
	void enterSTMselect(PostSQLParser.STMselectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STMselect}
	 * labeled alternative in {@link PostSQLParser#unit_statement}.
	 * @param ctx the parse tree
	 */
	void exitSTMselect(PostSQLParser.STMselectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createDatabase}
	 * labeled alternative in {@link PostSQLParser#create_database}.
	 * @param ctx the parse tree
	 */
	void enterCreateDatabase(PostSQLParser.CreateDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createDatabase}
	 * labeled alternative in {@link PostSQLParser#create_database}.
	 * @param ctx the parse tree
	 */
	void exitCreateDatabase(PostSQLParser.CreateDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropDatabase}
	 * labeled alternative in {@link PostSQLParser#drop_database}.
	 * @param ctx the parse tree
	 */
	void enterDropDatabase(PostSQLParser.DropDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropDatabase}
	 * labeled alternative in {@link PostSQLParser#drop_database}.
	 * @param ctx the parse tree
	 */
	void exitDropDatabase(PostSQLParser.DropDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showDatabase}
	 * labeled alternative in {@link PostSQLParser#show_database}.
	 * @param ctx the parse tree
	 */
	void enterShowDatabase(PostSQLParser.ShowDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showDatabase}
	 * labeled alternative in {@link PostSQLParser#show_database}.
	 * @param ctx the parse tree
	 */
	void exitShowDatabase(PostSQLParser.ShowDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code useDatabase}
	 * labeled alternative in {@link PostSQLParser#use_database}.
	 * @param ctx the parse tree
	 */
	void enterUseDatabase(PostSQLParser.UseDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code useDatabase}
	 * labeled alternative in {@link PostSQLParser#use_database}.
	 * @param ctx the parse tree
	 */
	void exitUseDatabase(PostSQLParser.UseDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link PostSQLParser#create_table}.
	 * @param ctx the parse tree
	 */
	void enterCreateTable(PostSQLParser.CreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link PostSQLParser#create_table}.
	 * @param ctx the parse tree
	 */
	void exitCreateTable(PostSQLParser.CreateTableContext ctx);
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
	 * Enter a parse tree produced by the {@code simpleColumn}
	 * labeled alternative in {@link PostSQLParser#columDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSimpleColumn(PostSQLParser.SimpleColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleColumn}
	 * labeled alternative in {@link PostSQLParser#columDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSimpleColumn(PostSQLParser.SimpleColumnContext ctx);
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
	 * Enter a parse tree produced by the {@code primaryKeyDecl}
	 * labeled alternative in {@link PostSQLParser#primaryKeyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKeyDecl(PostSQLParser.PrimaryKeyDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryKeyDecl}
	 * labeled alternative in {@link PostSQLParser#primaryKeyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKeyDecl(PostSQLParser.PrimaryKeyDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code foreignDecl}
	 * labeled alternative in {@link PostSQLParser#foreignKeyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterForeignDecl(PostSQLParser.ForeignDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code foreignDecl}
	 * labeled alternative in {@link PostSQLParser#foreignKeyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitForeignDecl(PostSQLParser.ForeignDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code checkDecl}
	 * labeled alternative in {@link PostSQLParser#checkDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterCheckDecl(PostSQLParser.CheckDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code checkDecl}
	 * labeled alternative in {@link PostSQLParser#checkDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitCheckDecl(PostSQLParser.CheckDeclContext ctx);
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
	 * Enter a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link PostSQLParser#alter_table}.
	 * @param ctx the parse tree
	 */
	void enterRenameTable(PostSQLParser.RenameTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link PostSQLParser#alter_table}.
	 * @param ctx the parse tree
	 */
	void exitRenameTable(PostSQLParser.RenameTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterTable}
	 * labeled alternative in {@link PostSQLParser#alter_table}.
	 * @param ctx the parse tree
	 */
	void enterAlterTable(PostSQLParser.AlterTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterTable}
	 * labeled alternative in {@link PostSQLParser#alter_table}.
	 * @param ctx the parse tree
	 */
	void exitAlterTable(PostSQLParser.AlterTableContext ctx);
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
	 * Enter a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link PostSQLParser#drop_table}.
	 * @param ctx the parse tree
	 */
	void enterDropTable(PostSQLParser.DropTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link PostSQLParser#drop_table}.
	 * @param ctx the parse tree
	 */
	void exitDropTable(PostSQLParser.DropTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showTable}
	 * labeled alternative in {@link PostSQLParser#show_table}.
	 * @param ctx the parse tree
	 */
	void enterShowTable(PostSQLParser.ShowTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showTable}
	 * labeled alternative in {@link PostSQLParser#show_table}.
	 * @param ctx the parse tree
	 */
	void exitShowTable(PostSQLParser.ShowTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showColumn}
	 * labeled alternative in {@link PostSQLParser#show_column}.
	 * @param ctx the parse tree
	 */
	void enterShowColumn(PostSQLParser.ShowColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showColumn}
	 * labeled alternative in {@link PostSQLParser#show_column}.
	 * @param ctx the parse tree
	 */
	void exitShowColumn(PostSQLParser.ShowColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fuckDatabase}
	 * labeled alternative in {@link PostSQLParser#fuck_database}.
	 * @param ctx the parse tree
	 */
	void enterFuckDatabase(PostSQLParser.FuckDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fuckDatabase}
	 * labeled alternative in {@link PostSQLParser#fuck_database}.
	 * @param ctx the parse tree
	 */
	void exitFuckDatabase(PostSQLParser.FuckDatabaseContext ctx);
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
	 * Enter a parse tree produced by the {@code var_int}
	 * labeled alternative in {@link PostSQLParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterVar_int(PostSQLParser.Var_intContext ctx);
	/**
	 * Exit a parse tree produced by the {@code var_int}
	 * labeled alternative in {@link PostSQLParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitVar_int(PostSQLParser.Var_intContext ctx);
	/**
	 * Enter a parse tree produced by the {@code var_char}
	 * labeled alternative in {@link PostSQLParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterVar_char(PostSQLParser.Var_charContext ctx);
	/**
	 * Exit a parse tree produced by the {@code var_char}
	 * labeled alternative in {@link PostSQLParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitVar_char(PostSQLParser.Var_charContext ctx);
	/**
	 * Enter a parse tree produced by the {@code var_boolean}
	 * labeled alternative in {@link PostSQLParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterVar_boolean(PostSQLParser.Var_booleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code var_boolean}
	 * labeled alternative in {@link PostSQLParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitVar_boolean(PostSQLParser.Var_booleanContext ctx);
}