call runcrud.bat
if "%ERRORLEVEL%" == "0" goto website
echo.
echo Something went wrong.
goto fail

:website
start http://localhost:8080/crud/v1/tasks/getTasks
if "%ERRORLEVEL%" == "0" goto end
echo.
echo There were problems with browser.
goto fail

:fail
echo.
echo There were problems.

:end
echo.
echo Work is finished.