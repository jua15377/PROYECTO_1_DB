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
		RULE_program = 0, RULE_unitStatement = 1, RULE_constraints = 2, RULE_columDeclaration = 3, 
		RULE_exp = 4, RULE_eq_op = 5, RULE_eq_sgn = 6, RULE_alter_table = 7, RULE_action_alter_table = 8, 
		RULE_insert_into = 9, RULE_update = 10, RULE_condicion = 11, RULE_delete = 12, 
		RULE_select = 13, RULE_varType = 14;
	public static final String[] ruleNames = {
		"program", "unitStatement", "constraints", "columDeclaration", "exp", 
		"eq_op", "eq_sgn", "alter_table", "action_alter_table", "insert_into", 
		"update", "condicion", "delete", "select", "varType"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'CREATE'", "'DATABASE'", "'DROP'", "'SHOW'", "'TABLE'", 
		"'USE'", "'FUCK'", "'('", "')'", "'COLUMNS'", "'PK_'", "','", "'FK_'", 
		"'CH_'", "'<'", "'>'", "'<='", "'>='", "'<>'", "'='", "'*'", "':'", "'PRIMARY'", 
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
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << ALTER) | (1L << INSERT_INTO) | (1L << UPDATE) | (1L << DELETE) | (1L << SELECT))) != 0)) {
				{
				{
				{
				setState(30);
				unitStatement();
				}
				setState(31);
				match(T__0);
				}
				}
				setState(37);
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
	public static class STMcreateTableContext extends UnitStatementContext {
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
		public STMcreateTableContext(UnitStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitSTMcreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class STMshowTableContext extends UnitStatementContext {
		public STMshowTableContext(UnitStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitSTMshowTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class STMuseDBContext extends UnitStatementContext {
		public TerminalNode ID() { return getToken(PostSQLParser.ID, 0); }
		public STMuseDBContext(UnitStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitSTMuseDB(this);
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
		public TerminalNode ID() { return getToken(PostSQLParser.ID, 0); }
		public STMdropTableContext(UnitStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitSTMdropTable(this);
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
	public static class STMcreateDBContext extends UnitStatementContext {
		public TerminalNode ID() { return getToken(PostSQLParser.ID, 0); }
		public STMcreateDBContext(UnitStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitSTMcreateDB(this);
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
		public STMshowDBContext(UnitStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitSTMshowDB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class STMshowColumnContext extends UnitStatementContext {
		public TerminalNode FROM() { return getToken(PostSQLParser.FROM, 0); }
		public TerminalNode ID() { return getToken(PostSQLParser.ID, 0); }
		public STMshowColumnContext(UnitStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitSTMshowColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class STMfuckTableContext extends UnitStatementContext {
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
		int _la;
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new STMcreateDBContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				match(T__1);
				setState(39);
				match(T__2);
				setState(40);
				match(ID);
				}
				break;
			case 2:
				_localctx = new STMdropDBContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				match(T__3);
				setState(42);
				match(T__2);
				setState(43);
				match(ID);
				}
				break;
			case 3:
				_localctx = new STMshowDBContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				match(T__4);
				setState(45);
				match(T__2);
				}
				break;
			case 4:
				_localctx = new STMshowTableContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
				match(T__4);
				setState(47);
				match(T__5);
				}
				break;
			case 5:
				_localctx = new STMuseDBContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(48);
				match(T__6);
				setState(49);
				match(T__2);
				setState(50);
				match(ID);
				}
				break;
			case 6:
				_localctx = new STMdropTableContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(51);
				match(T__3);
				setState(52);
				match(T__5);
				setState(53);
				match(ID);
				}
				break;
			case 7:
				_localctx = new STMfuckTableContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(54);
				match(T__7);
				setState(55);
				match(T__2);
				}
				break;
			case 8:
				_localctx = new STMcreateTableContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(56);
				match(T__1);
				setState(57);
				match(T__5);
				setState(58);
				match(ID);
				setState(59);
				match(T__8);
				setState(60);
				columDeclaration();
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CONSTRAINT) {
					{
					{
					setState(61);
					constraints();
					}
					}
					setState(66);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(67);
				match(T__9);
				}
				break;
			case 9:
				_localctx = new STMshowColumnContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(69);
				match(T__4);
				setState(70);
				match(T__10);
				setState(71);
				match(FROM);
				setState(72);
				match(ID);
				}
				break;
			case 10:
				_localctx = new STMalterTableContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(73);
				alter_table();
				}
				break;
			case 11:
				_localctx = new STMinsertIntoContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(74);
				insert_into();
				}
				break;
			case 12:
				_localctx = new STMupdateContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(75);
				update();
				}
				break;
			case 13:
				_localctx = new STMdeleteContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(76);
				delete();
				}
				break;
			case 14:
				_localctx = new STMselectContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(77);
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
		public TerminalNode CONSTRAINT() { return getToken(PostSQLParser.CONSTRAINT, 0); }
		public List<TerminalNode> ID() { return getTokens(PostSQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PostSQLParser.ID, i);
		}
		public TerminalNode PRIMARY() { return getToken(PostSQLParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(PostSQLParser.KEY, 0); }
		public PrimaryKeyDeclConstrContext(ConstraintsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitPrimaryKeyDeclConstr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForeignKeyDeclConstrContext extends ConstraintsContext {
		public TerminalNode CONSTRAINT() { return getToken(PostSQLParser.CONSTRAINT, 0); }
		public List<TerminalNode> ID() { return getTokens(PostSQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PostSQLParser.ID, i);
		}
		public TerminalNode FOREIGN() { return getToken(PostSQLParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(PostSQLParser.KEY, 0); }
		public TerminalNode REFERENCES() { return getToken(PostSQLParser.REFERENCES, 0); }
		public ForeignKeyDeclConstrContext(ConstraintsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitForeignKeyDeclConstr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CheckDeclConstrContext extends ConstraintsContext {
		public TerminalNode CONSTRAINT() { return getToken(PostSQLParser.CONSTRAINT, 0); }
		public TerminalNode ID() { return getToken(PostSQLParser.ID, 0); }
		public TerminalNode CHECK() { return getToken(PostSQLParser.CHECK, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
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
		enterRule(_localctx, 4, RULE_constraints);
		int _la;
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new PrimaryKeyDeclConstrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(CONSTRAINT);
				setState(81);
				match(T__11);
				setState(82);
				match(ID);
				setState(83);
				match(PRIMARY);
				setState(84);
				match(KEY);
				setState(96);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
					{
					setState(85);
					match(T__8);
					setState(86);
					match(ID);
					}
					break;
				case ID:
					{
					setState(87);
					match(ID);
					setState(92);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__12) {
						{
						{
						setState(88);
						match(T__12);
						setState(89);
						match(ID);
						}
						}
						setState(94);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(95);
					match(T__9);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				_localctx = new ForeignKeyDeclConstrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(CONSTRAINT);
				setState(99);
				match(T__13);
				setState(100);
				match(ID);
				setState(101);
				match(FOREIGN);
				setState(102);
				match(KEY);
				setState(127);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(103);
					match(T__8);
					setState(104);
					match(ID);
					}
					break;
				case 2:
					{
					setState(105);
					match(ID);
					setState(110);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__12) {
						{
						{
						setState(106);
						match(T__12);
						setState(107);
						match(ID);
						}
						}
						setState(112);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(113);
					match(T__9);
					setState(114);
					match(REFERENCES);
					setState(115);
					match(ID);
					setState(116);
					match(T__8);
					setState(117);
					match(ID);
					}
					break;
				case 3:
					{
					setState(118);
					match(ID);
					setState(123);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__12) {
						{
						{
						setState(119);
						match(T__12);
						setState(120);
						match(ID);
						}
						}
						setState(125);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(126);
					match(T__9);
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new CheckDeclConstrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				match(CONSTRAINT);
				setState(130);
				match(T__14);
				setState(131);
				match(ID);
				setState(132);
				match(CHECK);
				setState(133);
				match(T__8);
				setState(134);
				exp();
				setState(135);
				match(T__9);
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
		enterRule(_localctx, 6, RULE_columDeclaration);
		int _la;
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new SimpleColumnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(ID);
				setState(140);
				varType();
				}
				break;
			case 2:
				_localctx = new MultipleColumnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(ID);
				setState(142);
				varType();
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(143);
					match(T__12);
					setState(144);
					match(ID);
					setState(145);
					varType();
					}
					}
					setState(150);
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
		enterRule(_localctx, 8, RULE_exp);
		int _la;
		try {
			_localctx = new ExpDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
			case OR:
			case NOT:
				{
				setState(154);
				eq_op();
				}
				break;
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
				{
				setState(155);
				eq_sgn();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(158);
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
		enterRule(_localctx, 10, RULE_eq_op);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				_localctx = new AndOperationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				match(AND);
				}
				break;
			case OR:
				_localctx = new OrOperationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				match(OR);
				}
				break;
			case NOT:
				_localctx = new NotOperationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
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
		enterRule(_localctx, 12, RULE_eq_sgn);
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				_localctx = new MenorQueOpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(T__15);
				}
				break;
			case T__16:
				_localctx = new MayorQueOPContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(T__16);
				}
				break;
			case T__17:
				_localctx = new MenorIgualQueOpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				match(T__17);
				}
				break;
			case T__18:
				_localctx = new MayorIgualQueOpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(168);
				match(T__18);
				}
				break;
			case T__19:
				_localctx = new DiferenteOPContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(169);
				match(T__19);
				}
				break;
			case T__20:
				_localctx = new IgualOPContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(170);
				match(T__20);
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
		enterRule(_localctx, 14, RULE_alter_table);
		try {
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new RenameTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(ALTER);
				setState(174);
				match(T__5);
				setState(175);
				match(ID);
				setState(176);
				match(RENAME);
				setState(177);
				match(TO);
				setState(178);
				match(ID);
				}
				break;
			case 2:
				_localctx = new AlterTableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				match(ALTER);
				setState(180);
				match(T__5);
				setState(181);
				match(ID);
				setState(182);
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
		enterRule(_localctx, 16, RULE_action_alter_table);
		int _la;
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new AddColumnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				match(ADD);
				setState(186);
				match(COLUMN);
				setState(187);
				match(ID);
				setState(188);
				varType();
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CONSTRAINT) {
					{
					{
					setState(189);
					constraints();
					}
					}
					setState(194);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new AddConstraintsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				match(ADD);
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CONSTRAINT) {
					{
					{
					setState(196);
					constraints();
					}
					}
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				_localctx = new DropColumnContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				match(T__3);
				setState(203);
				match(COLUMN);
				setState(204);
				match(ID);
				}
				break;
			case 4:
				_localctx = new DropConstraintsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(205);
				match(T__3);
				setState(206);
				match(CONSTRAINT);
				setState(207);
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
		enterRule(_localctx, 18, RULE_insert_into);
		int _la;
		try {
			_localctx = new InsertIntoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(INSERT_INTO);
			setState(211);
			match(ID);
			setState(212);
			match(T__8);
			setState(213);
			match(ID);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(214);
				match(T__12);
				setState(215);
				match(ID);
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(221);
			match(T__9);
			setState(222);
			match(VALUES);
			setState(223);
			match(T__8);
			setState(224);
			varType();
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(225);
				match(T__12);
				setState(226);
				varType();
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(232);
			match(T__9);
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
		enterRule(_localctx, 20, RULE_update);
		int _la;
		try {
			_localctx = new UpdateDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(UPDATE);
			setState(235);
			match(ID);
			setState(236);
			match(SET);
			setState(237);
			match(ID);
			setState(238);
			match(T__20);
			setState(239);
			match(T__8);
			setState(240);
			varType();
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(241);
				match(T__12);
				setState(242);
				varType();
				}
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(248);
			match(T__9);
			setState(249);
			match(WHERE);
			setState(250);
			condicion();
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT))) != 0)) {
				{
				{
				setState(251);
				eq_op();
				setState(252);
				condicion();
				}
				}
				setState(258);
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
		enterRule(_localctx, 22, RULE_condicion);
		try {
			_localctx = new CondicionDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(ID);
			setState(260);
			eq_sgn();
			setState(261);
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
		enterRule(_localctx, 24, RULE_delete);
		int _la;
		try {
			_localctx = new DeleteDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(DELETE);
			setState(264);
			match(FROM);
			setState(265);
			match(ID);
			setState(266);
			match(WHERE);
			setState(267);
			condicion();
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT))) != 0)) {
				{
				{
				setState(268);
				eq_op();
				setState(269);
				condicion();
				}
				}
				setState(275);
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
		enterRule(_localctx, 26, RULE_select);
		int _la;
		try {
			_localctx = new SelectDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(SELECT);
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				{
				setState(277);
				match(T__21);
				}
				break;
			case ID:
				{
				setState(278);
				match(ID);
				{
				setState(279);
				match(T__12);
				setState(280);
				match(ID);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(283);
			match(FROM);
			setState(284);
			match(ID);
			setState(285);
			match(WHERE);
			setState(286);
			condicion();
			setState(287);
			match(ORDER_BY);
			setState(288);
			match(ID);
			setState(289);
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
			setState(290);
			match(T__12);
			setState(291);
			match(ID);
			setState(292);
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
	public static class VarintContext extends VarTypeContext {
		public TerminalNode INT() { return getToken(PostSQLParser.INT, 0); }
		public VarintContext(VarTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitVarint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarcharContext extends VarTypeContext {
		public TerminalNode CHAR() { return getToken(PostSQLParser.CHAR, 0); }
		public VarcharContext(VarTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitVarchar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarbooleanContext extends VarTypeContext {
		public TerminalNode BOOLEAN() { return getToken(PostSQLParser.BOOLEAN, 0); }
		public VarbooleanContext(VarTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitVarboolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarTypeContext varType() throws RecognitionException {
		VarTypeContext _localctx = new VarTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_varType);
		try {
			setState(297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new VarintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				match(INT);
				}
				break;
			case CHAR:
				_localctx = new VarcharContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				match(CHAR);
				}
				break;
			case BOOLEAN:
				_localctx = new VarbooleanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(296);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u012e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\7\2$\n\2"+
		"\f\2\16\2\'\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3A\n\3\f\3\16\3D\13\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3Q\n\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\7\4]\n\4\f\4\16\4`\13\4\3\4\5\4c\n\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4o\n\4\f\4\16\4r\13\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\7\4|\n\4\f\4\16\4\177\13\4\3\4\5\4\u0082\n\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\5\4\u008c\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0095"+
		"\n\5\f\5\16\5\u0098\13\5\5\5\u009a\n\5\3\6\3\6\3\6\5\6\u009f\n\6\3\6\3"+
		"\6\3\7\3\7\3\7\5\7\u00a6\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00ae\n\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00ba\n\t\3\n\3\n\3\n\3\n\3\n"+
		"\7\n\u00c1\n\n\f\n\16\n\u00c4\13\n\3\n\3\n\7\n\u00c8\n\n\f\n\16\n\u00cb"+
		"\13\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00d3\n\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\7\13\u00db\n\13\f\13\16\13\u00de\13\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\7\13\u00e6\n\13\f\13\16\13\u00e9\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\7\f\u00f6\n\f\f\f\16\f\u00f9\13\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\7\f\u0101\n\f\f\f\16\f\u0104\13\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\7\16\u0112\n\16\f\16\16\16\u0115\13\16\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u011c\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\5\20\u012c\n\20\3\20\2\2\21\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36\2\4\3\2\66\67\3\2-.\2\u014d\2%\3\2\2"+
		"\2\4P\3\2\2\2\6\u008b\3\2\2\2\b\u0099\3\2\2\2\n\u009b\3\2\2\2\f\u00a5"+
		"\3\2\2\2\16\u00ad\3\2\2\2\20\u00b9\3\2\2\2\22\u00d2\3\2\2\2\24\u00d4\3"+
		"\2\2\2\26\u00ec\3\2\2\2\30\u0105\3\2\2\2\32\u0109\3\2\2\2\34\u0116\3\2"+
		"\2\2\36\u012b\3\2\2\2 !\5\4\3\2!\"\7\3\2\2\"$\3\2\2\2# \3\2\2\2$\'\3\2"+
		"\2\2%#\3\2\2\2%&\3\2\2\2&\3\3\2\2\2\'%\3\2\2\2()\7\4\2\2)*\7\5\2\2*Q\7"+
		"\66\2\2+,\7\6\2\2,-\7\5\2\2-Q\7\66\2\2./\7\7\2\2/Q\7\5\2\2\60\61\7\7\2"+
		"\2\61Q\7\b\2\2\62\63\7\t\2\2\63\64\7\5\2\2\64Q\7\66\2\2\65\66\7\6\2\2"+
		"\66\67\7\b\2\2\67Q\7\66\2\289\7\n\2\29Q\7\5\2\2:;\7\4\2\2;<\7\b\2\2<="+
		"\7\66\2\2=>\7\13\2\2>B\5\b\5\2?A\5\6\4\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2"+
		"BC\3\2\2\2CE\3\2\2\2DB\3\2\2\2EF\7\f\2\2FQ\3\2\2\2GH\7\7\2\2HI\7\r\2\2"+
		"IJ\7\37\2\2JQ\7\66\2\2KQ\5\20\t\2LQ\5\24\13\2MQ\5\26\f\2NQ\5\32\16\2O"+
		"Q\5\34\17\2P(\3\2\2\2P+\3\2\2\2P.\3\2\2\2P\60\3\2\2\2P\62\3\2\2\2P\65"+
		"\3\2\2\2P8\3\2\2\2P:\3\2\2\2PG\3\2\2\2PK\3\2\2\2PL\3\2\2\2PM\3\2\2\2P"+
		"N\3\2\2\2PO\3\2\2\2Q\5\3\2\2\2RS\7\35\2\2ST\7\16\2\2TU\7\66\2\2UV\7\32"+
		"\2\2Vb\7\33\2\2WX\7\13\2\2Xc\7\66\2\2Y^\7\66\2\2Z[\7\17\2\2[]\7\66\2\2"+
		"\\Z\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_a\3\2\2\2`^\3\2\2\2ac\7\f\2"+
		"\2bW\3\2\2\2bY\3\2\2\2c\u008c\3\2\2\2de\7\35\2\2ef\7\20\2\2fg\7\66\2\2"+
		"gh\7\34\2\2h\u0081\7\33\2\2ij\7\13\2\2j\u0082\7\66\2\2kp\7\66\2\2lm\7"+
		"\17\2\2mo\7\66\2\2nl\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2r"+
		"p\3\2\2\2st\7\f\2\2tu\7\36\2\2uv\7\66\2\2vw\7\13\2\2w\u0082\7\66\2\2x"+
		"}\7\66\2\2yz\7\17\2\2z|\7\66\2\2{y\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3"+
		"\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0082\7\f\2\2\u0081i\3\2\2\2"+
		"\u0081k\3\2\2\2\u0081x\3\2\2\2\u0082\u008c\3\2\2\2\u0083\u0084\7\35\2"+
		"\2\u0084\u0085\7\21\2\2\u0085\u0086\7\66\2\2\u0086\u0087\7 \2\2\u0087"+
		"\u0088\7\13\2\2\u0088\u0089\5\n\6\2\u0089\u008a\7\f\2\2\u008a\u008c\3"+
		"\2\2\2\u008bR\3\2\2\2\u008bd\3\2\2\2\u008b\u0083\3\2\2\2\u008c\7\3\2\2"+
		"\2\u008d\u008e\7\66\2\2\u008e\u009a\5\36\20\2\u008f\u0090\7\66\2\2\u0090"+
		"\u0096\5\36\20\2\u0091\u0092\7\17\2\2\u0092\u0093\7\66\2\2\u0093\u0095"+
		"\5\36\20\2\u0094\u0091\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2"+
		"\u0096\u0097\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u008d"+
		"\3\2\2\2\u0099\u008f\3\2\2\2\u009a\t\3\2\2\2\u009b\u009e\t\2\2\2\u009c"+
		"\u009f\5\f\7\2\u009d\u009f\5\16\b\2\u009e\u009c\3\2\2\2\u009e\u009d\3"+
		"\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\t\2\2\2\u00a1\13\3\2\2\2\u00a2"+
		"\u00a6\7\62\2\2\u00a3\u00a6\7\63\2\2\u00a4\u00a6\7\64\2\2\u00a5\u00a2"+
		"\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\r\3\2\2\2\u00a7"+
		"\u00ae\7\22\2\2\u00a8\u00ae\7\23\2\2\u00a9\u00ae\7\24\2\2\u00aa\u00ae"+
		"\7\25\2\2\u00ab\u00ae\7\26\2\2\u00ac\u00ae\7\27\2\2\u00ad\u00a7\3\2\2"+
		"\2\u00ad\u00a8\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ad\u00aa\3\2\2\2\u00ad\u00ab"+
		"\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\17\3\2\2\2\u00af\u00b0\7!\2\2\u00b0"+
		"\u00b1\7\b\2\2\u00b1\u00b2\7\66\2\2\u00b2\u00b3\7\"\2\2\u00b3\u00b4\7"+
		"#\2\2\u00b4\u00ba\7\66\2\2\u00b5\u00b6\7!\2\2\u00b6\u00b7\7\b\2\2\u00b7"+
		"\u00b8\7\66\2\2\u00b8\u00ba\5\22\n\2\u00b9\u00af\3\2\2\2\u00b9\u00b5\3"+
		"\2\2\2\u00ba\21\3\2\2\2\u00bb\u00bc\7$\2\2\u00bc\u00bd\7%\2\2\u00bd\u00be"+
		"\7\66\2\2\u00be\u00c2\5\36\20\2\u00bf\u00c1\5\6\4\2\u00c0\u00bf\3\2\2"+
		"\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00d3"+
		"\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c9\7$\2\2\u00c6\u00c8\5\6\4\2\u00c7"+
		"\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\u00d3\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\7\6\2\2\u00cd"+
		"\u00ce\7%\2\2\u00ce\u00d3\7\66\2\2\u00cf\u00d0\7\6\2\2\u00d0\u00d1\7\35"+
		"\2\2\u00d1\u00d3\7\66\2\2\u00d2\u00bb\3\2\2\2\u00d2\u00c5\3\2\2\2\u00d2"+
		"\u00cc\3\2\2\2\u00d2\u00cf\3\2\2\2\u00d3\23\3\2\2\2\u00d4\u00d5\7&\2\2"+
		"\u00d5\u00d6\7\66\2\2\u00d6\u00d7\7\13\2\2\u00d7\u00dc\7\66\2\2\u00d8"+
		"\u00d9\7\17\2\2\u00d9\u00db\7\66\2\2\u00da\u00d8\3\2\2\2\u00db\u00de\3"+
		"\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de"+
		"\u00dc\3\2\2\2\u00df\u00e0\7\f\2\2\u00e0\u00e1\7\'\2\2\u00e1\u00e2\7\13"+
		"\2\2\u00e2\u00e7\5\36\20\2\u00e3\u00e4\7\17\2\2\u00e4\u00e6\5\36\20\2"+
		"\u00e5\u00e3\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8"+
		"\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\7\f\2\2\u00eb"+
		"\25\3\2\2\2\u00ec\u00ed\7(\2\2\u00ed\u00ee\7\66\2\2\u00ee\u00ef\7)\2\2"+
		"\u00ef\u00f0\7\66\2\2\u00f0\u00f1\7\27\2\2\u00f1\u00f2\7\13\2\2\u00f2"+
		"\u00f7\5\36\20\2\u00f3\u00f4\7\17\2\2\u00f4\u00f6\5\36\20\2\u00f5\u00f3"+
		"\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8"+
		"\u00fa\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\7\f\2\2\u00fb\u00fc\7+"+
		"\2\2\u00fc\u0102\5\30\r\2\u00fd\u00fe\5\f\7\2\u00fe\u00ff\5\30\r\2\u00ff"+
		"\u0101\3\2\2\2\u0100\u00fd\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2"+
		"\2\2\u0102\u0103\3\2\2\2\u0103\27\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0106"+
		"\7\66\2\2\u0106\u0107\5\16\b\2\u0107\u0108\7\66\2\2\u0108\31\3\2\2\2\u0109"+
		"\u010a\7*\2\2\u010a\u010b\7\37\2\2\u010b\u010c\7\66\2\2\u010c\u010d\7"+
		"+\2\2\u010d\u0113\5\30\r\2\u010e\u010f\5\f\7\2\u010f\u0110\5\30\r\2\u0110"+
		"\u0112\3\2\2\2\u0111\u010e\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2"+
		"\2\2\u0113\u0114\3\2\2\2\u0114\33\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u011b"+
		"\7\65\2\2\u0117\u011c\7\30\2\2\u0118\u0119\7\66\2\2\u0119\u011a\7\17\2"+
		"\2\u011a\u011c\7\66\2\2\u011b\u0117\3\2\2\2\u011b\u0118\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d\u011e\7\37\2\2\u011e\u011f\7\66\2\2\u011f\u0120\7"+
		"+\2\2\u0120\u0121\5\30\r\2\u0121\u0122\7,\2\2\u0122\u0123\7\66\2\2\u0123"+
		"\u0124\t\3\2\2\u0124\u0125\7\17\2\2\u0125\u0126\7\66\2\2\u0126\u0127\t"+
		"\3\2\2\u0127\35\3\2\2\2\u0128\u012c\7/\2\2\u0129\u012c\7\60\2\2\u012a"+
		"\u012c\7\61\2\2\u012b\u0128\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012a\3"+
		"\2\2\2\u012c\37\3\2\2\2\33%BP^bp}\u0081\u008b\u0096\u0099\u009e\u00a5"+
		"\u00ad\u00b9\u00c2\u00c9\u00d2\u00dc\u00e7\u00f7\u0102\u0113\u011b\u012b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}