call "..\!!nand2tetris\tools\JackCompiler.bat" "%~dp0\Snake"

java -classpath "%~dp0\..\!!nand2tetris-sources\out\production\!!nand2tetris-sources" VMEmulatorMain "%~dp0\Snake"

pause