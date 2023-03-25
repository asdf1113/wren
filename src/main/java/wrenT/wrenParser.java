// Generated from java-escape by ANTLR 4.11.1
package wrenT;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class wrenParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, IS=2, BEGIN=3, END=4, VAR=5, INTEGER=6, BOOLEAN=7, READ=8, 
		WRITE=9, SKIP_=10, WHILE=11, DO=12, IF=13, THEN=14, ELSE=15, AND=16, OR=17, 
		TRUE=18, FALSE=19, NOT=20, ASSIGN=21, COLON=22, COMMA=23, LPAREN=24, RPAREN=25, 
		SEMI=26, LE=27, LT=28, EQUAL=29, GT=30, GE=31, NE=32, ADD=33, SUB=34, 
		MUL=35, DIV=36, NURMAL=37, IDENTIFIER=38, WS=39;
	public static final int
		RULE_prog = 0, RULE_block = 1, RULE_declaration_seq = 2, RULE_declaration = 3, 
		RULE_type = 4, RULE_variable_list = 5, RULE_command_seq = 6, RULE_command = 7, 
		RULE_thencommand = 8, RULE_elsecommand = 9, RULE_expr = 10, RULE_integer_expr = 11, 
		RULE_element = 12, RULE_boolean_expr = 13, RULE_boolean_element = 14, 
		RULE_comparison = 15, RULE_weak_op = 16, RULE_strong_op = 17, RULE_variable = 18, 
		RULE_relation = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "block", "declaration_seq", "declaration", "type", "variable_list", 
			"command_seq", "command", "thencommand", "elsecommand", "expr", "integer_expr", 
			"element", "boolean_expr", "boolean_element", "comparison", "weak_op", 
			"strong_op", "variable", "relation"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "'is'", "'begin'", "'end'", "'var'", "'integer'", 
			"'boolean'", "'read'", "'write'", "'skip'", "'while'", "'do'", "'if'", 
			"'then'", "'else'", "'and'", "'or'", "'true'", "'false'", "'not'", "':='", 
			"':'", "','", "'('", "')'", "';'", "'<='", "'<'", "'='", "'>'", "'>='", 
			"'<>'", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM", "IS", "BEGIN", "END", "VAR", "INTEGER", "BOOLEAN", "READ", 
			"WRITE", "SKIP_", "WHILE", "DO", "IF", "THEN", "ELSE", "AND", "OR", "TRUE", 
			"FALSE", "NOT", "ASSIGN", "COLON", "COMMA", "LPAREN", "RPAREN", "SEMI", 
			"LE", "LT", "EQUAL", "GT", "GE", "NE", "ADD", "SUB", "MUL", "DIV", "NURMAL", 
			"IDENTIFIER", "WS"
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

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public wrenParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(wrenParser.PROGRAM, 0); }
		public TerminalNode IDENTIFIER() { return getToken(wrenParser.IDENTIFIER, 0); }
		public TerminalNode IS() { return getToken(wrenParser.IS, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wrenListener ) ((wrenListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wrenListener ) ((wrenListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wrenVisitor ) return ((wrenVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(PROGRAM);
			setState(41);
			match(IDENTIFIER);
			setState(42);
			match(IS);
			setState(43);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public Declaration_seqContext declaration_seq() {
			return getRuleContext(Declaration_seqContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(wrenParser.BEGIN, 0); }
		public Command_seqContext command_seq() {
			return getRuleContext(Command_seqContext.class,0);
		}
		public TerminalNode END() { return getToken(wrenParser.END, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wrenListener ) ((wrenListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wrenListener ) ((wrenListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wrenVisitor ) return ((wrenVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			declaration_seq();
			setState(46);
			match(BEGIN);
			setState(47);
			command_seq();
			setState(48);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Declaration_seqContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public Declaration_seqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_seq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wrenListener ) ((wrenListener)listener).enterDeclaration_seq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wrenListener ) ((wrenListener)listener).exitDeclaration_seq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wrenVisitor ) return ((wrenVisitor<? extends T>)visitor).visitDeclaration_seq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaration_seqContext declaration_seq() throws RecognitionException {
		Declaration_seqContext _localctx = new Declaration_seqContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration_seq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(50);
				declaration();
				}
				}
				setState(55);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(wrenParser.VAR, 0); }
		public Variable_listContext variable_list() {
			return getRuleContext(Variable_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(wrenParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(wrenParser.SEMI, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wrenListener ) ((wrenListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wrenListener ) ((wrenListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wrenVisitor ) return ((wrenVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(VAR);
			setState(57);
			variable_list();
			setState(58);
			match(COLON);
			setState(59);
			type();
			setState(60);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(wrenParser.INTEGER, 0); }
		public TerminalNode BOOLEAN() { return getToken(wrenParser.BOOLEAN, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wrenListener ) ((wrenListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wrenListener ) ((wrenListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wrenVisitor ) return ((wrenVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==BOOLEAN) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_listContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(wrenParser.COMMA, 0); }
		public Variable_listContext variable_list() {
			return getRuleContext(Variable_listContext.class,0);
		}
		public Variable_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wrenListener ) ((wrenListener)listener).enterVariable_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wrenListener ) ((wrenListener)listener).exitVariable_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wrenVisitor ) return ((wrenVisitor<? extends T>)visitor).visitVariable_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_listContext variable_list() throws RecognitionException {
		Variable_listContext _localctx = new Variable_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variable_list);
		try {
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				variable();
				setState(66);
				match(COMMA);
				setState(67);
				variable_list();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Command_seqContext extends ParserRuleContext {
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(wrenParser.SEMI, 0); }
		public Command_seqContext command_seq() {
			return getRuleContext(Command_seqContext.class,0);
		}
		public Command_seqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command_seq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wrenListener ) ((wrenListener)listener).enterCommand_seq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wrenListener ) ((wrenListener)listener).exitCommand_seq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wrenVisitor ) return ((wrenVisitor<? extends T>)visitor).visitCommand_seq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Command_seqContext command_seq() throws RecognitionException {
		Command_seqContext _localctx = new Command_seqContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_command_seq);
		try {
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				command();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				command();
				setState(73);
				match(SEMI);
				setState(74);
				command_seq();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CommandContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(wrenParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SKIP_() { return getToken(wrenParser.SKIP_, 0); }
		public TerminalNode READ() { return getToken(wrenParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(wrenParser.WRITE, 0); }
		public Integer_exprContext integer_expr() {
			return getRuleContext(Integer_exprContext.class,0);
		}
		public List<TerminalNode> WHILE() { return getTokens(wrenParser.WHILE); }
		public TerminalNode WHILE(int i) {
			return getToken(wrenParser.WHILE, i);
		}
		public Boolean_exprContext boolean_expr() {
			return getRuleContext(Boolean_exprContext.class,0);
		}
		public TerminalNode DO() { return getToken(wrenParser.DO, 0); }
		public Command_seqContext command_seq() {
			return getRuleContext(Command_seqContext.class,0);
		}
		public TerminalNode END() { return getToken(wrenParser.END, 0); }
		public List<TerminalNode> IF() { return getTokens(wrenParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(wrenParser.IF, i);
		}
		public TerminalNode THEN() { return getToken(wrenParser.THEN, 0); }
		public ThencommandContext thencommand() {
			return getRuleContext(ThencommandContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(wrenParser.ELSE, 0); }
		public ElsecommandContext elsecommand() {
			return getRuleContext(ElsecommandContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wrenListener ) ((wrenListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wrenListener ) ((wrenListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wrenVisitor ) return ((wrenVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_command);
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				variable();
				setState(79);
				match(ASSIGN);
				setState(80);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				match(SKIP_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				match(READ);
				setState(84);
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
				match(WRITE);
				setState(86);
				integer_expr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(87);
				match(WHILE);
				setState(88);
				boolean_expr(0);
				setState(89);
				match(DO);
				setState(90);
				command_seq();
				setState(91);
				match(END);
				setState(92);
				match(WHILE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(94);
				match(IF);
				setState(95);
				boolean_expr(0);
				setState(96);
				match(THEN);
				setState(97);
				thencommand();
				setState(98);
				match(END);
				setState(99);
				match(IF);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(101);
				match(IF);
				setState(102);
				boolean_expr(0);
				setState(103);
				match(THEN);
				setState(104);
				thencommand();
				setState(105);
				match(ELSE);
				setState(106);
				elsecommand();
				setState(107);
				match(END);
				setState(108);
				match(IF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ThencommandContext extends ParserRuleContext {
		public Command_seqContext command_seq() {
			return getRuleContext(Command_seqContext.class,0);
		}
		public ThencommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thencommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wrenListener ) ((wrenListener)listener).enterThencommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wrenListener ) ((wrenListener)listener).exitThencommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wrenVisitor ) return ((wrenVisitor<? extends T>)visitor).visitThencommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThencommandContext thencommand() throws RecognitionException {
		ThencommandContext _localctx = new ThencommandContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_thencommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			command_seq();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElsecommandContext extends ParserRuleContext {
		public Command_seqContext command_seq() {
			return getRuleContext(Command_seqContext.class,0);
		}
		public ElsecommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsecommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wrenListener ) ((wrenListener)listener).enterElsecommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wrenListener ) ((wrenListener)listener).exitElsecommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wrenVisitor ) return ((wrenVisitor<? extends T>)visitor).visitElsecommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElsecommandContext elsecommand() throws RecognitionException {
		ElsecommandContext _localctx = new ElsecommandContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_elsecommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			command_seq();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public Integer_exprContext integer_expr() {
			return getRuleContext(Integer_exprContext.class,0);
		}
		public Boolean_exprContext boolean_expr() {
			return getRuleContext(Boolean_exprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wrenListener ) ((wrenListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wrenListener ) ((wrenListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wrenVisitor ) return ((wrenVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expr);
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				integer_expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				boolean_expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Integer_exprContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public List<Integer_exprContext> integer_expr() {
			return getRuleContexts(Integer_exprContext.class);
		}
		public Integer_exprContext integer_expr(int i) {
			return getRuleContext(Integer_exprContext.class,i);
		}
		public Strong_opContext strong_op() {
			return getRuleContext(Strong_opContext.class,0);
		}
		public Weak_opContext weak_op() {
			return getRuleContext(Weak_opContext.class,0);
		}
		public Integer_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wrenListener ) ((wrenListener)listener).enterInteger_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wrenListener ) ((wrenListener)listener).exitInteger_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wrenVisitor ) return ((wrenVisitor<? extends T>)visitor).visitInteger_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Integer_exprContext integer_expr() throws RecognitionException {
		return integer_expr(0);
	}

	private Integer_exprContext integer_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Integer_exprContext _localctx = new Integer_exprContext(_ctx, _parentState);
		Integer_exprContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_integer_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(121);
			element();
			}
			_ctx.stop = _input.LT(-1);
			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(131);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new Integer_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_integer_expr);
						setState(123);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(124);
						strong_op();
						setState(125);
						integer_expr(4);
						}
						break;
					case 2:
						{
						_localctx = new Integer_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_integer_expr);
						setState(127);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(128);
						weak_op();
						setState(129);
						integer_expr(3);
						}
						break;
					}
					} 
				}
				setState(135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementContext extends ParserRuleContext {
		public TerminalNode NURMAL() { return getToken(wrenParser.NURMAL, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(wrenParser.LPAREN, 0); }
		public Integer_exprContext integer_expr() {
			return getRuleContext(Integer_exprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(wrenParser.RPAREN, 0); }
		public TerminalNode SUB() { return getToken(wrenParser.SUB, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wrenListener ) ((wrenListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wrenListener ) ((wrenListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wrenVisitor ) return ((wrenVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_element);
		try {
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NURMAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(NURMAL);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				variable();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				match(LPAREN);
				setState(139);
				integer_expr(0);
				setState(140);
				match(RPAREN);
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				match(SUB);
				setState(143);
				element();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Boolean_exprContext extends ParserRuleContext {
		public Boolean_elementContext boolean_element() {
			return getRuleContext(Boolean_elementContext.class,0);
		}
		public List<Boolean_exprContext> boolean_expr() {
			return getRuleContexts(Boolean_exprContext.class);
		}
		public Boolean_exprContext boolean_expr(int i) {
			return getRuleContext(Boolean_exprContext.class,i);
		}
		public TerminalNode AND() { return getToken(wrenParser.AND, 0); }
		public TerminalNode OR() { return getToken(wrenParser.OR, 0); }
		public Boolean_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wrenListener ) ((wrenListener)listener).enterBoolean_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wrenListener ) ((wrenListener)listener).exitBoolean_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wrenVisitor ) return ((wrenVisitor<? extends T>)visitor).visitBoolean_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_exprContext boolean_expr() throws RecognitionException {
		return boolean_expr(0);
	}

	private Boolean_exprContext boolean_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Boolean_exprContext _localctx = new Boolean_exprContext(_ctx, _parentState);
		Boolean_exprContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_boolean_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(147);
			boolean_element();
			}
			_ctx.stop = _input.LT(-1);
			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(155);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new Boolean_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_boolean_expr);
						setState(149);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(150);
						match(AND);
						setState(151);
						boolean_expr(4);
						}
						break;
					case 2:
						{
						_localctx = new Boolean_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_boolean_expr);
						setState(152);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(153);
						match(OR);
						setState(154);
						boolean_expr(3);
						}
						break;
					}
					} 
				}
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Boolean_elementContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(wrenParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(wrenParser.FALSE, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public TerminalNode NOT() { return getToken(wrenParser.NOT, 0); }
		public TerminalNode LPAREN() { return getToken(wrenParser.LPAREN, 0); }
		public Boolean_exprContext boolean_expr() {
			return getRuleContext(Boolean_exprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(wrenParser.RPAREN, 0); }
		public Boolean_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wrenListener ) ((wrenListener)listener).enterBoolean_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wrenListener ) ((wrenListener)listener).exitBoolean_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wrenVisitor ) return ((wrenVisitor<? extends T>)visitor).visitBoolean_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_elementContext boolean_element() throws RecognitionException {
		Boolean_elementContext _localctx = new Boolean_elementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_boolean_element);
		try {
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				match(TRUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				match(FALSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(163);
				comparison();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(164);
				match(NOT);
				setState(165);
				match(LPAREN);
				setState(166);
				boolean_expr(0);
				setState(167);
				match(RPAREN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(169);
				match(LPAREN);
				setState(170);
				boolean_expr(0);
				setState(171);
				match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonContext extends ParserRuleContext {
		public List<Integer_exprContext> integer_expr() {
			return getRuleContexts(Integer_exprContext.class);
		}
		public Integer_exprContext integer_expr(int i) {
			return getRuleContext(Integer_exprContext.class,i);
		}
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wrenListener ) ((wrenListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wrenListener ) ((wrenListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wrenVisitor ) return ((wrenVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_comparison);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			integer_expr(0);
			setState(176);
			relation();
			setState(177);
			integer_expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Weak_opContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(wrenParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(wrenParser.SUB, 0); }
		public Weak_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_weak_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wrenListener ) ((wrenListener)listener).enterWeak_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wrenListener ) ((wrenListener)listener).exitWeak_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wrenVisitor ) return ((wrenVisitor<? extends T>)visitor).visitWeak_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Weak_opContext weak_op() throws RecognitionException {
		Weak_opContext _localctx = new Weak_opContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_weak_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_la = _input.LA(1);
			if ( !(_la==ADD || _la==SUB) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Strong_opContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(wrenParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(wrenParser.DIV, 0); }
		public Strong_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strong_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wrenListener ) ((wrenListener)listener).enterStrong_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wrenListener ) ((wrenListener)listener).exitStrong_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wrenVisitor ) return ((wrenVisitor<? extends T>)visitor).visitStrong_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Strong_opContext strong_op() throws RecognitionException {
		Strong_opContext _localctx = new Strong_opContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_strong_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_la = _input.LA(1);
			if ( !(_la==MUL || _la==DIV) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(wrenParser.IDENTIFIER, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wrenListener ) ((wrenListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wrenListener ) ((wrenListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wrenVisitor ) return ((wrenVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RelationContext extends ParserRuleContext {
		public TerminalNode LE() { return getToken(wrenParser.LE, 0); }
		public TerminalNode LT() { return getToken(wrenParser.LT, 0); }
		public TerminalNode EQUAL() { return getToken(wrenParser.EQUAL, 0); }
		public TerminalNode GT() { return getToken(wrenParser.GT, 0); }
		public TerminalNode GE() { return getToken(wrenParser.GE, 0); }
		public TerminalNode NE() { return getToken(wrenParser.NE, 0); }
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wrenListener ) ((wrenListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wrenListener ) ((wrenListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wrenVisitor ) return ((wrenVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_relation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 8455716864L) != 0) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return integer_expr_sempred((Integer_exprContext)_localctx, predIndex);
		case 13:
			return boolean_expr_sempred((Boolean_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean integer_expr_sempred(Integer_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean boolean_expr_sempred(Boolean_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\'\u00bc\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0005\u00024\b\u0002\n\u0002\f\u00027\t\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005F\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006M\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"o\b\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0003\nw\b\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u0084\b\u000b\n\u000b\f\u000b\u0087\t\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0091\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u009c\b\r\n"+
		"\r\f\r\u009f\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00ae\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0000"+
		"\u0002\u0016\u001a\u0014\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&\u0000\u0004\u0001\u0000\u0006"+
		"\u0007\u0001\u0000!\"\u0001\u0000#$\u0001\u0000\u001b \u00bd\u0000(\u0001"+
		"\u0000\u0000\u0000\u0002-\u0001\u0000\u0000\u0000\u00045\u0001\u0000\u0000"+
		"\u0000\u00068\u0001\u0000\u0000\u0000\b>\u0001\u0000\u0000\u0000\nE\u0001"+
		"\u0000\u0000\u0000\fL\u0001\u0000\u0000\u0000\u000en\u0001\u0000\u0000"+
		"\u0000\u0010p\u0001\u0000\u0000\u0000\u0012r\u0001\u0000\u0000\u0000\u0014"+
		"v\u0001\u0000\u0000\u0000\u0016x\u0001\u0000\u0000\u0000\u0018\u0090\u0001"+
		"\u0000\u0000\u0000\u001a\u0092\u0001\u0000\u0000\u0000\u001c\u00ad\u0001"+
		"\u0000\u0000\u0000\u001e\u00af\u0001\u0000\u0000\u0000 \u00b3\u0001\u0000"+
		"\u0000\u0000\"\u00b5\u0001\u0000\u0000\u0000$\u00b7\u0001\u0000\u0000"+
		"\u0000&\u00b9\u0001\u0000\u0000\u0000()\u0005\u0001\u0000\u0000)*\u0005"+
		"&\u0000\u0000*+\u0005\u0002\u0000\u0000+,\u0003\u0002\u0001\u0000,\u0001"+
		"\u0001\u0000\u0000\u0000-.\u0003\u0004\u0002\u0000./\u0005\u0003\u0000"+
		"\u0000/0\u0003\f\u0006\u000001\u0005\u0004\u0000\u00001\u0003\u0001\u0000"+
		"\u0000\u000024\u0003\u0006\u0003\u000032\u0001\u0000\u0000\u000047\u0001"+
		"\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u0000"+
		"6\u0005\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000089\u0005\u0005"+
		"\u0000\u00009:\u0003\n\u0005\u0000:;\u0005\u0016\u0000\u0000;<\u0003\b"+
		"\u0004\u0000<=\u0005\u001a\u0000\u0000=\u0007\u0001\u0000\u0000\u0000"+
		">?\u0007\u0000\u0000\u0000?\t\u0001\u0000\u0000\u0000@F\u0003$\u0012\u0000"+
		"AB\u0003$\u0012\u0000BC\u0005\u0017\u0000\u0000CD\u0003\n\u0005\u0000"+
		"DF\u0001\u0000\u0000\u0000E@\u0001\u0000\u0000\u0000EA\u0001\u0000\u0000"+
		"\u0000F\u000b\u0001\u0000\u0000\u0000GM\u0003\u000e\u0007\u0000HI\u0003"+
		"\u000e\u0007\u0000IJ\u0005\u001a\u0000\u0000JK\u0003\f\u0006\u0000KM\u0001"+
		"\u0000\u0000\u0000LG\u0001\u0000\u0000\u0000LH\u0001\u0000\u0000\u0000"+
		"M\r\u0001\u0000\u0000\u0000NO\u0003$\u0012\u0000OP\u0005\u0015\u0000\u0000"+
		"PQ\u0003\u0014\n\u0000Qo\u0001\u0000\u0000\u0000Ro\u0005\n\u0000\u0000"+
		"ST\u0005\b\u0000\u0000To\u0003$\u0012\u0000UV\u0005\t\u0000\u0000Vo\u0003"+
		"\u0016\u000b\u0000WX\u0005\u000b\u0000\u0000XY\u0003\u001a\r\u0000YZ\u0005"+
		"\f\u0000\u0000Z[\u0003\f\u0006\u0000[\\\u0005\u0004\u0000\u0000\\]\u0005"+
		"\u000b\u0000\u0000]o\u0001\u0000\u0000\u0000^_\u0005\r\u0000\u0000_`\u0003"+
		"\u001a\r\u0000`a\u0005\u000e\u0000\u0000ab\u0003\u0010\b\u0000bc\u0005"+
		"\u0004\u0000\u0000cd\u0005\r\u0000\u0000do\u0001\u0000\u0000\u0000ef\u0005"+
		"\r\u0000\u0000fg\u0003\u001a\r\u0000gh\u0005\u000e\u0000\u0000hi\u0003"+
		"\u0010\b\u0000ij\u0005\u000f\u0000\u0000jk\u0003\u0012\t\u0000kl\u0005"+
		"\u0004\u0000\u0000lm\u0005\r\u0000\u0000mo\u0001\u0000\u0000\u0000nN\u0001"+
		"\u0000\u0000\u0000nR\u0001\u0000\u0000\u0000nS\u0001\u0000\u0000\u0000"+
		"nU\u0001\u0000\u0000\u0000nW\u0001\u0000\u0000\u0000n^\u0001\u0000\u0000"+
		"\u0000ne\u0001\u0000\u0000\u0000o\u000f\u0001\u0000\u0000\u0000pq\u0003"+
		"\f\u0006\u0000q\u0011\u0001\u0000\u0000\u0000rs\u0003\f\u0006\u0000s\u0013"+
		"\u0001\u0000\u0000\u0000tw\u0003\u0016\u000b\u0000uw\u0003\u001a\r\u0000"+
		"vt\u0001\u0000\u0000\u0000vu\u0001\u0000\u0000\u0000w\u0015\u0001\u0000"+
		"\u0000\u0000xy\u0006\u000b\uffff\uffff\u0000yz\u0003\u0018\f\u0000z\u0085"+
		"\u0001\u0000\u0000\u0000{|\n\u0003\u0000\u0000|}\u0003\"\u0011\u0000}"+
		"~\u0003\u0016\u000b\u0004~\u0084\u0001\u0000\u0000\u0000\u007f\u0080\n"+
		"\u0002\u0000\u0000\u0080\u0081\u0003 \u0010\u0000\u0081\u0082\u0003\u0016"+
		"\u000b\u0003\u0082\u0084\u0001\u0000\u0000\u0000\u0083{\u0001\u0000\u0000"+
		"\u0000\u0083\u007f\u0001\u0000\u0000\u0000\u0084\u0087\u0001\u0000\u0000"+
		"\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000"+
		"\u0000\u0086\u0017\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000"+
		"\u0000\u0088\u0091\u0005%\u0000\u0000\u0089\u0091\u0003$\u0012\u0000\u008a"+
		"\u008b\u0005\u0018\u0000\u0000\u008b\u008c\u0003\u0016\u000b\u0000\u008c"+
		"\u008d\u0005\u0019\u0000\u0000\u008d\u0091\u0001\u0000\u0000\u0000\u008e"+
		"\u008f\u0005\"\u0000\u0000\u008f\u0091\u0003\u0018\f\u0000\u0090\u0088"+
		"\u0001\u0000\u0000\u0000\u0090\u0089\u0001\u0000\u0000\u0000\u0090\u008a"+
		"\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0091\u0019"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u0006\r\uffff\uffff\u0000\u0093\u0094"+
		"\u0003\u001c\u000e\u0000\u0094\u009d\u0001\u0000\u0000\u0000\u0095\u0096"+
		"\n\u0003\u0000\u0000\u0096\u0097\u0005\u0010\u0000\u0000\u0097\u009c\u0003"+
		"\u001a\r\u0004\u0098\u0099\n\u0002\u0000\u0000\u0099\u009a\u0005\u0011"+
		"\u0000\u0000\u009a\u009c\u0003\u001a\r\u0003\u009b\u0095\u0001\u0000\u0000"+
		"\u0000\u009b\u0098\u0001\u0000\u0000\u0000\u009c\u009f\u0001\u0000\u0000"+
		"\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000"+
		"\u0000\u009e\u001b\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000"+
		"\u0000\u00a0\u00ae\u0005\u0012\u0000\u0000\u00a1\u00ae\u0005\u0013\u0000"+
		"\u0000\u00a2\u00ae\u0003$\u0012\u0000\u00a3\u00ae\u0003\u001e\u000f\u0000"+
		"\u00a4\u00a5\u0005\u0014\u0000\u0000\u00a5\u00a6\u0005\u0018\u0000\u0000"+
		"\u00a6\u00a7\u0003\u001a\r\u0000\u00a7\u00a8\u0005\u0019\u0000\u0000\u00a8"+
		"\u00ae\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005\u0018\u0000\u0000\u00aa"+
		"\u00ab\u0003\u001a\r\u0000\u00ab\u00ac\u0005\u0019\u0000\u0000\u00ac\u00ae"+
		"\u0001\u0000\u0000\u0000\u00ad\u00a0\u0001\u0000\u0000\u0000\u00ad\u00a1"+
		"\u0001\u0000\u0000\u0000\u00ad\u00a2\u0001\u0000\u0000\u0000\u00ad\u00a3"+
		"\u0001\u0000\u0000\u0000\u00ad\u00a4\u0001\u0000\u0000\u0000\u00ad\u00a9"+
		"\u0001\u0000\u0000\u0000\u00ae\u001d\u0001\u0000\u0000\u0000\u00af\u00b0"+
		"\u0003\u0016\u000b\u0000\u00b0\u00b1\u0003&\u0013\u0000\u00b1\u00b2\u0003"+
		"\u0016\u000b\u0000\u00b2\u001f\u0001\u0000\u0000\u0000\u00b3\u00b4\u0007"+
		"\u0001\u0000\u0000\u00b4!\u0001\u0000\u0000\u0000\u00b5\u00b6\u0007\u0002"+
		"\u0000\u0000\u00b6#\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005&\u0000\u0000"+
		"\u00b8%\u0001\u0000\u0000\u0000\u00b9\u00ba\u0007\u0003\u0000\u0000\u00ba"+
		"\'\u0001\u0000\u0000\u0000\u000b5ELnv\u0083\u0085\u0090\u009b\u009d\u00ad";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}