# Generated from c:\Users\Arron\AppData\Roaming\Sublime Text\Packages\SourcePawn\grammar\SourcePawnParser.g4 by ANTLR 4.10.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .SourcePawnParser import SourcePawnParser
else:
    from SourcePawnParser import SourcePawnParser

# This class defines a complete generic visitor for a parse tree produced by SourcePawnParser.

class SourcePawnParserVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by SourcePawnParser#start.
    def visitStart(self, ctx:SourcePawnParser.StartContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SourcePawnParser#methodmap.
    def visitMethodmap(self, ctx:SourcePawnParser.MethodmapContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SourcePawnParser#methodmapbody.
    def visitMethodmapbody(self, ctx:SourcePawnParser.MethodmapbodyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SourcePawnParser#builtinstoragetype.
    def visitBuiltinstoragetype(self, ctx:SourcePawnParser.BuiltinstoragetypeContext):
        return self.visitChildren(ctx)



del SourcePawnParser