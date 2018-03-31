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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, COLON=23, PRIMARY=24, 
		KEY=25, FOREIGN=26, CONSTRAINT=27, REFERENCES=28, FROM=29, CHECK=30, ALTER=31, 
		RENAME=32, TO=33, ADD=34, COLUMN=35, INSERT_INTO=36, VALUES=37, UPDATE=38, 
		SET=39, DELETE=40, WHERE=41, ORDER_BY=42, ASC=43, DESC=44, INT=45, CHAR=46, 
		BOOLEAN=47, AND=48, OR=49, NOT=50, SELECT=51, ID=52, NUM=53, Char=54, 
		WS=55;
	public static final int
		RULE_program = 0, RULE_unitStatement = 1, RULE_show_database = 2, RULE_use_database = 3, 
		RULE_create_table = 4, RULE_constraints = 5, RULE_columDeclaration = 6, 
		RULE_primaryKeyDeclaration = 7, RULE_foreignKeyDeclaration = 8, RULE_checkDeclaration = 9, 
		RULE_exp = 10, RULE_eq_op = 11, RULE_eq_sgn = 12, RULE_alter_table = 13, 
		RULE_action_alter_table = 14, RULE_drop_table = 15, RULE_show_table = 16, 
		RULE_show_column = 17, RULE_fuck_database = 18, RULE_insert_into = 19, 
		RULE_update = 20, RULE_condicion = 21, RULE_delete = 22, RULE_select = 23, 
		RULE_varType = 24;
	public static final String[] ruleNames = {
		"program", "unitStatement", "show_database", "use_database", "create_table", 
		"constraints", "columDeclaration", "primaryKeyDeclaration", "foreignKeyDeclaration", 
		"checkDeclaration", "exp", "eq_op", "eq_sgn", "alter_table", "action_alter_table", 
		"drop_table", "show_table", "show_column", "fuck_database", "insert_into", 
		"update", "condicion", "delete", "select", "varType"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'CREATE'", "'DATABASE'", "'DROP'", "'SHOW'", "'USE'", "'TABLE'", 
		"'('", "')'", "','", "'PK_'", "'FK_'", "'CH_'", "'<'", "'>'", "'<='", 
		"'>='", "'<>'", "'='", "'COLUMNS'", "'FUCK'", "'*'", "':'", "'PRIMARY'", 
		"'KEY'", "'FOREIGN'", "'CONSTRAINT'", "'REFERENCES'", "'FROM'", "'CHECK'", 
		"'ALTER'", "'RENAME'", "'TO'", "'ADD'", "'COLUMN'", "'INSERT INTO'", "'VALUES'", 
		"'UPDATE'", "'SET'", "'DELETE'", "'WHERE'", "'ORDER BY'", "'ASC'", "'DESC'", 
		"'INT'", "'CHAR'", "'BOOLEAN'", "'AND'", "'OR'", "'NOT'", "'SELECT'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "COLON", 
		"PRIMARY", "KEY", "FOREIGN", "CONSTRAINT", "REFERENCES", "FROM", "CHECK", 
		"ALTER", "RENAME", "TO", "ADD", "COLUMN", "INSERT_INTO", "VALUES", "UPDATE", 
		"SET", "DELETE", "WHERE", "ORDER_BY", "ASC", "DESC", "INT", "CHAR", "BOOLEAN", 
		"AND", "OR", "NOT", "SELECT", "ID", "NUM", "Char", "WS"
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
	public static class ProgramContext extends ParserRuleContext {
		public List<UnitStatementContext> unitStatement() {
			return getRuleContexts(UnitStatementContext.class);
		}
		public UnitStatementContext unitStatement(int i) {
			return getRuleContext(UnitStatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__20) | (1L << ALTER) | (1L << INSERT_INTO) | (1L << UPDATE) | (1L << DELETE) | (1L << SELECT))) != 0)) {
				{
				{
				{
				setState(50);
				unitStatement();
				}
				setState(51);
				match(T__0);
				}
				}
				setState(57);
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

	public static class UnitStatementContext extends ParserRuleContext {
		public UnitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitStatement; }
	 
		public UnitStatementContext() { }
		public void copyFrom(UnitStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class STMalterTableContext extends UnitStatementContext {
		public Alter_tableContext alter_table() {
			return getRuleContext(Alter_tableContext.class,0);
		}
		public STMalterTableContext(UnitStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitSTMalterTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class STMshowTableContext extends UnitStatementContext {
		public Show_tableContext show_table() {
			return getRuleContext(Show_tableContext.class,0);
		}
		public STMshowTableContext(UnitStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitSTMshowTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class STMuseDBContext extends UnitStatementContext {
		public Use_databaseContext use_database() {
			return getRuleContext(Use_databaseContext.class,0);
		}
		public STMuseDBContext(UnitStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitSTMuseDB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class STMcreateDBContext extends UnitStatementContext {
		public TerminalNode ID() { return getToken(PostSQLParser.ID, 0); }
		public Create_tableContext create_table() {
			return getRuleContext(Create_tableContext.class,0);
		}
		public STMcreateDBContext(UnitStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitSTMcreateDB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class STMinsertIntoContext extends UnitStatementContext {
		public Insert_intoContext insert_into() {
			return getRuleContext(Insert_intoContext.class,0);
		}
		public STMinsertIntoContext(UnitStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitSTMinsertInto(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class STMupdateContext extends UnitStatementContext {
		public UpdateContext update() {
			return getRuleContext(UpdateContext.class,0);
		}
		public STMupdateContext(UnitStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitSTMupdate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class STMdropDBContext extends UnitStatementContext {
		public TerminalNode ID() { return getToken(PostSQLParser.ID, 0); }
		public STMdropDBContext(UnitStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitSTMdropDB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class STMdropTableContext extends UnitStatementContext {
		public Drop_tableContext drop_table() {
			return getRuleContext(Drop_tableContext.class,0);
		}
		public STMdropTableContext(UnitStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitSTMdropTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class STMselectContext extends UnitStatementContext {
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public STMselectContext(UnitStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitSTMselect(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class STMshowDBContext extends UnitStatementContext {
		public Show_databaseContext show_database() {
			return getRuleContext(Show_databaseContext.class,0);
		}
		public STMshowDBContext(UnitStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitSTMshowDB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class STMdeleteContext extends UnitStatementContext {
		public DeleteContext delete() {
			return getRuleContext(DeleteContext.class,0);
		}
		public STMdeleteContext(UnitStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitSTMdelete(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class STMfuckTableContext extends UnitStatementContext {
		public Fuck_databaseContext fuck_database() {
			return getRuleContext(Fuck_databaseContext.class,0);
		}
		public STMfuckTableContext(UnitStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitSTMfuckTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitStatementContext unitStatement() throws RecognitionException {
		UnitStatementContext _localctx = new UnitStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_unitStatement);
		try {
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new STMcreateDBContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				match(T__1);
				setState(59);
				match(T__2);
				setState(60);
				match(ID);
				}
				break;
			case 2:
				_localctx = new STMdropDBContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				match(T__3);
				setState(62);
				match(T__2);
				setState(63);
				match(ID);
				}
				break;
			case 3:
				_localctx = new STMshowDBContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				show_database();
				}
				break;
			case 4:
				_localctx = new STMcreateDBContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				create_table();
				}
				break;
			case 5:
				_localctx = new STMalterTableContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(66);
				alter_table();
				}
				break;
			case 6:
				_localctx = new STMshowTableContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(67);
				show_table();
				}
				break;
			case 7:
				_localctx = new STMuseDBContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(68);
				use_database();
				}
				break;
			case 8:
				_localctx = new STMdropTableContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(69);
				drop_table();
				}
				break;
			case 9:
				_localctx = new STMfuckTableContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(70);
				fuck_database();
				}
				break;
			case 10:
				_localctx = new STMinsertIntoContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(71);
				insert_into();
				}
				break;
			case 11:
				_localctx = new STMupdateContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(72);
				update();
				}
				break;
			case 12:
				_localctx = new STMdeleteContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(73);
				delete();
				}
				break;
			case 13:
				_localctx = new STMselectContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(74);
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
		public ShowDatabaseContext(Show_databaseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitShowDatabase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Show_databaseContext show_database() throws RecognitionException {
		Show_databaseContext _localctx = new Show_databaseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_show_database);
		try {
			_localctx = new ShowDatabaseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__4);
			setState(78);
			match(T__2);
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
		enterRule(_localctx, 6, RULE_use_database);
		try {
			_localctx = new UseDatabaseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__5);
			setState(81);
			match(T__2);
			setState(82);
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
		enterRule(_localctx, 8, RULE_create_table);
		int _la;
		try {
			_localctx = new CreateTableContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__1);
			setState(85);
			match(T__6);
			setState(86);
			match(ID);
			setState(87);
			match(T__7);
			setState(88);
			columDeclaration();
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONSTRAINT) {
				{
				{
				setState(89);
				constraints();
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
			match(T__8);
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
		enterRule(_localctx, 10, RULE_constraints);
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new PrimaryKeyDeclConstrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				primaryKeyDeclaration();
				}
				break;
			case 2:
				_localctx = new ForeignKeyDeclConstrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				foreignKeyDeclaration();
				}
				break;
			case 3:
				_localctx = new CheckDeclConstrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
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
		enterRule(_localctx, 12, RULE_columDeclaration);
		int _la;
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new SimpleColumnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(ID);
				setState(103);
				varType();
				}
				break;
			case 2:
				_localctx = new MultipleColumnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				match(ID);
				setState(105);
				varType();
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(106);
					match(T__9);
					setState(107);
					match(ID);
					setState(108);
					varType();
					}
					}
					setState(113);
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
		enterRule(_localctx, 14, RULE_primaryKeyDeclaration);
		int _la;
		try {
			_localctx = new PrimaryKeyDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(CONSTRAINT);
			setState(117);
			match(T__10);
			setState(118);
			match(ID);
			setState(119);
			match(PRIMARY);
			setState(120);
			match(KEY);
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				{
				setState(121);
				match(T__7);
				setState(122);
				match(ID);
				}
				break;
			case ID:
				{
				setState(123);
				match(ID);
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(124);
					match(T__9);
					setState(125);
					match(ID);
					}
					}
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(131);
				match(T__8);
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
		enterRule(_localctx, 16, RULE_foreignKeyDeclaration);
		int _la;
		try {
			_localctx = new ForeignDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(CONSTRAINT);
			setState(135);
			match(T__11);
			setState(136);
			match(ID);
			setState(137);
			match(FOREIGN);
			setState(138);
			match(KEY);
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(139);
				match(T__7);
				setState(140);
				match(ID);
				}
				break;
			case 2:
				{
				setState(141);
				match(ID);
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(142);
					match(T__9);
					setState(143);
					match(ID);
					}
					}
					setState(148);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(149);
				match(T__8);
				setState(150);
				match(REFERENCES);
				setState(151);
				match(ID);
				setState(152);
				match(T__7);
				setState(153);
				match(ID);
				}
				break;
			case 3:
				{
				setState(154);
				match(ID);
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(155);
					match(T__9);
					setState(156);
					match(ID);
					}
					}
					setState(161);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(162);
				match(T__8);
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
		enterRule(_localctx, 18, RULE_checkDeclaration);
		try {
			_localctx = new CheckDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(CONSTRAINT);
			setState(166);
			match(T__12);
			setState(167);
			match(ID);
			setState(168);
			match(CHECK);
			setState(169);
			match(T__7);
			setState(170);
			exp();
			setState(171);
			match(T__8);
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
		enterRule(_localctx, 20, RULE_exp);
		int _la;
		try {
			_localctx = new ExpDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
			case OR:
			case NOT:
				{
				setState(174);
				eq_op();
				}
				break;
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
				{
				setState(175);
				eq_sgn();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(178);
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
		enterRule(_localctx, 22, RULE_eq_op);
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				_localctx = new AndOperationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(AND);
				}
				break;
			case OR:
				_localctx = new OrOperationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(OR);
				}
				break;
			case NOT:
				_localctx = new NotOperationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
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
		enterRule(_localctx, 24, RULE_eq_sgn);
		try {
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				_localctx = new MenorQueOpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				match(T__13);
				}
				break;
			case T__14:
				_localctx = new MayorQueOPContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				match(T__14);
				}
				break;
			case T__15:
				_localctx = new MenorIgualQueOpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(187);
				match(T__15);
				}
				break;
			case T__16:
				_localctx = new MayorIgualQueOpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(188);
				match(T__16);
				}
				break;
			case T__17:
				_localctx = new DiferenteOPContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(189);
				match(T__17);
				}
				break;
			case T__18:
				_localctx = new IgualOPContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(190);
				match(T__18);
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
		enterRule(_localctx, 26, RULE_alter_table);
		try {
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new RenameTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				match(ALTER);
				setState(194);
				match(T__6);
				setState(195);
				match(ID);
				setState(196);
				match(RENAME);
				setState(197);
				match(TO);
				setState(198);
				match(ID);
				}
				break;
			case 2:
				_localctx = new AlterTableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				match(ALTER);
				setState(200);
				match(T__6);
				setState(201);
				match(ID);
				setState(202);
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
		enterRule(_localctx, 28, RULE_action_alter_table);
		int _la;
		try {
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new AddColumnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				match(ADD);
				setState(206);
				match(COLUMN);
				setState(207);
				match(ID);
				setState(208);
				varType();
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CONSTRAINT) {
					{
					{
					setState(209);
					constraints();
					}
					}
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new AddConstraintsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(ADD);
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CONSTRAINT) {
					{
					{
					setState(216);
					constraints();
					}
					}
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				_localctx = new DropColumnContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(222);
				match(T__3);
				setState(223);
				match(COLUMN);
				setState(224);
				match(ID);
				}
				break;
			case 4:
				_localctx = new DropConstraintsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(225);
				match(T__3);
				setState(226);
				match(CONSTRAINT);
				setState(227);
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
		enterRule(_localctx, 30, RULE_drop_table);
		try {
			_localctx = new DropTableContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(T__3);
			setState(231);
			match(T__6);
			setState(232);
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
		public ShowTableContext(Show_tableContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitShowTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Show_tableContext show_table() throws RecognitionException {
		Show_tableContext _localctx = new Show_tableContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_show_table);
		try {
			_localctx = new ShowTableContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(T__4);
			setState(235);
			match(T__6);
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
		enterRule(_localctx, 34, RULE_show_column);
		try {
			_localctx = new ShowColumnContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(T__4);
			setState(238);
			match(T__19);
			setState(239);
			match(FROM);
			setState(240);
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
		enterRule(_localctx, 36, RULE_fuck_database);
		try {
			_localctx = new FuckDatabaseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(T__20);
			setState(243);
			match(T__2);
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
		enterRule(_localctx, 38, RULE_insert_into);
		int _la;
		try {
			_localctx = new InsertIntoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(INSERT_INTO);
			setState(246);
			match(ID);
			setState(247);
			match(T__7);
			setState(248);
			match(ID);
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(249);
				match(T__9);
				setState(250);
				match(ID);
				}
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(256);
			match(T__8);
			setState(257);
			match(VALUES);
			setState(258);
			match(T__7);
			setState(259);
			varType();
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(260);
				match(T__9);
				setState(261);
				varType();
				}
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(267);
			match(T__8);
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
		enterRule(_localctx, 40, RULE_update);
		int _la;
		try {
			_localctx = new UpdateDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(UPDATE);
			setState(270);
			match(ID);
			setState(271);
			match(SET);
			setState(272);
			match(ID);
			setState(273);
			match(T__18);
			setState(274);
			match(T__7);
			setState(275);
			varType();
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(276);
				match(T__9);
				setState(277);
				varType();
				}
				}
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(283);
			match(T__8);
			setState(284);
			match(WHERE);
			setState(285);
			condicion();
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT))) != 0)) {
				{
				{
				setState(286);
				eq_op();
				setState(287);
				condicion();
				}
				}
				setState(293);
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
		enterRule(_localctx, 42, RULE_condicion);
		try {
			_localctx = new CondicionDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(ID);
			setState(295);
			eq_sgn();
			setState(296);
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
		enterRule(_localctx, 44, RULE_delete);
		int _la;
		try {
			_localctx = new DeleteDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(DELETE);
			setState(299);
			match(FROM);
			setState(300);
			match(ID);
			setState(301);
			match(WHERE);
			setState(302);
			condicion();
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT))) != 0)) {
				{
				{
				setState(303);
				eq_op();
				setState(304);
				condicion();
				}
				}
				setState(310);
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
		enterRule(_localctx, 46, RULE_select);
		int _la;
		try {
			_localctx = new SelectDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(SELECT);
			setState(316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				{
				setState(312);
				match(T__21);
				}
				break;
			case ID:
				{
				setState(313);
				match(ID);
				{
				setState(314);
				match(T__9);
				setState(315);
				match(ID);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(318);
			match(FROM);
			setState(319);
			match(ID);
			setState(320);
			match(WHERE);
			setState(321);
			condicion();
			setState(322);
			match(ORDER_BY);
			setState(323);
			match(ID);
			setState(324);
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
			setState(325);
			match(T__9);
			setState(326);
			match(ID);
			setState(327);
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
		enterRule(_localctx, 48, RULE_varType);
		try {
			setState(332);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new Var_intContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				match(INT);
				}
				break;
			case CHAR:
				_localctx = new Var_charContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				match(CHAR);
				}
				break;
			case BOOLEAN:
				_localctx = new Var_booleanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(331);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u0151\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\7\28\n\2\f\2\16\2;\13\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3N\n\3\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6]\n\6\f\6\16\6`\13\6\3\6\3\6\3"+
		"\7\3\7\3\7\5\7g\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bp\n\b\f\b\16\bs\13"+
		"\b\5\bu\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0081\n\t\f\t"+
		"\16\t\u0084\13\t\3\t\5\t\u0087\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\7\n\u0093\n\n\f\n\16\n\u0096\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\7\n\u00a0\n\n\f\n\16\n\u00a3\13\n\3\n\5\n\u00a6\n\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\5\f\u00b3\n\f\3\f\3\f\3\r\3\r\3\r"+
		"\5\r\u00ba\n\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00c2\n\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00ce\n\17\3\20\3\20\3\20"+
		"\3\20\3\20\7\20\u00d5\n\20\f\20\16\20\u00d8\13\20\3\20\3\20\7\20\u00dc"+
		"\n\20\f\20\16\20\u00df\13\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00e7"+
		"\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u00fe\n\25\f\25\16\25\u0101"+
		"\13\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0109\n\25\f\25\16\25\u010c"+
		"\13\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0119"+
		"\n\26\f\26\16\26\u011c\13\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0124"+
		"\n\26\f\26\16\26\u0127\13\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\7\30\u0135\n\30\f\30\16\30\u0138\13\30\3\31\3\31\3"+
		"\31\3\31\3\31\5\31\u013f\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\5\32\u014f\n\32\3\32\2\2\33\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\4\3\2\66\67\3\2-.\2\u0165"+
		"\29\3\2\2\2\4M\3\2\2\2\6O\3\2\2\2\bR\3\2\2\2\nV\3\2\2\2\ff\3\2\2\2\16"+
		"t\3\2\2\2\20v\3\2\2\2\22\u0088\3\2\2\2\24\u00a7\3\2\2\2\26\u00af\3\2\2"+
		"\2\30\u00b9\3\2\2\2\32\u00c1\3\2\2\2\34\u00cd\3\2\2\2\36\u00e6\3\2\2\2"+
		" \u00e8\3\2\2\2\"\u00ec\3\2\2\2$\u00ef\3\2\2\2&\u00f4\3\2\2\2(\u00f7\3"+
		"\2\2\2*\u010f\3\2\2\2,\u0128\3\2\2\2.\u012c\3\2\2\2\60\u0139\3\2\2\2\62"+
		"\u014e\3\2\2\2\64\65\5\4\3\2\65\66\7\3\2\2\668\3\2\2\2\67\64\3\2\2\28"+
		";\3\2\2\29\67\3\2\2\29:\3\2\2\2:\3\3\2\2\2;9\3\2\2\2<=\7\4\2\2=>\7\5\2"+
		"\2>N\7\66\2\2?@\7\6\2\2@A\7\5\2\2AN\7\66\2\2BN\5\6\4\2CN\5\n\6\2DN\5\34"+
		"\17\2EN\5\"\22\2FN\5\b\5\2GN\5 \21\2HN\5&\24\2IN\5(\25\2JN\5*\26\2KN\5"+
		".\30\2LN\5\60\31\2M<\3\2\2\2M?\3\2\2\2MB\3\2\2\2MC\3\2\2\2MD\3\2\2\2M"+
		"E\3\2\2\2MF\3\2\2\2MG\3\2\2\2MH\3\2\2\2MI\3\2\2\2MJ\3\2\2\2MK\3\2\2\2"+
		"ML\3\2\2\2N\5\3\2\2\2OP\7\7\2\2PQ\7\5\2\2Q\7\3\2\2\2RS\7\b\2\2ST\7\5\2"+
		"\2TU\7\66\2\2U\t\3\2\2\2VW\7\4\2\2WX\7\t\2\2XY\7\66\2\2YZ\7\n\2\2Z^\5"+
		"\16\b\2[]\5\f\7\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_a\3\2\2\2"+
		"`^\3\2\2\2ab\7\13\2\2b\13\3\2\2\2cg\5\20\t\2dg\5\22\n\2eg\5\24\13\2fc"+
		"\3\2\2\2fd\3\2\2\2fe\3\2\2\2g\r\3\2\2\2hi\7\66\2\2iu\5\62\32\2jk\7\66"+
		"\2\2kq\5\62\32\2lm\7\f\2\2mn\7\66\2\2np\5\62\32\2ol\3\2\2\2ps\3\2\2\2"+
		"qo\3\2\2\2qr\3\2\2\2ru\3\2\2\2sq\3\2\2\2th\3\2\2\2tj\3\2\2\2u\17\3\2\2"+
		"\2vw\7\35\2\2wx\7\r\2\2xy\7\66\2\2yz\7\32\2\2z\u0086\7\33\2\2{|\7\n\2"+
		"\2|\u0087\7\66\2\2}\u0082\7\66\2\2~\177\7\f\2\2\177\u0081\7\66\2\2\u0080"+
		"~\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2"+
		"\u0083\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0087\7\13\2\2\u0086{\3"+
		"\2\2\2\u0086}\3\2\2\2\u0087\21\3\2\2\2\u0088\u0089\7\35\2\2\u0089\u008a"+
		"\7\16\2\2\u008a\u008b\7\66\2\2\u008b\u008c\7\34\2\2\u008c\u00a5\7\33\2"+
		"\2\u008d\u008e\7\n\2\2\u008e\u00a6\7\66\2\2\u008f\u0094\7\66\2\2\u0090"+
		"\u0091\7\f\2\2\u0091\u0093\7\66\2\2\u0092\u0090\3\2\2\2\u0093\u0096\3"+
		"\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0097\u0098\7\13\2\2\u0098\u0099\7\36\2\2\u0099\u009a\7"+
		"\66\2\2\u009a\u009b\7\n\2\2\u009b\u00a6\7\66\2\2\u009c\u00a1\7\66\2\2"+
		"\u009d\u009e\7\f\2\2\u009e\u00a0\7\66\2\2\u009f\u009d\3\2\2\2\u00a0\u00a3"+
		"\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a4\u00a6\7\13\2\2\u00a5\u008d\3\2\2\2\u00a5\u008f\3"+
		"\2\2\2\u00a5\u009c\3\2\2\2\u00a6\23\3\2\2\2\u00a7\u00a8\7\35\2\2\u00a8"+
		"\u00a9\7\17\2\2\u00a9\u00aa\7\66\2\2\u00aa\u00ab\7 \2\2\u00ab\u00ac\7"+
		"\n\2\2\u00ac\u00ad\5\26\f\2\u00ad\u00ae\7\13\2\2\u00ae\25\3\2\2\2\u00af"+
		"\u00b2\t\2\2\2\u00b0\u00b3\5\30\r\2\u00b1\u00b3\5\32\16\2\u00b2\u00b0"+
		"\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\t\2\2\2\u00b5"+
		"\27\3\2\2\2\u00b6\u00ba\7\62\2\2\u00b7\u00ba\7\63\2\2\u00b8\u00ba\7\64"+
		"\2\2\u00b9\u00b6\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba"+
		"\31\3\2\2\2\u00bb\u00c2\7\20\2\2\u00bc\u00c2\7\21\2\2\u00bd\u00c2\7\22"+
		"\2\2\u00be\u00c2\7\23\2\2\u00bf\u00c2\7\24\2\2\u00c0\u00c2\7\25\2\2\u00c1"+
		"\u00bb\3\2\2\2\u00c1\u00bc\3\2\2\2\u00c1\u00bd\3\2\2\2\u00c1\u00be\3\2"+
		"\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\33\3\2\2\2\u00c3\u00c4"+
		"\7!\2\2\u00c4\u00c5\7\t\2\2\u00c5\u00c6\7\66\2\2\u00c6\u00c7\7\"\2\2\u00c7"+
		"\u00c8\7#\2\2\u00c8\u00ce\7\66\2\2\u00c9\u00ca\7!\2\2\u00ca\u00cb\7\t"+
		"\2\2\u00cb\u00cc\7\66\2\2\u00cc\u00ce\5\36\20\2\u00cd\u00c3\3\2\2\2\u00cd"+
		"\u00c9\3\2\2\2\u00ce\35\3\2\2\2\u00cf\u00d0\7$\2\2\u00d0\u00d1\7%\2\2"+
		"\u00d1\u00d2\7\66\2\2\u00d2\u00d6\5\62\32\2\u00d3\u00d5\5\f\7\2\u00d4"+
		"\u00d3\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2"+
		"\2\2\u00d7\u00e7\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00dd\7$\2\2\u00da"+
		"\u00dc\5\f\7\2\u00db\u00da\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2"+
		"\2\2\u00dd\u00de\3\2\2\2\u00de\u00e7\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0"+
		"\u00e1\7\6\2\2\u00e1\u00e2\7%\2\2\u00e2\u00e7\7\66\2\2\u00e3\u00e4\7\6"+
		"\2\2\u00e4\u00e5\7\35\2\2\u00e5\u00e7\7\66\2\2\u00e6\u00cf\3\2\2\2\u00e6"+
		"\u00d9\3\2\2\2\u00e6\u00e0\3\2\2\2\u00e6\u00e3\3\2\2\2\u00e7\37\3\2\2"+
		"\2\u00e8\u00e9\7\6\2\2\u00e9\u00ea\7\t\2\2\u00ea\u00eb\7\66\2\2\u00eb"+
		"!\3\2\2\2\u00ec\u00ed\7\7\2\2\u00ed\u00ee\7\t\2\2\u00ee#\3\2\2\2\u00ef"+
		"\u00f0\7\7\2\2\u00f0\u00f1\7\26\2\2\u00f1\u00f2\7\37\2\2\u00f2\u00f3\7"+
		"\66\2\2\u00f3%\3\2\2\2\u00f4\u00f5\7\27\2\2\u00f5\u00f6\7\5\2\2\u00f6"+
		"\'\3\2\2\2\u00f7\u00f8\7&\2\2\u00f8\u00f9\7\66\2\2\u00f9\u00fa\7\n\2\2"+
		"\u00fa\u00ff\7\66\2\2\u00fb\u00fc\7\f\2\2\u00fc\u00fe\7\66\2\2\u00fd\u00fb"+
		"\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\u0102\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0103\7\13\2\2\u0103\u0104\7"+
		"\'\2\2\u0104\u0105\7\n\2\2\u0105\u010a\5\62\32\2\u0106\u0107\7\f\2\2\u0107"+
		"\u0109\5\62\32\2\u0108\u0106\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3"+
		"\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d\3\2\2\2\u010c\u010a\3\2\2\2\u010d"+
		"\u010e\7\13\2\2\u010e)\3\2\2\2\u010f\u0110\7(\2\2\u0110\u0111\7\66\2\2"+
		"\u0111\u0112\7)\2\2\u0112\u0113\7\66\2\2\u0113\u0114\7\25\2\2\u0114\u0115"+
		"\7\n\2\2\u0115\u011a\5\62\32\2\u0116\u0117\7\f\2\2\u0117\u0119\5\62\32"+
		"\2\u0118\u0116\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b"+
		"\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011e\7\13\2\2"+
		"\u011e\u011f\7+\2\2\u011f\u0125\5,\27\2\u0120\u0121\5\30\r\2\u0121\u0122"+
		"\5,\27\2\u0122\u0124\3\2\2\2\u0123\u0120\3\2\2\2\u0124\u0127\3\2\2\2\u0125"+
		"\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126+\3\2\2\2\u0127\u0125\3\2\2\2"+
		"\u0128\u0129\7\66\2\2\u0129\u012a\5\32\16\2\u012a\u012b\7\66\2\2\u012b"+
		"-\3\2\2\2\u012c\u012d\7*\2\2\u012d\u012e\7\37\2\2\u012e\u012f\7\66\2\2"+
		"\u012f\u0130\7+\2\2\u0130\u0136\5,\27\2\u0131\u0132\5\30\r\2\u0132\u0133"+
		"\5,\27\2\u0133\u0135\3\2\2\2\u0134\u0131\3\2\2\2\u0135\u0138\3\2\2\2\u0136"+
		"\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137/\3\2\2\2\u0138\u0136\3\2\2\2"+
		"\u0139\u013e\7\65\2\2\u013a\u013f\7\30\2\2\u013b\u013c\7\66\2\2\u013c"+
		"\u013d\7\f\2\2\u013d\u013f\7\66\2\2\u013e\u013a\3\2\2\2\u013e\u013b\3"+
		"\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\7\37\2\2\u0141\u0142\7\66\2\2\u0142"+
		"\u0143\7+\2\2\u0143\u0144\5,\27\2\u0144\u0145\7,\2\2\u0145\u0146\7\66"+
		"\2\2\u0146\u0147\t\3\2\2\u0147\u0148\7\f\2\2\u0148\u0149\7\66\2\2\u0149"+
		"\u014a\t\3\2\2\u014a\61\3\2\2\2\u014b\u014f\7/\2\2\u014c\u014f\7\60\2"+
		"\2\u014d\u014f\7\61\2\2\u014e\u014b\3\2\2\2\u014e\u014c\3\2\2\2\u014e"+
		"\u014d\3\2\2\2\u014f\63\3\2\2\2\339M^fqt\u0082\u0086\u0094\u00a1\u00a5"+
		"\u00b2\u00b9\u00c1\u00cd\u00d6\u00dd\u00e6\u00ff\u010a\u011a\u0125\u0136"+
		"\u013e\u014e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}