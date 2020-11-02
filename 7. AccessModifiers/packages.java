package com.mypack;
/*
Package statement should be the first statement in java file unless it is a comment

ONLY one package name is allowed
Any number of import statements are allowed
Any number of classes/interfaces/enum declarations are allowed

Empty java source file is a valid java program

javac someClass.java will create someClass.class in the cwd
javac -d . someClass.java will create the folder structure as per package 
and place class file in the folder designated

To run the class file, java com.mypack.someClass

*/
class someClass{
	public static void main(String[] args){
		System.out.println("Some Class Main Method");
	}
}