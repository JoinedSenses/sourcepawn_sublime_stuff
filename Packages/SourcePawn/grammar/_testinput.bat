@echo off
set /p rule="Enter rule to begin from: "
cd .\.antlr\
echo Enter text to test and terminate with ctrl + z
grun SourcePawn %rule% -gui