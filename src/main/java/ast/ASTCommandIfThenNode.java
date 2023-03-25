package ast;

import java.util.List;

public class ASTCommandIfThenNode extends ASTNode{
    public List<ASTCommand> thenCommandList;
    public ASTCommandIfThenNode() {
        super("thenNode", "then");
    }
}
