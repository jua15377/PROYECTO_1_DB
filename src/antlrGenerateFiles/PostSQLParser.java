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
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, ID=59, NUM=60, 
		FLT=61, DATE=62, WS=63;
	public static final int
		RULE_program = 0, RULE_unitStatement = 1, RULE_columnsids = 2, RULE_valuesids = 3, 
		RULE_struct = 4, RULE_constraints = 5, RULE_columDeclaration = 6, RULE_exp = 7, 
		RULE_eq_op = 8, RULE_eq_sgn = 9, RULE_action_alter_table = 10, RULE_condicion = 11, 
		RULE_varType = 12, RULE_typechar = 13;
	public static final String[] ruleNames = {
		"program", "unitStatement", "columnsids", "valuesids", "struct", "constraints", 
		"columDeclaration", "exp", "eq_op", "eq_sgn", "action_alter_table", "condicion", 
		"varType", "typechar"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'-v'", "'CREATE'", "'DATABASE'", "'DROP'", "'SHOW'", "'DATABASES'", 
		"'TABLES'", "'USE'", "'ALTER'", "'RENAME'", "'TO'", "'TABLE'", "'FUCK'", 
		"'('", "')'", "'COLUMNS'", "'FROM'", "'INSERT'", "'INTO'", "'VALUES'", 
		"'UPDATE'", "'SET'", "'='", "','", "'WHERE'", "'DELETE'", "'SELECT'", 
		"'*'", "'ORDER'", "'BY'", "'ASC'", "'DESC'", "'''", "'CONSTRAINT'", "'PK_'", 
		"'PRIMARY'", "'KEY'", "'FK_'", "'FOREIGN'", "'REFERENCES'", "'CH_'", "'CHECK'", 
		"'AND'", "'OR'", "'NOT'", "'<'", "'>'", "'<='", "'>='", "'<>'", "'ADD'", 
		"'COLUMN'", "'INT'", "'FLOAT'", "'DATE'", "'NULL'", "'CHAR'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "ID", 
		"NUM", "FLT", "DATE", "WS"
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
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new InitProgramContext(_localctx);
				enterOuterAlt(_localctx, 1);
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
				}
				break;
			case 2:
				_localctx = new InitProgramVerboseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				unitStatement();
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(37);
					match(T__0);
					setState(38);
					unitStatement();
					}
					}
					setState(43);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(44);
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
		public TerminalNode ID() { return getToken(PostSQLParser.ID, 0); }
		public ValuesidsContext valuesids() {
			return getRuleContext(ValuesidsContext.class,0);
		}
		public ColumnsidsContext columnsids() {
			return getRuleContext(ColumnsidsContext.class,0);
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
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new STMcreateDBContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				match(T__2);
				setState(49);
				match(T__3);
				setState(50);
				match(ID);
				}
				break;
			case 2:
				_localctx = new STMdropDBContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				match(T__4);
				setState(52);
				match(T__3);
				setState(53);
				match(ID);
				}
				break;
			case 3:
				_localctx = new STMshowDBContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				match(T__5);
				setState(55);
				match(T__6);
				}
				break;
			case 4:
				_localctx = new STMshowTableContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(56);
				match(T__5);
				setState(57);
				match(T__7);
				}
				break;
			case 5:
				_localctx = new STMuseDBContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(58);
				match(T__8);
				setState(59);
				match(T__3);
				setState(60);
				match(ID);
				}
				break;
			case 6:
				_localctx = new STMalterDBContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(61);
				match(T__9);
				setState(62);
				match(T__3);
				setState(63);
				match(ID);
				setState(64);
				match(T__10);
				setState(65);
				match(T__11);
				setState(66);
				match(ID);
				}
				break;
			case 7:
				_localctx = new STMdropTableContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(67);
				match(T__4);
				setState(68);
				match(T__12);
				setState(69);
				match(ID);
				}
				break;
			case 8:
				_localctx = new STMfuckTableContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(70);
				match(T__13);
				setState(71);
				match(T__3);
				}
				break;
			case 9:
				_localctx = new STMcreateTableContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(72);
				match(T__2);
				setState(73);
				match(T__12);
				setState(74);
				match(ID);
				setState(75);
				match(T__14);
				setState(76);
				columDeclaration();
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__34) {
					{
					{
					setState(77);
					constraints();
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(83);
				match(T__15);
				}
				break;
			case 10:
				_localctx = new STMshowColumnContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(85);
				match(T__5);
				setState(86);
				match(T__16);
				setState(87);
				match(T__17);
				setState(88);
				match(ID);
				}
				break;
			case 11:
				_localctx = new STMalterTableContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(89);
				match(T__9);
				setState(90);
				match(T__12);
				setState(91);
				match(ID);
				setState(92);
				action_alter_table();
				}
				break;
			case 12:
				_localctx = new STMinsertIntoContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(93);
				match(T__18);
				setState(94);
				match(T__19);
				setState(95);
				match(ID);
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(96);
					match(T__14);
					setState(97);
					columnsids();
					setState(98);
					match(T__15);
					}
				}

				setState(102);
				match(T__20);
				setState(103);
				match(T__14);
				setState(104);
				valuesids();
				setState(105);
				match(T__15);
				}
				break;
			case 13:
				_localctx = new STMupdateContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(107);
				match(T__21);
				setState(108);
				match(ID);
				setState(109);
				match(T__22);
				setState(110);
				match(ID);
				setState(111);
				match(T__23);
				setState(112);
				match(T__14);
				setState(113);
				varType();
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__24) {
					{
					{
					setState(114);
					match(T__24);
					setState(115);
					varType();
					}
					}
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(121);
				match(T__15);
				setState(122);
				match(T__25);
				setState(123);
				condicion();
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__43) | (1L << T__44) | (1L << T__45))) != 0)) {
					{
					{
					setState(124);
					eq_op();
					setState(125);
					condicion();
					}
					}
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 14:
				_localctx = new STMdeleteContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(132);
				match(T__26);
				setState(133);
				match(T__17);
				setState(134);
				match(ID);
				setState(135);
				match(T__25);
				setState(136);
				condicion();
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__43) | (1L << T__44) | (1L << T__45))) != 0)) {
					{
					{
					setState(137);
					eq_op();
					setState(138);
					condicion();
					}
					}
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 15:
				_localctx = new STMselectContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(145);
				match(T__27);
				setState(150);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__28:
					{
					setState(146);
					match(T__28);
					}
					break;
				case ID:
					{
					setState(147);
					match(ID);
					{
					setState(148);
					match(T__24);
					setState(149);
					match(ID);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(152);
				match(T__17);
				setState(153);
				match(ID);
				setState(154);
				match(T__25);
				setState(155);
				condicion();
				setState(156);
				match(T__29);
				setState(157);
				match(T__30);
				setState(158);
				match(ID);
				setState(159);
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
				setState(160);
				match(T__24);
				setState(161);
				match(ID);
				setState(162);
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

	public static class ColumnsidsContext extends ParserRuleContext {
		public ColumnsidsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnsids; }
	 
		public ColumnsidsContext() { }
		public void copyFrom(ColumnsidsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StmcolumsidContext extends ColumnsidsContext {
		public List<TerminalNode> ID() { return getTokens(PostSQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PostSQLParser.ID, i);
		}
		public StmcolumsidContext(ColumnsidsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitStmcolumsid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnsidsContext columnsids() throws RecognitionException {
		ColumnsidsContext _localctx = new ColumnsidsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_columnsids);
		int _la;
		try {
			_localctx = new StmcolumsidContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(ID);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24) {
				{
				{
				setState(167);
				match(T__24);
				setState(168);
				match(ID);
				}
				}
				setState(173);
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

	public static class ValuesidsContext extends ParserRuleContext {
		public ValuesidsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuesids; }
	 
		public ValuesidsContext() { }
		public void copyFrom(ValuesidsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StmvaluesContext extends ValuesidsContext {
		public List<StructContext> struct() {
			return getRuleContexts(StructContext.class);
		}
		public StructContext struct(int i) {
			return getRuleContext(StructContext.class,i);
		}
		public StmvaluesContext(ValuesidsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitStmvalues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesidsContext valuesids() throws RecognitionException {
		ValuesidsContext _localctx = new ValuesidsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_valuesids);
		int _la;
		try {
			_localctx = new StmvaluesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			struct();
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24) {
				{
				{
				setState(175);
				match(T__24);
				setState(176);
				struct();
				}
				}
				setState(181);
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

	public static class StructContext extends ParserRuleContext {
		public StructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct; }
	 
		public StructContext() { }
		public void copyFrom(StructContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StructidContext extends StructContext {
		public TerminalNode ID() { return getToken(PostSQLParser.ID, 0); }
		public StructidContext(StructContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitStructid(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StructdateContext extends StructContext {
		public TerminalNode DATE() { return getToken(PostSQLParser.DATE, 0); }
		public StructdateContext(StructContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitStructdate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StructfltContext extends StructContext {
		public TerminalNode FLT() { return getToken(PostSQLParser.FLT, 0); }
		public StructfltContext(StructContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitStructflt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StructnumContext extends StructContext {
		public TerminalNode NUM() { return getToken(PostSQLParser.NUM, 0); }
		public StructnumContext(StructContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitStructnum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructContext struct() throws RecognitionException {
		StructContext _localctx = new StructContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_struct);
		try {
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new StructidContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(T__33);
				setState(183);
				match(ID);
				setState(184);
				match(T__33);
				}
				break;
			case 2:
				_localctx = new StructnumContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(NUM);
				}
				break;
			case 3:
				_localctx = new StructfltContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				match(FLT);
				}
				break;
			case 4:
				_localctx = new StructdateContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(187);
				match(T__33);
				setState(188);
				match(DATE);
				setState(189);
				match(T__33);
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
		enterRule(_localctx, 10, RULE_constraints);
		int _la;
		try {
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new PrimaryKeyDeclConstrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(T__34);
				setState(193);
				match(T__35);
				setState(194);
				match(ID);
				setState(195);
				match(T__36);
				setState(196);
				match(T__37);
				setState(197);
				match(T__14);
				setState(207);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(198);
					match(ID);
					}
					break;
				case 2:
					{
					setState(199);
					match(ID);
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__24) {
						{
						{
						setState(200);
						match(T__24);
						setState(201);
						match(ID);
						}
						}
						setState(206);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(209);
				match(T__15);
				}
				break;
			case 2:
				_localctx = new ForeignKeyDeclConstrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				match(T__34);
				setState(211);
				match(T__38);
				setState(212);
				match(ID);
				setState(213);
				match(T__39);
				setState(214);
				match(T__37);
				setState(215);
				match(T__14);
				setState(225);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(216);
					match(ID);
					}
					break;
				case 2:
					{
					setState(217);
					match(ID);
					setState(222);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__24) {
						{
						{
						setState(218);
						match(T__24);
						setState(219);
						match(ID);
						}
						}
						setState(224);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(227);
				match(T__15);
				setState(228);
				match(T__40);
				setState(229);
				match(ID);
				setState(230);
				match(T__14);
				setState(240);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(231);
					match(ID);
					}
					break;
				case 2:
					{
					setState(232);
					match(ID);
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__24) {
						{
						{
						setState(233);
						match(T__24);
						setState(234);
						match(ID);
						}
						}
						setState(239);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(242);
				match(T__15);
				}
				break;
			case 3:
				_localctx = new CheckDeclConstrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(243);
				match(T__34);
				setState(244);
				match(T__41);
				setState(245);
				match(ID);
				setState(246);
				match(T__42);
				setState(247);
				match(T__14);
				setState(248);
				exp();
				setState(249);
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
		enterRule(_localctx, 12, RULE_columDeclaration);
		int _la;
		try {
			_localctx = new MultipleColumnContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(ID);
			setState(254);
			varType();
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24) {
				{
				{
				setState(255);
				match(T__24);
				setState(256);
				match(ID);
				setState(257);
				varType();
				}
				}
				setState(262);
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
		enterRule(_localctx, 14, RULE_exp);
		int _la;
		try {
			_localctx = new ExpDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__43:
			case T__44:
			case T__45:
				{
				setState(264);
				eq_op();
				}
				break;
			case T__23:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
				{
				setState(265);
				eq_sgn();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(268);
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
		enterRule(_localctx, 16, RULE_eq_op);
		try {
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__43:
				_localctx = new AndOperationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				match(T__43);
				}
				break;
			case T__44:
				_localctx = new OrOperationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				match(T__44);
				}
				break;
			case T__45:
				_localctx = new NotOperationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
				match(T__45);
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
		enterRule(_localctx, 18, RULE_eq_sgn);
		try {
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__46:
				_localctx = new MenorQueOpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				match(T__46);
				}
				break;
			case T__47:
				_localctx = new MayorQueOPContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				match(T__47);
				}
				break;
			case T__48:
				_localctx = new MenorIgualQueOpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(277);
				match(T__48);
				}
				break;
			case T__49:
				_localctx = new MayorIgualQueOpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(278);
				match(T__49);
				}
				break;
			case T__50:
				_localctx = new DiferenteOPContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(279);
				match(T__50);
				}
				break;
			case T__23:
				_localctx = new IgualOPContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(280);
				match(T__23);
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
		enterRule(_localctx, 20, RULE_action_alter_table);
		int _la;
		try {
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new AddColumnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				match(T__51);
				setState(284);
				match(T__52);
				setState(285);
				match(ID);
				setState(286);
				varType();
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__34) {
					{
					{
					setState(287);
					constraints();
					}
					}
					setState(292);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new AddConstraintsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				match(T__51);
				setState(294);
				constraints();
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__34) {
					{
					{
					setState(295);
					constraints();
					}
					}
					setState(300);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				_localctx = new DropColumnContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(301);
				match(T__4);
				setState(302);
				match(T__52);
				setState(303);
				match(ID);
				}
				break;
			case 4:
				_localctx = new DropConstraintsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(304);
				match(T__4);
				setState(305);
				match(T__34);
				setState(306);
				match(ID);
				}
				break;
			case 5:
				_localctx = new RenameTableContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(307);
				match(T__10);
				setState(308);
				match(T__11);
				setState(309);
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
		enterRule(_localctx, 22, RULE_condicion);
		try {
			_localctx = new CondicionDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(ID);
			setState(313);
			eq_sgn();
			setState(314);
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
		public TypecharContext typechar() {
			return getRuleContext(TypecharContext.class,0);
		}
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
		enterRule(_localctx, 24, RULE_varType);
		try {
			setState(321);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__53:
				_localctx = new VarintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				match(T__53);
				}
				break;
			case T__57:
				_localctx = new VarcharContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				typechar();
				}
				break;
			case T__54:
				_localctx = new VarfloatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(318);
				match(T__54);
				}
				break;
			case T__55:
				_localctx = new VardateContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(319);
				match(T__55);
				}
				break;
			case T__56:
				_localctx = new VarnullContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(320);
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

	public static class TypecharContext extends ParserRuleContext {
		public TypecharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typechar; }
	 
		public TypecharContext() { }
		public void copyFrom(TypecharContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypecharDeclarationContext extends TypecharContext {
		public TerminalNode NUM() { return getToken(PostSQLParser.NUM, 0); }
		public TypecharDeclarationContext(TypecharContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitTypecharDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypecharContext typechar() throws RecognitionException {
		TypecharContext _localctx = new TypecharContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_typechar);
		try {
			_localctx = new TypecharDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(T__57);
			setState(324);
			match(T__14);
			setState(325);
			match(NUM);
			setState(326);
			match(T__15);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3A\u014b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\7\2\"\n\2\f\2\16\2"+
		"%\13\2\3\2\3\2\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\3\2\5\2\61\n\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3Q\n\3\f\3\16\3T\13\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3g"+
		"\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3w\n\3"+
		"\f\3\16\3z\13\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u0082\n\3\f\3\16\3\u0085\13"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u008f\n\3\f\3\16\3\u0092\13\3\3"+
		"\3\3\3\3\3\3\3\3\3\5\3\u0099\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\3\u00a7\n\3\3\4\3\4\3\4\7\4\u00ac\n\4\f\4\16\4\u00af\13\4"+
		"\3\5\3\5\3\5\7\5\u00b4\n\5\f\5\16\5\u00b7\13\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\5\6\u00c1\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00cd"+
		"\n\7\f\7\16\7\u00d0\13\7\5\7\u00d2\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\7\7\u00df\n\7\f\7\16\7\u00e2\13\7\5\7\u00e4\n\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\7\7\u00ee\n\7\f\7\16\7\u00f1\13\7\5\7\u00f3\n\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00fe\n\7\3\b\3\b\3\b\3\b\3\b"+
		"\7\b\u0105\n\b\f\b\16\b\u0108\13\b\3\t\3\t\3\t\5\t\u010d\n\t\3\t\3\t\3"+
		"\n\3\n\3\n\5\n\u0114\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u011c\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\7\f\u0123\n\f\f\f\16\f\u0126\13\f\3\f\3\f\3\f\7\f"+
		"\u012b\n\f\f\f\16\f\u012e\13\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f"+
		"\u0139\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\5\16\u0144\n\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\2\4\3\2\"#\3\2=>\2\u0173\2\60\3\2\2\2\4\u00a6\3\2\2\2\6\u00a8\3\2\2\2"+
		"\b\u00b0\3\2\2\2\n\u00c0\3\2\2\2\f\u00fd\3\2\2\2\16\u00ff\3\2\2\2\20\u0109"+
		"\3\2\2\2\22\u0113\3\2\2\2\24\u011b\3\2\2\2\26\u0138\3\2\2\2\30\u013a\3"+
		"\2\2\2\32\u0143\3\2\2\2\34\u0145\3\2\2\2\36#\5\4\3\2\37 \7\3\2\2 \"\5"+
		"\4\3\2!\37\3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\61\3\2\2\2%#\3\2\2"+
		"\2&+\5\4\3\2\'(\7\3\2\2(*\5\4\3\2)\'\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2"+
		"\2\2,.\3\2\2\2-+\3\2\2\2./\7\4\2\2/\61\3\2\2\2\60\36\3\2\2\2\60&\3\2\2"+
		"\2\61\3\3\2\2\2\62\63\7\5\2\2\63\64\7\6\2\2\64\u00a7\7=\2\2\65\66\7\7"+
		"\2\2\66\67\7\6\2\2\67\u00a7\7=\2\289\7\b\2\29\u00a7\7\t\2\2:;\7\b\2\2"+
		";\u00a7\7\n\2\2<=\7\13\2\2=>\7\6\2\2>\u00a7\7=\2\2?@\7\f\2\2@A\7\6\2\2"+
		"AB\7=\2\2BC\7\r\2\2CD\7\16\2\2D\u00a7\7=\2\2EF\7\7\2\2FG\7\17\2\2G\u00a7"+
		"\7=\2\2HI\7\20\2\2I\u00a7\7\6\2\2JK\7\5\2\2KL\7\17\2\2LM\7=\2\2MN\7\21"+
		"\2\2NR\5\16\b\2OQ\5\f\7\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3"+
		"\2\2\2TR\3\2\2\2UV\7\22\2\2V\u00a7\3\2\2\2WX\7\b\2\2XY\7\23\2\2YZ\7\24"+
		"\2\2Z\u00a7\7=\2\2[\\\7\f\2\2\\]\7\17\2\2]^\7=\2\2^\u00a7\5\26\f\2_`\7"+
		"\25\2\2`a\7\26\2\2af\7=\2\2bc\7\21\2\2cd\5\6\4\2de\7\22\2\2eg\3\2\2\2"+
		"fb\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\7\27\2\2ij\7\21\2\2jk\5\b\5\2kl\7\22"+
		"\2\2l\u00a7\3\2\2\2mn\7\30\2\2no\7=\2\2op\7\31\2\2pq\7=\2\2qr\7\32\2\2"+
		"rs\7\21\2\2sx\5\32\16\2tu\7\33\2\2uw\5\32\16\2vt\3\2\2\2wz\3\2\2\2xv\3"+
		"\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{|\7\22\2\2|}\7\34\2\2}\u0083\5\30"+
		"\r\2~\177\5\22\n\2\177\u0080\5\30\r\2\u0080\u0082\3\2\2\2\u0081~\3\2\2"+
		"\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u00a7"+
		"\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087\7\35\2\2\u0087\u0088\7\24\2\2"+
		"\u0088\u0089\7=\2\2\u0089\u008a\7\34\2\2\u008a\u0090\5\30\r\2\u008b\u008c"+
		"\5\22\n\2\u008c\u008d\5\30\r\2\u008d\u008f\3\2\2\2\u008e\u008b\3\2\2\2"+
		"\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u00a7"+
		"\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0098\7\36\2\2\u0094\u0099\7\37\2\2"+
		"\u0095\u0096\7=\2\2\u0096\u0097\7\33\2\2\u0097\u0099\7=\2\2\u0098\u0094"+
		"\3\2\2\2\u0098\u0095\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\7\24\2\2"+
		"\u009b\u009c\7=\2\2\u009c\u009d\7\34\2\2\u009d\u009e\5\30\r\2\u009e\u009f"+
		"\7 \2\2\u009f\u00a0\7!\2\2\u00a0\u00a1\7=\2\2\u00a1\u00a2\t\2\2\2\u00a2"+
		"\u00a3\7\33\2\2\u00a3\u00a4\7=\2\2\u00a4\u00a5\t\2\2\2\u00a5\u00a7\3\2"+
		"\2\2\u00a6\62\3\2\2\2\u00a6\65\3\2\2\2\u00a68\3\2\2\2\u00a6:\3\2\2\2\u00a6"+
		"<\3\2\2\2\u00a6?\3\2\2\2\u00a6E\3\2\2\2\u00a6H\3\2\2\2\u00a6J\3\2\2\2"+
		"\u00a6W\3\2\2\2\u00a6[\3\2\2\2\u00a6_\3\2\2\2\u00a6m\3\2\2\2\u00a6\u0086"+
		"\3\2\2\2\u00a6\u0093\3\2\2\2\u00a7\5\3\2\2\2\u00a8\u00ad\7=\2\2\u00a9"+
		"\u00aa\7\33\2\2\u00aa\u00ac\7=\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00af\3\2"+
		"\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\7\3\2\2\2\u00af\u00ad"+
		"\3\2\2\2\u00b0\u00b5\5\n\6\2\u00b1\u00b2\7\33\2\2\u00b2\u00b4\5\n\6\2"+
		"\u00b3\u00b1\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6"+
		"\3\2\2\2\u00b6\t\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\7$\2\2\u00b9"+
		"\u00ba\7=\2\2\u00ba\u00c1\7$\2\2\u00bb\u00c1\7>\2\2\u00bc\u00c1\7?\2\2"+
		"\u00bd\u00be\7$\2\2\u00be\u00bf\7@\2\2\u00bf\u00c1\7$\2\2\u00c0\u00b8"+
		"\3\2\2\2\u00c0\u00bb\3\2\2\2\u00c0\u00bc\3\2\2\2\u00c0\u00bd\3\2\2\2\u00c1"+
		"\13\3\2\2\2\u00c2\u00c3\7%\2\2\u00c3\u00c4\7&\2\2\u00c4\u00c5\7=\2\2\u00c5"+
		"\u00c6\7\'\2\2\u00c6\u00c7\7(\2\2\u00c7\u00d1\7\21\2\2\u00c8\u00d2\7="+
		"\2\2\u00c9\u00ce\7=\2\2\u00ca\u00cb\7\33\2\2\u00cb\u00cd\7=\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2"+
		"\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00c8\3\2\2\2\u00d1"+
		"\u00c9\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00fe\7\22\2\2\u00d4\u00d5\7"+
		"%\2\2\u00d5\u00d6\7)\2\2\u00d6\u00d7\7=\2\2\u00d7\u00d8\7*\2\2\u00d8\u00d9"+
		"\7(\2\2\u00d9\u00e3\7\21\2\2\u00da\u00e4\7=\2\2\u00db\u00e0\7=\2\2\u00dc"+
		"\u00dd\7\33\2\2\u00dd\u00df\7=\2\2\u00de\u00dc\3\2\2\2\u00df\u00e2\3\2"+
		"\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2"+
		"\u00e0\3\2\2\2\u00e3\u00da\3\2\2\2\u00e3\u00db\3\2\2\2\u00e4\u00e5\3\2"+
		"\2\2\u00e5\u00e6\7\22\2\2\u00e6\u00e7\7+\2\2\u00e7\u00e8\7=\2\2\u00e8"+
		"\u00f2\7\21\2\2\u00e9\u00f3\7=\2\2\u00ea\u00ef\7=\2\2\u00eb\u00ec\7\33"+
		"\2\2\u00ec\u00ee\7=\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef"+
		"\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2"+
		"\2\2\u00f2\u00e9\3\2\2\2\u00f2\u00ea\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00fe\7\22\2\2\u00f5\u00f6\7%\2\2\u00f6\u00f7\7,\2\2\u00f7\u00f8\7=\2"+
		"\2\u00f8\u00f9\7-\2\2\u00f9\u00fa\7\21\2\2\u00fa\u00fb\5\20\t\2\u00fb"+
		"\u00fc\7\22\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00c2\3\2\2\2\u00fd\u00d4\3"+
		"\2\2\2\u00fd\u00f5\3\2\2\2\u00fe\r\3\2\2\2\u00ff\u0100\7=\2\2\u0100\u0106"+
		"\5\32\16\2\u0101\u0102\7\33\2\2\u0102\u0103\7=\2\2\u0103\u0105\5\32\16"+
		"\2\u0104\u0101\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107"+
		"\3\2\2\2\u0107\17\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010c\t\3\2\2\u010a"+
		"\u010d\5\22\n\2\u010b\u010d\5\24\13\2\u010c\u010a\3\2\2\2\u010c\u010b"+
		"\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\t\3\2\2\u010f\21\3\2\2\2\u0110"+
		"\u0114\7.\2\2\u0111\u0114\7/\2\2\u0112\u0114\7\60\2\2\u0113\u0110\3\2"+
		"\2\2\u0113\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0114\23\3\2\2\2\u0115\u011c"+
		"\7\61\2\2\u0116\u011c\7\62\2\2\u0117\u011c\7\63\2\2\u0118\u011c\7\64\2"+
		"\2\u0119\u011c\7\65\2\2\u011a\u011c\7\32\2\2\u011b\u0115\3\2\2\2\u011b"+
		"\u0116\3\2\2\2\u011b\u0117\3\2\2\2\u011b\u0118\3\2\2\2\u011b\u0119\3\2"+
		"\2\2\u011b\u011a\3\2\2\2\u011c\25\3\2\2\2\u011d\u011e\7\66\2\2\u011e\u011f"+
		"\7\67\2\2\u011f\u0120\7=\2\2\u0120\u0124\5\32\16\2\u0121\u0123\5\f\7\2"+
		"\u0122\u0121\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125"+
		"\3\2\2\2\u0125\u0139\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u0128\7\66\2\2"+
		"\u0128\u012c\5\f\7\2\u0129\u012b\5\f\7\2\u012a\u0129\3\2\2\2\u012b\u012e"+
		"\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u0139\3\2\2\2\u012e"+
		"\u012c\3\2\2\2\u012f\u0130\7\7\2\2\u0130\u0131\7\67\2\2\u0131\u0139\7"+
		"=\2\2\u0132\u0133\7\7\2\2\u0133\u0134\7%\2\2\u0134\u0139\7=\2\2\u0135"+
		"\u0136\7\r\2\2\u0136\u0137\7\16\2\2\u0137\u0139\7=\2\2\u0138\u011d\3\2"+
		"\2\2\u0138\u0127\3\2\2\2\u0138\u012f\3\2\2\2\u0138\u0132\3\2\2\2\u0138"+
		"\u0135\3\2\2\2\u0139\27\3\2\2\2\u013a\u013b\7=\2\2\u013b\u013c\5\24\13"+
		"\2\u013c\u013d\7=\2\2\u013d\31\3\2\2\2\u013e\u0144\78\2\2\u013f\u0144"+
		"\5\34\17\2\u0140\u0144\79\2\2\u0141\u0144\7:\2\2\u0142\u0144\7;\2\2\u0143"+
		"\u013e\3\2\2\2\u0143\u013f\3\2\2\2\u0143\u0140\3\2\2\2\u0143\u0141\3\2"+
		"\2\2\u0143\u0142\3\2\2\2\u0144\33\3\2\2\2\u0145\u0146\7<\2\2\u0146\u0147"+
		"\7\21\2\2\u0147\u0148\7>\2\2\u0148\u0149\7\22\2\2\u0149\35\3\2\2\2\36"+
		"#+\60Rfx\u0083\u0090\u0098\u00a6\u00ad\u00b5\u00c0\u00ce\u00d1\u00e0\u00e3"+
		"\u00ef\u00f2\u00fd\u0106\u010c\u0113\u011b\u0124\u012c\u0138\u0143";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}