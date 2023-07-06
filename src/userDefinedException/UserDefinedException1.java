package userDefinedException;

/*  we can create our own exception class and throw that exception using throw keyword. 
 *  These exceptions are known as user-defined or custom exceptions */

/* 1. User-defined exception must extend Exception class
 * 2. The exception is thrown using throw keyword.
*/

public class UserDefinedException1 {

	public static void main(String[] args) {
		try {
			MyException e = new MyException("Error : Something bad happens");
			System.out.println(e);
			throw e;
			
		}catch(MyException exp) {
			System.out.println(exp);
			System.out.println(exp.errorMsg);
		}

	}

}

// In the above example underkneed the hood MyException exp = new MyException("Error : Something bad happens" 
// or MyException exp = e;

class MyException extends Exception{
	String errorMsg;
	
	MyException(String errorMsg){
		this.errorMsg = errorMsg;
	}
		
}