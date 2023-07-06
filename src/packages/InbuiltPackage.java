package packages;

//A class can have only one package declaration and that also on top

import java.util.Scanner;


/* A package is a pack(group) of classes, interfaces and other packages */
/* we use packages to organize our classes and interfaces */

/* → java is a top level package
   → util is a sub package
   → and Scanner is a class which is present in the sub package util. 
*/

/** Two Types of package -->  1.)User defined package  2.)Built in package */

/* The already defined package like java.io.*, java.lang.* etc are known as built-in packages. */

public class InbuiltPackage {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

//       String Input
		 String name = sc.nextLine();
//		 Numerical data Input
		 int age = sc.nextInt();
		 
		 System.out.println("Name: " + name + " age: " + age);
	}

}


/* 
 * 1. import package.*;
 * 2. import package.classname;
 * 3. fully qualified name.
 * 
*/
 