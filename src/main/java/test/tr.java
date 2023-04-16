package test;

import Acc.Acc;
import generateClass.MyClassLoader;
import generateClass.codeDump;
import icgen.IcGen;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import wrenT.wrenBaseListenerImpl;
import wrenT.wrenLexer;
import wrenT.wrenParser;

import java.io.FileOutputStream;

public class tr extends ClassLoader{
    public static void main(String[] args) {
        ANTLRInputStream inputStream= new ANTLRInputStream(
                "program multiply is\n" +
                "var m, n, product : integer;\n" +
                "begin\n" +
                "read m; read n;\n" +
                "product := 0;\n" +
                "while n>0 do\n" +
                "if 2*(n/2) <> n then \n" +
                "product := product + m\n" +
                "end if;\n" +
                "m := 2 * m;\n" +
                "n := n / 2\n" +
                "end while;\n" +
                "write product\n" +
                "end"
//                "program multiply is\n" +
//                        "var m, n, product : integer;\n" +
//                        "begin\n" +
//                        "read m; read n;\n" +
//                        "product := 0;\n" +
//                        "if m>n then\n" +
//                        "product := m-n\n" +
//                        "else product :=n-m\n" +
//                        "end if;\n" +
//                        "write product\n" +
//                        "end"
//                "program a is\n" +
//                        "var m, n, product : integer;\n" +
//                        "begin\n" +
//                        "read m; read n;\n" +
//                        "product := 0;\n" +
//                        "product :=m+n*3;\n" +
//                        "write product\n" +
//                        "end"
        );
        wrenLexer lexer = new wrenLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        wrenParser parser = new wrenParser(tokenStream);
        ParseTree parseTree = parser.prog();
        //System.out.println(parseTree.toStringTree(parser));

        ParseTreeWalker walker = new ParseTreeWalker();
        wrenBaseListenerImpl listener = new wrenBaseListenerImpl();
        walker.walk(listener,parseTree);

        //AST遍历测试
//        listener.traval(listener.getAstTree());

        //伪机器代码生成
        IcGen icGen=new IcGen();
        icGen.build(listener.getAstTree());

        //中间代码解释器
//        Acc myA=new Acc();
//        Integer a=myA.Inter();

        //生成字节码 a.class 并反射运行
        try {
            byte[] code = codeDump.dump();
            FileOutputStream fos = new FileOutputStream("a.class");
            fos.write(code);
            fos.close();

            tr loader = new tr();
            Class<?> exampleClass = loader.defineClass("Example", code, 0, code.length);
            exampleClass.getMethods()[0].invoke(null, new Object[] { null });

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
