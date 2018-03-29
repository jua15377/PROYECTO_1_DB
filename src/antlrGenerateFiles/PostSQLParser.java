// Generated from PostSQL.g4 by ANTLR 4.7.1
package antlrGenerateFiles;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PostSQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, COLON=16, SEMICOLON=17, 
		CREATE=18, TABLE=19, DATABASE=20, DROP=21, SHOW=22, PRIMARY=23, KEY=24, 
		FOREIGN=25, CONSTRAINT=26, REFERENCES=27, FROM=28, CHECK=29, ALTER=30, 
		RENAME=31, TO=32, ADD=33, COLUMN=34, INSERT_INTO=35, VALUES=36, UPDATE=37, 
		SET=38, DELETE=39, WHERE=40, ORDER_BY=41, ASC=42, DESC=43, INT=44, CHAR=45, 
		BOOLEAN=46, AND=47, OR=48, NOT=49, SELECT=50, USE=51, ID=52, NUM=53, Char=54, 
		WS=55;
	public static final int
		RULE_sql_script = 0, RULE_unit_statement = 1, RULE_create_database = 2, 
		RULE_drop_database = 3, RULE_show_database = 4, RULE_use_database = 5, 
		RULE_create_table = 6, RULE_constraints = 7, RULE_columDeclaration = 8, 
		RULE_primaryKeyDeclaration = 9, RULE_foreignKeyDeclaration = 10, RULE_checkDeclaration = 11, 
		RULE_exp = 12, RULE_eq_op = 13, RULE_eq_sgn = 14, RULE_alter_table = 15, 
		RULE_action_alter_table = 16, RULE_drop_table = 17, RULE_show_table = 18, 
		RULE_show_column = 19, RULE_fuck_database = 20, RULE_insert_into = 21, 
		RULE_update = 22, RULE_condicion = 23, RULE_delete = 24, RULE_select = 25, 
		RULE_varType = 26;
	public static final String[] ruleNames = {
		"sql_script", "unit_statement", "create_database", "drop_database", "show_database", 
		"use_database", "create_table", "constraints", "columDeclaration", "primaryKeyDeclaration", 
		"foreignKeyDeclaration", "checkDeclaration", "exp", "eq_op", "eq_sgn", 
		"alter_table", "action_alter_table", "drop_table", "show_table", "show_column", 
		"fuck_database", "insert_into", "update", "condicion", "delete", "select", 
		"varType"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "','", "'PK_'", "'FK_'", "'CH_'", "'<'", "'>'", "'<='", 
		"'>='", "'<>'", "'='", "'SHOW COLUMNS'", "'FUCK DATABASE'", "'*'", "':'", 
		"';'", "'CREATE'", "'TABLE'", "'DATABASE'", "'DROP'", "'SHOW'", "'PRIMARY'", 
		"'KEY'", "'FOREIGN'", "'CONSTRAINT'", "'REFERENCES'", "'FROM'", "'CHECK'", 
		"'ALTER'", "'RENAME'", "'TO'", "'ADD'", "'COLUMN'", "'INSERT INTO'", "'VALUES'", 
		"'UPDATE'", "'SET'", "'DELETE'", "'WHERE'", "'ORDER BY'", "'ASC'", "'DESC'", 
		"'INT'", "'CHAR'", "'BOOLEAN'", "'AND'", "'OR'", "'NOT'", "'SELECT'", 
		"'USE'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "COLON", "SEMICOLON", "CREATE", "TABLE", "DATABASE", 
		"DROP", "SHOW", "PRIMARY", "KEY", "FOREIGN", "CONSTRAINT", "REFERENCES", 
		"FROM", "CHECK", "ALTER", "RENAME", "TO", "ADD", "COLUMN", "INSERT_INTO", 
		"VALUES", "UPDATE", "SET", "DELETE", "WHERE", "ORDER_BY", "ASC", "DESC", 
		"INT", "CHAR", "BOOLEAN", "AND", "OR", "NOT", "SELECT", "USE", "ID", "NUM", 
		"Char", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PostSQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PostSQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Sql_scriptContext extends ParserRuleContext {
		public Sql_scriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_script; }
	 
		public Sql_scriptContext() { }
		public void copyFrom(Sql_scriptContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SqlScriptContext extends Sql_scriptContext {
		public List<Unit_statementContext> unit_statement() {
			return getRuleContexts(Unit_statementContext.class);
		}
		public Unit_statementContext unit_statement(int i) {
			return getRuleContext(Unit_statementContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(PostSQLParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(PostSQLParser.SEMICOLON, i);
		}
		public SqlScriptContext(Sql_scriptContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitSqlScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_scriptContext sql_script() throws RecognitionException {
		Sql_scriptContext _localctx = new Sql_scriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sql_script);
		int _la;
		try {
			_localctx = new SqlScriptContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << CREATE) | (1L << DROP) | (1L << SHOW) | (1L << ALTER) | (1L << INSERT_INTO) | (1L << UPDATE) | (1L << DELETE) | (1L << SELECT) | (1L << USE))) != 0)) {
				{
				{
				{
				setState(54);
				unit_statement();
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(55);
					match(SEMICOLON);
					}
				}

				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unit_statementContext extends ParserRuleContext {
		public Unit_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unit_statement; }
	 
		public Unit_statementContext() { }
		public void copyFrom(Unit_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class STMalterTableContext extends Unit_statementContext {
		public Alter_tableContext alter_table() {
			return getRuleContext(Alter_tableContext.class,0);
		}
		public STMalterTableContext(Unit_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitSTMalterTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class STMshowTableContext extends Unit_statementContext {
		public Show_tableContext show_table() {
			return getRuleContext(Show_tableContext.class,0);
		}
		public STMshowTableContext(Unit_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitSTMshowTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class STMuseDBContext extends Unit_statementContext {
		public Use_databaseContext use_database() {
			return getRuleContext(Use_databaseContext.class,0);
		}
		public STMuseDBContext(Unit_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitSTMuseDB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class STMcreateDBContext extends Unit_statementContext {
		public Create_databaseContext create_database() {
			return getRuleContext(Create_databaseContext.class,0);
		}
		public Create_tableContext create_table() {
			return getRuleContext(Create_tableContext.class,0);
		}
		public STMcreateDBContext(Unit_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitSTMcreateDB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class STMinsertIntoContext extends Unit_statementContext {
		public Insert_intoContext insert_into() {
			return getRuleContext(Insert_intoContext.class,0);
		}
		public STMinsertIntoContext(Unit_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitSTMinsertInto(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class STMupdateContext extends Unit_statementContext {
		public UpdateContext update() {
			return getRuleContext(UpdateContext.class,0);
		}
		public STMupdateContext(Unit_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitSTMupdate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class STMdropDBContext extends Unit_statementContext {
		public Drop_databaseContext drop_database() {
			return getRuleContext(Drop_databaseContext.class,0);
		}
		public STMdropDBContext(Unit_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitSTMdropDB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class STMdropTableContext extends Unit_statementContext {
		public Drop_tableContext drop_table() {
			return getRuleContext(Drop_tableContext.class,0);
		}
		public STMdropTableContext(Unit_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitSTMdropTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class STMselectContext extends Unit_statementContext {
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public STMselectContext(Unit_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitSTMselect(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class STMshowDBContext extends Unit_statementContext {
		public Show_databaseContext show_database() {
			return getRuleContext(Show_databaseContext.class,0);
		}
		public STMshowDBContext(Unit_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitSTMshowDB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class STMdeleteContext extends Unit_statementContext {
		public DeleteContext delete() {
			return getRuleContext(DeleteContext.class,0);
		}
		public STMdeleteContext(Unit_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitSTMdelete(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class STMfuckTableContext extends Unit_statementContext {
		public Fuck_databaseContext fuck_database() {
			return getRuleContext(Fuck_databaseContext.class,0);
		}
		public STMfuckTableContext(Unit_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitSTMfuckTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unit_statementContext unit_statement() throws RecognitionException {
		Unit_statementContext _localctx = new Unit_statementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_unit_statement);
		try {
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new STMcreateDBContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				create_database();
				}
				break;
			case 2:
				_localctx = new STMdropDBContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				drop_database();
				}
				break;
			case 3:
				_localctx = new STMshowDBContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				show_database();
				}
				break;
			case 4:
				_localctx = new STMcreateDBContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				create_table();
				}
				break;
			case 5:
				_localctx = new STMalterTableContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(67);
				alter_table();
				}
				break;
			case 6:
				_localctx = new STMshowTableContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(68);
				show_table();
				}
				break;
			case 7:
				_localctx = new STMuseDBContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(69);
				use_database();
				}
				break;
			case 8:
				_localctx = new STMdropTableContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(70);
				drop_table();
				}
				break;
			case 9:
				_localctx = new STMfuckTableContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(71);
				fuck_database();
				}
				break;
			case 10:
				_localctx = new STMinsertIntoContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(72);
				insert_into();
				}
				break;
			case 11:
				_localctx = new STMupdateContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(73);
				update();
				}
				break;
			case 12:
				_localctx = new STMdeleteContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(74);
				delete();
				}
				break;
			case 13:
				_localctx = new STMselectContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(75);
				select();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_databaseContext extends ParserRuleContext {
		public Create_databaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_database; }
	 
		public Create_databaseContext() { }
		public void copyFrom(Create_databaseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CreateDatabaseContext extends Create_databaseContext {
		public TerminalNode CREATE() { return getToken(PostSQLParser.CREATE, 0); }
		public TerminalNode DATABASE() { return getToken(PostSQLParser.DATABASE, 0); }
		public TerminalNode ID() { return getToken(PostSQLParser.ID, 0); }
		public CreateDatabaseContext(Create_databaseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitCreateDatabase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_databaseContext create_database() throws RecognitionException {
		Create_databaseContext _localctx = new Create_databaseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_create_database);
		try {
			_localctx = new CreateDatabaseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(CREATE);
			setState(79);
			match(DATABASE);
			setState(80);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_databaseContext extends ParserRuleContext {
		public Drop_databaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_database; }
	 
		public Drop_databaseContext() { }
		public void copyFrom(Drop_databaseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DropDatabaseContext extends Drop_databaseContext {
		public TerminalNode DROP() { return getToken(PostSQLParser.DROP, 0); }
		public TerminalNode DATABASE() { return getToken(PostSQLParser.DATABASE, 0); }
		public TerminalNode ID() { return getToken(PostSQLParser.ID, 0); }
		public DropDatabaseContext(Drop_databaseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitDropDatabase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_databaseContext drop_database() throws RecognitionException {
		Drop_databaseContext _localctx = new Drop_databaseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_drop_database);
		try {
			_localctx = new DropDatabaseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(DROP);
			setState(83);
			match(DATABASE);
			setState(84);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Show_databaseContext extends ParserRuleContext {
		public Show_databaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show_database; }
	 
		public Show_databaseContext() { }
		public void copyFrom(Show_databaseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ShowDatabaseContext extends Show_databaseContext {
		public TerminalNode SHOW() { return getToken(PostSQLParser.SHOW, 0); }
		public TerminalNode DATABASE() { return getToken(PostSQLParser.DATABASE, 0); }
		public ShowDatabaseContext(Show_databaseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitShowDatabase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Show_databaseContext show_database() throws RecognitionException {
		Show_databaseContext _localctx = new Show_databaseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_show_database);
		try {
			_localctx = new ShowDatabaseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(SHOW);
			setState(87);
			match(DATABASE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Use_databaseContext extends ParserRuleContext {
		public Use_databaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use_database; }
	 
		public Use_databaseContext() { }
		public void copyFrom(Use_databaseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UseDatabaseContext extends Use_databaseContext {
		public TerminalNode USE() { return getToken(PostSQLParser.USE, 0); }
		public TerminalNode DATABASE() { return getToken(PostSQLParser.DATABASE, 0); }
		public TerminalNode ID() { return getToken(PostSQLParser.ID, 0); }
		public UseDatabaseContext(Use_databaseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitUseDatabase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Use_databaseContext use_database() throws RecognitionException {
		Use_databaseContext _localctx = new Use_databaseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_use_database);
		try {
			_localctx = new UseDatabaseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(USE);
			setState(90);
			match(DATABASE);
			setState(91);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_tableContext extends ParserRuleContext {
		public Create_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table; }
	 
		public Create_tableContext() { }
		public void copyFrom(Create_tableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CreateTableContext extends Create_tableContext {
		public TerminalNode CREATE() { return getToken(PostSQLParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(PostSQLParser.TABLE, 0); }
		public TerminalNode ID() { return getToken(PostSQLParser.ID, 0); }
		public ColumDeclarationContext columDeclaration() {
			return getRuleContext(ColumDeclarationContext.class,0);
		}
		public List<ConstraintsContext> constraints() {
			return getRuleContexts(ConstraintsContext.class);
		}
		public ConstraintsContext constraints(int i) {
			return getRuleContext(ConstraintsContext.class,i);
		}
		public CreateTableContext(Create_tableContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_tableContext create_table() throws RecognitionException {
		Create_tableContext _localctx = new Create_tableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_create_table);
		int _la;
		try {
			_localctx = new CreateTableContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(CREATE);
			setState(94);
			match(TABLE);
			setState(95);
			match(ID);
			setState(96);
			match(T__0);
			setState(97);
			columDeclaration();
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONSTRAINT) {
				{
				{
				setState(98);
				constraints();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstraintsContext extends ParserRuleContext {
		public ConstraintsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraints; }
	 
		public ConstraintsContext() { }
		public void copyFrom(ConstraintsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrimaryKeyDeclConstrContext extends ConstraintsContext {
		public PrimaryKeyDeclarationContext primaryKeyDeclaration() {
			return getRuleContext(PrimaryKeyDeclarationContext.class,0);
		}
		public PrimaryKeyDeclConstrContext(ConstraintsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitPrimaryKeyDeclConstr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForeignKeyDeclConstrContext extends ConstraintsContext {
		public ForeignKeyDeclarationContext foreignKeyDeclaration() {
			return getRuleContext(ForeignKeyDeclarationContext.class,0);
		}
		public ForeignKeyDeclConstrContext(ConstraintsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitForeignKeyDeclConstr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CheckDeclConstrContext extends ConstraintsContext {
		public CheckDeclarationContext checkDeclaration() {
			return getRuleContext(CheckDeclarationContext.class,0);
		}
		public CheckDeclConstrContext(ConstraintsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitCheckDeclConstr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintsContext constraints() throws RecognitionException {
		ConstraintsContext _localctx = new ConstraintsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constraints);
		try {
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new PrimaryKeyDeclConstrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				primaryKeyDeclaration();
				}
				break;
			case 2:
				_localctx = new ForeignKeyDeclConstrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				foreignKeyDeclaration();
				}
				break;
			case 3:
				_localctx = new CheckDeclConstrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				checkDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumDeclarationContext extends ParserRuleContext {
		public ColumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columDeclaration; }
	 
		public ColumDeclarationContext() { }
		public void copyFrom(ColumDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SimpleColumnContext extends ColumDeclarationContext {
		public TerminalNode ID() { return getToken(PostSQLParser.ID, 0); }
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public SimpleColumnContext(ColumDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitSimpleColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultipleColumnContext extends ColumDeclarationContext {
		public List<TerminalNode> ID() { return getTokens(PostSQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PostSQLParser.ID, i);
		}
		public List<VarTypeContext> varType() {
			return getRuleContexts(VarTypeContext.class);
		}
		public VarTypeContext varType(int i) {
			return getRuleContext(VarTypeContext.class,i);
		}
		public MultipleColumnContext(ColumDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitMultipleColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumDeclarationContext columDeclaration() throws RecognitionException {
		ColumDeclarationContext _localctx = new ColumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_columDeclaration);
		int _la;
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new SimpleColumnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(ID);
				setState(112);
				varType();
				}
				break;
			case 2:
				_localctx = new MultipleColumnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				match(ID);
				setState(114);
				varType();
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(115);
					match(T__2);
					setState(116);
					match(ID);
					setState(117);
					varType();
					}
					}
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryKeyDeclarationContext extends ParserRuleContext {
		public PrimaryKeyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKeyDeclaration; }
	 
		public PrimaryKeyDeclarationContext() { }
		public void copyFrom(PrimaryKeyDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrimaryKeyDeclContext extends PrimaryKeyDeclarationContext {
		public TerminalNode CONSTRAINT() { return getToken(PostSQLParser.CONSTRAINT, 0); }
		public List<TerminalNode> ID() { return getTokens(PostSQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PostSQLParser.ID, i);
		}
		public TerminalNode PRIMARY() { return getToken(PostSQLParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(PostSQLParser.KEY, 0); }
		public PrimaryKeyDeclContext(PrimaryKeyDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitPrimaryKeyDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryKeyDeclarationContext primaryKeyDeclaration() throws RecognitionException {
		PrimaryKeyDeclarationContext _localctx = new PrimaryKeyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_primaryKeyDeclaration);
		int _la;
		try {
			_localctx = new PrimaryKeyDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(CONSTRAINT);
			setState(126);
			match(T__3);
			setState(127);
			match(ID);
			setState(128);
			match(PRIMARY);
			setState(129);
			match(KEY);
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(130);
				match(T__0);
				setState(131);
				match(ID);
				}
				break;
			case ID:
				{
				setState(132);
				match(ID);
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(133);
					match(T__2);
					setState(134);
					match(ID);
					}
					}
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(140);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForeignKeyDeclarationContext extends ParserRuleContext {
		public ForeignKeyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreignKeyDeclaration; }
	 
		public ForeignKeyDeclarationContext() { }
		public void copyFrom(ForeignKeyDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForeignDeclContext extends ForeignKeyDeclarationContext {
		public TerminalNode CONSTRAINT() { return getToken(PostSQLParser.CONSTRAINT, 0); }
		public List<TerminalNode> ID() { return getTokens(PostSQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PostSQLParser.ID, i);
		}
		public TerminalNode FOREIGN() { return getToken(PostSQLParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(PostSQLParser.KEY, 0); }
		public TerminalNode REFERENCES() { return getToken(PostSQLParser.REFERENCES, 0); }
		public ForeignDeclContext(ForeignKeyDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitForeignDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeignKeyDeclarationContext foreignKeyDeclaration() throws RecognitionException {
		ForeignKeyDeclarationContext _localctx = new ForeignKeyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_foreignKeyDeclaration);
		int _la;
		try {
			_localctx = new ForeignDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(CONSTRAINT);
			setState(144);
			match(T__4);
			setState(145);
			match(ID);
			setState(146);
			match(FOREIGN);
			setState(147);
			match(KEY);
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(148);
				match(T__0);
				setState(149);
				match(ID);
				}
				break;
			case 2:
				{
				setState(150);
				match(ID);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(151);
					match(T__2);
					setState(152);
					match(ID);
					}
					}
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(158);
				match(T__1);
				setState(159);
				match(REFERENCES);
				setState(160);
				match(ID);
				setState(161);
				match(T__0);
				setState(162);
				match(ID);
				}
				break;
			case 3:
				{
				setState(163);
				match(ID);
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(164);
					match(T__2);
					setState(165);
					match(ID);
					}
					}
					setState(170);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(171);
				match(T__1);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CheckDeclarationContext extends ParserRuleContext {
		public CheckDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkDeclaration; }
	 
		public CheckDeclarationContext() { }
		public void copyFrom(CheckDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CheckDeclContext extends CheckDeclarationContext {
		public TerminalNode CONSTRAINT() { return getToken(PostSQLParser.CONSTRAINT, 0); }
		public TerminalNode ID() { return getToken(PostSQLParser.ID, 0); }
		public TerminalNode CHECK() { return getToken(PostSQLParser.CHECK, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public CheckDeclContext(CheckDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitCheckDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckDeclarationContext checkDeclaration() throws RecognitionException {
		CheckDeclarationContext _localctx = new CheckDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_checkDeclaration);
		try {
			_localctx = new CheckDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(CONSTRAINT);
			setState(175);
			match(T__5);
			setState(176);
			match(ID);
			setState(177);
			match(CHECK);
			setState(178);
			match(T__0);
			setState(179);
			exp();
			setState(180);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpDeclContext extends ExpContext {
		public List<TerminalNode> ID() { return getTokens(PostSQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PostSQLParser.ID, i);
		}
		public List<TerminalNode> NUM() { return getTokens(PostSQLParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(PostSQLParser.NUM, i);
		}
		public Eq_opContext eq_op() {
			return getRuleContext(Eq_opContext.class,0);
		}
		public Eq_sgnContext eq_sgn() {
			return getRuleContext(Eq_sgnContext.class,0);
		}
		public ExpDeclContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitExpDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_exp);
		int _la;
		try {
			_localctx = new ExpDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
			case OR:
			case NOT:
				{
				setState(183);
				eq_op();
				}
				break;
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
				{
				setState(184);
				eq_sgn();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(187);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Eq_opContext extends ParserRuleContext {
		public Eq_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq_op; }
	 
		public Eq_opContext() { }
		public void copyFrom(Eq_opContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AndOperationContext extends Eq_opContext {
		public TerminalNode AND() { return getToken(PostSQLParser.AND, 0); }
		public AndOperationContext(Eq_opContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitAndOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotOperationContext extends Eq_opContext {
		public TerminalNode NOT() { return getToken(PostSQLParser.NOT, 0); }
		public NotOperationContext(Eq_opContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitNotOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrOperationContext extends Eq_opContext {
		public TerminalNode OR() { return getToken(PostSQLParser.OR, 0); }
		public OrOperationContext(Eq_opContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitOrOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Eq_opContext eq_op() throws RecognitionException {
		Eq_opContext _localctx = new Eq_opContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_eq_op);
		try {
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				_localctx = new AndOperationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(AND);
				}
				break;
			case OR:
				_localctx = new OrOperationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				match(OR);
				}
				break;
			case NOT:
				_localctx = new NotOperationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				match(NOT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Eq_sgnContext extends ParserRuleContext {
		public Eq_sgnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq_sgn; }
	 
		public Eq_sgnContext() { }
		public void copyFrom(Eq_sgnContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MayorIgualQueOpContext extends Eq_sgnContext {
		public MayorIgualQueOpContext(Eq_sgnContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitMayorIgualQueOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MayorQueOPContext extends Eq_sgnContext {
		public MayorQueOPContext(Eq_sgnContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitMayorQueOP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MenorIgualQueOpContext extends Eq_sgnContext {
		public MenorIgualQueOpContext(Eq_sgnContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitMenorIgualQueOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MenorQueOpContext extends Eq_sgnContext {
		public MenorQueOpContext(Eq_sgnContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitMenorQueOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IgualOPContext extends Eq_sgnContext {
		public IgualOPContext(Eq_sgnContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitIgualOP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DiferenteOPContext extends Eq_sgnContext {
		public DiferenteOPContext(Eq_sgnContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitDiferenteOP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Eq_sgnContext eq_sgn() throws RecognitionException {
		Eq_sgnContext _localctx = new Eq_sgnContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_eq_sgn);
		try {
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				_localctx = new MenorQueOpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				match(T__6);
				}
				break;
			case T__7:
				_localctx = new MayorQueOPContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				match(T__7);
				}
				break;
			case T__8:
				_localctx = new MenorIgualQueOpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				match(T__8);
				}
				break;
			case T__9:
				_localctx = new MayorIgualQueOpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(197);
				match(T__9);
				}
				break;
			case T__10:
				_localctx = new DiferenteOPContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(198);
				match(T__10);
				}
				break;
			case T__11:
				_localctx = new IgualOPContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(199);
				match(T__11);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_tableContext extends ParserRuleContext {
		public Alter_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table; }
	 
		public Alter_tableContext() { }
		public void copyFrom(Alter_tableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RenameTableContext extends Alter_tableContext {
		public TerminalNode ALTER() { return getToken(PostSQLParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(PostSQLParser.TABLE, 0); }
		public List<TerminalNode> ID() { return getTokens(PostSQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PostSQLParser.ID, i);
		}
		public TerminalNode RENAME() { return getToken(PostSQLParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(PostSQLParser.TO, 0); }
		public RenameTableContext(Alter_tableContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitRenameTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableContext extends Alter_tableContext {
		public TerminalNode ALTER() { return getToken(PostSQLParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(PostSQLParser.TABLE, 0); }
		public TerminalNode ID() { return getToken(PostSQLParser.ID, 0); }
		public Action_alter_tableContext action_alter_table() {
			return getRuleContext(Action_alter_tableContext.class,0);
		}
		public AlterTableContext(Alter_tableContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitAlterTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_tableContext alter_table() throws RecognitionException {
		Alter_tableContext _localctx = new Alter_tableContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_alter_table);
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new RenameTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(ALTER);
				setState(203);
				match(TABLE);
				setState(204);
				match(ID);
				setState(205);
				match(RENAME);
				setState(206);
				match(TO);
				setState(207);
				match(ID);
				}
				break;
			case 2:
				_localctx = new AlterTableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(ALTER);
				setState(209);
				match(TABLE);
				setState(210);
				match(ID);
				setState(211);
				action_alter_table();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Action_alter_tableContext extends ParserRuleContext {
		public Action_alter_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action_alter_table; }
	 
		public Action_alter_tableContext() { }
		public void copyFrom(Action_alter_tableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddColumnContext extends Action_alter_tableContext {
		public TerminalNode ADD() { return getToken(PostSQLParser.ADD, 0); }
		public TerminalNode COLUMN() { return getToken(PostSQLParser.COLUMN, 0); }
		public TerminalNode ID() { return getToken(PostSQLParser.ID, 0); }
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public List<ConstraintsContext> constraints() {
			return getRuleContexts(ConstraintsContext.class);
		}
		public ConstraintsContext constraints(int i) {
			return getRuleContext(ConstraintsContext.class,i);
		}
		public AddColumnContext(Action_alter_tableContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitAddColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropConstraintsContext extends Action_alter_tableContext {
		public TerminalNode DROP() { return getToken(PostSQLParser.DROP, 0); }
		public TerminalNode CONSTRAINT() { return getToken(PostSQLParser.CONSTRAINT, 0); }
		public TerminalNode ID() { return getToken(PostSQLParser.ID, 0); }
		public DropConstraintsContext(Action_alter_tableContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitDropConstraints(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddConstraintsContext extends Action_alter_tableContext {
		public TerminalNode ADD() { return getToken(PostSQLParser.ADD, 0); }
		public List<ConstraintsContext> constraints() {
			return getRuleContexts(ConstraintsContext.class);
		}
		public ConstraintsContext constraints(int i) {
			return getRuleContext(ConstraintsContext.class,i);
		}
		public AddConstraintsContext(Action_alter_tableContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitAddConstraints(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropColumnContext extends Action_alter_tableContext {
		public TerminalNode DROP() { return getToken(PostSQLParser.DROP, 0); }
		public TerminalNode COLUMN() { return getToken(PostSQLParser.COLUMN, 0); }
		public TerminalNode ID() { return getToken(PostSQLParser.ID, 0); }
		public DropColumnContext(Action_alter_tableContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitDropColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Action_alter_tableContext action_alter_table() throws RecognitionException {
		Action_alter_tableContext _localctx = new Action_alter_tableContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_action_alter_table);
		int _la;
		try {
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new AddColumnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(ADD);
				setState(215);
				match(COLUMN);
				setState(216);
				match(ID);
				setState(217);
				varType();
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CONSTRAINT) {
					{
					{
					setState(218);
					constraints();
					}
					}
					setState(223);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new AddConstraintsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				match(ADD);
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CONSTRAINT) {
					{
					{
					setState(225);
					constraints();
					}
					}
					setState(230);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				_localctx = new DropColumnContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(231);
				match(DROP);
				setState(232);
				match(COLUMN);
				setState(233);
				match(ID);
				}
				break;
			case 4:
				_localctx = new DropConstraintsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(234);
				match(DROP);
				setState(235);
				match(CONSTRAINT);
				setState(236);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_tableContext extends ParserRuleContext {
		public Drop_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_table; }
	 
		public Drop_tableContext() { }
		public void copyFrom(Drop_tableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DropTableContext extends Drop_tableContext {
		public TerminalNode DROP() { return getToken(PostSQLParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(PostSQLParser.TABLE, 0); }
		public TerminalNode ID() { return getToken(PostSQLParser.ID, 0); }
		public DropTableContext(Drop_tableContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitDropTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_tableContext drop_table() throws RecognitionException {
		Drop_tableContext _localctx = new Drop_tableContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_drop_table);
		try {
			_localctx = new DropTableContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(DROP);
			setState(240);
			match(TABLE);
			setState(241);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Show_tableContext extends ParserRuleContext {
		public Show_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show_table; }
	 
		public Show_tableContext() { }
		public void copyFrom(Show_tableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ShowTableContext extends Show_tableContext {
		public TerminalNode SHOW() { return getToken(PostSQLParser.SHOW, 0); }
		public TerminalNode TABLE() { return getToken(PostSQLParser.TABLE, 0); }
		public ShowTableContext(Show_tableContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitShowTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Show_tableContext show_table() throws RecognitionException {
		Show_tableContext _localctx = new Show_tableContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_show_table);
		try {
			_localctx = new ShowTableContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(SHOW);
			setState(244);
			match(TABLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Show_columnContext extends ParserRuleContext {
		public Show_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show_column; }
	 
		public Show_columnContext() { }
		public void copyFrom(Show_columnContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ShowColumnContext extends Show_columnContext {
		public TerminalNode FROM() { return getToken(PostSQLParser.FROM, 0); }
		public TerminalNode ID() { return getToken(PostSQLParser.ID, 0); }
		public ShowColumnContext(Show_columnContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitShowColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Show_columnContext show_column() throws RecognitionException {
		Show_columnContext _localctx = new Show_columnContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_show_column);
		try {
			_localctx = new ShowColumnContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(T__12);
			setState(247);
			match(FROM);
			setState(248);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fuck_databaseContext extends ParserRuleContext {
		public Fuck_databaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fuck_database; }
	 
		public Fuck_databaseContext() { }
		public void copyFrom(Fuck_databaseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuckDatabaseContext extends Fuck_databaseContext {
		public FuckDatabaseContext(Fuck_databaseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitFuckDatabase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fuck_databaseContext fuck_database() throws RecognitionException {
		Fuck_databaseContext _localctx = new Fuck_databaseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_fuck_database);
		try {
			_localctx = new FuckDatabaseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_intoContext extends ParserRuleContext {
		public Insert_intoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_into; }
	 
		public Insert_intoContext() { }
		public void copyFrom(Insert_intoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InsertIntoContext extends Insert_intoContext {
		public TerminalNode INSERT_INTO() { return getToken(PostSQLParser.INSERT_INTO, 0); }
		public List<TerminalNode> ID() { return getTokens(PostSQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PostSQLParser.ID, i);
		}
		public TerminalNode VALUES() { return getToken(PostSQLParser.VALUES, 0); }
		public List<VarTypeContext> varType() {
			return getRuleContexts(VarTypeContext.class);
		}
		public VarTypeContext varType(int i) {
			return getRuleContext(VarTypeContext.class,i);
		}
		public InsertIntoContext(Insert_intoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitInsertInto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_intoContext insert_into() throws RecognitionException {
		Insert_intoContext _localctx = new Insert_intoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_insert_into);
		int _la;
		try {
			_localctx = new InsertIntoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(INSERT_INTO);
			setState(253);
			match(ID);
			setState(254);
			match(T__0);
			setState(255);
			match(ID);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(256);
				match(T__2);
				setState(257);
				match(ID);
				}
				}
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(263);
			match(T__1);
			setState(264);
			match(VALUES);
			setState(265);
			match(T__0);
			setState(266);
			varType();
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(267);
				match(T__2);
				setState(268);
				varType();
				}
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(274);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateContext extends ParserRuleContext {
		public UpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update; }
	 
		public UpdateContext() { }
		public void copyFrom(UpdateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UpdateDeclContext extends UpdateContext {
		public TerminalNode UPDATE() { return getToken(PostSQLParser.UPDATE, 0); }
		public List<TerminalNode> ID() { return getTokens(PostSQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PostSQLParser.ID, i);
		}
		public TerminalNode SET() { return getToken(PostSQLParser.SET, 0); }
		public List<VarTypeContext> varType() {
			return getRuleContexts(VarTypeContext.class);
		}
		public VarTypeContext varType(int i) {
			return getRuleContext(VarTypeContext.class,i);
		}
		public TerminalNode WHERE() { return getToken(PostSQLParser.WHERE, 0); }
		public List<CondicionContext> condicion() {
			return getRuleContexts(CondicionContext.class);
		}
		public CondicionContext condicion(int i) {
			return getRuleContext(CondicionContext.class,i);
		}
		public List<Eq_opContext> eq_op() {
			return getRuleContexts(Eq_opContext.class);
		}
		public Eq_opContext eq_op(int i) {
			return getRuleContext(Eq_opContext.class,i);
		}
		public UpdateDeclContext(UpdateContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitUpdateDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_update);
		int _la;
		try {
			_localctx = new UpdateDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(UPDATE);
			setState(277);
			match(ID);
			setState(278);
			match(SET);
			setState(279);
			match(ID);
			setState(280);
			match(T__11);
			setState(281);
			match(T__0);
			setState(282);
			varType();
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(283);
				match(T__2);
				setState(284);
				varType();
				}
				}
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(290);
			match(T__1);
			setState(291);
			match(WHERE);
			setState(292);
			condicion();
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT))) != 0)) {
				{
				{
				setState(293);
				eq_op();
				setState(294);
				condicion();
				}
				}
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondicionContext extends ParserRuleContext {
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
	 
		public CondicionContext() { }
		public void copyFrom(CondicionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CondicionDeclContext extends CondicionContext {
		public List<TerminalNode> ID() { return getTokens(PostSQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PostSQLParser.ID, i);
		}
		public Eq_sgnContext eq_sgn() {
			return getRuleContext(Eq_sgnContext.class,0);
		}
		public CondicionDeclContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitCondicionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_condicion);
		try {
			_localctx = new CondicionDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(ID);
			setState(302);
			eq_sgn();
			setState(303);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteContext extends ParserRuleContext {
		public DeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete; }
	 
		public DeleteContext() { }
		public void copyFrom(DeleteContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeleteDeclContext extends DeleteContext {
		public TerminalNode DELETE() { return getToken(PostSQLParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(PostSQLParser.FROM, 0); }
		public TerminalNode ID() { return getToken(PostSQLParser.ID, 0); }
		public TerminalNode WHERE() { return getToken(PostSQLParser.WHERE, 0); }
		public List<CondicionContext> condicion() {
			return getRuleContexts(CondicionContext.class);
		}
		public CondicionContext condicion(int i) {
			return getRuleContext(CondicionContext.class,i);
		}
		public List<Eq_opContext> eq_op() {
			return getRuleContexts(Eq_opContext.class);
		}
		public Eq_opContext eq_op(int i) {
			return getRuleContext(Eq_opContext.class,i);
		}
		public DeleteDeclContext(DeleteContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitDeleteDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteContext delete() throws RecognitionException {
		DeleteContext _localctx = new DeleteContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_delete);
		int _la;
		try {
			_localctx = new DeleteDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(DELETE);
			setState(306);
			match(FROM);
			setState(307);
			match(ID);
			setState(308);
			match(WHERE);
			setState(309);
			condicion();
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT))) != 0)) {
				{
				{
				setState(310);
				eq_op();
				setState(311);
				condicion();
				}
				}
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectContext extends ParserRuleContext {
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
	 
		public SelectContext() { }
		public void copyFrom(SelectContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SelectDeclContext extends SelectContext {
		public TerminalNode SELECT() { return getToken(PostSQLParser.SELECT, 0); }
		public TerminalNode FROM() { return getToken(PostSQLParser.FROM, 0); }
		public List<TerminalNode> ID() { return getTokens(PostSQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PostSQLParser.ID, i);
		}
		public TerminalNode WHERE() { return getToken(PostSQLParser.WHERE, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode ORDER_BY() { return getToken(PostSQLParser.ORDER_BY, 0); }
		public List<TerminalNode> ASC() { return getTokens(PostSQLParser.ASC); }
		public TerminalNode ASC(int i) {
			return getToken(PostSQLParser.ASC, i);
		}
		public List<TerminalNode> DESC() { return getTokens(PostSQLParser.DESC); }
		public TerminalNode DESC(int i) {
			return getToken(PostSQLParser.DESC, i);
		}
		public SelectDeclContext(SelectContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitSelectDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_select);
		int _la;
		try {
			_localctx = new SelectDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(SELECT);
			setState(323);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				{
				setState(319);
				match(T__14);
				}
				break;
			case ID:
				{
				setState(320);
				match(ID);
				{
				setState(321);
				match(T__2);
				setState(322);
				match(ID);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(325);
			match(FROM);
			setState(326);
			match(ID);
			setState(327);
			match(WHERE);
			setState(328);
			condicion();
			setState(329);
			match(ORDER_BY);
			setState(330);
			match(ID);
			setState(331);
			_la = _input.LA(1);
			if ( !(_la==ASC || _la==DESC) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			{
			setState(332);
			match(T__2);
			setState(333);
			match(ID);
			setState(334);
			_la = _input.LA(1);
			if ( !(_la==ASC || _la==DESC) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarTypeContext extends ParserRuleContext {
		public VarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varType; }
	 
		public VarTypeContext() { }
		public void copyFrom(VarTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Var_booleanContext extends VarTypeContext {
		public TerminalNode BOOLEAN() { return getToken(PostSQLParser.BOOLEAN, 0); }
		public Var_booleanContext(VarTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitVar_boolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Var_charContext extends VarTypeContext {
		public TerminalNode CHAR() { return getToken(PostSQLParser.CHAR, 0); }
		public Var_charContext(VarTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitVar_char(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Var_intContext extends VarTypeContext {
		public TerminalNode INT() { return getToken(PostSQLParser.INT, 0); }
		public Var_intContext(VarTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitVar_int(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarTypeContext varType() throws RecognitionException {
		VarTypeContext _localctx = new VarTypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_varType);
		try {
			setState(339);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new Var_intContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				match(INT);
				}
				break;
			case CHAR:
				_localctx = new Var_charContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				match(CHAR);
				}
				break;
			case BOOLEAN:
				_localctx = new Var_booleanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(338);
				match(BOOLEAN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u0158\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\5\2;\n\2\7\2=\n\2\f\2\16\2@\13"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3O\n\3\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\7\bf\n\b\f\b\16\bi\13\b\3\b\3\b\3\t\3\t\3\t\5\tp\n\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\7\ny\n\n\f\n\16\n|\13\n\5\n~\n\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u008a\n\13\f\13\16\13\u008d\13"+
		"\13\3\13\5\13\u0090\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u009c"+
		"\n\f\f\f\16\f\u009f\13\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00a9\n\f"+
		"\f\f\16\f\u00ac\13\f\3\f\5\f\u00af\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\5\16\u00bc\n\16\3\16\3\16\3\17\3\17\3\17\5\17\u00c3\n"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00cb\n\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00d7\n\21\3\22\3\22\3\22\3\22\3\22"+
		"\7\22\u00de\n\22\f\22\16\22\u00e1\13\22\3\22\3\22\7\22\u00e5\n\22\f\22"+
		"\16\22\u00e8\13\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00f0\n\22\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\7\27\u0105\n\27\f\27\16\27\u0108\13\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\7\27\u0110\n\27\f\27\16\27\u0113\13\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0120\n\30\f\30\16"+
		"\30\u0123\13\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u012b\n\30\f\30\16"+
		"\30\u012e\13\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\7\32\u013c\n\32\f\32\16\32\u013f\13\32\3\33\3\33\3\33\3\33\3\33"+
		"\5\33\u0146\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\5\34\u0156\n\34\3\34\2\2\35\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\66\2\4\3\2\66\67\3\2,-\2\u016b\2>\3\2\2"+
		"\2\4N\3\2\2\2\6P\3\2\2\2\bT\3\2\2\2\nX\3\2\2\2\f[\3\2\2\2\16_\3\2\2\2"+
		"\20o\3\2\2\2\22}\3\2\2\2\24\177\3\2\2\2\26\u0091\3\2\2\2\30\u00b0\3\2"+
		"\2\2\32\u00b8\3\2\2\2\34\u00c2\3\2\2\2\36\u00ca\3\2\2\2 \u00d6\3\2\2\2"+
		"\"\u00ef\3\2\2\2$\u00f1\3\2\2\2&\u00f5\3\2\2\2(\u00f8\3\2\2\2*\u00fc\3"+
		"\2\2\2,\u00fe\3\2\2\2.\u0116\3\2\2\2\60\u012f\3\2\2\2\62\u0133\3\2\2\2"+
		"\64\u0140\3\2\2\2\66\u0155\3\2\2\28:\5\4\3\29;\7\23\2\2:9\3\2\2\2:;\3"+
		"\2\2\2;=\3\2\2\2<8\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?\3\3\2\2\2@>"+
		"\3\2\2\2AO\5\6\4\2BO\5\b\5\2CO\5\n\6\2DO\5\16\b\2EO\5 \21\2FO\5&\24\2"+
		"GO\5\f\7\2HO\5$\23\2IO\5*\26\2JO\5,\27\2KO\5.\30\2LO\5\62\32\2MO\5\64"+
		"\33\2NA\3\2\2\2NB\3\2\2\2NC\3\2\2\2ND\3\2\2\2NE\3\2\2\2NF\3\2\2\2NG\3"+
		"\2\2\2NH\3\2\2\2NI\3\2\2\2NJ\3\2\2\2NK\3\2\2\2NL\3\2\2\2NM\3\2\2\2O\5"+
		"\3\2\2\2PQ\7\24\2\2QR\7\26\2\2RS\7\66\2\2S\7\3\2\2\2TU\7\27\2\2UV\7\26"+
		"\2\2VW\7\66\2\2W\t\3\2\2\2XY\7\30\2\2YZ\7\26\2\2Z\13\3\2\2\2[\\\7\65\2"+
		"\2\\]\7\26\2\2]^\7\66\2\2^\r\3\2\2\2_`\7\24\2\2`a\7\25\2\2ab\7\66\2\2"+
		"bc\7\3\2\2cg\5\22\n\2df\5\20\t\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2"+
		"\2hj\3\2\2\2ig\3\2\2\2jk\7\4\2\2k\17\3\2\2\2lp\5\24\13\2mp\5\26\f\2np"+
		"\5\30\r\2ol\3\2\2\2om\3\2\2\2on\3\2\2\2p\21\3\2\2\2qr\7\66\2\2r~\5\66"+
		"\34\2st\7\66\2\2tz\5\66\34\2uv\7\5\2\2vw\7\66\2\2wy\5\66\34\2xu\3\2\2"+
		"\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{~\3\2\2\2|z\3\2\2\2}q\3\2\2\2}s\3\2\2"+
		"\2~\23\3\2\2\2\177\u0080\7\34\2\2\u0080\u0081\7\6\2\2\u0081\u0082\7\66"+
		"\2\2\u0082\u0083\7\31\2\2\u0083\u008f\7\32\2\2\u0084\u0085\7\3\2\2\u0085"+
		"\u0090\7\66\2\2\u0086\u008b\7\66\2\2\u0087\u0088\7\5\2\2\u0088\u008a\7"+
		"\66\2\2\u0089\u0087\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u0090\7\4"+
		"\2\2\u008f\u0084\3\2\2\2\u008f\u0086\3\2\2\2\u0090\25\3\2\2\2\u0091\u0092"+
		"\7\34\2\2\u0092\u0093\7\7\2\2\u0093\u0094\7\66\2\2\u0094\u0095\7\33\2"+
		"\2\u0095\u00ae\7\32\2\2\u0096\u0097\7\3\2\2\u0097\u00af\7\66\2\2\u0098"+
		"\u009d\7\66\2\2\u0099\u009a\7\5\2\2\u009a\u009c\7\66\2\2\u009b\u0099\3"+
		"\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\7\4\2\2\u00a1\u00a2\7\35"+
		"\2\2\u00a2\u00a3\7\66\2\2\u00a3\u00a4\7\3\2\2\u00a4\u00af\7\66\2\2\u00a5"+
		"\u00aa\7\66\2\2\u00a6\u00a7\7\5\2\2\u00a7\u00a9\7\66\2\2\u00a8\u00a6\3"+
		"\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00af\7\4\2\2\u00ae\u0096\3\2"+
		"\2\2\u00ae\u0098\3\2\2\2\u00ae\u00a5\3\2\2\2\u00af\27\3\2\2\2\u00b0\u00b1"+
		"\7\34\2\2\u00b1\u00b2\7\b\2\2\u00b2\u00b3\7\66\2\2\u00b3\u00b4\7\37\2"+
		"\2\u00b4\u00b5\7\3\2\2\u00b5\u00b6\5\32\16\2\u00b6\u00b7\7\4\2\2\u00b7"+
		"\31\3\2\2\2\u00b8\u00bb\t\2\2\2\u00b9\u00bc\5\34\17\2\u00ba\u00bc\5\36"+
		"\20\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00be\t\2\2\2\u00be\33\3\2\2\2\u00bf\u00c3\7\61\2\2\u00c0\u00c3\7\62"+
		"\2\2\u00c1\u00c3\7\63\2\2\u00c2\u00bf\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2"+
		"\u00c1\3\2\2\2\u00c3\35\3\2\2\2\u00c4\u00cb\7\t\2\2\u00c5\u00cb\7\n\2"+
		"\2\u00c6\u00cb\7\13\2\2\u00c7\u00cb\7\f\2\2\u00c8\u00cb\7\r\2\2\u00c9"+
		"\u00cb\7\16\2\2\u00ca\u00c4\3\2\2\2\u00ca\u00c5\3\2\2\2\u00ca\u00c6\3"+
		"\2\2\2\u00ca\u00c7\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb"+
		"\37\3\2\2\2\u00cc\u00cd\7 \2\2\u00cd\u00ce\7\25\2\2\u00ce\u00cf\7\66\2"+
		"\2\u00cf\u00d0\7!\2\2\u00d0\u00d1\7\"\2\2\u00d1\u00d7\7\66\2\2\u00d2\u00d3"+
		"\7 \2\2\u00d3\u00d4\7\25\2\2\u00d4\u00d5\7\66\2\2\u00d5\u00d7\5\"\22\2"+
		"\u00d6\u00cc\3\2\2\2\u00d6\u00d2\3\2\2\2\u00d7!\3\2\2\2\u00d8\u00d9\7"+
		"#\2\2\u00d9\u00da\7$\2\2\u00da\u00db\7\66\2\2\u00db\u00df\5\66\34\2\u00dc"+
		"\u00de\5\20\t\2\u00dd\u00dc\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3"+
		"\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00f0\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2"+
		"\u00e6\7#\2\2\u00e3\u00e5\5\20\t\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3\2"+
		"\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00f0\3\2\2\2\u00e8"+
		"\u00e6\3\2\2\2\u00e9\u00ea\7\27\2\2\u00ea\u00eb\7$\2\2\u00eb\u00f0\7\66"+
		"\2\2\u00ec\u00ed\7\27\2\2\u00ed\u00ee\7\34\2\2\u00ee\u00f0\7\66\2\2\u00ef"+
		"\u00d8\3\2\2\2\u00ef\u00e2\3\2\2\2\u00ef\u00e9\3\2\2\2\u00ef\u00ec\3\2"+
		"\2\2\u00f0#\3\2\2\2\u00f1\u00f2\7\27\2\2\u00f2\u00f3\7\25\2\2\u00f3\u00f4"+
		"\7\66\2\2\u00f4%\3\2\2\2\u00f5\u00f6\7\30\2\2\u00f6\u00f7\7\25\2\2\u00f7"+
		"\'\3\2\2\2\u00f8\u00f9\7\17\2\2\u00f9\u00fa\7\36\2\2\u00fa\u00fb\7\66"+
		"\2\2\u00fb)\3\2\2\2\u00fc\u00fd\7\20\2\2\u00fd+\3\2\2\2\u00fe\u00ff\7"+
		"%\2\2\u00ff\u0100\7\66\2\2\u0100\u0101\7\3\2\2\u0101\u0106\7\66\2\2\u0102"+
		"\u0103\7\5\2\2\u0103\u0105\7\66\2\2\u0104\u0102\3\2\2\2\u0105\u0108\3"+
		"\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0109\3\2\2\2\u0108"+
		"\u0106\3\2\2\2\u0109\u010a\7\4\2\2\u010a\u010b\7&\2\2\u010b\u010c\7\3"+
		"\2\2\u010c\u0111\5\66\34\2\u010d\u010e\7\5\2\2\u010e\u0110\5\66\34\2\u010f"+
		"\u010d\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2"+
		"\2\2\u0112\u0114\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0115\7\4\2\2\u0115"+
		"-\3\2\2\2\u0116\u0117\7\'\2\2\u0117\u0118\7\66\2\2\u0118\u0119\7(\2\2"+
		"\u0119\u011a\7\66\2\2\u011a\u011b\7\16\2\2\u011b\u011c\7\3\2\2\u011c\u0121"+
		"\5\66\34\2\u011d\u011e\7\5\2\2\u011e\u0120\5\66\34\2\u011f\u011d\3\2\2"+
		"\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0124"+
		"\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0125\7\4\2\2\u0125\u0126\7*\2\2\u0126"+
		"\u012c\5\60\31\2\u0127\u0128\5\34\17\2\u0128\u0129\5\60\31\2\u0129\u012b"+
		"\3\2\2\2\u012a\u0127\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012d/\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0130\7\66\2\2"+
		"\u0130\u0131\5\36\20\2\u0131\u0132\7\66\2\2\u0132\61\3\2\2\2\u0133\u0134"+
		"\7)\2\2\u0134\u0135\7\36\2\2\u0135\u0136\7\66\2\2\u0136\u0137\7*\2\2\u0137"+
		"\u013d\5\60\31\2\u0138\u0139\5\34\17\2\u0139\u013a\5\60\31\2\u013a\u013c"+
		"\3\2\2\2\u013b\u0138\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\63\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0145\7\64\2"+
		"\2\u0141\u0146\7\21\2\2\u0142\u0143\7\66\2\2\u0143\u0144\7\5\2\2\u0144"+
		"\u0146\7\66\2\2\u0145\u0141\3\2\2\2\u0145\u0142\3\2\2\2\u0146\u0147\3"+
		"\2\2\2\u0147\u0148\7\36\2\2\u0148\u0149\7\66\2\2\u0149\u014a\7*\2\2\u014a"+
		"\u014b\5\60\31\2\u014b\u014c\7+\2\2\u014c\u014d\7\66\2\2\u014d\u014e\t"+
		"\3\2\2\u014e\u014f\7\5\2\2\u014f\u0150\7\66\2\2\u0150\u0151\t\3\2\2\u0151"+
		"\65\3\2\2\2\u0152\u0156\7.\2\2\u0153\u0156\7/\2\2\u0154\u0156\7\60\2\2"+
		"\u0155\u0152\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0154\3\2\2\2\u0156\67"+
		"\3\2\2\2\34:>Ngoz}\u008b\u008f\u009d\u00aa\u00ae\u00bb\u00c2\u00ca\u00d6"+
		"\u00df\u00e6\u00ef\u0106\u0111\u0121\u012c\u013d\u0145\u0155";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}