package ast;

import java.util.List;

public class ASTCommandIf extends ASTCommand{
    public ASTExpression condi;
    public ASTCommandIfThenNode thenNode;
    public ASTCommandIf() {
        super("CommandIf","if");
    }
}
