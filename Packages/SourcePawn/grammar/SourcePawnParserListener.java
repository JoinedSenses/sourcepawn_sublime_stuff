// Generated from ./SourcePawnParser.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SourcePawnParser}.
 */
public interface SourcePawnParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SourcePawnParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(SourcePawnParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SourcePawnParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(SourcePawnParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link SourcePawnParser#pragma}.
	 * @param ctx the parse tree
	 */
	void enterPragma(SourcePawnParser.PragmaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SourcePawnParser#pragma}.
	 * @param ctx the parse tree
	 */
	void exitPragma(SourcePawnParser.PragmaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SourcePawnParser#pragmasemi}.
	 * @param ctx the parse tree
	 */
	void enterPragmasemi(SourcePawnParser.PragmasemiContext ctx);
	/**
	 * Exit a parse tree produced by {@link SourcePawnParser#pragmasemi}.
	 * @param ctx the parse tree
	 */
	void exitPragmasemi(SourcePawnParser.PragmasemiContext ctx);
	/**
	 * Enter a parse tree produced by {@link SourcePawnParser#pragmanewdecls}.
	 * @param ctx the parse tree
	 */
	void enterPragmanewdecls(SourcePawnParser.PragmanewdeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SourcePawnParser#pragmanewdecls}.
	 * @param ctx the parse tree
	 */
	void exitPragmanewdecls(SourcePawnParser.PragmanewdeclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SourcePawnParser#methodmap}.
	 * @param ctx the parse tree
	 */
	void enterMethodmap(SourcePawnParser.MethodmapContext ctx);
	/**
	 * Exit a parse tree produced by {@link SourcePawnParser#methodmap}.
	 * @param ctx the parse tree
	 */
	void exitMethodmap(SourcePawnParser.MethodmapContext ctx);
	/**
	 * Enter a parse tree produced by {@link SourcePawnParser#methodmapbody}.
	 * @param ctx the parse tree
	 */
	void enterMethodmapbody(SourcePawnParser.MethodmapbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SourcePawnParser#methodmapbody}.
	 * @param ctx the parse tree
	 */
	void exitMethodmapbody(SourcePawnParser.MethodmapbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SourcePawnParser#builtinstoragetype}.
	 * @param ctx the parse tree
	 */
	void enterBuiltinstoragetype(SourcePawnParser.BuiltinstoragetypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SourcePawnParser#builtinstoragetype}.
	 * @param ctx the parse tree
	 */
	void exitBuiltinstoragetype(SourcePawnParser.BuiltinstoragetypeContext ctx);
}