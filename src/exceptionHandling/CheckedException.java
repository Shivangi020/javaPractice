package exceptionHandling;

import java.io.*;


/* Checked exceptions are checked at compile-time */
/* IMP: These exceptions must be declared in the method signature using throws or caught using a try-catch block */

/** Checked Exception */
/* SQLException
 * IOException
 * ClassNotFoundException
 * InvocationTargetException 
*/


public class CheckedException {

	public static void main(String[] args) {
//		FileInputStream fis = null;	
//		fis = new FileInputStream("B:/myfile.txt");  // throws FileNotFoundException which is a checked exception

//		Handling the checked exception by try catch block
		try {
			FileInputStream fis = null;	
			fis = new FileInputStream("B:/myfile.txt");  
		}catch(FileNotFoundException e) {
			System.out.println("Error : File is not found");
		}
	}

}



