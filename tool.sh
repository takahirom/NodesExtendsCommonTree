rm -R output
java org.antlr.Tool -o output simple.g 
cd output
cp ../source/* ./
javac Test.java
java Test a.txt
