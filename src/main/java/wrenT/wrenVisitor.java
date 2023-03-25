// Generated from java-escape by ANTLR 4.11.1
package wrenT;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link wrenParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface wrenVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link wrenParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(wrenParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link wrenParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(wrenParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link wrenParser#declaration_seq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_seq(wrenParser.Declaration_seqContext ctx);
	/**
	 * Visit a parse tree produced by {@link wrenParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(wrenParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link wrenParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(wrenParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link wrenParser#variable_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_list(wrenParser.Variable_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link wrenParser#command_seq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand_seq(wrenParser.Command_seqContext ctx);
	/**
	 * Visit a parse tree produced by {@link wrenParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(wrenParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link wrenParser#thencommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThencommand(wrenParser.ThencommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link wrenParser#elsecommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsecommand(wrenParser.ElsecommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link wrenParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(wrenParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_expr(wrenParser.Integer_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link wrenParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(wrenParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_expr(wrenParser.Boolean_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link wrenParser#boolean_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_element(wrenParser.Boolean_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link wrenParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(wrenParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link wrenParser#weak_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWeak_op(wrenParser.Weak_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link wrenParser#strong_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrong_op(wrenParser.Strong_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link wrenParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(wrenParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link wrenParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation(wrenParser.RelationContext ctx);
}
