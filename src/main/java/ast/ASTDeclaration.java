package ast;

import java.util.ArrayList;

public class ASTDeclaration extends ASTNode{
    public ArrayList<ASTIdentifier> identifierList;
    public ASTNode ty;
    public ASTDeclaration() {
        super("declaration","dec");
    }
}
