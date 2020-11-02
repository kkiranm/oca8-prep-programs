/*** Flow Control ***/
/*
	if-else
	switch case
	for
	while
	do-while
	break
	continue
*/
public class FlowControl{
	public static void main(String[] args){
		int x=10;
		int y=20;
		if(x<y){
			System.out.println(x);
		}
		else{
			System.out.println(y);
		}
		
		switch(x){
			case 10:
				System.out.println(10);
				
			case 20:
				System.out.println(20);//This will also print since break is not present in previous case
		}
		
		switch(x){
			case 20:
				System.out.println(20);
			case 30:
				System.out.println(30);
			default:
				System.out.println("Default");//This will print since all cases are false
		}
		
		switch(x){
			default:
				System.out.println("Default");	
			case 20:
				System.out.println(20);//This will print since default is true
			case 30:
				System.out.println(30);//This will print since default is true
		}
		
		String stuff = "X";
		String res = null;
		
		res = stuff.equals("X")?"A":stuff.equals("Y")?"B":"C";
		System.out.println(res);
		
		//Iterative Statements
		//while
		//To be used when the number of reps is not known
		
		int whilex = 0;
		
		while(whilex<=10){ //The loop body will run until the while condition is false. Once it is false, loop stops
			System.out.println(whilex);
			whilex++; //If there is no whilex++, it will become an infinite loop with 0s
		}
		
		boolean boolx = true;
		// while (boolx){
			// System.out.println(boolx); //Infinite loop
		// }
		// while (false){
			// System.out.println(boolx); //Compile Time error unreachable statement
		// }
		
		int whiley = 20;
		
		while(whilex<whiley){
			System.out.println("hello");
			whilex++;
		}
		System.out.println("hi");
		
		while (whilex>whiley){ //Since this condition is false, loop won't run
			System.out.println("This won't run");
		}
		System.out.println("This will run");
		
		final int whilefinalint = 10;
		// while(whilefinalint<=whiley){
			// // System.out.println(whilefinalint); //Final value will be replacing the variable at compile time
			// //whilefinalint++;
		// }
		
		//do-while
		//Code block will execute atleast once in do-while
		
		int dowhilex = 10;
		int dowhiley = 20;
		System.out.println("Do-While");
		do{
			System.out.println(dowhilex);
			dowhilex++;
		}while(dowhilex<dowhiley);
		
		//for loop
		System.out.println("For Loop");
		
/*		
		for(initialisation;condition;increment/decrement);
		{
			Body
		}
 		1. Initialisation
		2. Conditional Check
		3. Body
		4. Increment/Decrement
		5. Conditional Check
		6. Steps 3-5
		7. When Step 4 fails, loop will end */
		
		//Initialisation should contain initialisation of single/multiple variables of the same type
		for(int fori=0, forj=0;fori==20;fori++){
		}
		
		//Any Java statement is allowed in Initialisation and Increment/Decrement sections
		//Examples:
		
		for(System.out.println("For Initialisation");dowhilex<25;dowhilex++){
			System.out.println("For loop body");
		}
		
		for(System.out.println("For Initialisation");dowhilex<30;System.out.println("For Loop Increment/Decrement")){
			System.out.println("For loop body");
			dowhilex++;
		}
		
		//The conditional block is true by default if nothing is provided
		// for (;;){} //Will run infinite number of times
		
		
		
		// for-each loop
		//Only for arrays and collections (Lists, etc)
		//Unable to use on normal datatypes
		//Unable to use to access elements in reverse/zigzag order
		System.out.println("Enhanced For Loops");
		int[] foreach = {10,20,30};
		
		//Traditional for loop
		for(int newi=0;newi<foreach.length;newi++){
			System.out.println(foreach[newi]);
		}
		
		//Enhanced For loop
		
		for(int a : foreach){
			System.out.println(a);
		}
		
		
		//Multi dimensional array example
		
		System.out.println("Multi Dimension Array with Enhanced For loop");
		
		int[][][] multidim = new int[2][3][4];
		multidim[0][0][0]=1;
		multidim[0][0][1]=2;
		multidim[0][0][2]=3;
		multidim[0][0][3]=4;
		multidim[0][1][0]=5;
		multidim[0][1][1]=6;
		multidim[0][1][2]=7;
		multidim[0][1][3]=8;
		multidim[0][2][0]=9;
		multidim[0][2][1]=10;
		multidim[0][2][2]=11;
		multidim[0][2][3]=12;
		for(int[][] a:multidim){
			for(int[] b:a){
				for(int c: b){
					System.out.println(c);
				}
			}
		}
		System.out.println(multidim);
		
		
		//Transfer Statements
		//break, continue
		
		//break
		//Usage in switch statements to come out of the block when case is true
		System.out.println("break statement");
		
		int breaki = 10;
		switch(breaki){
			case 1:
				System.out.println("One");
			
			case 10:
				System.out.println("Ten");
				break;
			
			default:
				System.out.println("Default");
		}
		
		//Usage in loops
		for(int loopi=0; loopi<10; loopi++){
			System.out.println(loopi);
			if(loopi==8){
				break;
			}
		}
		
		//Usage in labeled block
		int labeli=8;
		l1:{
			System.out.println("Inside Labeled Block");
			if(labeli==8){
				break l1;
			}
			System.out.println("This won't run since it's after break");
		}
		
		//break cannot be used anywhere else
			
		//continue
		//to skip current iteration and move on to the next iteration
		System.out.println("continue statement");
		for(int continuei=0;continuei<10;continuei++){
			if(continuei%2==0){
				continue;
			}
			//This will be skipped whenever continuei%2==0. Continue will transfer control to next iteration
			System.out.println(continuei);
		}
		
		//continue can be used ONLY in loops
		//It can be used in labeled block as long as there are no {} for the labeled block
		
		//Example
		System.out.println("Special Example");
		
		l2:
		
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					if(i==j)
						// break; //1-0, 2-0, 2-1
						// break l2; //No Output
						// continue; //0-1, 0-2, 1-0, 1-2, 2-0, 2-1
						continue l2; //1-0, 2-0, 2-1
						
					System.out.println(i+"-----"+j);
				}
			}
		System.out.println("Outside l2:");		
	}
}