package generateClass;

import jdk.internal.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.Label;
import jdk.internal.org.objectweb.asm.MethodVisitor;
import jdk.internal.org.objectweb.asm.Opcodes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class codeDump implements Opcodes {

    public static byte[] dump() throws Exception {
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES);
        cw.visit(V1_8,ACC_PUBLIC|ACC_SUPER, "Example", null,"java/lang/Object",null);
        {
            MethodVisitor mv1 = cw.visitMethod(ACC_PUBLIC,"<init>","()V",null,null);
            mv1.visitCode();
            mv1.visitVarInsn(ALOAD,0);
            mv1.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>","()V", false);
            mv1.visitInsn(RETURN);
            mv1.visitMaxs(1,1);
            mv1.visitEnd();
        }

        {
            MethodVisitor mv2 = cw.visitMethod(ACC_PUBLIC + ACC_STATIC, "main", "([Ljava/lang/String;)V", null, null);
            mv2.visitCode();

            //Scanner
            mv2.visitTypeInsn(NEW, "java/util/Scanner");
            mv2.visitInsn(DUP);
            mv2.visitFieldInsn(GETSTATIC, "java/lang/System", "in", "Ljava/io/InputStream;");
            mv2.visitMethodInsn(INVOKESPECIAL, "java/util/Scanner", "<init>", "(Ljava/io/InputStream;)V", false);
            mv2.visitVarInsn(ASTORE, 1);

            {
                File file=new File("a.txt");
                BufferedReader reader=null;
                String tempString=null;
                String res[]=null;

                int tempNum=2;//记录local varible数量
                int jType=0;//记录跳转种类
                Label [] labelList = new Label[100];
                for(int i=0;i<100;i++){
                    labelList[i] = new Label();
                }
                Map<String,Integer> env = new HashMap<>(); //名字-序号

                reader = new BufferedReader(new FileReader(file));
                while ((tempString = reader.readLine()) != null) {
                    res = tempString.split(" ");
                    switch (res[0]) {
                        case "LOAD": {
                            if (isNumber(res[1])) {
                                mv2.visitIntInsn(SIPUSH, Integer.valueOf(res[1]));
                            } else {
                                mv2.visitVarInsn(ILOAD, env.get(res[1]));
                            }
                        }
                        break;
                        case "STO": {
                            //如果不存在，插入，返回null;存在返回value
                            if (env.putIfAbsent(res[1], tempNum) == null) tempNum++;
                            mv2.visitVarInsn(ISTORE, env.get(res[1]));
                        }
                        break;
                        case "GET": {
                            if (env.putIfAbsent(res[1], tempNum) == null) tempNum++;
                            mv2.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
                            mv2.visitLdcInsn("Enter value " + res[1].toLowerCase() + ": ");
                            mv2.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);
                            mv2.visitVarInsn(ALOAD, 1);
                            mv2.visitMethodInsn(INVOKEVIRTUAL, "java/util/Scanner", "nextInt", "()I", false);
                            mv2.visitVarInsn(ISTORE, env.get(res[1]));
                        }
                        break;
                        case "PUT": {
                            mv2.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
                            mv2.visitVarInsn(ILOAD, env.get(res[1]));
                            mv2.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(I)V", false);
                        }
                        break;
                        case "ADD": {
                            if (isNumber(res[1])) {
                                mv2.visitIntInsn(SIPUSH, Integer.valueOf(res[1]));
                            } else {
                                mv2.visitVarInsn(ILOAD, env.get(res[1]));
                            }
                            mv2.visitInsn(IADD);
                        }
                        break;
                        case "SUB": {
                            if (isNumber(res[1])) {
                                mv2.visitIntInsn(SIPUSH, Integer.valueOf(res[1]));
                            } else {
                                mv2.visitVarInsn(ILOAD, env.get(res[1]));
                            }
                            mv2.visitInsn(ISUB);
                        }
                        break;
                        case "MUL": {
                            if (isNumber(res[1])) {
                                mv2.visitIntInsn(SIPUSH, Integer.valueOf(res[1]));
                            } else {
                                mv2.visitVarInsn(ILOAD, env.get(res[1]));
                            }
                            mv2.visitInsn(IMUL);
                        }
                        break;
                        case "DIV": {
                            if (isNumber(res[1])) {
                                mv2.visitIntInsn(SIPUSH, Integer.valueOf(res[1]));
                            } else {
                                mv2.visitVarInsn(ILOAD, env.get(res[1]));
                            }
                            mv2.visitInsn(IDIV);
                        }
                        break;
                        case "AND": {
                            if (isNumber(res[1])) {
                                mv2.visitIntInsn(SIPUSH, Integer.valueOf(res[1]));
                            } else {
                                mv2.visitVarInsn(ILOAD, env.get(res[1]));
                            }
                            mv2.visitInsn(IAND);
                        }
                        break;
                        case "OR": {
                            if (isNumber(res[1])) {
                                mv2.visitIntInsn(SIPUSH, Integer.valueOf(res[1]));
                            } else {
                                mv2.visitVarInsn(ILOAD, env.get(res[1]));
                            }
                            mv2.visitInsn(IOR);
                        }
                        break;
                        case "NOT": {
                            mv2.visitInsn(INEG);
                        }
                        break;

                        case "J":{
                            char a[] = res[1].toCharArray();
                            int i = a[1]-'0';
                            mv2.visitJumpInsn(GOTO, labelList[i]);
                        }break;
                        case "TSTGT":{ //Test if Acc Greater Than zero
                            jType=1;//ifle
                        }break;
                        case "TSTLT":{ //Test if Acc Less Than zero
                            jType=2;//>= ifge
                        }break;
                        case "TSTLE":{//Test if Acc Less than or Equal zero
                            jType=3;//> ifgt
                        }break;
                        case "TSTNE":{//!=
                            jType=4;//= ifeq
                        }break;
                        case "TSTEQ":{//=
                            jType=5;//!= ifne
                        }break;
                        case "TSTGE":{//>=
                            jType=6;//< iflt
                        }break;
                        case "JF":{
                            char a[] = res[1].toCharArray();
                            int i = a[1]-'0';
//                            System.out.println("here!!:  "+i);
                            switch (jType){
                                case 1:{
                                    mv2.visitJumpInsn(IFLE, labelList[i]);
                                }break;
                                case 2:{
                                    mv2.visitJumpInsn(IFGE, labelList[i]);
                                }break;
                                case 3:{
                                    mv2.visitJumpInsn(IFGT, labelList[i]);
                                }break;
                                case 4:{
                                    mv2.visitJumpInsn(IFEQ, labelList[i]);
                                }break;
                                case 5:{
                                    mv2.visitJumpInsn(IFNE, labelList[i]);
                                }break;
                                case 6:{
                                    mv2.visitJumpInsn(IFLT, labelList[i]);
                                }break;
                                default:jType=0;
                            }
                            jType=0;
                        }break;
                        case "NO-OP": {
                        }
                        break;
                        case "HALT": {
                        }
                        break;
//                        case "LABLE":{
//                            char a[] = res[0].toCharArray();
//                            int i = a[1]-'0';
//                            mv2.visitLabel(labelList[i]);
//                        }break;
                        default: {
                            if(res[1].equals("LABLE")){
//                                System.out.println("lable!!!");
                                char a[] = res[0].toCharArray();
                                int i = a[1]-'0';
                                mv2.visitLabel(labelList[i]);
                            }else{
                                System.out.println("erro!!!");
                                System.out.println("here is the wrong code: "+res[0]+" "+res[1]);
                            }
                        }
                    }
                }
            }
                        //return
            mv2.visitInsn(RETURN);

            mv2.visitMaxs(1, 1);
            mv2.visitEnd();
        }

        cw.visitEnd();
        return cw.toByteArray();

    }

    static boolean isNumber (String str){
        Pattern pattern = Pattern.compile("-?[0-9]+(\\\\.[0-9]+)?");
        Matcher m = pattern.matcher(str);
        return m.matches();
    }

}
