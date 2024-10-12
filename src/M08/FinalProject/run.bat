@echo off
rem Navigate to the directory of the batch file
cd /d "%~dp0"

rem Compile all Java files in the current directory
javac *.java

rem Check if the compilation was successful
if %errorlevel% neq 0 (
    echo Compilation failed. Please check for errors.
    pause
    exit /b
)

rem Run the Entry point class
java InventoryManager