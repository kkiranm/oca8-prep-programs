/*** Data Types ***/

/* 
Numeric Data Types

Integral Data Types in ascending order of size
byte = 1 byte
short = 2 bytes
int = 4 bytes
long = 8 bytes

Floating Data Types in ascending order of size
float = 4 bytes
double = 8 bytes
*/

public class DataTypes{
	public static void main(String[] args){
		//Byte and Short don't need any specific literal symbols
		byte b = 10;
		short s = 20;
		int i = 3543;
		int j = 35_436;//Allowed _ for clarity in number system - new feature in java 1.7
		int k = 0b100;//Allowed binary with 0b - new feature in java 1.7
		int a = 0323; //Octal base - allowed literal starting with a 0
		int x = 0xABCD; //Hex base - allowed literal starting with 0x followed by anything between A-F and 0-9
		
		//long needs a L or l at the end of the number to denote it's long data type
		long l = 12345678l;
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		System.out.println(a);
		System.out.println(x);
		
		//Implicit Type Conversion can happen from a lower data type to a higher datatype
		l = x;
		System.out.println(l);
		
		//Explicit Type Conversion can happen from a lower data type to a higher datatype
		x = (int)l;
		System.out.println(x);
		b=(byte)x;
		System.out.println(b);
		
		//Floating Point DataTypes
		float f = 10.5f; //Mandatory f or F to be added at the end of literal for Float
		double d = 20.45; //Double is the default literal
		System.out.println(f);
		System.out.println(d);
		
		d = f; //Allowed since upcasting from float to double
		System.out.println(d);
		f=(float)d; //Explicit Typecasting
		System.out.println(f);
		
/*

Non-numeric data types

char - 2 bytes
boolean - unknown size

*/
		char c = 'a';//allowed
		char ch = 54; //allowed
		char df = 0xABCD; //allowed
		char uc = '\u0456';//allowed unicode representation u followed by 4 digits
		char esc = '\n';//allowed escape character new line
		char tab = '\t';//allowed escape character tab
		System.out.println(c);
		System.out.println(ch);
		System.out.println(df);
		System.out.println(uc);
		System.out.println(esc);
		System.out.println(tab);
		
		boolean bool = false; //allowed
		boolean bool2 = true; //allowed
		
		System.out.println(bool);
		System.out.println(bool2);
		
		//Typecasting of chars to integral types is also allowed
		
		int newint = c;//c is a char variable and allowed to be casted to int
		System.out.println(newint);
		
		byte newbyte = (byte)c;
		System.out.println(newbyte);
		
	}
}
