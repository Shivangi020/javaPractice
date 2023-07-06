package exceptionHandling;

/* An Exception is an unwanted event that interrupts the normal flow of the program */
/* When an exception occurs program execution gets terminated. */ 
/* Exception handling ensures that the flow of the program doesn’t break when an exception occurs */

/* Errors indicate that something went wrong which is not in the scope of a programmer to handle. 
 * You cannot handle an error. Also, the error doesn’t occur due to bad data entered by user 
 * rather it indicates a system failure,disk crash or resource unavailability.*/


/* Exceptions are events that occurs during runtime due to bad data entered by user or an error in programming logic. 
 * A programmer can handle such conditions and take necessary corrective actions*/

public class Exception {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 0;
		
		try {
			int result = num1 / num2;
			System.out.println(result);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
	}

}
