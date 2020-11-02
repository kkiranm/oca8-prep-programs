public class Variables{
	static int staticVar;//Doesn't need initialisation
	int instanceVar;
	int x = 10;
	static int y = 20;
	
	public static void main(String[] args){
		//Primitive Variables
		//Instance, Local and Static Variables 
		//Local Variables have to be initialised before usage. They don't have default values set
		//Instance variables can be accessed only from instance area directly and we can't access from static area directly.
        //But static variables can be accessed from both instance and static areas directly.
		int primitiveVar = 10;
		int x = 30;
		System.out.println("This is local variable x: "+x);
		Student referenceVar = new Student();
		Student referenceVar2 = new Student();
		referenceVar.classOrInstanceVar = 12;
		referenceVar2.classOrInstanceVar = 22;
		System.out.println(primitiveVar);
		System.out.println("Reference Var 1 Class Var: "+referenceVar.classOrInstanceVar);
		System.out.println("Reference Var 2 Class Var: "+referenceVar2.classOrInstanceVar);
		
		System.out.println("");
		
		System.out.println("/*** Static Variables ***/");
		
		staticVar = 5;
		System.out.println(staticVar);//Possible since this is Static Method and var is also static		
		
		Variables v = new Variables();
		Variables v2 = v;//V2 IS ALSO POINTING TO THE SAME OBJECT AS V. IT'S NOT A NEW OBJECT
		v.instanceVar = 2;
		
		System.out.println(v.instanceVar);//Possible to print an instanceVar of a class from a Static Method
		v.printStaticVar();//Is possible since an instance method can access instance var
		System.out.println(v2);//This will print object reference Variable
		System.out.println(v2.instanceVar);
		
		// System.out.println(instanceVar);//Not possible since this is a static method and the var is non-static
		referenceVar.changeStaticVar(35);
		System.out.println(staticVar);
		
		/*** Different ways to print Static Variables ***/
		System.out.println("Static Variable using Class.var name: "+Variables.staticVar);
		System.out.println("Static Variable using reference.var name: "+v.staticVar);
		System.out.println("Static Variable using only var name since it's in the same class: "+staticVar);
		
		//Tricky Question
		//Refer to the instance variables x and y to follow this
		Variables var1 = new Variables();
		var1.x = 888;
		var1.y = 999;
		Variables var2 = new Variables();
		// System.out.println("var2 x: "+var2.x+"var2 y: "=var2.y);
		System.out.println(var2.x);
		System.out.println(var2.y);//This will print 999 as it's been changed by var1 object already
		int ii=10;
		try{
			int i = Integer.parseInt("0");
			ii=i;
		}
		catch(NullPointerException e){
			
		}
		//System.out.println(i); //Not possible as i is internal to try block and can't be accessed outside
		System.out.println(ii);//Possible since it's within the scope of this statement
		
		boolean variableNotInitialised;
		// System.out.println(variableNotInitialised);//Not possible since it's a local var and not initialised
		if(args.length>0){
			variableNotInitialised = true;
		}
		// System.out.println(variableNotInitialised);//This also doesn't work as it needs runtime variable
		else{
			variableNotInitialised = false;
		}
		System.out.println(variableNotInitialised);
		
		final char finalVar = 'z';
		System.out.println(finalVar);
	}
	
	public void printStaticVar(){
		System.out.println(instanceVar);
	}
}

class Student{
	int classOrInstanceVar;
	void changeStaticVar(int x){
		Variables.staticVar = x;
		System.out.println("Static Var has been changed. Now staticVar is: "+Variables.staticVar);
	}
}