@echo off
CALL:MYPING
EXIT /B %ERRORLEVEL%

:MYPING
set /p MYIP="IP Address: "
ping %MYIP%
EXIT /B 0