package test;

import Acc.Acc;
import icgen.IcGen;
import org.antlr.v4.runtime.ANTLRErrorStrategy;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import wrenT.wrenBaseListenerImpl;
import wrenT.wrenLexer;
import wrenT.wrenParser;

public class tr {
    public static void main(String[] args) {
        ANTLRInputStream inputStream= new ANTLRInputStream("program gcd is\n" +
                "var m,n : integer;\n" +
                "begin\n" +
                "read m; read n;\n" +
                "while m <> n do\n" +
                "if m < n then n := n-m\n" +
                "else m := m-n\n" +
                "end if\n" +
                "end while;\n" +
                "write m\n" +
                "end");
        wrenLexer lexer = new wrenLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        wrenParser parser = new wrenParser(tokenStream);
        ParseTree parseTree = parser.prog();
        //System.out.println(parseTree.toStringTree(parser));

        ParseTreeWalker walker = new ParseTreeWalker();
        wrenBaseListenerImpl listener = new wrenBaseListenerImpl();
        walker.walk(listener,parseTree);

//        listener.traval(listener.getAstTree());

        IcGen icGen=new IcGen();
        icGen.build(listener.getAstTree());
            Acc myA=new Acc();
            Integer a=myA.Inter();
            //System.out.println(a);
//        int m=12,n=16;
//        while(m!=n){
//            if(m<n) n=n-m;
//            else m=m-n;
//        }
//        System.out.println(m);

    }
}
