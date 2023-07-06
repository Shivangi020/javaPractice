package throwAndThrows;

/* Throws keyword gives an information to the programmer that there may occur an exception. */

/* TODO DOUBT :  The throws keyword is used for checked exceptions, while unchecked exceptions do not require its usage */

public class ThrowsExample {

	
	public static void main(String[] args) throws Exception {
		int[] arr = {1,2,4,7};
		System.out.println(arr[9]);
		
/* Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 4 
 * at ThrowsKeyword.ThrowsExample.main(ThrowsExample.java:12) */
		
	}

}
