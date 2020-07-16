/** Arrays **/

public class Arrays{
	public static void main(String[] args){

/*Single Dimension Array - Declare and initialise 
	<DataType>[] <variableName> = new <DataType> [<Size>];
*/
		//Declare Array
		//Both the below ways are allowed
		//int[4] a; is not allowed
		
		int[] a;
		int b[];
		
		//Below are allowed for multidim arrays
		int[][] c;
		int[]d[];
		int e[][];
		
		int[][][] f;
		int[][]g[];
		int[]h[][];
		
		//Java implements multidim arrays as array of arrays to improve memory utilisation
		
		int[][] x = new int[2][]; //Creates 2 dim array. First dim has size of 2, second dim size undefined
		//In the above notation, second dim size isn't defined.
		// Hence, first dimension has size 2, each of which has second dim arrays but size not known yet
		x[0]= new int[2];//Only now the size of second dim of the first element of first dim is defined as 2
		x[1]= new int[3];//Only now the size of second dim of the second element of first dim is defined as 3
		x[0][1] = 3;
		x[0][1] = 4;
		x[1][0]=5;
		x[1][1]=6;
		x[1][2]=7;
		//This way, second dimension can be defined with multiple sizes wrt each of the first dimension
	    //For every first dimension array element, there is a different sized second dimension array element
		
		System.out.println(x); //This prints the object referring to the class which is [[I 2 dime Int array class
		
		int[][][] y = new int[2][][];
		y[0]=new int[1][];
		y[0][0]=new int[3];
		y[0][0][0] = 5;
		y[0][0][1] = 6;
		y[0][0][2] = 7;
		System.out.println(y[0][0][0]+""+y[0][0][1]+""+y[0][0][2]);
		
		//int[][][] yy = new int[2][][3];//This isn't valid as second dim has no size and third dim has size
		
		int[][] m = new int[2][];
		System.out.println(m[0]);
		//m[0]=4; //Not allowed
		m[0] = new int[2];
		System.out.println(m[0]); //This will print object referring to the other array
		System.out.println(m[1]);
		//System.out.println(m[1][0]);//Null Pointer Exception since the second element of base dim doesn't have the child size defined. Hence, null pointer
		//In other words, no 'new' keyword has been used so no array object is defined.
		
		
		//The below code won't compile since s array elements are not initialised and will have null values since null is the default value for String type
		/*
		String[] s = new String[2];
		int i = 0;
		for(String s1:s)
		{
			s[i].concat("Element"+i);
			i++;
		}
		for(i=0; i<s.length; i++)
		{
			System.out.println(s[i]);
		}
		
		*/
		
		class Students{
			String name;
			public Students(String name){
				this.name = name;
			}
		}
		
		Students[] students = new Students[3];
		students[1] = new Students("Student 1");
		System.out.println(students[0]);//This will be null since it's not assigned any value
		System.out.println(students[1]);//This will print the variable referencing the student object
		System.out.println(students[1].name);
		//System.out.println(students[0].name);//This won't compile as .name method will not work on a null object reference
		
		
		//Declaring multiple arrays in one line
		//All should be of same data type
		//int []z,[]second; //This usage of [] before second variable isn't allowed
		int []z, second[], third[][];//This is allowed
		
		//Declaring, construction and initialisation in one line using {} but size shouldn't be defined
		int single[] = {3,4,5,6};
		
		//Multi Dim arrays in this {} method
		
		int multi[][] = {{3,4,5},{6,7}};
		System.out.println(multi[0][0]);
		System.out.println(multi[0][1]);
		System.out.println(multi[0][2]);
		System.out.println(multi[1][0]);
		System.out.println(multi[1][1]);
		
		boolean multibool[][] = {{true},{false, false}};
		System.out.println(multibool[0]);//This will automatically hold array address of the child dimension
		System.out.println(multibool[0][0]);
		System.out.println(multibool[1][0]);
		System.out.println(multibool[1][1]);
		
		int[][] xy = new int[1][2];
		//xy[0]=5; //This won't compile since it holds array object of the lower dimension
		xy[0][0]=5;
		System.out.println(xy[0]);
		System.out.println(xy[0][0]);
		System.out.println(xy.length);
		System.out.println(xy[0].length);//This will work only if it is working on array object, not array value
		System.out.println(xy[0][1]);
			
		//Anonymous Arrays
		System.out.println(new int[]{3,4,5});
		sum(new int[]{3,4,5});
		
		float[] fl = new float[2];
		fl[0]=1;
		fl[1]=2;
		System.out.println(fl[0]);//1.0
		System.out.println(fl[1]);//2.0
		float[] fl1 = fl;
		fl[0]=3;
		System.out.println(fl1[0]);//3.0
		System.out.println(fl1[1]);//2.0
				
		 String[] argh = args;
		 if(argh.length>0){
			System.out.println(argh[0]);
		}
}
	public static void sum(int[] n){
			int total = 0;
			for(int i:n)
			{
				total += i;
			}
			System.out.println(total);
		}
}