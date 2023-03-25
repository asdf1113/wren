package ast;

import java.util.List;

public class ASTCommandWhile extends ASTCommand{
    public ASTExpression condi;
    public List<ASTCommand> commandList;
    public ASTCommandWhile() {
        super("CommandWhile","while");
    }
}
