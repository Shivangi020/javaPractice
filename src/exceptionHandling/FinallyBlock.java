package exceptionHandling;

/* finally block contains all the crucial statements that must be executed whether exception occurs or not. */
/* Finally block will always execute even if there is no exception in try block */
/* A finally block must be associated with a try block, you cannot use finally without a try block */

/* The statements present in the finally block execute even 
 * if the try block contains control transfer statements like return, break or continue. */

public class FinallyBlock {

	public static void main(String[] args) {
		try {
			int num =52;
			int x = 0;
			System.out.println(num/x);
		}catch(ArithmeticException e ) {
			System.out.println(e);
		}finally {
			System.out.println("This is finally block");
		}
		System.out.println("Out of try-catch-finally");  
	}

}
