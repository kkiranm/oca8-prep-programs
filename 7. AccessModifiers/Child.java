class Child extends Parent{
	public static void main(String[] args){
		property();
	}
	/* This cannot override parent class method since it is declared as final
	public static void property(){
		System.out.println("Child's property");
	}
	*/
}

/* This class cannot inherit from finalParent class since the class is Final and can't be inherited
class finalChild extends finalParent{
	
}
*/