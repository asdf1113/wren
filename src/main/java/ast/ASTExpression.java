package ast;

public class ASTExpression extends ASTNode{
    public ASTNode lExpr;
    public ASTOperator op;
    public ASTNode rExpr;

    public ASTExpression() {
        super("expression","expr");
    }
}
