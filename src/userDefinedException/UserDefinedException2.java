package userDefinedException;

public class UserDefinedException2 {

	static void passwordChecker(String password) {
		try {
			if(password != "ankita") {
				InvalidPasswordException exp = new InvalidPasswordException("Wrong password");
				throw exp;
			}
			System.out.println("ok");
		}catch(InvalidPasswordException e ) {
			 System.out.println("Caught the exception");
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
		passwordChecker("ankita");     

	}

}

class InvalidPasswordException extends Exception{
	
	
//	Child class Constructor calling parent class Constructor using super
	 InvalidPasswordException(String errorMsg){
		 super(errorMsg);
	 }
	
}