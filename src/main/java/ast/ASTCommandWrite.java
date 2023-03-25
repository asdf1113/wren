package ast;

public class ASTCommandWrite extends ASTCommand{
    public ASTNode value;
    public ASTCommandWrite() {
        super("CommandWrite","write");
    }
}
