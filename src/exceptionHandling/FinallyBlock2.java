package exceptionHandling;

/* finally block will execute even if try block return statement executes . The only case where it will not execute is when it encounters System.exit() */

public class FinallyBlock2 {

	public static void main(String[] args) {
		System.out.println(func());
	}
	public static int func(){
		int num1 = 10;
		int num2 = 10;
		
		try {
			int result = num1 / num2;
			 return result;
		}catch(ArithmeticException e) {
			System.out.println(e);
		}finally {
			System.out.println("Inside Finally block");
		}
		return 0;
	}

}

/* first finally block statement then try return*/
