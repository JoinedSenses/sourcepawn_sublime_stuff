# Generated from c:\Users\Arron\AppData\Roaming\Sublime Text\Packages\SourcePawn\grammar\SourcePawnParser.g4 by ANTLR 4.10.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .SourcePawnParser import SourcePawnParser
else:
    from SourcePawnParser import SourcePawnParser

# This class defines a complete generic visitor for a parse tree produced by SourcePawnParser.

class SourcePawnParserVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by SourcePawnParser#visibility.
    def visitVisibility(self, ctx:SourcePawnParser.VisibilityContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SourcePawnParser#methodmap.
    def visitMethodmap(self, ctx:SourcePawnParser.MethodmapContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SourcePawnParser#methodmapInheritance.
    def visitMethodmapInheritance(self, ctx:SourcePawnParser.MethodmapInheritanceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SourcePawnParser#methodmapItem.
    def visitMethodmapItem(self, ctx:SourcePawnParser.MethodmapItemContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SourcePawnParser#methodmapPropertyDecl.
    def visitMethodmapPropertyDecl(self, ctx:SourcePawnParser.MethodmapPropertyDeclContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SourcePawnParser#methodmapPropertyImpl.
    def visitMethodmapPropertyImpl(self, ctx:SourcePawnParser.MethodmapPropertyImplContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SourcePawnParser#compilationUnit.
    def visitCompilationUnit(self, ctx:SourcePawnParser.CompilationUnitContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SourcePawnParser#definition.
    def visitDefinition(self, ctx:SourcePawnParser.DefinitionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SourcePawnParser#declaration.
    def visitDeclaration(self, ctx:SourcePawnParser.DeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SourcePawnParser#symbol.
    def visitSymbol(self, ctx:SourcePawnParser.SymbolContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SourcePawnParser#type.
    def visitType(self, ctx:SourcePawnParser.TypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SourcePawnParser#builtin_type.
    def visitBuiltin_type(self, ctx:SourcePawnParser.Builtin_typeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SourcePawnParser#commaExpr.
    def visitCommaExpr(self, ctx:SourcePawnParser.CommaExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SourcePawnParser#definedArg.
    def visitDefinedArg(self, ctx:SourcePawnParser.DefinedArgContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SourcePawnParser#sizeofArg.
    def visitSizeofArg(self, ctx:SourcePawnParser.SizeofArgContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SourcePawnParser#expr.
    def visitExpr(self, ctx:SourcePawnParser.ExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SourcePawnParser#literal.
    def visitLiteral(self, ctx:SourcePawnParser.LiteralContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SourcePawnParser#assignmentOperator.
    def visitAssignmentOperator(self, ctx:SourcePawnParser.AssignmentOperatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SourcePawnParser#typedef.
    def visitTypedef(self, ctx:SourcePawnParser.TypedefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SourcePawnParser#typeset.
    def visitTypeset(self, ctx:SourcePawnParser.TypesetContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SourcePawnParser#fullTypedefExpression.
    def visitFullTypedefExpression(self, ctx:SourcePawnParser.FullTypedefExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SourcePawnParser#typedefExpression.
    def visitTypedefExpression(self, ctx:SourcePawnParser.TypedefExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SourcePawnParser#nativeDefinition.
    def visitNativeDefinition(self, ctx:SourcePawnParser.NativeDefinitionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SourcePawnParser#forwardDefinition.
    def visitForwardDefinition(self, ctx:SourcePawnParser.ForwardDefinitionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SourcePawnParser#functionDeclaration.
    def visitFunctionDeclaration(self, ctx:SourcePawnParser.FunctionDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SourcePawnParser#functionCallback.
    def visitFunctionCallback(self, ctx:SourcePawnParser.FunctionCallbackContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SourcePawnParser#methodArgs.
    def visitMethodArgs(self, ctx:SourcePawnParser.MethodArgsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SourcePawnParser#methodArgsNoAssign.
    def visitMethodArgsNoAssign(self, ctx:SourcePawnParser.MethodArgsNoAssignContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SourcePawnParser#methodArgDecl.
    def visitMethodArgDecl(self, ctx:SourcePawnParser.MethodArgDeclContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SourcePawnParser#methodArgAssigment.
    def visitMethodArgAssigment(self, ctx:SourcePawnParser.MethodArgAssigmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SourcePawnParser#methodArg.
    def visitMethodArg(self, ctx:SourcePawnParser.MethodArgContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SourcePawnParser#methodBody.
    def visitMethodBody(self, ctx:SourcePawnParser.MethodBodyContext):
        return self.visitChildren(ctx)



del SourcePawnParser