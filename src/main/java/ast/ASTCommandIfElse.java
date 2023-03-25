package ast;

import java.util.List;

public class ASTCommandIfElse extends ASTCommand{
    public ASTExpression condi;
    public ASTCommandIfThenNode thenNode;
    public ASTCommandIfElseNode elseNode;
    public ASTCommandIfElse() {
        super("CommandIfElse","IfElse");
    }
}
