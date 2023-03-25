package ast;

import java.util.List;

public class ASTBlock extends ASTNode{
    public List<ASTDeclaration> declarationList;
    public List<ASTCommand> commandList;


    public ASTBlock() {
        super("block","blo");
    }
}
