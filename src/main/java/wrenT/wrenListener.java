// Generated from java-escape by ANTLR 4.11.1
package wrenT;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link wrenParser}.
 */
public interface wrenListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link wrenParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(wrenParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link wrenParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(wrenParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link wrenParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(wrenParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link wrenParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(wrenParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link wrenParser#declaration_seq}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_seq(wrenParser.Declaration_seqContext ctx);
	/**
	 * Exit a parse tree produced by {@link wrenParser#declaration_seq}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_seq(wrenParser.Declaration_seqContext ctx);
	/**
	 * Enter a parse tree produced by {@link wrenParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(wrenParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link wrenParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(wrenParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link wrenParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(wrenParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link wrenParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(wrenParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link wrenParser#variable_list}.
	 * @param ctx the parse tree
	 */
	void enterVariable_list(wrenParser.Variable_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link wrenParser#variable_list}.
	 * @param ctx the parse tree
	 */
	void exitVariable_list(wrenParser.Variable_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link wrenParser#command_seq}.
	 * @param ctx the parse tree
	 */
	void enterCommand_seq(wrenParser.Command_seqContext ctx);
	/**
	 * Exit a parse tree produced by {@link wrenParser#command_seq}.
	 * @param ctx the parse tree
	 */
	void exitCommand_seq(wrenParser.Command_seqContext ctx);
	/**
	 * Enter a parse tree produced by {@link wrenParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(wrenParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link wrenParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(wrenParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link wrenParser#thencommand}.
	 * @param ctx the parse tree
	 */
	void enterThencommand(wrenParser.ThencommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link wrenParser#thencommand}.
	 * @param ctx the parse tree
	 */
	void exitThencommand(wrenParser.ThencommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link wrenParser#elsecommand}.
	 * @param ctx the parse tree
	 */
	void enterElsecommand(wrenParser.ElsecommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link wrenParser#elsecommand}.
	 * @param ctx the parse tree
	 */
	void exitElsecommand(wrenParser.ElsecommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link wrenParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(wrenParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link wrenParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(wrenParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by .
	 * @param ctx the parse tree
	 */
	void enterInteger_expr(wrenParser.Integer_exprContext ctx);
	/**
	 * Exit a parse tree produced by .
	 * @param ctx the parse tree
	 */
	void exitInteger_expr(wrenParser.Integer_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link wrenParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(wrenParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link wrenParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(wrenParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by .
	 * @param ctx the parse tree
	 */
	void enterBoolean_expr(wrenParser.Boolean_exprContext ctx);
	/**
	 * Exit a parse tree produced by .
	 * @param ctx the parse tree
	 */
	void exitBoolean_expr(wrenParser.Boolean_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link wrenParser#boolean_element}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_element(wrenParser.Boolean_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link wrenParser#boolean_element}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_element(wrenParser.Boolean_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link wrenParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(wrenParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link wrenParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(wrenParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link wrenParser#weak_op}.
	 * @param ctx the parse tree
	 */
	void enterWeak_op(wrenParser.Weak_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link wrenParser#weak_op}.
	 * @param ctx the parse tree
	 */
	void exitWeak_op(wrenParser.Weak_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link wrenParser#strong_op}.
	 * @param ctx the parse tree
	 */
	void enterStrong_op(wrenParser.Strong_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link wrenParser#strong_op}.
	 * @param ctx the parse tree
	 */
	void exitStrong_op(wrenParser.Strong_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link wrenParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(wrenParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link wrenParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(wrenParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link wrenParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(wrenParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link wrenParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(wrenParser.RelationContext ctx);
}
