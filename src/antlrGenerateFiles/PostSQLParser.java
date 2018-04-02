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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, ID=58, NUM=59, Char=60, 
		WS=61;
	public static final int
		RULE_program = 0, RULE_unitStatement = 1, RULE_constraints = 2, RULE_columDeclaration = 3, 
		RULE_exp = 4, RULE_eq_op = 5, RULE_eq_sgn = 6, RULE_action_alter_table = 7, 
		RULE_condicion = 8, RULE_varType = 9;
	public static final String[] ruleNames = {
		"program", "unitStatement", "constraints", "columDeclaration", "exp", 
		"eq_op", "eq_sgn", "action_alter_table", "condicion", "varType"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'-v'", "'CREATE'", "'DATABASE'", "'DROP'", "'SHOW'", "'DATABASES'", 
		"'TABLES'", "'USE'", "'ALTER'", "'RENAME'", "'TO'", "'TABLE'", "'FUCK'", 
		"'('", "')'", "'COLUMNS'", "'FROM'", "'INSERT'", "'INTO'", "','", "'VALUES'", 
		"'UPDATE'", "'SET'", "'='", "'WHERE'", "'DELETE'", "'SELECT'", "'*'", 
		"'ORDER'", "'BY'", "'ASC'", "'DESC'", "'CONSTRAINT'", "'PK_'", "'PRIMARY'", 
		"'KEY'", "'FK_'", "'FOREIGN'", "'REFERENCES'", "'CH_'", "'CHECK'", "'AND'", 
		"'OR'", "'NOT'", "'<'", "'>'", "'<='", "'>='", "'<>'", "'ADD'", "'COLUMN'", 
		"'INT'", "'CHAR'", "'FLOAT'", "'DATE'", "'NULL'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "ID", "NUM", 
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
	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InitProgramVerboseContext extends ProgramContext {
		public List<UnitStatementContext> unitStatement() {
			return getRuleContexts(UnitStatementContext.class);
		}
		public UnitStatementContext unitStatement(int i) {
			return getRuleContext(UnitStatementContext.class,i);
		}
		public InitProgramVerboseContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitInitProgramVerbose(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InitProgramContext extends ProgramContext {
		public List<UnitStatementContext> unitStatement() {
			return getRuleContexts(UnitStatementContext.class);
		}
		public UnitStatementContext unitStatement(int i) {
			return getRuleContext(UnitStatementContext.class,i);
		}
		public InitProgramContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitInitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			setState(38);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new InitProgramContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				unitStatement();
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(21);
					match(T__0);
					setState(22);
					unitStatement();
					}
					}
					setState(27);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new InitProgramVerboseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				unitStatement();
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(29);
					match(T__0);
					setState(30);
					unitStatement();
					}
					}
					setState(35);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(36);
				match(T__1);
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
		public List<VarTypeContext> varType() {
			return getRuleContexts(VarTypeContext.class);
		}
		public VarTypeContext varType(int i) {
			return getRuleContext(VarTypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(PostSQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PostSQLParser.ID, i);
		}
		public STMinsertIntoContext(UnitStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitSTMinsertInto(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class STMupdateContext extends UnitStatementContext {
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
		public TerminalNode ID() { return getToken(PostSQLParser.ID, 0); }
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
		public STMdeleteContext(UnitStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitSTMdelete(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class STMalterDBContext extends UnitStatementContext {
		public List<TerminalNode> ID() { return getTokens(PostSQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PostSQLParser.ID, i);
		}
		public STMalterDBContext(UnitStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitSTMalterDB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class STMalterTableContext extends UnitStatementContext {
		public TerminalNode ID() { return getToken(PostSQLParser.ID, 0); }
		public Action_alter_tableContext action_alter_table() {
			return getRuleContext(Action_alter_tableContext.class,0);
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
		public List<TerminalNode> ID() { return getTokens(PostSQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PostSQLParser.ID, i);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
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
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new STMcreateDBContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				match(T__2);
				setState(41);
				match(T__3);
				setState(42);
				match(ID);
				}
				break;
			case 2:
				_localctx = new STMdropDBContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				match(T__4);
				setState(44);
				match(T__3);
				setState(45);
				match(ID);
				}
				break;
			case 3:
				_localctx = new STMshowDBContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				match(T__5);
				setState(47);
				match(T__6);
				}
				break;
			case 4:
				_localctx = new STMshowTableContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(48);
				match(T__5);
				setState(49);
				match(T__7);
				}
				break;
			case 5:
				_localctx = new STMuseDBContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(50);
				match(T__8);
				setState(51);
				match(T__3);
				setState(52);
				match(ID);
				}
				break;
			case 6:
				_localctx = new STMalterDBContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(53);
				match(T__9);
				setState(54);
				match(T__3);
				setState(55);
				match(ID);
				setState(56);
				match(T__10);
				setState(57);
				match(T__11);
				setState(58);
				match(ID);
				}
				break;
			case 7:
				_localctx = new STMdropTableContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(59);
				match(T__4);
				setState(60);
				match(T__12);
				setState(61);
				match(ID);
				}
				break;
			case 8:
				_localctx = new STMfuckTableContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(62);
				match(T__13);
				setState(63);
				match(T__3);
				}
				break;
			case 9:
				_localctx = new STMcreateTableContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(64);
				match(T__2);
				setState(65);
				match(T__12);
				setState(66);
				match(ID);
				setState(67);
				match(T__14);
				setState(68);
				columDeclaration();
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__33) {
					{
					{
					setState(69);
					constraints();
					}
					}
					setState(74);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(75);
				match(T__15);
				}
				break;
			case 10:
				_localctx = new STMshowColumnContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(77);
				match(T__5);
				setState(78);
				match(T__16);
				setState(79);
				match(T__17);
				setState(80);
				match(ID);
				}
				break;
			case 11:
				_localctx = new STMalterTableContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(81);
				match(T__9);
				setState(82);
				match(T__12);
				setState(83);
				match(ID);
				setState(84);
				action_alter_table();
				}
				break;
			case 12:
				_localctx = new STMinsertIntoContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(85);
				match(T__18);
				setState(86);
				match(T__19);
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(87);
					match(ID);
					setState(88);
					match(T__14);
					setState(89);
					match(ID);
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__20) {
						{
						{
						setState(90);
						match(T__20);
						setState(91);
						match(ID);
						}
						}
						setState(96);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(97);
					match(T__15);
					}
				}

				setState(100);
				match(T__21);
				setState(101);
				match(T__14);
				setState(102);
				varType();
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__20) {
					{
					{
					setState(103);
					match(T__20);
					setState(104);
					varType();
					}
					}
					setState(109);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(110);
				match(T__15);
				}
				break;
			case 13:
				_localctx = new STMupdateContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(112);
				match(T__22);
				setState(113);
				match(ID);
				setState(114);
				match(T__23);
				setState(115);
				match(ID);
				setState(116);
				match(T__24);
				setState(117);
				match(T__14);
				setState(118);
				varType();
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__20) {
					{
					{
					setState(119);
					match(T__20);
					setState(120);
					varType();
					}
					}
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(126);
				match(T__15);
				setState(127);
				match(T__25);
				setState(128);
				condicion();
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__42) | (1L << T__43) | (1L << T__44))) != 0)) {
					{
					{
					setState(129);
					eq_op();
					setState(130);
					condicion();
					}
					}
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 14:
				_localctx = new STMdeleteContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(137);
				match(T__26);
				setState(138);
				match(T__17);
				setState(139);
				match(ID);
				setState(140);
				match(T__25);
				setState(141);
				condicion();
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__42) | (1L << T__43) | (1L << T__44))) != 0)) {
					{
					{
					setState(142);
					eq_op();
					setState(143);
					condicion();
					}
					}
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 15:
				_localctx = new STMselectContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(150);
				match(T__27);
				setState(155);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__28:
					{
					setState(151);
					match(T__28);
					}
					break;
				case ID:
					{
					setState(152);
					match(ID);
					{
					setState(153);
					match(T__20);
					setState(154);
					match(ID);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(157);
				match(T__17);
				setState(158);
				match(ID);
				setState(159);
				match(T__25);
				setState(160);
				condicion();
				setState(161);
				match(T__29);
				setState(162);
				match(T__30);
				setState(163);
				match(ID);
				setState(164);
				_la = _input.LA(1);
				if ( !(_la==T__31 || _la==T__32) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				{
				setState(165);
				match(T__20);
				setState(166);
				match(ID);
				setState(167);
				_la = _input.LA(1);
				if ( !(_la==T__31 || _la==T__32) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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
		public List<TerminalNode> ID() { return getTokens(PostSQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PostSQLParser.ID, i);
		}
		public PrimaryKeyDeclConstrContext(ConstraintsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitPrimaryKeyDeclConstr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForeignKeyDeclConstrContext extends ConstraintsContext {
		public List<TerminalNode> ID() { return getTokens(PostSQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PostSQLParser.ID, i);
		}
		public ForeignKeyDeclConstrContext(ConstraintsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitForeignKeyDeclConstr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CheckDeclConstrContext extends ConstraintsContext {
		public TerminalNode ID() { return getToken(PostSQLParser.ID, 0); }
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
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new PrimaryKeyDeclConstrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(T__33);
				setState(172);
				match(T__34);
				setState(173);
				match(ID);
				setState(174);
				match(T__35);
				setState(175);
				match(T__36);
				setState(176);
				match(T__14);
				setState(186);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(177);
					match(ID);
					}
					break;
				case 2:
					{
					setState(178);
					match(ID);
					setState(183);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__20) {
						{
						{
						setState(179);
						match(T__20);
						setState(180);
						match(ID);
						}
						}
						setState(185);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(188);
				match(T__15);
				}
				break;
			case 2:
				_localctx = new ForeignKeyDeclConstrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				match(T__33);
				setState(190);
				match(T__37);
				setState(191);
				match(ID);
				setState(192);
				match(T__38);
				setState(193);
				match(T__36);
				setState(194);
				match(T__14);
				setState(204);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(195);
					match(ID);
					}
					break;
				case 2:
					{
					setState(196);
					match(ID);
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__20) {
						{
						{
						setState(197);
						match(T__20);
						setState(198);
						match(ID);
						}
						}
						setState(203);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(206);
				match(T__15);
				setState(207);
				match(T__39);
				setState(208);
				match(ID);
				setState(209);
				match(T__14);
				setState(219);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(210);
					match(ID);
					}
					break;
				case 2:
					{
					setState(211);
					match(ID);
					setState(216);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__20) {
						{
						{
						setState(212);
						match(T__20);
						setState(213);
						match(ID);
						}
						}
						setState(218);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(221);
				match(T__15);
				}
				break;
			case 3:
				_localctx = new CheckDeclConstrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(222);
				match(T__33);
				setState(223);
				match(T__40);
				setState(224);
				match(ID);
				setState(225);
				match(T__41);
				setState(226);
				match(T__14);
				setState(227);
				exp();
				setState(228);
				match(T__15);
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
			_localctx = new MultipleColumnContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(ID);
			setState(233);
			varType();
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(234);
				match(T__20);
				setState(235);
				match(ID);
				setState(236);
				varType();
				}
				}
				setState(241);
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
			setState(242);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__42:
			case T__43:
			case T__44:
				{
				setState(243);
				eq_op();
				}
				break;
			case T__24:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
				{
				setState(244);
				eq_sgn();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(247);
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
		public AndOperationContext(Eq_opContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitAndOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotOperationContext extends Eq_opContext {
		public NotOperationContext(Eq_opContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitNotOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrOperationContext extends Eq_opContext {
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
			setState(252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__42:
				_localctx = new AndOperationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				match(T__42);
				}
				break;
			case T__43:
				_localctx = new OrOperationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				match(T__43);
				}
				break;
			case T__44:
				_localctx = new NotOperationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
				match(T__44);
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
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__45:
				_localctx = new MenorQueOpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				match(T__45);
				}
				break;
			case T__46:
				_localctx = new MayorQueOPContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				match(T__46);
				}
				break;
			case T__47:
				_localctx = new MenorIgualQueOpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(256);
				match(T__47);
				}
				break;
			case T__48:
				_localctx = new MayorIgualQueOpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(257);
				match(T__48);
				}
				break;
			case T__49:
				_localctx = new DiferenteOPContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(258);
				match(T__49);
				}
				break;
			case T__24:
				_localctx = new IgualOPContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(259);
				match(T__24);
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
		public TerminalNode ID() { return getToken(PostSQLParser.ID, 0); }
		public DropConstraintsContext(Action_alter_tableContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitDropConstraints(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddConstraintsContext extends Action_alter_tableContext {
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
	public static class RenameTableContext extends Action_alter_tableContext {
		public TerminalNode ID() { return getToken(PostSQLParser.ID, 0); }
		public RenameTableContext(Action_alter_tableContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitRenameTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropColumnContext extends Action_alter_tableContext {
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
		enterRule(_localctx, 14, RULE_action_alter_table);
		int _la;
		try {
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new AddColumnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				match(T__50);
				setState(263);
				match(T__51);
				setState(264);
				match(ID);
				setState(265);
				varType();
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__33) {
					{
					{
					setState(266);
					constraints();
					}
					}
					setState(271);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new AddConstraintsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				match(T__50);
				setState(273);
				constraints();
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__33) {
					{
					{
					setState(274);
					constraints();
					}
					}
					setState(279);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				_localctx = new DropColumnContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(280);
				match(T__4);
				setState(281);
				match(T__51);
				setState(282);
				match(ID);
				}
				break;
			case 4:
				_localctx = new DropConstraintsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(283);
				match(T__4);
				setState(284);
				match(T__33);
				setState(285);
				match(ID);
				}
				break;
			case 5:
				_localctx = new RenameTableContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(286);
				match(T__10);
				setState(287);
				match(T__11);
				setState(288);
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
		enterRule(_localctx, 16, RULE_condicion);
		try {
			_localctx = new CondicionDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(ID);
			setState(292);
			eq_sgn();
			setState(293);
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
		public VarintContext(VarTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitVarint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarnullContext extends VarTypeContext {
		public VarnullContext(VarTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitVarnull(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarcharContext extends VarTypeContext {
		public VarcharContext(VarTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitVarchar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarfloatContext extends VarTypeContext {
		public VarfloatContext(VarTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitVarfloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VardateContext extends VarTypeContext {
		public VardateContext(VarTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitVardate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarTypeContext varType() throws RecognitionException {
		VarTypeContext _localctx = new VarTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_varType);
		try {
			setState(300);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__52:
				_localctx = new VarintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				match(T__52);
				}
				break;
			case T__53:
				_localctx = new VarcharContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				match(T__53);
				}
				break;
			case T__54:
				_localctx = new VarfloatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(297);
				match(T__54);
				}
				break;
			case T__55:
				_localctx = new VardateContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(298);
				match(T__55);
				}
				break;
			case T__56:
				_localctx = new VarnullContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(299);
				match(T__56);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3?\u0131\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\2\3\2\3\2\7\2\"\n\2\f\2"+
		"\16\2%\13\2\3\2\3\2\5\2)\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\7\3I\n\3\f\3\16\3L\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3_\n\3\f\3\16\3b\13\3\3\3\5\3e\n\3\3"+
		"\3\3\3\3\3\3\3\3\3\7\3l\n\3\f\3\16\3o\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\7\3|\n\3\f\3\16\3\177\13\3\3\3\3\3\3\3\3\3\3\3\3\3\7"+
		"\3\u0087\n\3\f\3\16\3\u008a\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u0094"+
		"\n\3\f\3\16\3\u0097\13\3\3\3\3\3\3\3\3\3\3\3\5\3\u009e\n\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00ac\n\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\7\4\u00b8\n\4\f\4\16\4\u00bb\13\4\5\4\u00bd\n\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u00ca\n\4\f\4\16\4\u00cd"+
		"\13\4\5\4\u00cf\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u00d9\n\4\f\4"+
		"\16\4\u00dc\13\4\5\4\u00de\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"\u00e9\n\4\3\5\3\5\3\5\3\5\3\5\7\5\u00f0\n\5\f\5\16\5\u00f3\13\5\3\6\3"+
		"\6\3\6\5\6\u00f8\n\6\3\6\3\6\3\7\3\7\3\7\5\7\u00ff\n\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\b\u0107\n\b\3\t\3\t\3\t\3\t\3\t\7\t\u010e\n\t\f\t\16\t\u0111"+
		"\13\t\3\t\3\t\3\t\7\t\u0116\n\t\f\t\16\t\u0119\13\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\t\u0124\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\5\13\u012f\n\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\4\3\2\"#\3\2"+
		"<=\2\u015a\2(\3\2\2\2\4\u00ab\3\2\2\2\6\u00e8\3\2\2\2\b\u00ea\3\2\2\2"+
		"\n\u00f4\3\2\2\2\f\u00fe\3\2\2\2\16\u0106\3\2\2\2\20\u0123\3\2\2\2\22"+
		"\u0125\3\2\2\2\24\u012e\3\2\2\2\26\33\5\4\3\2\27\30\7\3\2\2\30\32\5\4"+
		"\3\2\31\27\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34)\3\2\2"+
		"\2\35\33\3\2\2\2\36#\5\4\3\2\37 \7\3\2\2 \"\5\4\3\2!\37\3\2\2\2\"%\3\2"+
		"\2\2#!\3\2\2\2#$\3\2\2\2$&\3\2\2\2%#\3\2\2\2&\'\7\4\2\2\')\3\2\2\2(\26"+
		"\3\2\2\2(\36\3\2\2\2)\3\3\2\2\2*+\7\5\2\2+,\7\6\2\2,\u00ac\7<\2\2-.\7"+
		"\7\2\2./\7\6\2\2/\u00ac\7<\2\2\60\61\7\b\2\2\61\u00ac\7\t\2\2\62\63\7"+
		"\b\2\2\63\u00ac\7\n\2\2\64\65\7\13\2\2\65\66\7\6\2\2\66\u00ac\7<\2\2\67"+
		"8\7\f\2\289\7\6\2\29:\7<\2\2:;\7\r\2\2;<\7\16\2\2<\u00ac\7<\2\2=>\7\7"+
		"\2\2>?\7\17\2\2?\u00ac\7<\2\2@A\7\20\2\2A\u00ac\7\6\2\2BC\7\5\2\2CD\7"+
		"\17\2\2DE\7<\2\2EF\7\21\2\2FJ\5\b\5\2GI\5\6\4\2HG\3\2\2\2IL\3\2\2\2JH"+
		"\3\2\2\2JK\3\2\2\2KM\3\2\2\2LJ\3\2\2\2MN\7\22\2\2N\u00ac\3\2\2\2OP\7\b"+
		"\2\2PQ\7\23\2\2QR\7\24\2\2R\u00ac\7<\2\2ST\7\f\2\2TU\7\17\2\2UV\7<\2\2"+
		"V\u00ac\5\20\t\2WX\7\25\2\2Xd\7\26\2\2YZ\7<\2\2Z[\7\21\2\2[`\7<\2\2\\"+
		"]\7\27\2\2]_\7<\2\2^\\\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2"+
		"b`\3\2\2\2ce\7\22\2\2dY\3\2\2\2de\3\2\2\2ef\3\2\2\2fg\7\30\2\2gh\7\21"+
		"\2\2hm\5\24\13\2ij\7\27\2\2jl\5\24\13\2ki\3\2\2\2lo\3\2\2\2mk\3\2\2\2"+
		"mn\3\2\2\2np\3\2\2\2om\3\2\2\2pq\7\22\2\2q\u00ac\3\2\2\2rs\7\31\2\2st"+
		"\7<\2\2tu\7\32\2\2uv\7<\2\2vw\7\33\2\2wx\7\21\2\2x}\5\24\13\2yz\7\27\2"+
		"\2z|\5\24\13\2{y\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2"+
		"\2\177}\3\2\2\2\u0080\u0081\7\22\2\2\u0081\u0082\7\34\2\2\u0082\u0088"+
		"\5\22\n\2\u0083\u0084\5\f\7\2\u0084\u0085\5\22\n\2\u0085\u0087\3\2\2\2"+
		"\u0086\u0083\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089"+
		"\3\2\2\2\u0089\u00ac\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c\7\35\2\2"+
		"\u008c\u008d\7\24\2\2\u008d\u008e\7<\2\2\u008e\u008f\7\34\2\2\u008f\u0095"+
		"\5\22\n\2\u0090\u0091\5\f\7\2\u0091\u0092\5\22\n\2\u0092\u0094\3\2\2\2"+
		"\u0093\u0090\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096"+
		"\3\2\2\2\u0096\u00ac\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u009d\7\36\2\2"+
		"\u0099\u009e\7\37\2\2\u009a\u009b\7<\2\2\u009b\u009c\7\27\2\2\u009c\u009e"+
		"\7<\2\2\u009d\u0099\3\2\2\2\u009d\u009a\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a0\7\24\2\2\u00a0\u00a1\7<\2\2\u00a1\u00a2\7\34\2\2\u00a2\u00a3\5"+
		"\22\n\2\u00a3\u00a4\7 \2\2\u00a4\u00a5\7!\2\2\u00a5\u00a6\7<\2\2\u00a6"+
		"\u00a7\t\2\2\2\u00a7\u00a8\7\27\2\2\u00a8\u00a9\7<\2\2\u00a9\u00aa\t\2"+
		"\2\2\u00aa\u00ac\3\2\2\2\u00ab*\3\2\2\2\u00ab-\3\2\2\2\u00ab\60\3\2\2"+
		"\2\u00ab\62\3\2\2\2\u00ab\64\3\2\2\2\u00ab\67\3\2\2\2\u00ab=\3\2\2\2\u00ab"+
		"@\3\2\2\2\u00abB\3\2\2\2\u00abO\3\2\2\2\u00abS\3\2\2\2\u00abW\3\2\2\2"+
		"\u00abr\3\2\2\2\u00ab\u008b\3\2\2\2\u00ab\u0098\3\2\2\2\u00ac\5\3\2\2"+
		"\2\u00ad\u00ae\7$\2\2\u00ae\u00af\7%\2\2\u00af\u00b0\7<\2\2\u00b0\u00b1"+
		"\7&\2\2\u00b1\u00b2\7\'\2\2\u00b2\u00bc\7\21\2\2\u00b3\u00bd\7<\2\2\u00b4"+
		"\u00b9\7<\2\2\u00b5\u00b6\7\27\2\2\u00b6\u00b8\7<\2\2\u00b7\u00b5\3\2"+
		"\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00b3\3\2\2\2\u00bc\u00b4\3\2"+
		"\2\2\u00bd\u00be\3\2\2\2\u00be\u00e9\7\22\2\2\u00bf\u00c0\7$\2\2\u00c0"+
		"\u00c1\7(\2\2\u00c1\u00c2\7<\2\2\u00c2\u00c3\7)\2\2\u00c3\u00c4\7\'\2"+
		"\2\u00c4\u00ce\7\21\2\2\u00c5\u00cf\7<\2\2\u00c6\u00cb\7<\2\2\u00c7\u00c8"+
		"\7\27\2\2\u00c8\u00ca\7<\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2"+
		"\2\2\u00ce\u00c5\3\2\2\2\u00ce\u00c6\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\u00d1\7\22\2\2\u00d1\u00d2\7*\2\2\u00d2\u00d3\7<\2\2\u00d3\u00dd\7\21"+
		"\2\2\u00d4\u00de\7<\2\2\u00d5\u00da\7<\2\2\u00d6\u00d7\7\27\2\2\u00d7"+
		"\u00d9\7<\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2"+
		"\2\2\u00da\u00db\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd"+
		"\u00d4\3\2\2\2\u00dd\u00d5\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e9\7\22"+
		"\2\2\u00e0\u00e1\7$\2\2\u00e1\u00e2\7+\2\2\u00e2\u00e3\7<\2\2\u00e3\u00e4"+
		"\7,\2\2\u00e4\u00e5\7\21\2\2\u00e5\u00e6\5\n\6\2\u00e6\u00e7\7\22\2\2"+
		"\u00e7\u00e9\3\2\2\2\u00e8\u00ad\3\2\2\2\u00e8\u00bf\3\2\2\2\u00e8\u00e0"+
		"\3\2\2\2\u00e9\7\3\2\2\2\u00ea\u00eb\7<\2\2\u00eb\u00f1\5\24\13\2\u00ec"+
		"\u00ed\7\27\2\2\u00ed\u00ee\7<\2\2\u00ee\u00f0\5\24\13\2\u00ef\u00ec\3"+
		"\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\t\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f7\t\3\2\2\u00f5\u00f8\5\f\7\2"+
		"\u00f6\u00f8\5\16\b\2\u00f7\u00f5\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00f9"+
		"\3\2\2\2\u00f9\u00fa\t\3\2\2\u00fa\13\3\2\2\2\u00fb\u00ff\7-\2\2\u00fc"+
		"\u00ff\7.\2\2\u00fd\u00ff\7/\2\2\u00fe\u00fb\3\2\2\2\u00fe\u00fc\3\2\2"+
		"\2\u00fe\u00fd\3\2\2\2\u00ff\r\3\2\2\2\u0100\u0107\7\60\2\2\u0101\u0107"+
		"\7\61\2\2\u0102\u0107\7\62\2\2\u0103\u0107\7\63\2\2\u0104\u0107\7\64\2"+
		"\2\u0105\u0107\7\33\2\2\u0106\u0100\3\2\2\2\u0106\u0101\3\2\2\2\u0106"+
		"\u0102\3\2\2\2\u0106\u0103\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0105\3\2"+
		"\2\2\u0107\17\3\2\2\2\u0108\u0109\7\65\2\2\u0109\u010a\7\66\2\2\u010a"+
		"\u010b\7<\2\2\u010b\u010f\5\24\13\2\u010c\u010e\5\6\4\2\u010d\u010c\3"+
		"\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"\u0124\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0113\7\65\2\2\u0113\u0117\5"+
		"\6\4\2\u0114\u0116\5\6\4\2\u0115\u0114\3\2\2\2\u0116\u0119\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0124\3\2\2\2\u0119\u0117\3\2"+
		"\2\2\u011a\u011b\7\7\2\2\u011b\u011c\7\66\2\2\u011c\u0124\7<\2\2\u011d"+
		"\u011e\7\7\2\2\u011e\u011f\7$\2\2\u011f\u0124\7<\2\2\u0120\u0121\7\r\2"+
		"\2\u0121\u0122\7\16\2\2\u0122\u0124\7<\2\2\u0123\u0108\3\2\2\2\u0123\u0112"+
		"\3\2\2\2\u0123\u011a\3\2\2\2\u0123\u011d\3\2\2\2\u0123\u0120\3\2\2\2\u0124"+
		"\21\3\2\2\2\u0125\u0126\7<\2\2\u0126\u0127\5\16\b\2\u0127\u0128\7<\2\2"+
		"\u0128\23\3\2\2\2\u0129\u012f\7\67\2\2\u012a\u012f\78\2\2\u012b\u012f"+
		"\79\2\2\u012c\u012f\7:\2\2\u012d\u012f\7;\2\2\u012e\u0129\3\2\2\2\u012e"+
		"\u012a\3\2\2\2\u012e\u012b\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012d\3\2"+
		"\2\2\u012f\25\3\2\2\2\35\33#(J`dm}\u0088\u0095\u009d\u00ab\u00b9\u00bc"+
		"\u00cb\u00ce\u00da\u00dd\u00e8\u00f1\u00f7\u00fe\u0106\u010f\u0117\u0123"+
		"\u012e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}