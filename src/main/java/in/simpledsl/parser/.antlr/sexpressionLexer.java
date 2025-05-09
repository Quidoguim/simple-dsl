// Generated from c:/Users/quido/OneDrive/Documentos/Faculdade/Linguagens de Programação/simple-dsl/src/main/java/in/simpledsl/parser/sexpression.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class sexpressionLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STRING=1, WHITESPACE=2, NUMBER=3, SYMBOL=4, LPAREN=5, RPAREN=6, DOT=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"STRING", "WHITESPACE", "NUMBER", "SYMBOL", "LPAREN", "RPAREN", "DOT", 
			"SYMBOL_START", "DIGIT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'('", "')'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STRING", "WHITESPACE", "NUMBER", "SYMBOL", "LPAREN", "RPAREN", 
			"DOT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public sexpressionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "sexpression.g4"; }

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
		"\u0004\u0000\u0007H\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0005\u0000\u0018\b\u0000\n\u0000\f\u0000\u001b\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0004\u0001 \b\u0001\u000b\u0001\f\u0001!\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0003\u0002\'\b\u0002\u0001\u0002\u0004"+
		"\u0002*\b\u0002\u000b\u0002\f\u0002+\u0001\u0002\u0001\u0002\u0004\u0002"+
		"0\b\u0002\u000b\u0002\f\u00021\u0003\u00024\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u00039\b\u0003\n\u0003\f\u0003<\t\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0003\u0007E\b\u0007\u0001\b\u0001\b\u0000\u0000\t\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\u0000\u0011\u0000\u0001\u0000\u0004\u0002\u0000\"\"\\\\\u0003\u0000\t"+
		"\n\r\r  \u0002\u0000++--\u0004\u0000*+-/AZazN\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0001\u0013\u0001\u0000\u0000\u0000\u0003\u001f\u0001\u0000\u0000\u0000"+
		"\u0005&\u0001\u0000\u0000\u0000\u00075\u0001\u0000\u0000\u0000\t=\u0001"+
		"\u0000\u0000\u0000\u000b?\u0001\u0000\u0000\u0000\rA\u0001\u0000\u0000"+
		"\u0000\u000fD\u0001\u0000\u0000\u0000\u0011F\u0001\u0000\u0000\u0000\u0013"+
		"\u0019\u0005\"\u0000\u0000\u0014\u0015\u0005\\\u0000\u0000\u0015\u0018"+
		"\t\u0000\u0000\u0000\u0016\u0018\b\u0000\u0000\u0000\u0017\u0014\u0001"+
		"\u0000\u0000\u0000\u0017\u0016\u0001\u0000\u0000\u0000\u0018\u001b\u0001"+
		"\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u0019\u001a\u0001"+
		"\u0000\u0000\u0000\u001a\u001c\u0001\u0000\u0000\u0000\u001b\u0019\u0001"+
		"\u0000\u0000\u0000\u001c\u001d\u0005\"\u0000\u0000\u001d\u0002\u0001\u0000"+
		"\u0000\u0000\u001e \u0007\u0001\u0000\u0000\u001f\u001e\u0001\u0000\u0000"+
		"\u0000 !\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000!\"\u0001"+
		"\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#$\u0006\u0001\u0000\u0000"+
		"$\u0004\u0001\u0000\u0000\u0000%\'\u0007\u0002\u0000\u0000&%\u0001\u0000"+
		"\u0000\u0000&\'\u0001\u0000\u0000\u0000\')\u0001\u0000\u0000\u0000(*\u0003"+
		"\u0011\b\u0000)(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+)\u0001"+
		"\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,3\u0001\u0000\u0000\u0000"+
		"-/\u0005.\u0000\u0000.0\u0003\u0011\b\u0000/.\u0001\u0000\u0000\u0000"+
		"01\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000012\u0001\u0000\u0000"+
		"\u000024\u0001\u0000\u0000\u00003-\u0001\u0000\u0000\u000034\u0001\u0000"+
		"\u0000\u00004\u0006\u0001\u0000\u0000\u00005:\u0003\u000f\u0007\u0000"+
		"69\u0003\u000f\u0007\u000079\u0003\u0011\b\u000086\u0001\u0000\u0000\u0000"+
		"87\u0001\u0000\u0000\u00009<\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000"+
		"\u0000:;\u0001\u0000\u0000\u0000;\b\u0001\u0000\u0000\u0000<:\u0001\u0000"+
		"\u0000\u0000=>\u0005(\u0000\u0000>\n\u0001\u0000\u0000\u0000?@\u0005)"+
		"\u0000\u0000@\f\u0001\u0000\u0000\u0000AB\u0005.\u0000\u0000B\u000e\u0001"+
		"\u0000\u0000\u0000CE\u0007\u0003\u0000\u0000DC\u0001\u0000\u0000\u0000"+
		"E\u0010\u0001\u0000\u0000\u0000FG\u000209\u0000G\u0012\u0001\u0000\u0000"+
		"\u0000\u000b\u0000\u0017\u0019!&+138:D\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}