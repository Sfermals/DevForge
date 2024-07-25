@ECHO OFF
SETLOCAL

for /f tokens^=* %%i in ('where test:*')do  set FILE_NAME=%%~nxi


FOR /F "delims=" %%i IN ("%FILE_NAME%") DO (
ECHO fileextension=%%~xi
)