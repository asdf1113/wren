package ast;

public class ASTNumeral extends ASTNode{
    public ASTNumeral() {
        super("numeral"," ");
    }
    public ASTNumeral(String num){
        super("numeral", num);
    }
}
