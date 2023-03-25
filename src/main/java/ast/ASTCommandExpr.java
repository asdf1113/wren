package ast;

public class ASTCommandExpr extends ASTCommand{
    public ASTIdentifier identifier;
    public ASTExpression expression;
    public ASTCommandExpr() {
        super("CommandExpr","assign");
    }
}
