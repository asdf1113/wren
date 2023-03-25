package ast;

import java.util.List;

public class ASTCommandIfElseNode extends ASTNode{
    public List<ASTCommand> elseCommandList;
    public ASTCommandIfElseNode() {
        super("ElseNode", "else");
    }
}
