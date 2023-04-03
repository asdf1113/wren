package icgen;

import ast.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IcGen {
    public Integer temp=0;
    public static Integer lable=0;

    public void build(ASTNode tree){
        try{
            File file=new File("a.txt");
            if(!file.exists()){
                file.createNewFile();
            }else{
                file.delete();
            }

            FileWriter fileWriter=new FileWriter(file.getAbsoluteFile(),true);
            BufferedWriter bw= new BufferedWriter(fileWriter);



        String type = tree.type;

        switch (type){
            case "identifier":{
                bw.write("LOAD "+((ASTIdentifier)tree).name.toUpperCase()+"\n");
                bw.flush();
            }
            break;
            case "operator":{
                String name=((ASTOperator)tree).name;
                Integer temp2=temp+2;
                switch (name) {
                    case "+":{bw.write("ADD ");
                        bw.flush();
                    }

                       break;
                    case "-":{
                        bw.write("SUB ");
                        bw.flush();
                    }

                        break;
                    case "*":{
                        bw.write("MUL ");
                        bw.flush();
                    }

                        break;
                    case "/": {
                        bw.write("DIV ");
                        bw.flush();
                    }break;
                }
//                switch (name){
//                    case "+":bw.write("ADD T" + temp2.toString());break;
//                    case "-":bw.write("SUB T" + temp2.toString());break;
//                    case "*":bw.write("MUL T" + temp2.toString());break;
//                    case "/":bw.write("DIV T" + temp2.toString());break;
//                    case "<":{
//                        bw.write("SUB T" + temp2.toString());
//                        bw.write("TSTLT");
//                    }
//                    break;
//                    case "<=":{
//                        bw.write("SUB T" + temp2.toString());
//                        bw.write("TSTLE");
//                    }
//                    break;
//                    case "=":{
//                        bw.write("SUB T" + temp2.toString());
//                        bw.write("TSTEQ");
//                    }
//                    break;
//                    case ">":{
//                        bw.write("SUB T" + temp2.toString());
//                        bw.write("TSTGT");
//                    }
//                    break;
//                    case ">=":{
//                        bw.write("SUB T" + temp2.toString());
//                        bw.write("TSTGE");
//                    }break;
//                    case "<>":{
//                        bw.write("SUB T" + temp2.toString());
//                        bw.write("TSTNE");
//                    }
//                    break;
//                }
            }
            break;
            case "numeral":{
                String name=((ASTNumeral)tree).name;
                switch (name){
                    case "true":{bw.write("LOAD 1"+"\n");bw.flush();}
                        break;
                    case "false":{bw.write("LOAD 0"+"\n");bw.flush();}
                        break;
                    default:{bw.write("LOAD "+name+"\n");bw.flush();}
                }

            }
            break;
            case "expression":{
                Integer temp1 = temp + 1;
                Integer temp2 = temp + 2;
                if(((ASTExpression)tree).lExpr!=null){
                    if(((ASTExpression)tree).lExpr.name.equals("not")){
                        build(((ASTExpression)tree).rExpr);
                        bw.write("NOT"+"\n");
                        bw.flush();
                        return;
                    }
                    build(((ASTExpression)tree).lExpr);

                }
                if(((ASTExpression)tree).rExpr!=null) {
                    String op=((ASTExpression) tree).op.name;
                    if (((ASTExpression) (((ASTExpression) tree).rExpr)).rExpr == null) {
//                        build(((ASTExpression) tree).op);
//                        String type1=((ASTExpression) (((ASTExpression) tree).rExpr)).lExpr.type;
//                        String name1=((ASTExpression) (((ASTExpression) tree).rExpr)).lExpr.name;
//                        if(type1=="identifier")
//                            bw.write(name1.toUpperCase());
//                        else bw.write(name1);

                        switch (op){
                            case "and":{
                                bw.write("STO T"+temp1+"\n");
                                bw.flush();
                                build(((ASTExpression)tree).rExpr);
                                bw.write("AND T"+temp1+"\n");
                                bw.flush();
                            }break;
                            case "or":{
                                bw.write("STO T"+temp1+"\n");
                                bw.flush();
                                build(((ASTExpression)tree).rExpr);
                                bw.write("OR T"+temp1+"\n");
                                bw.flush();
                            }break;
                            case "<":{
                                bw.write("SUB ");
                                bw.flush();
                                String type1=((ASTExpression) (((ASTExpression) tree).rExpr)).lExpr.type;
                                String name1=((ASTExpression) (((ASTExpression) tree).rExpr)).lExpr.name;
                                if(type1=="identifier"){
                                    bw.write(name1.toUpperCase()+"\n");
                                    bw.flush();
                                }

                                else {bw.write(name1+"\n"); bw.flush();}
                            bw.write("TSTLT"+"\n");
                                bw.flush();
                    }
                    break;
                    case "<=":{
                        bw.write("SUB ");
                        bw.flush();
                        String type1=((ASTExpression) (((ASTExpression) tree).rExpr)).lExpr.type;
                        String name1=((ASTExpression) (((ASTExpression) tree).rExpr)).lExpr.name;
                        if(type1=="identifier") {
                            bw.write(name1.toUpperCase() + "\n");
                            bw.flush();
                        }
                        else {bw.write(name1+"\n"); bw.flush();}
                        bw.write("TSTLE"+"\n");
                        bw.flush();
                    }
                    break;
                    case "=":{
                        bw.write("SUB ");
                        bw.flush();
                        String type1=((ASTExpression) (((ASTExpression) tree).rExpr)).lExpr.type;
                        String name1=((ASTExpression) (((ASTExpression) tree).rExpr)).lExpr.name;
                        if(type1=="identifier"){
                            bw.write(name1.toUpperCase()+"\n");bw.flush();}
                        else {bw.write(name1+"\n");bw.flush();}
                        bw.write("TSTEQ"+"\n");
                        bw.flush();
                    }
                    break;
                    case ">":{
                        bw.write("SUB ");
                        bw.flush();
                        String type1=((ASTExpression) (((ASTExpression) tree).rExpr)).lExpr.type;
                        String name1=((ASTExpression) (((ASTExpression) tree).rExpr)).lExpr.name;
                        if(type1=="identifier") {
                            bw.write(name1.toUpperCase() + "\n");
                            bw.flush();
                        }
                        else{ bw.write(name1+"\n"); bw.flush();}
                        bw.write("TSTGT"+"\n");
                        bw.flush();
                    }
                    break;
                    case ">=":{
                        bw.write("SUB ");
                        bw.flush();
                        String type1=((ASTExpression) (((ASTExpression) tree).rExpr)).lExpr.type;
                        String name1=((ASTExpression) (((ASTExpression) tree).rExpr)).lExpr.name;
                        if(type1=="identifier"){
                            bw.write(name1.toUpperCase()+"\n");
                            bw.flush();}
                        else {bw.write(name1+"\n"); bw.flush();}
                        bw.write("TSTGE"+"\n");
                        bw.flush();
                    }break;
                    case "<>":{
                        bw.write("SUB ");
                        bw.flush();
                        String type1=((ASTExpression) (((ASTExpression) tree).rExpr)).lExpr.type;
                        String name1=((ASTExpression) (((ASTExpression) tree).rExpr)).lExpr.name;
                        if(type1=="identifier"){
                            bw.write(name1.toUpperCase()+"\n");bw.flush();}
                        else {bw.write(name1+"\n");bw.flush();}
                        bw.write("TSTNE"+"\n");
                        bw.flush();
                    }
                    break;
                            default:{
                                build(((ASTExpression) tree).op);
                        String type1=((ASTExpression) (((ASTExpression) tree).rExpr)).lExpr.type;
                        String name1=((ASTExpression) (((ASTExpression) tree).rExpr)).lExpr.name;
                        if(type1=="identifier"){
                            bw.write(name1.toUpperCase()+"\n");
                            bw.flush();}
                        else{ bw.write(name1+"\n");bw.flush();}
                            }
                        }
                    } else {
                        bw.write("STO T" + temp1.toString()+"\n");
                        bw.flush();
                        build(((ASTExpression) tree).rExpr);
                        bw.write("STO T" + temp2.toString()+"\n");
                        bw.flush();
                        bw.write("LOAD T" + temp1.toString()+"\n");
                        bw.flush();
                        switch (op){
                            case "and":{
                                bw.write("STO T"+temp1+"\n");
                                bw.flush();
                                build(((ASTExpression)tree).rExpr);
                                bw.write("AND T"+temp1+"\n");
                                bw.flush();
                            }break;
                            case "or":{
                                bw.write("STO T"+temp1+"\n");
                                bw.flush();
                                build(((ASTExpression)tree).rExpr);
                                bw.write("OR T"+temp1+"\n");
                                bw.flush();
                            }break;
                            case "<":{
                        bw.write("SUB T" + temp2.toString()+"\n");
                                bw.flush();
                        bw.write("TSTLT"+"\n");
                                bw.flush();
                    }
                    break;
                    case "<=":{
                        bw.write("SUB T" + temp2.toString()+"\n");
                        bw.flush();
                        bw.write("TSTLE"+"\n");
                        bw.flush();
                    }
                    break;
                    case "=":{
                        bw.write("SUB T" + temp2.toString()+"\n");
                        bw.flush();
                        bw.write("TSTEQ"+"\n");
                        bw.flush();
                    }
                    break;
                    case ">":{
                        bw.write("SUB T" + temp2.toString()+"\n");
                        bw.flush();
                        bw.write("TSTGT"+"\n");
                        bw.flush();
                    }
                    break;
                    case ">=":{
                        bw.write("SUB T" + temp2.toString()+"\n");
                        bw.flush();
                        bw.write("TSTGE"+"\n");
                        bw.flush();
                    }break;
                    case "<>":{
                        bw.write("SUB T" + temp2.toString()+"\n");
                        bw.flush();
                        bw.write("TSTNE"+"\n");
                        bw.flush();
                    }
                    break;
                            default:{
                                build(((ASTExpression) tree).op);
                                bw.write("T" + temp2.toString()+"\n");
                                bw.flush();
                            }
                        }

                        temp = temp1;
                    }
                }
            }
            break;
            case "program":{
                build(((ASTProgram)tree).block);
            }
            break;
            case "block":{
//                for(int i = 0; i<((ASTBlock)tree).declarationList.size(); i++){
//                    traval(((ASTBlock) tree).declarationList.get(i));
//                }
                for(int i=0;i<((ASTBlock)tree).commandList.size();i++){
                    build(((ASTBlock) tree).commandList.get(i));
                }
            }
            break;
            case "CommandRead":{
                bw.write("GET "+((ASTCommandRead)tree).identifier.name.toUpperCase()+"\n");
                bw.flush();
            }
            break;
            case "CommandWrite":{
                //traval(((ASTCommandWrite)tree).value);
                Integer temp1=temp+1;
                build(((ASTCommandWrite)tree).value);
                bw.write("STO"+" T"+temp1+"\n");
                bw.flush();
                bw.write("PUT"+" T"+temp1+"\n");
                bw.flush();
                temp++;
            }
            break;
            case "CommandExpr":{
                temp=0;
                build(((ASTCommandExpr)tree).expression);
                bw.write("STO "+((ASTCommandExpr)tree).identifier.name.toUpperCase()+"\n");
                bw.flush();
            }
            break;
            case"CommandSkip": {
                bw.write("NO-OP"+"\n");
                bw.flush();
            }
            case "CommandWhile":{
                Integer lable1=lable+1;
                Integer lable2=lable+2;
                lable=lable+2;
                bw.write("L"+lable1+" LABLE"+"\n");
                bw.flush();
                build(((ASTCommandWhile)tree).condi);
                bw.write("JF L"+lable2+"\n");
                bw.flush();
                for(int i=0;i<((ASTCommandWhile)tree).commandList.size();i++){
                    build(((ASTCommandWhile) tree).commandList.get(i));
                }
                bw.write("J L"+lable1+"\n");
                bw.flush();
                bw.write("L"+lable2+" LABLE"+"\n");
                bw.flush();

            }
            break;
            case "CommandIf":{
                Integer lable1=lable+1;
                lable=lable1;
                build(((ASTCommandIf)tree).condi);
                bw.write("JF L"+lable1+"\n");
                bw.flush();
                build(((ASTCommandIf)tree).thenNode);
                bw.write("L"+lable1+" LABLE"+"\n");
                bw.flush();
            }
            break;
            case "CommandIfElse":{
                Integer lable1=lable+1;
                Integer lable2=lable+2;
                lable=lable+2;
                build(((ASTCommandIfElse)tree).condi);
                bw.write("JF L"+lable1+"\n");
                bw.flush();
                build(((ASTCommandIfElse)tree).thenNode);
                bw.write("J L"+lable2+"\n");
                bw.flush();
                bw.write("L"+lable1+" LABLE"+"\n");
                bw.flush();
                build(((ASTCommandIfElse)tree).elseNode);
                bw.write("L"+lable2+" LABLE\n");
                bw.flush();

            }
            break;
            case "thenNode":{
                for(int i=0;i<((ASTCommandIfThenNode)tree).thenCommandList.size();i++){
                    build(((ASTCommandIfThenNode)tree).thenCommandList.get(i));
                }
            }
            break;
            case "ElseNode":{
                for(int i=0;i<((ASTCommandIfElseNode)tree).elseCommandList.size();i++){
                    build(((ASTCommandIfElseNode)tree).elseCommandList.get(i));
                }
            }
            break;

//
//            case "numeral":
//            case "type":


//
//            case"declaration":{
//                for(int i = 0; i<((ASTDeclaration)tree).identifierList.size(); i++){
//                    traval(((ASTDeclaration) tree).identifierList.get(i));
//                }
//                traval(((ASTDeclaration) tree).ty);
//            }
//            break;


//
//

//


            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }
        bw.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
