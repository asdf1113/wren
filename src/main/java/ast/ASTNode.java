package ast;

import org.antlr.v4.runtime.tree.Tree;

import java.util.ArrayList;

public abstract class ASTNode implements Tree {
   // public abstract void accept(ASTVisitor visitor) throws Exception;
    public String type;
    public String name;
    public ArrayList<ASTNode> children = new ArrayList<ASTNode>();
    public ASTNode parent;

    public  String getType(){
        return type;
    }

    public ASTNode(String type, String name){
        this.type=type;
        this.name=name;
    }

    @Override
    public Tree getParent() {
        return this.parent;
    }

    @Override
    public Object getPayload() {
        return this.type;
    }

    @Override
    public Tree getChild(int i) {
        if(i<this.children.size()){
            return this.children.get(i);
        }
        return null;
    }

    @Override
    public int getChildCount() {
        return this.children.size();
    }

    @Override
    public String toStringTree() {
        return this.type+": "+this.name;
    }


}
