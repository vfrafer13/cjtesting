set projectLocation=C:\Users\nezzi\IdeaProjects\CupcakeJemmaTesting
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
pause