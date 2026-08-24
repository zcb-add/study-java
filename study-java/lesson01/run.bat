@echo off
cd /d %~dp0
javac -encoding UTF-8 Practice.java
java -Dfile.encoding=UTF-8 Practice
pause
