package test;

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
        ANTLRInputStream inputStream= new ANTLRInputStream("program test is\n" +
                "    var a,b:integer;\n" +
                "begin\n" +
                "    skip;\n" +
                "    while not(c2) and (a<b) do a:=a+1 end while\n" +
                "end");
        wrenLexer lexer = new wrenLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        wrenParser parser = new wrenParser(tokenStream);
        ParseTree parseTree = parser.prog();
        //System.out.println(parseTree.toStringTree(parser));

        ParseTreeWalker walker = new ParseTreeWalker();
        wrenBaseListenerImpl listener = new wrenBaseListenerImpl();
        walker.walk(listener,parseTree);

        listener.traval(listener.getAstTree());


    }
}
