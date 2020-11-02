/*
Public Class means file name should be same as the class
Normal class name can have any file name
javac sourceFileStructure.java
java A will give A 
java B will give B 
class without a main method cannot be run as JRE looks for main method to start execution
*/
class A {
	public static void main(String[] args){
		System.out.println("This is class A from sourceFileStructure.java file");
	}
}

class B {
	public static void main (String[] args){
		System.out.println("This is class B from sourceFileStructure.java file");
	}
}

class C {
	//This won't run
}