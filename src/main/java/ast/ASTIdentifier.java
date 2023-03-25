package ast;

import java.util.ArrayList;

public class ASTIdentifier extends ASTNode{
    public ASTIdentifier() {
        super("identifier"," ");
    }
    public ASTIdentifier(String name_){
        super("identifier", name_);
    }
}
