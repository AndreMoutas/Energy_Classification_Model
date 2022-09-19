@echo OFF
set back=%cd%

FOR /d %%i in (C:\Github\*) do (
    cd "%%i"
    gradle wrapper --no-daemon
    gradlew lint --no-daemon

    for /R %%f in (lint-results-debug.xml) do @IF EXIST %%f (
        move %%f C:\Work\Outputs\Android-Lint-Final
        rename C:\Work\Outputs\Android-Lint-Final\lint-results-debug.xml %%~nxi.xml
    )

    for /R %%f in (lint-results.xml) do @IF EXIST %%f (
        move %%f C:\Work\Outputs\Android-Lint-Final
        rename C:\Work\Outputs\Android-Lint-Final\lint-results.xml %%~nxi.xml
    )

    @REM rename .\app\build\reports\lint-results-debug.xml %%~nxi.xml
    @REM move .\app\build\reports\%%~nxi.xml C:\Work\Outputs\Android

    @REM rename .\android\build\reports\lint-results-debug.xml %%~nxi.xml
    @REM move .\android\build\reports\%%~nxi.xml C:\Work\Outputs\Android

    @REM rename .\app\build\reports\lint-results.xml %%~nxi.xml
    @REM move .\app\build\reports\%%~nxi.xml C:\Work\Outputs\Android

    @REM rename .\android\build\reports\lint-results.xml %%~nxi.xml
    @REM move .\android\build\reports\%%~nxi.xml C:\Work\Outputs\Android
)
cd %back%