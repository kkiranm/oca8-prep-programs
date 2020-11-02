/*
javac -d . ClassModifiers.java
javac -d . Test.java

java pack2.Test
*/
package pack2;
import pack1.ClassModifiers;

class Test{
	public static void main(String[] args){
		ClassModifiers classe = new ClassModifiers();
		classe.methodOne();
	}
}