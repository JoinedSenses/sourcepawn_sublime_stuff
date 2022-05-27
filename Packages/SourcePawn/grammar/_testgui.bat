@echo off
set /p testfile="Enter file to test: "
cd .\.antlr\
grun SourcePawn compilationUnit ..\testinput\%testfile%.sp -gui