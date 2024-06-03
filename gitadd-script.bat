@echo off
setlocal

:: Check if folder name is provided
if "%~1"=="" (
  echo Thêm tên project.
  echo Usage: %0 folder_name
  exit /b 1
)


:: Folder name provided as argument
set "FOLDER_NAME=%~1"

echo Adding files from %FOLDER_NAME%

:: Add specific folders and files
git add  %FOLDER_NAME%/src
git add  %FOLDER_NAME%/.mvn
git add  %FOLDER_NAME%/mvnw
git add  %FOLDER_NAME%/mvnw.cmd
git add  %FOLDER_NAME%/pom.xml

echo Files added to git successfully from %PROJECT_PATH%.

endlocal
