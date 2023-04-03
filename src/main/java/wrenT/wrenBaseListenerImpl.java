package wrenT;

import ast.*;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.Stack;

public class wrenBaseListenerImpl extends wrenBaseListener {
    private Stack<ASTNode> nodeStack = new Stack<>();

    public void traval(ASTNode tree){
        String type = tree.type;
        //System.out.println(tree.toStringTree());
        switch (type){
            case "program":{
                traval(((ASTProgram)tree).identifier);
                traval(((ASTProgram)tree).block);
            }
            break;
            case "operator":
            case "numeral":
            case "type":
            case "identifier":
            case"CommandSkip": {
                //System.out.println(tree.toStringTree());
                return;
            }
            case "block":{
                for(int i=0;i<((ASTBlock)tree).declarationList.size();i++){
                    traval(((ASTBlock) tree).declarationList.get(i));
                }
                for(int i=0;i<((ASTBlock)tree).commandList.size();i++){
                    traval(((ASTBlock) tree).commandList.get(i));
                }
            }
            break;
            case"declaration":{
                for(int i=0;i<((ASTDeclaration)tree).identifierList.size();i++){
                    traval(((ASTDeclaration) tree).identifierList.get(i));
                }
                traval(((ASTDeclaration) tree).ty);
            }
            break;
            case "CommandExpr":{
                traval(((ASTCommandExpr)tree).identifier);
                traval(((ASTCommandExpr)tree).expression);
            }
            break;
            case "expression":{
                if(((ASTExpression)tree).lExpr!=null)
                traval(((ASTExpression)tree).lExpr);
                if(((ASTExpression)tree).op!=null)
                traval(((ASTExpression)tree).op);
                if(((ASTExpression)tree).rExpr!=null)
                traval(((ASTExpression)tree).rExpr);
            }
            break;
            case "CommandWrite":{
                traval(((ASTCommandWrite)tree).value);
            }
            break;
            case "CommandRead":{
                traval(((ASTCommandRead) tree).identifier);
            }
            break;
            case "CommandIf":{
                traval(((ASTCommandIf)tree).condi);
                traval(((ASTCommandIf)tree).thenNode);
            }
            break;
            case "CommandIfElse":{
                traval(((ASTCommandIfElse)tree).condi);
                traval(((ASTCommandIfElse)tree).thenNode);
                traval(((ASTCommandIfElse)tree).elseNode);
            }
            break;
            case "thenNode":{
                for(int i=0;i<((ASTCommandIfThenNode)tree).thenCommandList.size();i++){
                    traval(((ASTCommandIfThenNode)tree).thenCommandList.get(i));
                }
            }
            break;
            case "ElseNode":{
                for(int i=0;i<((ASTCommandIfElseNode)tree).elseCommandList.size();i++){
                    traval(((ASTCommandIfElseNode)tree).elseCommandList.get(i));
                }
            }
            break;
            case "CommandWhile":{
                traval(((ASTCommandWhile)tree).condi);
                for(int i=0;i<((ASTCommandWhile)tree).commandList.size();i++){
                    traval(((ASTCommandWhile)tree).commandList.get(i));
                }
            }
            break;
            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }
    }

    public ASTNode getAstTree(){
        return nodeStack.pop();
    }

    @Override
    public void enterProg(wrenParser.ProgContext ctx) {
        ASTProgram prog = new ASTProgram();
        nodeStack.push(prog);
        //System.out.println(nodeStack.peek().toStringTree());
    }

    @Override
    public void exitProg(wrenParser.ProgContext ctx) {
        //super.exitProg(ctx);
    }

    @Override
    public void enterBlock(wrenParser.BlockContext ctx) {
        //ASTBlock block = new ASTBlock();
        nodeStack.push(new ASTBlock());
        //System.out.println(nodeStack.peek().toStringTree());
    }

