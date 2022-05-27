// Generated from ./SourcePawnParser.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SourcePawnParser}.
 */
public interface SourcePawnParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SourcePawnParser#visibility}.
	 * @param ctx the parse tree
	 */
	void enterVisibility(SourcePawnParser.VisibilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link SourcePawnParser#visibility}.
	 * @param ctx the parse tree
	 */
	void exitVisibility(SourcePawnParser.VisibilityContext ctx);
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
	 * Enter a parse tree produced by {@link SourcePawnParser#methodmapInheritance}.
	 * @param ctx the parse tree
	 */
	void enterMethodmapInheritance(SourcePawnParser.MethodmapInheritanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SourcePawnParser#methodmapInheritance}.
	 * @param ctx the parse tree
	 */
	void exitMethodmapInheritance(SourcePawnParser.MethodmapInheritanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SourcePawnParser#methodmapItem}.
	 * @param ctx the parse tree
	 */
	void enterMethodmapItem(SourcePawnParser.MethodmapItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SourcePawnParser#methodmapItem}.
	 * @param ctx the parse tree
	 */
	void exitMethodmapItem(SourcePawnParser.MethodmapItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SourcePawnParser#methodmapPropertyDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethodmapPropertyDecl(SourcePawnParser.MethodmapPropertyDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SourcePawnParser#methodmapPropertyDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethodmapPropertyDecl(SourcePawnParser.MethodmapPropertyDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SourcePawnParser#methodmapPropertyImpl}.
	 * @param ctx the parse tree
	 */
	void enterMethodmapPropertyImpl(SourcePawnParser.MethodmapPropertyImplContext ctx);
	/**
	 * Exit a parse tree produced by {@link SourcePawnParser#methodmapPropertyImpl}.
	 * @param ctx the parse tree
	 */
	void exitMethodmapPropertyImpl(SourcePawnParser.MethodmapPropertyImplContext ctx);
	/**
	 * Enter a parse tree produced by {@link SourcePawnParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(SourcePawnParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SourcePawnParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(SourcePawnParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SourcePawnParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(SourcePawnParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SourcePawnParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(SourcePawnParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SourcePawnParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(SourcePawnParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SourcePawnParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(SourcePawnParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SourcePawnParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol(SourcePawnParser.SymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link SourcePawnParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol(SourcePawnParser.SymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link SourcePawnParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SourcePawnParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SourcePawnParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SourcePawnParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SourcePawnParser#builtin_type}.
	 * @param ctx the parse tree
	 */
	void enterBuiltin_type(SourcePawnParser.Builtin_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SourcePawnParser#builtin_type}.
	 * @param ctx the parse tree
	 */
	void exitBuiltin_type(SourcePawnParser.Builtin_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SourcePawnParser#commaExpr}.
	 * @param ctx the parse tree
	 */
	void enterCommaExpr(SourcePawnParser.CommaExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SourcePawnParser#commaExpr}.
	 * @param ctx the parse tree
	 */
	void exitCommaExpr(SourcePawnParser.CommaExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SourcePawnParser#definedArg}.
	 * @param ctx the parse tree
	 */
	void enterDefinedArg(SourcePawnParser.DefinedArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SourcePawnParser#definedArg}.
	 * @param ctx the parse tree
	 */
	void exitDefinedArg(SourcePawnParser.DefinedArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SourcePawnParser#sizeofArg}.
	 * @param ctx the parse tree
	 */
	void enterSizeofArg(SourcePawnParser.SizeofArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SourcePawnParser#sizeofArg}.
	 * @param ctx the parse tree
	 */
	void exitSizeofArg(SourcePawnParser.SizeofArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SourcePawnParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SourcePawnParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SourcePawnParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SourcePawnParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SourcePawnParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(SourcePawnParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SourcePawnParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(SourcePawnParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SourcePawnParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(SourcePawnParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SourcePawnParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(SourcePawnParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SourcePawnParser#typedef}.
	 * @param ctx the parse tree
	 */
	void enterTypedef(SourcePawnParser.TypedefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SourcePawnParser#typedef}.
	 * @param ctx the parse tree
	 */
	void exitTypedef(SourcePawnParser.TypedefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SourcePawnParser#typeset}.
	 * @param ctx the parse tree
	 */
	void enterTypeset(SourcePawnParser.TypesetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SourcePawnParser#typeset}.
	 * @param ctx the parse tree
	 */
	void exitTypeset(SourcePawnParser.TypesetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SourcePawnParser#fullTypedefExpression}.
	 * @param ctx the parse tree
	 */
	void enterFullTypedefExpression(SourcePawnParser.FullTypedefExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SourcePawnParser#fullTypedefExpression}.
	 * @param ctx the parse tree
	 */
	void exitFullTypedefExpression(SourcePawnParser.FullTypedefExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SourcePawnParser#typedefExpression}.
	 * @param ctx the parse tree
	 */
	void enterTypedefExpression(SourcePawnParser.TypedefExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SourcePawnParser#typedefExpression}.
	 * @param ctx the parse tree
	 */
	void exitTypedefExpression(SourcePawnParser.TypedefExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SourcePawnParser#nativeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterNativeDefinition(SourcePawnParser.NativeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SourcePawnParser#nativeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitNativeDefinition(SourcePawnParser.NativeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SourcePawnParser#forwardDefinition}.
	 * @param ctx the parse tree
	 */
	void enterForwardDefinition(SourcePawnParser.ForwardDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SourcePawnParser#forwardDefinition}.
	 * @param ctx the parse tree
	 */
	void exitForwardDefinition(SourcePawnParser.ForwardDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SourcePawnParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(SourcePawnParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SourcePawnParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(SourcePawnParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SourcePawnParser#functionCallback}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallback(SourcePawnParser.FunctionCallbackContext ctx);
	/**
	 * Exit a parse tree produced by {@link SourcePawnParser#functionCallback}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallback(SourcePawnParser.FunctionCallbackContext ctx);
	/**
	 * Enter a parse tree produced by {@link SourcePawnParser#methodArgs}.
	 * @param ctx the parse tree
	 */
	void enterMethodArgs(SourcePawnParser.MethodArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SourcePawnParser#methodArgs}.
	 * @param ctx the parse tree
	 */
	void exitMethodArgs(SourcePawnParser.MethodArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SourcePawnParser#methodArgsNoAssign}.
	 * @param ctx the parse tree
	 */
	void enterMethodArgsNoAssign(SourcePawnParser.MethodArgsNoAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SourcePawnParser#methodArgsNoAssign}.
	 * @param ctx the parse tree
	 */
	void exitMethodArgsNoAssign(SourcePawnParser.MethodArgsNoAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link SourcePawnParser#methodArgDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethodArgDecl(SourcePawnParser.MethodArgDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SourcePawnParser#methodArgDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethodArgDecl(SourcePawnParser.MethodArgDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SourcePawnParser#methodArgAssigment}.
	 * @param ctx the parse tree
	 */
	void enterMethodArgAssigment(SourcePawnParser.MethodArgAssigmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SourcePawnParser#methodArgAssigment}.
	 * @param ctx the parse tree
	 */
	void exitMethodArgAssigment(SourcePawnParser.MethodArgAssigmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SourcePawnParser#methodArg}.
	 * @param ctx the parse tree
	 */
	void enterMethodArg(SourcePawnParser.MethodArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SourcePawnParser#methodArg}.
	 * @param ctx the parse tree
	 */
	void exitMethodArg(SourcePawnParser.MethodArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SourcePawnParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(SourcePawnParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SourcePawnParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(SourcePawnParser.MethodBodyContext ctx);
}