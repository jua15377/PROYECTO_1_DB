// Generated from PostSQL.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PostSQLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, COLON=17, 
		SEMICOLON=18, CREATE=19, TABLE=20, DATABASE=21, DROP=22, SHOW=23, PRIMARY=24, 
		KEY=25, FOREIGN=26, CONSTRAINT=27, REFERENCES=28, FROM=29, CHECK=30, ALTER=31, 
		RENAME=32, TO=33, ADD=34, COLUMN=35, INSERT_INTO=36, VALUES=37, UPDATE=38, 
		SET=39, DELETE=40, WHERE=41, ORDER_BY=42, ASC=43, DESC=44, ID=45, NUM=46, 
		Char=47, WS=48;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "COLON", 
		"SEMICOLON", "CREATE", "TABLE", "DATABASE", "DROP", "SHOW", "PRIMARY", 
		"KEY", "FOREIGN", "CONSTRAINT", "REFERENCES", "FROM", "CHECK", "ALTER", 
		"RENAME", "TO", "ADD", "COLUMN", "INSERT_INTO", "VALUES", "UPDATE", "SET", 
		"DELETE", "WHERE", "ORDER_BY", "ASC", "DESC", "LETTER", "DIGIT", "ID", 
		"NUM", "Char", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "','", "'PK_'", "'FK_'", "'CH_'", "'<'", "'>'", "'<='", 
		"'>='", "'<>'", "'='", "'SHOW TABLE'", "'SHOW COLUMNS'", "'FUCK DATABASE'", 
		"'*'", "':'", "';'", "'CREATE'", "'TABLE'", "'DATABASE'", "'DROP'", "'SHOW'", 
		"'PRIMARY'", "'KEY'", "'FOREIGN'", "'CONSTRAINT'", "'REFERENCES'", "'FROM'", 
		"'CHECK'", "'ALTER'", "'RENAME'", "'TO'", "'ADD'", "'COLUMN'", "'INSERT INTO'", 
		"'VALUES'", "'UPDATE'", "'SET'", "'DELETE'", "'WHERE'", "'ORDER BY'", 
		"'ASC'", "'DESC'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "COLON", "SEMICOLON", "CREATE", "TABLE", 
		"DATABASE", "DROP", "SHOW", "PRIMARY", "KEY", "FOREIGN", "CONSTRAINT", 
		"REFERENCES", "FROM", "CHECK", "ALTER", "RENAME", "TO", "ADD", "COLUMN", 
		"INSERT_INTO", "VALUES", "UPDATE", "SET", "DELETE", "WHERE", "ORDER_BY", 
		"ASC", "DESC", "ID", "NUM", "Char", "WS"
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


	public PostSQLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PostSQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u017d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3"+
		"$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3"+
		"&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3"+
		"*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-\3"+
		"-\3.\3.\3/\3/\3\60\3\60\3\60\7\60\u0169\n\60\f\60\16\60\u016c\13\60\3"+
		"\61\3\61\7\61\u0170\n\61\f\61\16\61\u0173\13\61\3\62\3\62\3\63\6\63\u0178"+
		"\n\63\r\63\16\63\u0179\3\63\3\63\2\2\64\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W"+
		"-Y.[\2]\2_/a\60c\61e\62\3\2\4\4\2C\\c|\5\2\13\f\16\17\"\"\2\u017e\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3"+
		"\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2"+
		"\2\3g\3\2\2\2\5i\3\2\2\2\7k\3\2\2\2\tm\3\2\2\2\13q\3\2\2\2\ru\3\2\2\2"+
		"\17y\3\2\2\2\21{\3\2\2\2\23}\3\2\2\2\25\u0080\3\2\2\2\27\u0083\3\2\2\2"+
		"\31\u0086\3\2\2\2\33\u0088\3\2\2\2\35\u0093\3\2\2\2\37\u00a0\3\2\2\2!"+
		"\u00ae\3\2\2\2#\u00b0\3\2\2\2%\u00b2\3\2\2\2\'\u00b4\3\2\2\2)\u00bb\3"+
		"\2\2\2+\u00c1\3\2\2\2-\u00ca\3\2\2\2/\u00cf\3\2\2\2\61\u00d4\3\2\2\2\63"+
		"\u00dc\3\2\2\2\65\u00e0\3\2\2\2\67\u00e8\3\2\2\29\u00f3\3\2\2\2;\u00fe"+
		"\3\2\2\2=\u0103\3\2\2\2?\u0109\3\2\2\2A\u010f\3\2\2\2C\u0116\3\2\2\2E"+
		"\u0119\3\2\2\2G\u011d\3\2\2\2I\u0124\3\2\2\2K\u0130\3\2\2\2M\u0137\3\2"+
		"\2\2O\u013e\3\2\2\2Q\u0142\3\2\2\2S\u0149\3\2\2\2U\u014f\3\2\2\2W\u0158"+
		"\3\2\2\2Y\u015c\3\2\2\2[\u0161\3\2\2\2]\u0163\3\2\2\2_\u0165\3\2\2\2a"+
		"\u016d\3\2\2\2c\u0174\3\2\2\2e\u0177\3\2\2\2gh\7*\2\2h\4\3\2\2\2ij\7+"+
		"\2\2j\6\3\2\2\2kl\7.\2\2l\b\3\2\2\2mn\7R\2\2no\7M\2\2op\7a\2\2p\n\3\2"+
		"\2\2qr\7H\2\2rs\7M\2\2st\7a\2\2t\f\3\2\2\2uv\7E\2\2vw\7J\2\2wx\7a\2\2"+
		"x\16\3\2\2\2yz\7>\2\2z\20\3\2\2\2{|\7@\2\2|\22\3\2\2\2}~\7>\2\2~\177\7"+
		"?\2\2\177\24\3\2\2\2\u0080\u0081\7@\2\2\u0081\u0082\7?\2\2\u0082\26\3"+
		"\2\2\2\u0083\u0084\7>\2\2\u0084\u0085\7@\2\2\u0085\30\3\2\2\2\u0086\u0087"+
		"\7?\2\2\u0087\32\3\2\2\2\u0088\u0089\7U\2\2\u0089\u008a\7J\2\2\u008a\u008b"+
		"\7Q\2\2\u008b\u008c\7Y\2\2\u008c\u008d\7\"\2\2\u008d\u008e\7V\2\2\u008e"+
		"\u008f\7C\2\2\u008f\u0090\7D\2\2\u0090\u0091\7N\2\2\u0091\u0092\7G\2\2"+
		"\u0092\34\3\2\2\2\u0093\u0094\7U\2\2\u0094\u0095\7J\2\2\u0095\u0096\7"+
		"Q\2\2\u0096\u0097\7Y\2\2\u0097\u0098\7\"\2\2\u0098\u0099\7E\2\2\u0099"+
		"\u009a\7Q\2\2\u009a\u009b\7N\2\2\u009b\u009c\7W\2\2\u009c\u009d\7O\2\2"+
		"\u009d\u009e\7P\2\2\u009e\u009f\7U\2\2\u009f\36\3\2\2\2\u00a0\u00a1\7"+
		"H\2\2\u00a1\u00a2\7W\2\2\u00a2\u00a3\7E\2\2\u00a3\u00a4\7M\2\2\u00a4\u00a5"+
		"\7\"\2\2\u00a5\u00a6\7F\2\2\u00a6\u00a7\7C\2\2\u00a7\u00a8\7V\2\2\u00a8"+
		"\u00a9\7C\2\2\u00a9\u00aa\7D\2\2\u00aa\u00ab\7C\2\2\u00ab\u00ac\7U\2\2"+
		"\u00ac\u00ad\7G\2\2\u00ad \3\2\2\2\u00ae\u00af\7,\2\2\u00af\"\3\2\2\2"+
		"\u00b0\u00b1\7<\2\2\u00b1$\3\2\2\2\u00b2\u00b3\7=\2\2\u00b3&\3\2\2\2\u00b4"+
		"\u00b5\7E\2\2\u00b5\u00b6\7T\2\2\u00b6\u00b7\7G\2\2\u00b7\u00b8\7C\2\2"+
		"\u00b8\u00b9\7V\2\2\u00b9\u00ba\7G\2\2\u00ba(\3\2\2\2\u00bb\u00bc\7V\2"+
		"\2\u00bc\u00bd\7C\2\2\u00bd\u00be\7D\2\2\u00be\u00bf\7N\2\2\u00bf\u00c0"+
		"\7G\2\2\u00c0*\3\2\2\2\u00c1\u00c2\7F\2\2\u00c2\u00c3\7C\2\2\u00c3\u00c4"+
		"\7V\2\2\u00c4\u00c5\7C\2\2\u00c5\u00c6\7D\2\2\u00c6\u00c7\7C\2\2\u00c7"+
		"\u00c8\7U\2\2\u00c8\u00c9\7G\2\2\u00c9,\3\2\2\2\u00ca\u00cb\7F\2\2\u00cb"+
		"\u00cc\7T\2\2\u00cc\u00cd\7Q\2\2\u00cd\u00ce\7R\2\2\u00ce.\3\2\2\2\u00cf"+
		"\u00d0\7U\2\2\u00d0\u00d1\7J\2\2\u00d1\u00d2\7Q\2\2\u00d2\u00d3\7Y\2\2"+
		"\u00d3\60\3\2\2\2\u00d4\u00d5\7R\2\2\u00d5\u00d6\7T\2\2\u00d6\u00d7\7"+
		"K\2\2\u00d7\u00d8\7O\2\2\u00d8\u00d9\7C\2\2\u00d9\u00da\7T\2\2\u00da\u00db"+
		"\7[\2\2\u00db\62\3\2\2\2\u00dc\u00dd\7M\2\2\u00dd\u00de\7G\2\2\u00de\u00df"+
		"\7[\2\2\u00df\64\3\2\2\2\u00e0\u00e1\7H\2\2\u00e1\u00e2\7Q\2\2\u00e2\u00e3"+
		"\7T\2\2\u00e3\u00e4\7G\2\2\u00e4\u00e5\7K\2\2\u00e5\u00e6\7I\2\2\u00e6"+
		"\u00e7\7P\2\2\u00e7\66\3\2\2\2\u00e8\u00e9\7E\2\2\u00e9\u00ea\7Q\2\2\u00ea"+
		"\u00eb\7P\2\2\u00eb\u00ec\7U\2\2\u00ec\u00ed\7V\2\2\u00ed\u00ee\7T\2\2"+
		"\u00ee\u00ef\7C\2\2\u00ef\u00f0\7K\2\2\u00f0\u00f1\7P\2\2\u00f1\u00f2"+
		"\7V\2\2\u00f28\3\2\2\2\u00f3\u00f4\7T\2\2\u00f4\u00f5\7G\2\2\u00f5\u00f6"+
		"\7H\2\2\u00f6\u00f7\7G\2\2\u00f7\u00f8\7T\2\2\u00f8\u00f9\7G\2\2\u00f9"+
		"\u00fa\7P\2\2\u00fa\u00fb\7E\2\2\u00fb\u00fc\7G\2\2\u00fc\u00fd\7U\2\2"+
		"\u00fd:\3\2\2\2\u00fe\u00ff\7H\2\2\u00ff\u0100\7T\2\2\u0100\u0101\7Q\2"+
		"\2\u0101\u0102\7O\2\2\u0102<\3\2\2\2\u0103\u0104\7E\2\2\u0104\u0105\7"+
		"J\2\2\u0105\u0106\7G\2\2\u0106\u0107\7E\2\2\u0107\u0108\7M\2\2\u0108>"+
		"\3\2\2\2\u0109\u010a\7C\2\2\u010a\u010b\7N\2\2\u010b\u010c\7V\2\2\u010c"+
		"\u010d\7G\2\2\u010d\u010e\7T\2\2\u010e@\3\2\2\2\u010f\u0110\7T\2\2\u0110"+
		"\u0111\7G\2\2\u0111\u0112\7P\2\2\u0112\u0113\7C\2\2\u0113\u0114\7O\2\2"+
		"\u0114\u0115\7G\2\2\u0115B\3\2\2\2\u0116\u0117\7V\2\2\u0117\u0118\7Q\2"+
		"\2\u0118D\3\2\2\2\u0119\u011a\7C\2\2\u011a\u011b\7F\2\2\u011b\u011c\7"+
		"F\2\2\u011cF\3\2\2\2\u011d\u011e\7E\2\2\u011e\u011f\7Q\2\2\u011f\u0120"+
		"\7N\2\2\u0120\u0121\7W\2\2\u0121\u0122\7O\2\2\u0122\u0123\7P\2\2\u0123"+
		"H\3\2\2\2\u0124\u0125\7K\2\2\u0125\u0126\7P\2\2\u0126\u0127\7U\2\2\u0127"+
		"\u0128\7G\2\2\u0128\u0129\7T\2\2\u0129\u012a\7V\2\2\u012a\u012b\7\"\2"+
		"\2\u012b\u012c\7K\2\2\u012c\u012d\7P\2\2\u012d\u012e\7V\2\2\u012e\u012f"+
		"\7Q\2\2\u012fJ\3\2\2\2\u0130\u0131\7X\2\2\u0131\u0132\7C\2\2\u0132\u0133"+
		"\7N\2\2\u0133\u0134\7W\2\2\u0134\u0135\7G\2\2\u0135\u0136\7U\2\2\u0136"+
		"L\3\2\2\2\u0137\u0138\7W\2\2\u0138\u0139\7R\2\2\u0139\u013a\7F\2\2\u013a"+
		"\u013b\7C\2\2\u013b\u013c\7V\2\2\u013c\u013d\7G\2\2\u013dN\3\2\2\2\u013e"+
		"\u013f\7U\2\2\u013f\u0140\7G\2\2\u0140\u0141\7V\2\2\u0141P\3\2\2\2\u0142"+
		"\u0143\7F\2\2\u0143\u0144\7G\2\2\u0144\u0145\7N\2\2\u0145\u0146\7G\2\2"+
		"\u0146\u0147\7V\2\2\u0147\u0148\7G\2\2\u0148R\3\2\2\2\u0149\u014a\7Y\2"+
		"\2\u014a\u014b\7J\2\2\u014b\u014c\7G\2\2\u014c\u014d\7T\2\2\u014d\u014e"+
		"\7G\2\2\u014eT\3\2\2\2\u014f\u0150\7Q\2\2\u0150\u0151\7T\2\2\u0151\u0152"+
		"\7F\2\2\u0152\u0153\7G\2\2\u0153\u0154\7T\2\2\u0154\u0155\7\"\2\2\u0155"+
		"\u0156\7D\2\2\u0156\u0157\7[\2\2\u0157V\3\2\2\2\u0158\u0159\7C\2\2\u0159"+
		"\u015a\7U\2\2\u015a\u015b\7E\2\2\u015bX\3\2\2\2\u015c\u015d\7F\2\2\u015d"+
		"\u015e\7G\2\2\u015e\u015f\7U\2\2\u015f\u0160\7E\2\2\u0160Z\3\2\2\2\u0161"+
		"\u0162\t\2\2\2\u0162\\\3\2\2\2\u0163\u0164\4\62;\2\u0164^\3\2\2\2\u0165"+
		"\u016a\5[.\2\u0166\u0169\5[.\2\u0167\u0169\5]/\2\u0168\u0166\3\2\2\2\u0168"+
		"\u0167\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2"+
		"\2\2\u016b`\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u0171\5]/\2\u016e\u0170"+
		"\5]/\2\u016f\u016e\3\2\2\2\u0170\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0171"+
		"\u0172\3\2\2\2\u0172b\3\2\2\2\u0173\u0171\3\2\2\2\u0174\u0175\5[.\2\u0175"+
		"d\3\2\2\2\u0176\u0178\t\3\2\2\u0177\u0176\3\2\2\2\u0178\u0179\3\2\2\2"+
		"\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017c"+
		"\b\63\2\2\u017cf\3\2\2\2\7\2\u0168\u016a\u0171\u0179\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}