    @Override
    public void exitBlock(wrenParser.BlockContext ctx) {
        ASTNode thisNode = nodeStack.pop();
        ASTNode parentNode = nodeStack.peek();
        if(parentNode.getClass()==ASTProgram.class){
                ((ASTProgram)parentNode).block=(ASTBlock)thisNode;
        }
    }

    @Override
    public void enterDeclaration(wrenParser.DeclarationContext ctx) {
        nodeStack.push(new ASTDeclaration());
        //System.out.println(nodeStack.peek().toStringTree());
    }

    @Override
    public void exitDeclaration(wrenParser.DeclarationContext ctx) {
        ASTNode thisNode = nodeStack.pop();
        ASTNode parentNode = nodeStack.peek();
        if(parentNode.getClass()==ASTBlock.class){
            if(((ASTBlock)parentNode).declarationList==null){
                ((ASTBlock)parentNode).declarationList=new ArrayList<>();
            }
            ((ASTBlock)parentNode).declarationList.add((ASTDeclaration)thisNode);
        }
    }

    @Override
    public void enterCommand(wrenParser.CommandContext ctx) {
//        System.out.print(ctx.getChildCount()+"  ");
//        System.out.print(ctx.start.getText()+"  ");
//        System.out.println(ctx.start.getType());
        int com = ctx.start.getType();
        //String ty = ctx.start.getText();
        switch (com){
            case 10: nodeStack.push(new ASTCommandSkip());break;
            case 8: nodeStack.push(new ASTCommandRead());break;
            case 9: nodeStack.push(new ASTCommandWrite());break;
            case 11: nodeStack.push(new ASTCommandWhile());break;
            case 38: nodeStack.push(new ASTCommandExpr());break;
            case 13:{if(ctx.getChildCount()==6)
                nodeStack.push(new ASTCommandIf());
            else nodeStack.push(new ASTCommandIfElse());}
            break;
            default:nodeStack.push(new ASTCommand("Command"," "));
        }
       //System.out.println(nodeStack.peek().toStringTree());

    }

    @Override
    public void exitCommand(wrenParser.CommandContext ctx) {
        ASTNode thisNode = nodeStack.pop();
        ASTNode parentNode = nodeStack.peek();
        if(parentNode.getClass()==ASTBlock.class) {
            if (((ASTBlock) parentNode).commandList == null) {
                ((ASTBlock) parentNode).commandList = new ArrayList<>();
            }
            ((ASTBlock) parentNode).commandList.add((ASTCommand) thisNode);
        }else if(parentNode.getClass()==ASTCommandIfThenNode.class){
            if (((ASTCommandIfThenNode) parentNode).thenCommandList == null) {
                ((ASTCommandIfThenNode) parentNode).thenCommandList = new ArrayList<>();
            }
            ((ASTCommandIfThenNode) parentNode).thenCommandList.add((ASTCommand) thisNode);
        }else if(parentNode.getClass()==ASTCommandIfElseNode.class){
            if (((ASTCommandIfElseNode) parentNode).elseCommandList == null) {
                ((ASTCommandIfElseNode) parentNode).elseCommandList = new ArrayList<>();
            }
            ((ASTCommandIfElseNode) parentNode).elseCommandList.add((ASTCommand) thisNode);
        }else if(parentNode.getClass()==ASTCommandWhile.class){
            if(((ASTCommandWhile)parentNode).commandList==null){
                ((ASTCommandWhile)parentNode).commandList=new ArrayList<>();
            }
            ((ASTCommandWhile)parentNode).commandList.add((ASTCommand) thisNode);
        }
//        else if(parentNode.getClass()==ASTCommandIf.class){
//            if (((ASTCommandIf) parentNode).thenCommandList == null) {
//                ((ASTCommandIf) parentNode).thenCommandList = new ArrayList<>();
//            }
//            ((ASTCommandIf) parentNode).thenCommandList.add((ASTCommand) thisNode);
//        }
    }

