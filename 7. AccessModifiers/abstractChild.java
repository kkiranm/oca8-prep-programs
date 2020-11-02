class abstractChild extends abstractMethodDemo{
	public static void main(String[] args){
		abstractChild abs = new abstractChild();
		abs.abstractMethod();
		/* abstractMethodDemo absDemo = new abstractMethodDemo(); //This cannot be instantiated since abstract
		abs.abstractMethod();
		*/
	}
	
	public void abstractMethod(){
		System.out.println("Abstract Method implemented by child class");
	}
}