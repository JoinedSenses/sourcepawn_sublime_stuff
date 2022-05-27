@echo off
Title Compile SourcePawn Grammar
start /B cmd /c "antlr4 ./SourcePawnLexer.g4 -Dlanguage=Python3 -o . & antlr4 ./SourcePawnParser.g4 -Dlanguage=Python3 -o . & pause"
start /B cmd /c "antlr4 ./SourcePawnLexer.g4 -o ./.antlr & antlr4 ./SourcePawnParser.g4 -o ./.antlr & javac -d ./.antlr ./.antlr/SourcePawn*.java & pause"