/*
Either fully qualified name or import statement is required to bring in an outside class 

Explicit Class Import - import java.util.ArrayList;
Implicit Class Import - import java.util.*;

Order of import priority:
Explicit import
Classes present in current working directory
Implicit import

Only the imported classes and interfaces will be available when importing. Sub package classes won't be available

Import is a dynamic inclusion and they will be imported during runtime

Static Import: When static members of a class are imported using static import, they can be accessed directly

*/
import java.util.ArrayList;
import java.util.*;
import java.sql.*;
import static java.lang.Math.sqrt; //Static Import

class importAndPackages{
	public static void main(String[] args){
		java.util.ArrayList l = new java.util.ArrayList();
		ArrayList l2 = new ArrayList();
		//Date d = new Date(); //This won't work since both util and sql have Date classes
		java.util.Date d = new java.util.Date();
		System.out.println(sqrt(4));// Static Imported method
	}
}