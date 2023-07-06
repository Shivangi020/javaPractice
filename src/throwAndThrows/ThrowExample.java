package throwAndThrows;

/* Throw in Java is a keyword that is used to throw a single built-in exception or a custom exception explicitly or manually */

/* we can throw either checked or unchecked exceptions  */

/* Only one object of exception type can be thrown by using throw keyword at a time */

/* Throw keyword can be used inside a method or static block provided that exception handling is present. */

/* We mainly use throw keyword to throw custom exception on the basis of some specified condition */

// SYNTAX : throw Instance || eg.  throw new ArithmeticException("/ by zero");


/** Throwing exception manually using throw keyword */

public class ThrowExample {

	public static void main(String[] args) {
         
		try {
			int num = 87;
			int x = 5;
			if(x == 5) {
				throw new ArithmeticException("x can not be 5 ");
			}else {
				System.out.println(num/x);
			}
		}catch(ArithmeticException e){
			System.out.println(e);
			System.out.println("Error msg: "+ e.getMessage());
		}
	
	}

}
