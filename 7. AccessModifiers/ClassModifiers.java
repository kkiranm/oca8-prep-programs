package pack1;
/*
Class Modifiers tell JVM whether a 
1. Class can be accessible from anywhere
2. Child class creation is possible
3. Object creation is possible

Only applicable top level modifiers:

public - can be accessed from anywhere
default - can be accessed within same package
final method - No method of parent class can be overriden by child class 
final class - cannot be inherited by a child class
abstract
strictfp

javac -d . ClassModifiers.java
javac -d . Test.java

java pack2.Test

*/
public class ClassModifiers{
	public void methodOne(){
		System.out.println("ClassModifiers Class: methodOne");
	}
}


