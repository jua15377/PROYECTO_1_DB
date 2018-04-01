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
		T__52=53, T__53=54, T__54=55, ID=56, NUM=57, Char=58, WS=59;
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
		null, "';'", "'-v'", "'CREATE'", "'DATABASE'", "'DROP'", "'SHOW'", "'DATABASES'", 
		"'TABLE'", "'USE'", "'ALTER'", "'RENAME'", "'TO'", "'FUCK'", "'('", "')'", 
		"'COLUMNS'", "'FROM'", "'CONSTRAINT'", "'PK_'", "'PRIMARY'", "'KEY'", 
		"','", "'FK_'", "'FOREIGN'", "'REFERENCES'", "'CH_'", "'CHECK'", "'AND'", 
		"'OR'", "'NOT'", "'<'", "'>'", "'<='", "'>='", "'<>'", "'='", "'ADD'", 
		"'COLUMN'", "'INSERT'", "'INTO'", "'VALUES'", "'UPDATE'", "'SET'", "'WHERE'", 
		"'DELETE'", "'SELECT'", "'*'", "'ORDER'", "'BY'", "'ASC'", "'DESC'", "'INT'", 
		"'CHAR'", "'FLOAT'", "'DATE'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "ID", "NUM", "Char", "WS"
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
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new InitProgramContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				unitStatement();
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(31);
					match(T__0);
					setState(32);
					unitStatement();
					}
					}
					setState(37);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new InitProgramVerboseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				unitStatement();
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(39);
					match(T__0);
					setState(40);
					unitStatement();
					}
					}
					setState(45);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(46);
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
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new STMcreateDBContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				match(T__2);
				setState(51);
				match(T__3);
				setState(52);
				match(ID);
				}
				break;
			case 2:
				_localctx = new STMdropDBContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				match(T__4);
				setState(54);
				match(T__3);
				setState(55);
				match(ID);
				}
				break;
			case 3:
				_localctx = new STMshowDBContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				match(T__5);
				setState(57);
				match(T__6);
				}
				break;
			case 4:
				_localctx = new STMshowTableContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(58);
				match(T__5);
				setState(59);
				match(T__7);
				}
				break;
			case 5:
				_localctx = new STMuseDBContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(60);
				match(T__8);
				setState(61);
				match(T__3);
				setState(62);
				match(ID);
				}
				break;
			case 6:
				_localctx = new STMalterDBContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(63);
				match(T__9);
				setState(64);
				match(T__3);
				setState(65);
				match(ID);
				setState(66);
				match(T__10);
				setState(67);
				match(T__11);
				setState(68);
				match(ID);
				}
				break;
			case 7:
				_localctx = new STMdropTableContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(69);
				match(T__4);
				setState(70);
				match(T__7);
				setState(71);
				match(ID);
				}
				break;
			case 8:
				_localctx = new STMfuckTableContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(72);
				match(T__12);
				setState(73);
				match(T__3);
				}
				break;
			case 9:
				_localctx = new STMcreateTableContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(74);
				match(T__2);
				setState(75);
				match(T__7);
				setState(76);
				match(ID);
				setState(77);
				match(T__13);
				setState(78);
				columDeclaration();
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(79);
					constraints();
					}
					}
					setState(84);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(85);
				match(T__14);
				}
				break;
			case 10:
				_localctx = new STMshowColumnContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(87);
				match(T__5);
				setState(88);
				match(T__15);
				setState(89);
				match(T__16);
				setState(90);
				match(ID);
				}
				break;
			case 11:
				_localctx = new STMalterTableContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(91);
				alter_table();
				}
				break;
			case 12:
				_localctx = new STMinsertIntoContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(92);
				insert_into();
				}
				break;
			case 13:
				_localctx = new STMupdateContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(93);
				update();
				}
				break;
			case 14:
				_localctx = new STMdeleteContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(94);
				delete();
				}
				break;
			case 15:
				_localctx = new STMselectContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(95);
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
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new PrimaryKeyDeclConstrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(T__17);
				setState(99);
				match(T__18);
				setState(100);
				match(ID);
				setState(101);
				match(T__19);
				setState(102);
				match(T__20);
				setState(114);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__13:
					{
					setState(103);
					match(T__13);
					setState(104);
					match(ID);
					}
					break;
				case ID:
					{
					setState(105);
					match(ID);
					setState(110);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__21) {
						{
						{
						setState(106);
						match(T__21);
						setState(107);
						match(ID);
						}
						}
						setState(112);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(113);
					match(T__14);
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
				setState(116);
				match(T__17);
				setState(117);
				match(T__22);
				setState(118);
				match(ID);
				setState(119);
				match(T__23);
				setState(120);
				match(T__20);
				setState(145);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(121);
					match(T__13);
					setState(122);
					match(ID);
					}
					break;
				case 2:
					{
					setState(123);
					match(ID);
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__21) {
						{
						{
						setState(124);
						match(T__21);
						setState(125);
						match(ID);
						}
						}
						setState(130);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(131);
					match(T__14);
					setState(132);
					match(T__24);
					setState(133);
					match(ID);
					setState(134);
					match(T__13);
					setState(135);
					match(ID);
					}
					break;
				case 3:
					{
					setState(136);
					match(ID);
					setState(141);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__21) {
						{
						{
						setState(137);
						match(T__21);
						setState(138);
						match(ID);
						}
						}
						setState(143);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(144);
					match(T__14);
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new CheckDeclConstrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				match(T__17);
				setState(148);
				match(T__25);
				setState(149);
				match(ID);
				setState(150);
				match(T__26);
				setState(151);
				match(T__13);
				setState(152);
				exp();
				setState(153);
				match(T__14);
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
			setState(157);
			match(ID);
			setState(158);
			varType();
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(159);
				match(T__21);
				setState(160);
				match(ID);
				setState(161);
				varType();
				}
				}
				setState(166);
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
			setState(167);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
			case T__28:
			case T__29:
				{
				setState(168);
				eq_op();
				}
				break;
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
				{
				setState(169);
				eq_sgn();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(172);
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
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
				_localctx = new AndOperationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(T__27);
				}
				break;
			case T__28:
				_localctx = new OrOperationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(T__28);
				}
				break;
			case T__29:
				_localctx = new NotOperationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				match(T__29);
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
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
				_localctx = new MenorQueOpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				match(T__30);
				}
				break;
			case T__31:
				_localctx = new MayorQueOPContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				match(T__31);
				}
				break;
			case T__32:
				_localctx = new MenorIgualQueOpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				match(T__32);
				}
				break;
			case T__33:
				_localctx = new MayorIgualQueOpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(182);
				match(T__33);
				}
				break;
			case T__34:
				_localctx = new DiferenteOPContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(183);
				match(T__34);
				}
				break;
			case T__35:
				_localctx = new IgualOPContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(184);
				match(T__35);
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
		public List<TerminalNode> ID() { return getTokens(PostSQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PostSQLParser.ID, i);
		}
		public RenameTableContext(Alter_tableContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitRenameTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableContext extends Alter_tableContext {
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
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new RenameTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(T__9);
				setState(188);
				match(T__7);
				setState(189);
				match(ID);
				setState(190);
				match(T__10);
				setState(191);
				match(T__11);
				setState(192);
				match(ID);
				}
				break;
			case 2:
				_localctx = new AlterTableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				match(T__9);
				setState(194);
				match(T__7);
				setState(195);
				match(ID);
				setState(196);
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
		enterRule(_localctx, 16, RULE_action_alter_table);
		int _la;
		try {
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new AddColumnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				match(T__36);
				setState(200);
				match(T__37);
				setState(201);
				match(ID);
				setState(202);
				varType();
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(203);
					constraints();
					}
					}
					setState(208);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new AddConstraintsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(T__36);
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(210);
					constraints();
					}
					}
					setState(215);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				_localctx = new DropColumnContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(216);
				match(T__4);
				setState(217);
				match(T__37);
				setState(218);
				match(ID);
				}
				break;
			case 4:
				_localctx = new DropConstraintsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(219);
				match(T__4);
				setState(220);
				match(T__17);
				setState(221);
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
			setState(224);
			match(T__38);
			setState(225);
			match(T__39);
			setState(226);
			match(ID);
			setState(227);
			match(T__13);
			setState(228);
			match(ID);
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(229);
				match(T__21);
				setState(230);
				match(ID);
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(236);
			match(T__14);
			setState(237);
			match(T__40);
			setState(238);
			match(T__13);
			setState(239);
			varType();
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(240);
				match(T__21);
				setState(241);
				varType();
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(247);
			match(T__14);
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
			setState(249);
			match(T__41);
			setState(250);
			match(ID);
			setState(251);
			match(T__42);
			setState(252);
			match(ID);
			setState(253);
			match(T__35);
			setState(254);
			match(T__13);
			setState(255);
			varType();
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(256);
				match(T__21);
				setState(257);
				varType();
				}
				}
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(263);
			match(T__14);
			setState(264);
			match(T__43);
			setState(265);
			condicion();
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) {
				{
				{
				setState(266);
				eq_op();
				setState(267);
				condicion();
				}
				}
				setState(273);
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
			setState(274);
			match(ID);
			setState(275);
			eq_sgn();
			setState(276);
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
			setState(278);
			match(T__44);
			setState(279);
			match(T__16);
			setState(280);
			match(ID);
			setState(281);
			match(T__43);
			setState(282);
			condicion();
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) {
				{
				{
				setState(283);
				eq_op();
				setState(284);
				condicion();
				}
				}
				setState(290);
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
		public List<TerminalNode> ID() { return getTokens(PostSQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PostSQLParser.ID, i);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
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
			setState(291);
			match(T__45);
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__46:
				{
				setState(292);
				match(T__46);
				}
				break;
			case ID:
				{
				setState(293);
				match(ID);
				{
				setState(294);
				match(T__21);
				setState(295);
				match(ID);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(298);
			match(T__16);
			setState(299);
			match(ID);
			setState(300);
			match(T__43);
			setState(301);
			condicion();
			setState(302);
			match(T__47);
			setState(303);
			match(T__48);
			setState(304);
			match(ID);
			setState(305);
			_la = _input.LA(1);
			if ( !(_la==T__49 || _la==T__50) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			{
			setState(306);
			match(T__21);
			setState(307);
			match(ID);
			setState(308);
			_la = _input.LA(1);
			if ( !(_la==T__49 || _la==T__50) ) {
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
		public VarintContext(VarTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostSQLVisitor ) return ((PostSQLVisitor<? extends T>)visitor).visitVarint(this);
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
		enterRule(_localctx, 28, RULE_varType);
		try {
			setState(314);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__51:
				_localctx = new VarintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				match(T__51);
				}
				break;
			case T__52:
				_localctx = new VarcharContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				match(T__52);
				}
				break;
			case T__53:
				_localctx = new VarfloatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(312);
				match(T__53);
				}
				break;
			case T__54:
				_localctx = new VardateContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(313);
				match(T__54);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3=\u013f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\7\2$\n\2"+
		"\f\2\16\2\'\13\2\3\2\3\2\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\3\2\5\2\63\n"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3S\n\3\f\3\16\3"+
		"V\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3c\n\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4o\n\4\f\4\16\4r\13\4\3\4\5\4u\n\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0081\n\4\f\4\16\4\u0084\13"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u008e\n\4\f\4\16\4\u0091\13\4\3"+
		"\4\5\4\u0094\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u009e\n\4\3\5\3\5"+
		"\3\5\3\5\3\5\7\5\u00a5\n\5\f\5\16\5\u00a8\13\5\3\6\3\6\3\6\5\6\u00ad\n"+
		"\6\3\6\3\6\3\7\3\7\3\7\5\7\u00b4\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00bc"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00c8\n\t\3\n\3\n\3\n"+
		"\3\n\3\n\7\n\u00cf\n\n\f\n\16\n\u00d2\13\n\3\n\3\n\7\n\u00d6\n\n\f\n\16"+
		"\n\u00d9\13\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00e1\n\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\7\13\u00ea\n\13\f\13\16\13\u00ed\13\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\7\13\u00f5\n\13\f\13\16\13\u00f8\13\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0105\n\f\f\f\16\f\u0108\13\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\7\f\u0110\n\f\f\f\16\f\u0113\13\f\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0121\n\16\f\16\16\16\u0124"+
		"\13\16\3\17\3\17\3\17\3\17\3\17\5\17\u012b\n\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u013d"+
		"\n\20\3\20\2\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\4\3\2:;\3\2"+
		"\64\65\2\u0161\2\62\3\2\2\2\4b\3\2\2\2\6\u009d\3\2\2\2\b\u009f\3\2\2\2"+
		"\n\u00a9\3\2\2\2\f\u00b3\3\2\2\2\16\u00bb\3\2\2\2\20\u00c7\3\2\2\2\22"+
		"\u00e0\3\2\2\2\24\u00e2\3\2\2\2\26\u00fb\3\2\2\2\30\u0114\3\2\2\2\32\u0118"+
		"\3\2\2\2\34\u0125\3\2\2\2\36\u013c\3\2\2\2 %\5\4\3\2!\"\7\3\2\2\"$\5\4"+
		"\3\2#!\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\63\3\2\2\2\'%\3\2\2\2("+
		"-\5\4\3\2)*\7\3\2\2*,\5\4\3\2+)\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2"+
		".\60\3\2\2\2/-\3\2\2\2\60\61\7\4\2\2\61\63\3\2\2\2\62 \3\2\2\2\62(\3\2"+
		"\2\2\63\3\3\2\2\2\64\65\7\5\2\2\65\66\7\6\2\2\66c\7:\2\2\678\7\7\2\28"+
		"9\7\6\2\29c\7:\2\2:;\7\b\2\2;c\7\t\2\2<=\7\b\2\2=c\7\n\2\2>?\7\13\2\2"+
		"?@\7\6\2\2@c\7:\2\2AB\7\f\2\2BC\7\6\2\2CD\7:\2\2DE\7\r\2\2EF\7\16\2\2"+
		"Fc\7:\2\2GH\7\7\2\2HI\7\n\2\2Ic\7:\2\2JK\7\17\2\2Kc\7\6\2\2LM\7\5\2\2"+
		"MN\7\n\2\2NO\7:\2\2OP\7\20\2\2PT\5\b\5\2QS\5\6\4\2RQ\3\2\2\2SV\3\2\2\2"+
		"TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\7\21\2\2Xc\3\2\2\2YZ\7\b\2"+
		"\2Z[\7\22\2\2[\\\7\23\2\2\\c\7:\2\2]c\5\20\t\2^c\5\24\13\2_c\5\26\f\2"+
		"`c\5\32\16\2ac\5\34\17\2b\64\3\2\2\2b\67\3\2\2\2b:\3\2\2\2b<\3\2\2\2b"+
		">\3\2\2\2bA\3\2\2\2bG\3\2\2\2bJ\3\2\2\2bL\3\2\2\2bY\3\2\2\2b]\3\2\2\2"+
		"b^\3\2\2\2b_\3\2\2\2b`\3\2\2\2ba\3\2\2\2c\5\3\2\2\2de\7\24\2\2ef\7\25"+
		"\2\2fg\7:\2\2gh\7\26\2\2ht\7\27\2\2ij\7\20\2\2ju\7:\2\2kp\7:\2\2lm\7\30"+
		"\2\2mo\7:\2\2nl\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2rp\3\2"+
		"\2\2su\7\21\2\2ti\3\2\2\2tk\3\2\2\2u\u009e\3\2\2\2vw\7\24\2\2wx\7\31\2"+
		"\2xy\7:\2\2yz\7\32\2\2z\u0093\7\27\2\2{|\7\20\2\2|\u0094\7:\2\2}\u0082"+
		"\7:\2\2~\177\7\30\2\2\177\u0081\7:\2\2\u0080~\3\2\2\2\u0081\u0084\3\2"+
		"\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0085\u0086\7\21\2\2\u0086\u0087\7\33\2\2\u0087\u0088\7"+
		":\2\2\u0088\u0089\7\20\2\2\u0089\u0094\7:\2\2\u008a\u008f\7:\2\2\u008b"+
		"\u008c\7\30\2\2\u008c\u008e\7:\2\2\u008d\u008b\3\2\2\2\u008e\u0091\3\2"+
		"\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0092\u0094\7\21\2\2\u0093{\3\2\2\2\u0093}\3\2\2\2\u0093"+
		"\u008a\3\2\2\2\u0094\u009e\3\2\2\2\u0095\u0096\7\24\2\2\u0096\u0097\7"+
		"\34\2\2\u0097\u0098\7:\2\2\u0098\u0099\7\35\2\2\u0099\u009a\7\20\2\2\u009a"+
		"\u009b\5\n\6\2\u009b\u009c\7\21\2\2\u009c\u009e\3\2\2\2\u009dd\3\2\2\2"+
		"\u009dv\3\2\2\2\u009d\u0095\3\2\2\2\u009e\7\3\2\2\2\u009f\u00a0\7:\2\2"+
		"\u00a0\u00a6\5\36\20\2\u00a1\u00a2\7\30\2\2\u00a2\u00a3\7:\2\2\u00a3\u00a5"+
		"\5\36\20\2\u00a4\u00a1\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2"+
		"\u00a6\u00a7\3\2\2\2\u00a7\t\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00ac\t"+
		"\2\2\2\u00aa\u00ad\5\f\7\2\u00ab\u00ad\5\16\b\2\u00ac\u00aa\3\2\2\2\u00ac"+
		"\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\t\2\2\2\u00af\13\3\2\2"+
		"\2\u00b0\u00b4\7\36\2\2\u00b1\u00b4\7\37\2\2\u00b2\u00b4\7 \2\2\u00b3"+
		"\u00b0\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\r\3\2\2\2"+
		"\u00b5\u00bc\7!\2\2\u00b6\u00bc\7\"\2\2\u00b7\u00bc\7#\2\2\u00b8\u00bc"+
		"\7$\2\2\u00b9\u00bc\7%\2\2\u00ba\u00bc\7&\2\2\u00bb\u00b5\3\2\2\2\u00bb"+
		"\u00b6\3\2\2\2\u00bb\u00b7\3\2\2\2\u00bb\u00b8\3\2\2\2\u00bb\u00b9\3\2"+
		"\2\2\u00bb\u00ba\3\2\2\2\u00bc\17\3\2\2\2\u00bd\u00be\7\f\2\2\u00be\u00bf"+
		"\7\n\2\2\u00bf\u00c0\7:\2\2\u00c0\u00c1\7\r\2\2\u00c1\u00c2\7\16\2\2\u00c2"+
		"\u00c8\7:\2\2\u00c3\u00c4\7\f\2\2\u00c4\u00c5\7\n\2\2\u00c5\u00c6\7:\2"+
		"\2\u00c6\u00c8\5\22\n\2\u00c7\u00bd\3\2\2\2\u00c7\u00c3\3\2\2\2\u00c8"+
		"\21\3\2\2\2\u00c9\u00ca\7\'\2\2\u00ca\u00cb\7(\2\2\u00cb\u00cc\7:\2\2"+
		"\u00cc\u00d0\5\36\20\2\u00cd\u00cf\5\6\4\2\u00ce\u00cd\3\2\2\2\u00cf\u00d2"+
		"\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00e1\3\2\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d3\u00d7\7\'\2\2\u00d4\u00d6\5\6\4\2\u00d5\u00d4\3\2"+
		"\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\u00e1\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\7\7\2\2\u00db\u00dc\7("+
		"\2\2\u00dc\u00e1\7:\2\2\u00dd\u00de\7\7\2\2\u00de\u00df\7\24\2\2\u00df"+
		"\u00e1\7:\2\2\u00e0\u00c9\3\2\2\2\u00e0\u00d3\3\2\2\2\u00e0\u00da\3\2"+
		"\2\2\u00e0\u00dd\3\2\2\2\u00e1\23\3\2\2\2\u00e2\u00e3\7)\2\2\u00e3\u00e4"+
		"\7*\2\2\u00e4\u00e5\7:\2\2\u00e5\u00e6\7\20\2\2\u00e6\u00eb\7:\2\2\u00e7"+
		"\u00e8\7\30\2\2\u00e8\u00ea\7:\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00ed\3\2"+
		"\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ee\u00ef\7\21\2\2\u00ef\u00f0\7+\2\2\u00f0\u00f1\7\20"+
		"\2\2\u00f1\u00f6\5\36\20\2\u00f2\u00f3\7\30\2\2\u00f3\u00f5\5\36\20\2"+
		"\u00f4\u00f2\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7"+
		"\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa\7\21\2\2"+
		"\u00fa\25\3\2\2\2\u00fb\u00fc\7,\2\2\u00fc\u00fd\7:\2\2\u00fd\u00fe\7"+
		"-\2\2\u00fe\u00ff\7:\2\2\u00ff\u0100\7&\2\2\u0100\u0101\7\20\2\2\u0101"+
		"\u0106\5\36\20\2\u0102\u0103\7\30\2\2\u0103\u0105\5\36\20\2\u0104\u0102"+
		"\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"\u0109\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010a\7\21\2\2\u010a\u010b\7"+
		".\2\2\u010b\u0111\5\30\r\2\u010c\u010d\5\f\7\2\u010d\u010e\5\30\r\2\u010e"+
		"\u0110\3\2\2\2\u010f\u010c\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2"+
		"\2\2\u0111\u0112\3\2\2\2\u0112\27\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0115"+
		"\7:\2\2\u0115\u0116\5\16\b\2\u0116\u0117\7:\2\2\u0117\31\3\2\2\2\u0118"+
		"\u0119\7/\2\2\u0119\u011a\7\23\2\2\u011a\u011b\7:\2\2\u011b\u011c\7.\2"+
		"\2\u011c\u0122\5\30\r\2\u011d\u011e\5\f\7\2\u011e\u011f\5\30\r\2\u011f"+
		"\u0121\3\2\2\2\u0120\u011d\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2"+
		"\2\2\u0122\u0123\3\2\2\2\u0123\33\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u012a"+
		"\7\60\2\2\u0126\u012b\7\61\2\2\u0127\u0128\7:\2\2\u0128\u0129\7\30\2\2"+
		"\u0129\u012b\7:\2\2\u012a\u0126\3\2\2\2\u012a\u0127\3\2\2\2\u012b\u012c"+
		"\3\2\2\2\u012c\u012d\7\23\2\2\u012d\u012e\7:\2\2\u012e\u012f\7.\2\2\u012f"+
		"\u0130\5\30\r\2\u0130\u0131\7\62\2\2\u0131\u0132\7\63\2\2\u0132\u0133"+
		"\7:\2\2\u0133\u0134\t\3\2\2\u0134\u0135\7\30\2\2\u0135\u0136\7:\2\2\u0136"+
		"\u0137\t\3\2\2\u0137\35\3\2\2\2\u0138\u013d\7\66\2\2\u0139\u013d\7\67"+
		"\2\2\u013a\u013d\78\2\2\u013b\u013d\79\2\2\u013c\u0138\3\2\2\2\u013c\u0139"+
		"\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013b\3\2\2\2\u013d\37\3\2\2\2\34%"+
		"-\62Tbpt\u0082\u008f\u0093\u009d\u00a6\u00ac\u00b3\u00bb\u00c7\u00d0\u00d7"+
		"\u00e0\u00eb\u00f6\u0106\u0111\u0122\u012a\u013c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}