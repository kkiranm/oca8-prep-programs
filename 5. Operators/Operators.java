public class Operators{
	/***
	Increment and Decrement
	Arithmetic
	String Concatenation
	Relational
	Equality
	Bitwise
	Short Circuit
	instanceOf
	Type Cast
	Assignment
	Conditional
	new
	[]
	***/
	public static void main(String[] args){
		int x=0;
		int y=0;
		System.out.println(x++); //Post increment - it means system.out.prinln will act on x first and then ++ will be executed
		System.out.println(y--); //Post decrement - it means system.out.prinln will act on y first and then -- will be executed
		System.out.println(x);// now x value is 1 from post increment that has already happened
		System.out.println(y);// now y value is -1 from post decrement that has already happened
		
		int a = 0;
		int b = 0;
		System.out.println(++a);//Pre increment - it first acts on ++ and then prints a
		System.out.println(--b);//Pre decrement - it first acts on -- and then prints b
		//Increment and decrement operators work only on variables, not values
		// System.out.println(++(++a));//This won't execute as the inner ++a evaluates to a value first
		
		
		//Arithmetic Operators always evaluate to either int or higher. 
		//Hence, typecasting is required if it's being performed on lower datatypes
		
		byte b1 = 9;
		byte b2 = 10;
		// byte b3 = b1+b2;//Not possible since int is being assigned to byte
		byte b3 = (byte)(b1+b2);
		System.out.println(b3);
		// b2 = b1+1;//Also won't compile since b1+1 evaluates to an int
		int i2 = b1+1;//Compiles since b1+1 evaluates to an int
		
		//When ++ or -- are used on smaller datatypes, internal typecasting happens automatically and it will compile
		System.out.println(++b1);
		
		int a1=1;
		int a2=2;
		System.out.println(a1+a2);
		System.out.println(a1-a2);
		System.out.println(a1*a2);
		System.out.println(a1/a2);
		System.out.println(a1%a2);
		
		float f1 = 10f;
		// System.out.println(a1/0);//Runtime exception as /0
		System.out.println(f1/0);//Possible since floating point can display infinity
		
		//String Concatenation Operator +
		//From left to right
		System.out.println(a1+a2+" String "+f1);//will print sum of a1 and a2 followed by string and f1
		
		// Relational > >= < <= 
		//Applicable on all Primitive datatypes except for boolean
		System.out.println(10>20);
		System.out.println(10.5>20);
		System.out.println((byte)10>(byte)20);
		System.out.println('a'>'b');
		// System.out.println(10>20>30);//Nesting is not allowed
		
		// Equality ==, !=
		System.out.println(10==10);
		System.out.println(10!=20);
		
		Operators o1 = new Operators();
		Operators o2 = new Operators();
		System.out.println(o1==o2);
		Operators o3 = o2;
		System.out.println(o2==o3);//Reference Variable comparison is allowed for == and !=
		
		//Difference between == and .equals for strings
		
		String s1 = new String("Kiran");
		String s2 = new String("Kiran");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2); //Both are different objects hence this will return false
		System.out.println(s1.equals(s2)); //.equals compares the internal string value of objects, hence this will return true
				
		// Bitwise & | ^
		// And, OR and XOR
		//AND - both should be true
		//OR - one of the values should be true
		//XOR - both should not be the same
		
		System.out.println(true&false);//False since both are not true
		System.out.println(true|false);//True since one of them is true
		System.out.println(true^false);//True since both are not same
		
		//Bitwise operators applicable to integral values too
		System.out.println(4&5);
		System.out.println(4|5);
		System.out.println(4^5);
		
		//Bitwise Compliment Operator ~ - allowed for only integral data types
		System.out.println(~4);
		
		//Boolean Compliment Operator ! is applicable to only boolean datatype
		System.out.println(!true);
	
		// Short Circuit && and ||
		// & and | - need both the values to be evaluated whereas for && and ||, second argument evaluation is optional
		int sc1 = 10, sc2 = 15;
		if(++sc1 < 10 & ++sc2 > 15){
			++sc1;
		} else {
			++sc2;
		}
		System.out.println(sc1+""+sc2);
		//In this example, both the statements on either side of & are evaluated although first one is wrong
		
				
		// instanceof
		System.out.println(o3 instanceof Operators);

		// Assignment 
		//Simple, Chained and Compound
		int ss1=5;//Simple
		
		
		// int ss2=ss3=10; //Not possible to use chained assignment while declaring
		int ss2,ss3;
		ss2 = ss3 = 10;//Chained
		System.out.println(ss2+" "+ss3);
		
		int ss4 = 3;
		ss4 += ss3;//Compound Assignment
		System.out.println(ss4);
						
		// Conditional ?:
		//(Condition)?Value if true:Value if false
		boolean ternary = (10>20)?(30>40):(40>50)?(43>41):(34<35);
		System.out.println(ternary);
		
		
		// new
		// []
			
	}
}