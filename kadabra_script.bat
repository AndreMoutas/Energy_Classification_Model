@echo OFF
set back=%cd%
FOR /d %%i in (C:\Github\*) do (
    java -jar C:\Tool\kadabra\kadabra\kadabra.jar -c C:\Tool\kadabra\kadabra_workspace/config.kadabra -p %%i
    rename results.json %%~nxi.json
    move %%~nxi.json C:\Work\Outputs\Kadabra-Final
)
cd %back%