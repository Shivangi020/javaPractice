package exceptionHandling;

// NOTE --> when catching the exception the more specific exception must be listed before the more general
// also The Exception subclass must be caught before the superclass

public class MultipleCatch {

	public static void main(String[] args) {
		try{
	         int a[]=new int[7];
	         a[7]=30/10;
	         System.out.println("statement in try block");
	     }
	     catch(ArithmeticException e){
	        System.out.println("Warning: ArithmeticException");
	     }
	     catch(ArrayIndexOutOfBoundsException e){
	        System.out.println("Warning: ArrayIndexOutOfBoundsException");
	     }
		System.out.println("Out of try-catch block...");

	}

}
