import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.*;

public class LoadWhitespace{
	
	public static class Whitespace extends whitespaceBaseListener{
		Stack<Integer>stack = new Stack<Integer>();
		
		public void exitPush(whitespaceParser.PushContext ctx){
			stack.push(ctx.parameter().value);
		}
		
		public void exitParameter(whitespaceParser.ParameterContext ctx){
			int num=ctx.getChildCount();
			ctx.value=0;
			for(int i=1;i<num;i++){
				if(ctx.getChild(i).getText().equals(" "))
				{	ctx.value+=0;
				}
				if(ctx.getChild(i).getText().equals("\t"))
				{	ctx.value+=Math.pow(2,num-2-i);
				}
			}
			if(ctx.getChild(0).getText()=="\t")
				ctx.value=-ctx.value;
		}
		
		public void exitOutchar(whitespaceParser.OutcharContext ctx){
			int x=stack.pop();
			char ch=(char)x;
			System.out.print(ch);
		}
	}
		
		public static void main(String[] args) throws Exception {
			String inputFile = null;
			if ( args.length>0 ) inputFile = args[0];
			InputStream is = System.in;
			if ( inputFile!=null ) {
				is = new FileInputStream(inputFile);
			}
			ANTLRInputStream input = new ANTLRInputStream(is);
			whitespaceLexer lexer = new whitespaceLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			whitespaceParser parser = new whitespaceParser(tokens);
			parser.setBuildParseTree(true);      // tell ANTLR to build a parse tree
			ParseTree tree = parser.file(); // parse
			// show tree in text form
			//System.out.println(tree.toStringTree(parser));

			ParseTreeWalker walker = new ParseTreeWalker();
			Whitespace ws = new Whitespace();
			walker.walk(ws, tree);
		//	System.out.println("stack result = "+eval.stack.pop());
		}
}