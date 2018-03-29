// Generated from PostSQL.g4 by ANTLR 4.7.1
package antlrGenerateFiles;
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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, COLON=16, SEMICOLON=17, 
		CREATE=18, TABLE=19, DATABASE=20, DROP=21, SHOW=22, PRIMARY=23, KEY=24, 
		FOREIGN=25, CONSTRAINT=26, REFERENCES=27, FROM=28, CHECK=29, ALTER=30, 
		RENAME=31, TO=32, ADD=33, COLUMN=34, INSERT_INTO=35, VALUES=36, UPDATE=37, 
		SET=38, DELETE=39, WHERE=40, ORDER_BY=41, ASC=42, DESC=43, INT=44, CHAR=45, 
		BOOLEAN=46, AND=47, OR=48, NOT=49, SELECT=50, USE=51, ID=52, NUM=53, Char=54, 
		WS=55;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "COLON", "SEMICOLON", 
		"CREATE", "TABLE", "DATABASE", "DROP", "SHOW", "PRIMARY", "KEY", "FOREIGN", 
		"CONSTRAINT", "REFERENCES", "FROM", "CHECK", "ALTER", "RENAME", "TO", 
		"ADD", "COLUMN", "INSERT_INTO", "VALUES", "UPDATE", "SET", "DELETE", "WHERE", 
		"ORDER_BY", "ASC", "DESC", "INT", "CHAR", "BOOLEAN", "AND", "OR", "NOT", 
		"SELECT", "USE", "LETTER", "DIGIT", "ID", "NUM", "Char", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\29\u01a7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\3\3\3\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3"+
		"\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3"+
		"(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3"+
		",\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3\60"+
		"\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67"+
		"\7\67\u0193\n\67\f\67\16\67\u0196\13\67\38\38\78\u019a\n8\f8\168\u019d"+
		"\138\39\39\3:\6:\u01a2\n:\r:\16:\u01a3\3:\3:\2\2;\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\2k\2m\66o\67q8s9\3\2\4\4\2C\\c"+
		"|\5\2\13\f\16\17\"\"\2\u01a8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2"+
		"\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2m"+
		"\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\3u\3\2\2\2\5w\3\2\2\2\7y\3\2"+
		"\2\2\t{\3\2\2\2\13\177\3\2\2\2\r\u0083\3\2\2\2\17\u0087\3\2\2\2\21\u0089"+
		"\3\2\2\2\23\u008b\3\2\2\2\25\u008e\3\2\2\2\27\u0091\3\2\2\2\31\u0094\3"+
		"\2\2\2\33\u0096\3\2\2\2\35\u00a3\3\2\2\2\37\u00b1\3\2\2\2!\u00b3\3\2\2"+
		"\2#\u00b5\3\2\2\2%\u00b7\3\2\2\2\'\u00be\3\2\2\2)\u00c4\3\2\2\2+\u00cd"+
		"\3\2\2\2-\u00d2\3\2\2\2/\u00d7\3\2\2\2\61\u00df\3\2\2\2\63\u00e3\3\2\2"+
		"\2\65\u00eb\3\2\2\2\67\u00f6\3\2\2\29\u0101\3\2\2\2;\u0106\3\2\2\2=\u010c"+
		"\3\2\2\2?\u0112\3\2\2\2A\u0119\3\2\2\2C\u011c\3\2\2\2E\u0120\3\2\2\2G"+
		"\u0127\3\2\2\2I\u0133\3\2\2\2K\u013a\3\2\2\2M\u0141\3\2\2\2O\u0145\3\2"+
		"\2\2Q\u014c\3\2\2\2S\u0152\3\2\2\2U\u015b\3\2\2\2W\u015f\3\2\2\2Y\u0164"+
		"\3\2\2\2[\u0168\3\2\2\2]\u016d\3\2\2\2_\u0175\3\2\2\2a\u0179\3\2\2\2c"+
		"\u017c\3\2\2\2e\u0180\3\2\2\2g\u0187\3\2\2\2i\u018b\3\2\2\2k\u018d\3\2"+
		"\2\2m\u018f\3\2\2\2o\u0197\3\2\2\2q\u019e\3\2\2\2s\u01a1\3\2\2\2uv\7*"+
		"\2\2v\4\3\2\2\2wx\7+\2\2x\6\3\2\2\2yz\7.\2\2z\b\3\2\2\2{|\7R\2\2|}\7M"+
		"\2\2}~\7a\2\2~\n\3\2\2\2\177\u0080\7H\2\2\u0080\u0081\7M\2\2\u0081\u0082"+
		"\7a\2\2\u0082\f\3\2\2\2\u0083\u0084\7E\2\2\u0084\u0085\7J\2\2\u0085\u0086"+
		"\7a\2\2\u0086\16\3\2\2\2\u0087\u0088\7>\2\2\u0088\20\3\2\2\2\u0089\u008a"+
		"\7@\2\2\u008a\22\3\2\2\2\u008b\u008c\7>\2\2\u008c\u008d\7?\2\2\u008d\24"+
		"\3\2\2\2\u008e\u008f\7@\2\2\u008f\u0090\7?\2\2\u0090\26\3\2\2\2\u0091"+
		"\u0092\7>\2\2\u0092\u0093\7@\2\2\u0093\30\3\2\2\2\u0094\u0095\7?\2\2\u0095"+
		"\32\3\2\2\2\u0096\u0097\7U\2\2\u0097\u0098\7J\2\2\u0098\u0099\7Q\2\2\u0099"+
		"\u009a\7Y\2\2\u009a\u009b\7\"\2\2\u009b\u009c\7E\2\2\u009c\u009d\7Q\2"+
		"\2\u009d\u009e\7N\2\2\u009e\u009f\7W\2\2\u009f\u00a0\7O\2\2\u00a0\u00a1"+
		"\7P\2\2\u00a1\u00a2\7U\2\2\u00a2\34\3\2\2\2\u00a3\u00a4\7H\2\2\u00a4\u00a5"+
		"\7W\2\2\u00a5\u00a6\7E\2\2\u00a6\u00a7\7M\2\2\u00a7\u00a8\7\"\2\2\u00a8"+
		"\u00a9\7F\2\2\u00a9\u00aa\7C\2\2\u00aa\u00ab\7V\2\2\u00ab\u00ac\7C\2\2"+
		"\u00ac\u00ad\7D\2\2\u00ad\u00ae\7C\2\2\u00ae\u00af\7U\2\2\u00af\u00b0"+
		"\7G\2\2\u00b0\36\3\2\2\2\u00b1\u00b2\7,\2\2\u00b2 \3\2\2\2\u00b3\u00b4"+
		"\7<\2\2\u00b4\"\3\2\2\2\u00b5\u00b6\7=\2\2\u00b6$\3\2\2\2\u00b7\u00b8"+
		"\7E\2\2\u00b8\u00b9\7T\2\2\u00b9\u00ba\7G\2\2\u00ba\u00bb\7C\2\2\u00bb"+
		"\u00bc\7V\2\2\u00bc\u00bd\7G\2\2\u00bd&\3\2\2\2\u00be\u00bf\7V\2\2\u00bf"+
		"\u00c0\7C\2\2\u00c0\u00c1\7D\2\2\u00c1\u00c2\7N\2\2\u00c2\u00c3\7G\2\2"+
		"\u00c3(\3\2\2\2\u00c4\u00c5\7F\2\2\u00c5\u00c6\7C\2\2\u00c6\u00c7\7V\2"+
		"\2\u00c7\u00c8\7C\2\2\u00c8\u00c9\7D\2\2\u00c9\u00ca\7C\2\2\u00ca\u00cb"+
		"\7U\2\2\u00cb\u00cc\7G\2\2\u00cc*\3\2\2\2\u00cd\u00ce\7F\2\2\u00ce\u00cf"+
		"\7T\2\2\u00cf\u00d0\7Q\2\2\u00d0\u00d1\7R\2\2\u00d1,\3\2\2\2\u00d2\u00d3"+
		"\7U\2\2\u00d3\u00d4\7J\2\2\u00d4\u00d5\7Q\2\2\u00d5\u00d6\7Y\2\2\u00d6"+
		".\3\2\2\2\u00d7\u00d8\7R\2\2\u00d8\u00d9\7T\2\2\u00d9\u00da\7K\2\2\u00da"+
		"\u00db\7O\2\2\u00db\u00dc\7C\2\2\u00dc\u00dd\7T\2\2\u00dd\u00de\7[\2\2"+
		"\u00de\60\3\2\2\2\u00df\u00e0\7M\2\2\u00e0\u00e1\7G\2\2\u00e1\u00e2\7"+
		"[\2\2\u00e2\62\3\2\2\2\u00e3\u00e4\7H\2\2\u00e4\u00e5\7Q\2\2\u00e5\u00e6"+
		"\7T\2\2\u00e6\u00e7\7G\2\2\u00e7\u00e8\7K\2\2\u00e8\u00e9\7I\2\2\u00e9"+
		"\u00ea\7P\2\2\u00ea\64\3\2\2\2\u00eb\u00ec\7E\2\2\u00ec\u00ed\7Q\2\2\u00ed"+
		"\u00ee\7P\2\2\u00ee\u00ef\7U\2\2\u00ef\u00f0\7V\2\2\u00f0\u00f1\7T\2\2"+
		"\u00f1\u00f2\7C\2\2\u00f2\u00f3\7K\2\2\u00f3\u00f4\7P\2\2\u00f4\u00f5"+
		"\7V\2\2\u00f5\66\3\2\2\2\u00f6\u00f7\7T\2\2\u00f7\u00f8\7G\2\2\u00f8\u00f9"+
		"\7H\2\2\u00f9\u00fa\7G\2\2\u00fa\u00fb\7T\2\2\u00fb\u00fc\7G\2\2\u00fc"+
		"\u00fd\7P\2\2\u00fd\u00fe\7E\2\2\u00fe\u00ff\7G\2\2\u00ff\u0100\7U\2\2"+
		"\u01008\3\2\2\2\u0101\u0102\7H\2\2\u0102\u0103\7T\2\2\u0103\u0104\7Q\2"+
		"\2\u0104\u0105\7O\2\2\u0105:\3\2\2\2\u0106\u0107\7E\2\2\u0107\u0108\7"+
		"J\2\2\u0108\u0109\7G\2\2\u0109\u010a\7E\2\2\u010a\u010b\7M\2\2\u010b<"+
		"\3\2\2\2\u010c\u010d\7C\2\2\u010d\u010e\7N\2\2\u010e\u010f\7V\2\2\u010f"+
		"\u0110\7G\2\2\u0110\u0111\7T\2\2\u0111>\3\2\2\2\u0112\u0113\7T\2\2\u0113"+
		"\u0114\7G\2\2\u0114\u0115\7P\2\2\u0115\u0116\7C\2\2\u0116\u0117\7O\2\2"+
		"\u0117\u0118\7G\2\2\u0118@\3\2\2\2\u0119\u011a\7V\2\2\u011a\u011b\7Q\2"+
		"\2\u011bB\3\2\2\2\u011c\u011d\7C\2\2\u011d\u011e\7F\2\2\u011e\u011f\7"+
		"F\2\2\u011fD\3\2\2\2\u0120\u0121\7E\2\2\u0121\u0122\7Q\2\2\u0122\u0123"+
		"\7N\2\2\u0123\u0124\7W\2\2\u0124\u0125\7O\2\2\u0125\u0126\7P\2\2\u0126"+
		"F\3\2\2\2\u0127\u0128\7K\2\2\u0128\u0129\7P\2\2\u0129\u012a\7U\2\2\u012a"+
		"\u012b\7G\2\2\u012b\u012c\7T\2\2\u012c\u012d\7V\2\2\u012d\u012e\7\"\2"+
		"\2\u012e\u012f\7K\2\2\u012f\u0130\7P\2\2\u0130\u0131\7V\2\2\u0131\u0132"+
		"\7Q\2\2\u0132H\3\2\2\2\u0133\u0134\7X\2\2\u0134\u0135\7C\2\2\u0135\u0136"+
		"\7N\2\2\u0136\u0137\7W\2\2\u0137\u0138\7G\2\2\u0138\u0139\7U\2\2\u0139"+
		"J\3\2\2\2\u013a\u013b\7W\2\2\u013b\u013c\7R\2\2\u013c\u013d\7F\2\2\u013d"+
		"\u013e\7C\2\2\u013e\u013f\7V\2\2\u013f\u0140\7G\2\2\u0140L\3\2\2\2\u0141"+
		"\u0142\7U\2\2\u0142\u0143\7G\2\2\u0143\u0144\7V\2\2\u0144N\3\2\2\2\u0145"+
		"\u0146\7F\2\2\u0146\u0147\7G\2\2\u0147\u0148\7N\2\2\u0148\u0149\7G\2\2"+
		"\u0149\u014a\7V\2\2\u014a\u014b\7G\2\2\u014bP\3\2\2\2\u014c\u014d\7Y\2"+
		"\2\u014d\u014e\7J\2\2\u014e\u014f\7G\2\2\u014f\u0150\7T\2\2\u0150\u0151"+
		"\7G\2\2\u0151R\3\2\2\2\u0152\u0153\7Q\2\2\u0153\u0154\7T\2\2\u0154\u0155"+
		"\7F\2\2\u0155\u0156\7G\2\2\u0156\u0157\7T\2\2\u0157\u0158\7\"\2\2\u0158"+
		"\u0159\7D\2\2\u0159\u015a\7[\2\2\u015aT\3\2\2\2\u015b\u015c\7C\2\2\u015c"+
		"\u015d\7U\2\2\u015d\u015e\7E\2\2\u015eV\3\2\2\2\u015f\u0160\7F\2\2\u0160"+
		"\u0161\7G\2\2\u0161\u0162\7U\2\2\u0162\u0163\7E\2\2\u0163X\3\2\2\2\u0164"+
		"\u0165\7K\2\2\u0165\u0166\7P\2\2\u0166\u0167\7V\2\2\u0167Z\3\2\2\2\u0168"+
		"\u0169\7E\2\2\u0169\u016a\7J\2\2\u016a\u016b\7C\2\2\u016b\u016c\7T\2\2"+
		"\u016c\\\3\2\2\2\u016d\u016e\7D\2\2\u016e\u016f\7Q\2\2\u016f\u0170\7Q"+
		"\2\2\u0170\u0171\7N\2\2\u0171\u0172\7G\2\2\u0172\u0173\7C\2\2\u0173\u0174"+
		"\7P\2\2\u0174^\3\2\2\2\u0175\u0176\7C\2\2\u0176\u0177\7P\2\2\u0177\u0178"+
		"\7F\2\2\u0178`\3\2\2\2\u0179\u017a\7Q\2\2\u017a\u017b\7T\2\2\u017bb\3"+
		"\2\2\2\u017c\u017d\7P\2\2\u017d\u017e\7Q\2\2\u017e\u017f\7V\2\2\u017f"+
		"d\3\2\2\2\u0180\u0181\7U\2\2\u0181\u0182\7G\2\2\u0182\u0183\7N\2\2\u0183"+
		"\u0184\7G\2\2\u0184\u0185\7E\2\2\u0185\u0186\7V\2\2\u0186f\3\2\2\2\u0187"+
		"\u0188\7W\2\2\u0188\u0189\7U\2\2\u0189\u018a\7G\2\2\u018ah\3\2\2\2\u018b"+
		"\u018c\t\2\2\2\u018cj\3\2\2\2\u018d\u018e\4\62;\2\u018el\3\2\2\2\u018f"+
		"\u0194\5i\65\2\u0190\u0193\5i\65\2\u0191\u0193\5k\66\2\u0192\u0190\3\2"+
		"\2\2\u0192\u0191\3\2\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194"+
		"\u0195\3\2\2\2\u0195n\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u019b\5k\66\2"+
		"\u0198\u019a\5k\66\2\u0199\u0198\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u0199"+
		"\3\2\2\2\u019b\u019c\3\2\2\2\u019cp\3\2\2\2\u019d\u019b\3\2\2\2\u019e"+
		"\u019f\5i\65\2\u019fr\3\2\2\2\u01a0\u01a2\t\3\2\2\u01a1\u01a0\3\2\2\2"+
		"\u01a2\u01a3\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5"+
		"\3\2\2\2\u01a5\u01a6\b:\2\2\u01a6t\3\2\2\2\7\2\u0192\u0194\u019b\u01a3"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}