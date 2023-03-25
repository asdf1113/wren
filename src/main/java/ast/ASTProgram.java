package ast;

public class ASTProgram extends ASTNode {
    public ASTIdentifier identifier;
    public ASTBlock block;
    public ASTProgram(){
        super("program","prog");
    }

}
