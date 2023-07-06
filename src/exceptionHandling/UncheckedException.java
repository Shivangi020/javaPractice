package exceptionHandling;


/*  Unchecked exceptions are checked at runtime */

/** Unchecked Exception */
/* NullPointerException
 * ArrayIndexOutOfBoundsException
 * ArithmeticException
 * IllegalArgumentException
 * NumberFormatException*/

/* Most of the times these exception occurs due to the bad data provided by user during the user-program interaction. */

public class UncheckedException {

	public static void main(String[] args) {
		
		try {
			int[] arr = {1,4,7,8};
			System.out.println(arr[5]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error : Index out of bound of array");
		}

	}

}
