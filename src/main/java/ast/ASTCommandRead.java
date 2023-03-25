package ast;

public class ASTCommandRead extends ASTCommand{
    public ASTIdentifier identifier;
    public ASTCommandRead() {
        super("CommandRead","read");
    }
}
