// Generated from whitespace.g4 by ANTLR 4.5.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link whitespaceParser}.
 */
public interface whitespaceListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link whitespaceParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(whitespaceParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link whitespaceParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(whitespaceParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link whitespaceParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(whitespaceParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link whitespaceParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(whitespaceParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link whitespaceParser#push}.
	 * @param ctx the parse tree
	 */
	void enterPush(whitespaceParser.PushContext ctx);
	/**
	 * Exit a parse tree produced by {@link whitespaceParser#push}.
	 * @param ctx the parse tree
	 */
	void exitPush(whitespaceParser.PushContext ctx);
	/**
	 * Enter a parse tree produced by {@link whitespaceParser#copy}.
	 * @param ctx the parse tree
	 */
	void enterCopy(whitespaceParser.CopyContext ctx);
	/**
	 * Exit a parse tree produced by {@link whitespaceParser#copy}.
	 * @param ctx the parse tree
	 */
	void exitCopy(whitespaceParser.CopyContext ctx);
	/**
	 * Enter a parse tree produced by {@link whitespaceParser#pop}.
	 * @param ctx the parse tree
	 */
	void enterPop(whitespaceParser.PopContext ctx);
	/**
	 * Exit a parse tree produced by {@link whitespaceParser#pop}.
	 * @param ctx the parse tree
	 */
	void exitPop(whitespaceParser.PopContext ctx);
	/**
	 * Enter a parse tree produced by {@link whitespaceParser#copynth}.
	 * @param ctx the parse tree
	 */
	void enterCopynth(whitespaceParser.CopynthContext ctx);
	/**
	 * Exit a parse tree produced by {@link whitespaceParser#copynth}.
	 * @param ctx the parse tree
	 */
	void exitCopynth(whitespaceParser.CopynthContext ctx);
	/**
	 * Enter a parse tree produced by {@link whitespaceParser#swicth}.
	 * @param ctx the parse tree
	 */
	void enterSwicth(whitespaceParser.SwicthContext ctx);
	/**
	 * Exit a parse tree produced by {@link whitespaceParser#swicth}.
	 * @param ctx the parse tree
	 */
	void exitSwicth(whitespaceParser.SwicthContext ctx);
	/**
	 * Enter a parse tree produced by {@link whitespaceParser#slide}.
	 * @param ctx the parse tree
	 */
	void enterSlide(whitespaceParser.SlideContext ctx);
	/**
	 * Exit a parse tree produced by {@link whitespaceParser#slide}.
	 * @param ctx the parse tree
	 */
	void exitSlide(whitespaceParser.SlideContext ctx);
	/**
	 * Enter a parse tree produced by {@link whitespaceParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(whitespaceParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link whitespaceParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(whitespaceParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link whitespaceParser#sub}.
	 * @param ctx the parse tree
	 */
	void enterSub(whitespaceParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by {@link whitespaceParser#sub}.
	 * @param ctx the parse tree
	 */
	void exitSub(whitespaceParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by {@link whitespaceParser#mult}.
	 * @param ctx the parse tree
	 */
	void enterMult(whitespaceParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by {@link whitespaceParser#mult}.
	 * @param ctx the parse tree
	 */
	void exitMult(whitespaceParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by {@link whitespaceParser#div}.
	 * @param ctx the parse tree
	 */
	void enterDiv(whitespaceParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by {@link whitespaceParser#div}.
	 * @param ctx the parse tree
	 */
	void exitDiv(whitespaceParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by {@link whitespaceParser#mod}.
	 * @param ctx the parse tree
	 */
	void enterMod(whitespaceParser.ModContext ctx);
	/**
	 * Exit a parse tree produced by {@link whitespaceParser#mod}.
	 * @param ctx the parse tree
	 */
	void exitMod(whitespaceParser.ModContext ctx);
	/**
	 * Enter a parse tree produced by {@link whitespaceParser#mark}.
	 * @param ctx the parse tree
	 */
	void enterMark(whitespaceParser.MarkContext ctx);
	/**
	 * Exit a parse tree produced by {@link whitespaceParser#mark}.
	 * @param ctx the parse tree
	 */
	void exitMark(whitespaceParser.MarkContext ctx);
	/**
	 * Enter a parse tree produced by {@link whitespaceParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(whitespaceParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link whitespaceParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(whitespaceParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link whitespaceParser#jump}.
	 * @param ctx the parse tree
	 */
	void enterJump(whitespaceParser.JumpContext ctx);
	/**
	 * Exit a parse tree produced by {@link whitespaceParser#jump}.
	 * @param ctx the parse tree
	 */
	void exitJump(whitespaceParser.JumpContext ctx);
	/**
	 * Enter a parse tree produced by {@link whitespaceParser#jumpz}.
	 * @param ctx the parse tree
	 */
	void enterJumpz(whitespaceParser.JumpzContext ctx);
	/**
	 * Exit a parse tree produced by {@link whitespaceParser#jumpz}.
	 * @param ctx the parse tree
	 */
	void exitJumpz(whitespaceParser.JumpzContext ctx);
	/**
	 * Enter a parse tree produced by {@link whitespaceParser#jumpn}.
	 * @param ctx the parse tree
	 */
	void enterJumpn(whitespaceParser.JumpnContext ctx);
	/**
	 * Exit a parse tree produced by {@link whitespaceParser#jumpn}.
	 * @param ctx the parse tree
	 */
	void exitJumpn(whitespaceParser.JumpnContext ctx);
	/**
	 * Enter a parse tree produced by {@link whitespaceParser#ends}.
	 * @param ctx the parse tree
	 */
	void enterEnds(whitespaceParser.EndsContext ctx);
	/**
	 * Exit a parse tree produced by {@link whitespaceParser#ends}.
	 * @param ctx the parse tree
	 */
	void exitEnds(whitespaceParser.EndsContext ctx);
	/**
	 * Enter a parse tree produced by {@link whitespaceParser#endp}.
	 * @param ctx the parse tree
	 */
	void enterEndp(whitespaceParser.EndpContext ctx);
	/**
	 * Exit a parse tree produced by {@link whitespaceParser#endp}.
	 * @param ctx the parse tree
	 */
	void exitEndp(whitespaceParser.EndpContext ctx);
	/**
	 * Enter a parse tree produced by {@link whitespaceParser#outchar}.
	 * @param ctx the parse tree
	 */
	void enterOutchar(whitespaceParser.OutcharContext ctx);
	/**
	 * Exit a parse tree produced by {@link whitespaceParser#outchar}.
	 * @param ctx the parse tree
	 */
	void exitOutchar(whitespaceParser.OutcharContext ctx);
	/**
	 * Enter a parse tree produced by {@link whitespaceParser#outnum}.
	 * @param ctx the parse tree
	 */
	void enterOutnum(whitespaceParser.OutnumContext ctx);
	/**
	 * Exit a parse tree produced by {@link whitespaceParser#outnum}.
	 * @param ctx the parse tree
	 */
	void exitOutnum(whitespaceParser.OutnumContext ctx);
	/**
	 * Enter a parse tree produced by {@link whitespaceParser#readchar}.
	 * @param ctx the parse tree
	 */
	void enterReadchar(whitespaceParser.ReadcharContext ctx);
	/**
	 * Exit a parse tree produced by {@link whitespaceParser#readchar}.
	 * @param ctx the parse tree
	 */
	void exitReadchar(whitespaceParser.ReadcharContext ctx);
	/**
	 * Enter a parse tree produced by {@link whitespaceParser#readnum}.
	 * @param ctx the parse tree
	 */
	void enterReadnum(whitespaceParser.ReadnumContext ctx);
	/**
	 * Exit a parse tree produced by {@link whitespaceParser#readnum}.
	 * @param ctx the parse tree
	 */
	void exitReadnum(whitespaceParser.ReadnumContext ctx);
	/**
	 * Enter a parse tree produced by {@link whitespaceParser#stack}.
	 * @param ctx the parse tree
	 */
	void enterStack(whitespaceParser.StackContext ctx);
	/**
	 * Exit a parse tree produced by {@link whitespaceParser#stack}.
	 * @param ctx the parse tree
	 */
	void exitStack(whitespaceParser.StackContext ctx);
	/**
	 * Enter a parse tree produced by {@link whitespaceParser#arithm}.
	 * @param ctx the parse tree
	 */
	void enterArithm(whitespaceParser.ArithmContext ctx);
	/**
	 * Exit a parse tree produced by {@link whitespaceParser#arithm}.
	 * @param ctx the parse tree
	 */
	void exitArithm(whitespaceParser.ArithmContext ctx);
	/**
	 * Enter a parse tree produced by {@link whitespaceParser#flow}.
	 * @param ctx the parse tree
	 */
	void enterFlow(whitespaceParser.FlowContext ctx);
	/**
	 * Exit a parse tree produced by {@link whitespaceParser#flow}.
	 * @param ctx the parse tree
	 */
	void exitFlow(whitespaceParser.FlowContext ctx);
	/**
	 * Enter a parse tree produced by {@link whitespaceParser#io}.
	 * @param ctx the parse tree
	 */
	void enterIo(whitespaceParser.IoContext ctx);
	/**
	 * Exit a parse tree produced by {@link whitespaceParser#io}.
	 * @param ctx the parse tree
	 */
	void exitIo(whitespaceParser.IoContext ctx);
	/**
	 * Enter a parse tree produced by {@link whitespaceParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(whitespaceParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link whitespaceParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(whitespaceParser.ParameterContext ctx);
}