package exceptionHandling;


/* The code (or set of statements) that can throw an exception is placed inside try block
 * and if the exception is raised, it is handled by the corresponding catch block.*/

/* try block is always followed by a catch block or finally block */

/* A catch block is where you handle the exceptions, this block must immediately placed after a try block. 
 * A single try block can have several catch blocks associated with it*/

public class Exception2 {

	public static void main(String[] args) {
	
	    int[] arr = {4,8,7,2,3};
		
		try {
			int a = arr[5];
			System.out.println(a);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("You can not print element out of index bound");
			System.out.println(e);
		}

	}

}
