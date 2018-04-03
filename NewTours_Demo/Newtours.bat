@echo off
setlocal
set ProjectPath=%~dp0
echo %ProjectPath%
cd %~dp0
mvn test -Dtest=TestRunner -DBatchFile=%~f0
pause
:q