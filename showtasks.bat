call runcrud.bat
if "%ERRORLEVEL%" == "0" goto website
echo.
echo Something went wrong.
goto fail

:website
start https://floating-anchorage-64751.herokuapp.com/v1/tasks
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