    @Override
    public void enterInteger_expr(wrenParser.Integer_exprContext ctx) {
//        System.out.println(ctx.getChild(0).getChild(0).getText());
        if(ctx.getChild(0).getChild(0)!=null && (ctx.getChild(0).getChild(0).getText().equals("("))) return;
        nodeStack.push(new ASTExpression());
    }

    @Override
    public void exitInteger_expr(wrenParser.Integer_exprContext ctx) {
        if(ctx.getChild(0).getChild(0)!=null && (ctx.getChild(0).getChild(0).getText().equals("("))){
            return;
        }
        ASTNode thisNode = nodeStack.pop();
        ASTNode parentNode = nodeStack.peek();
        if(parentNode.getClass()==ASTCommandWrite.class) {
            ((ASTCommandWrite) parentNode).value=thisNode;
        }else if(parentNode.getClass()==ASTExpression.class){
            if(((ASTExpression) parentNode).lExpr==null){
                ((ASTExpression) parentNode).lExpr=thisNode;
            }else{
                ((ASTExpression) parentNode).rExpr=thisNode;
            }
        }else if(parentNode.getClass()==ASTCommandExpr.class){
            ((ASTCommandExpr) parentNode).expression=(ASTExpression) thisNode;
        }
    }

    @Override
    public void enterWeak_op(wrenParser.Weak_opContext ctx) {
        String op=ctx.getChild(0).getText();
        nodeStack.push(new ASTOperator(op));
    }

    @Override
    public void exitWeak_op(wrenParser.Weak_opContext ctx) {
        ASTNode thisNode = nodeStack.pop();
        ASTNode parentNode = nodeStack.peek();
        if(parentNode.getClass()==ASTExpression.class){
            ((ASTExpression)parentNode).op=(ASTOperator) thisNode;
        }
    }

    @Override
    public void enterStrong_op(wrenParser.Strong_opContext ctx) {
        String op=ctx.getChild(0).getText();
        nodeStack.push(new ASTOperator(op));
    }

    @Override
    public void exitStrong_op(wrenParser.Strong_opContext ctx) {
        ASTNode thisNode = nodeStack.pop();
        ASTNode parentNode = nodeStack.peek();
        if(parentNode.getClass()==ASTExpression.class){
            ((ASTExpression)parentNode).op=(ASTOperator) thisNode;
        }
    }


    @Override
    public void enterBoolean_expr(wrenParser.Boolean_exprContext ctx) {
        nodeStack.push(new ASTExpression());
    }

    @Override
    public void exitBoolean_expr(wrenParser.Boolean_exprContext ctx) {
        ASTNode thisNode = nodeStack.pop();
        ASTNode parentNode = nodeStack.peek();
        if(parentNode.getClass()==ASTExpression.class){
            if(((ASTExpression) parentNode).lExpr==null){
                ((ASTExpression) parentNode).lExpr=thisNode;
            }else{
                ((ASTExpression) parentNode).rExpr=thisNode;
            }
        }else if(parentNode.getClass()==ASTCommandExpr.class){
            ((ASTCommandExpr) parentNode).expression=(ASTExpression) thisNode;
        }else if(parentNode.getClass()==ASTCommandIf.class){
            ((ASTCommandIf)parentNode).condi=(ASTExpression) thisNode;
        }else if(parentNode.getClass()==ASTCommandIfElse.class){
            ((ASTCommandIfElse)parentNode).condi=(ASTExpression) thisNode;
        }else if(parentNode.getClass()==ASTCommandWhile.class){
            ((ASTCommandWhile)parentNode).condi=(ASTExpression) thisNode;
        }
    }

    @Override
    public void enterRelation(wrenParser.RelationContext ctx) {
        String op=ctx.getChild(0).getText();
        nodeStack.push(new ASTOperator(op));
    }

