package userDefinedException;


//the need for a throws declaration depends on whether the exception is checked or unchecked. 
// here the ageValidException is checked exception hence throws declaration is important

public class UserDefinedException3 {

	
	static void ageCheck(int age) throws ageValidException  {
		if(age < 18) {
			ageValidException exp = new ageValidException("Not valid age for vote");
			throw exp;
			
		}else {
			System.out.println("You can vote");
		}
	}
	
	public static void main(String[] args) {
	 try {
		 ageCheck(7);
	 }catch(ageValidException e) {
		 System.out.println(e.getMessage());
	 }

	}

}

class ageValidException extends Exception{
	ageValidException(String s){
		super(s);
	}
}
