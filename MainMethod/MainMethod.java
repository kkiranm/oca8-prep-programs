public class MainMethod{
	static{
		System.out.println("This is static block method"); //This will be executed before main method 
	}
	static final synchronized strictfp public void main(String...args){ //Varargs can be used instead of [] 
		System.out.println(args[0]);
	}
	
	static final synchronized strictfp public void main(int...args){  
		System.out.println("Args from second main method: "+args[0]); //This won't execute as JVM will only look for main method with String type parameter
	}
}