    @Override
    public void exitRelation(wrenParser.RelationContext ctx) {
        ASTNode thisNode = nodeStack.pop();
        ASTNode parentNode = nodeStack.peek();
        if(parentNode.getClass()==ASTExpression.class){
            ((ASTExpression)parentNode).op=(ASTOperator) thisNode;
        }
    }

    @Override
    public void enterThencommand(wrenParser.ThencommandContext ctx) {
        nodeStack.push(new ASTCommandIfThenNode());
    }

    @Override
    public void exitThencommand(wrenParser.ThencommandContext ctx) {
        ASTNode thisNode = nodeStack.pop();
        ASTNode parentNode = nodeStack.peek();
        if(parentNode.getClass()==ASTCommandIf.class ) {
            ((ASTCommandIf)parentNode).thenNode=(ASTCommandIfThenNode) thisNode;
        }else if(parentNode.getClass()==ASTCommandIfElse.class){
            ((ASTCommandIfElse)parentNode).thenNode=(ASTCommandIfThenNode) thisNode;
        }
    }

    @Override
    public void enterElsecommand(wrenParser.ElsecommandContext ctx) {
        nodeStack.push(new ASTCommandIfElseNode());
    }

    @Override
    public void exitElsecommand(wrenParser.ElsecommandContext ctx) {
        ASTNode thisNode = nodeStack.pop();
        ASTNode parentNode = nodeStack.peek();
       if(parentNode.getClass()==ASTCommandIfElse.class){
            ((ASTCommandIfElse)parentNode).elseNode=(ASTCommandIfElseNode) thisNode;
        }
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        //System.out.println(node.getSymbol());
       int id = node.getSymbol().getType();
       String text=node.getSymbol().getText();
       ASTNode parentNode=nodeStack.peek();

       switch (id){
           case 7:
           case 6:{
               if(parentNode.getClass() == ASTDeclaration.class){
                   ((ASTDeclaration)parentNode).ty=new ASTType(text);
               }
           }
           break;
           case 20:
           //true false
           case 18:
           case 19:
           case 37: {//num
               if(parentNode.getClass() == ASTExpression.class){
                   if(((ASTExpression) parentNode).lExpr==null){
                       ((ASTExpression) parentNode).lExpr = (ASTNode) new ASTNumeral(text);
                   }else {
                       ((ASTExpression) parentNode).rExpr = (ASTNode) new ASTNumeral(text);
                   }
               }
           }
           break;
           case 34://minus
               //and or
           case 17:
           case 16: {
               if (parentNode.getClass() == ASTExpression.class){
                   ((ASTExpression) parentNode).op=new ASTOperator(text);
               }
           }
           break;
           case 38: {
               if (parentNode.getClass() == ASTProgram.class) {
                   ((ASTProgram) parentNode).identifier = new ASTIdentifier(text);
               } else if (parentNode.getClass() == ASTDeclaration.class) {
                   if (((ASTDeclaration) parentNode).identifierList == null)
                       ((ASTDeclaration) parentNode).identifierList = new ArrayList<>();
                   ((ASTDeclaration) parentNode).identifierList.add(new ASTIdentifier(text));
               } else if (parentNode.getClass() == ASTCommandRead.class) {
                   ((ASTCommandRead) parentNode).identifier = new ASTIdentifier(text);
               }else if(parentNode.getClass() == ASTExpression.class){
                   if(((ASTExpression) parentNode).lExpr==null){
                       ((ASTExpression) parentNode).lExpr = (ASTNode) new ASTIdentifier(text);
                   }else {
                       ((ASTExpression) parentNode).rExpr = (ASTNode) new ASTIdentifier(text);
                   }
               }
//               else if (parentNode.getClass() == ASTCommandWrite.class) {
//                   ((ASTCommandWrite) parentNode).value = new ASTIdentifier(text);
//               }
               else if(parentNode.getClass() == ASTCommandExpr.class){
                   ((ASTCommandExpr) parentNode).identifier = new ASTIdentifier(text);
               }
           }
           break;
           default:
       }


    }



}
