package finalKeyword;

/** Blank final variable --> */
/* A final variable that is not initialized at the time of declaration is known as blank final variable. 
 * We must initialize the blank final variable in constructor of the class otherwise it will throw a compilation error 
 * (Error: variable MAX_VALUE might not have been initialized) */

/* If you want to create a variable that is initialized at the time of creating object 
 * and once initialized may not be changed, Blank final variable is useful. */

/** Uninitialized static final variable */
/* A static final variable that is not initialized during declaration can only be initialized in static block. */

public class BlankFinalVariable {

	public static void main(String[] args) {
		StudentData st1 = new StudentData("ankita",50);
		StudentData st2 = new StudentData("kuhu",20);
		st1.display();
		st1.name = "shivangi";
//		st1.ROLLNO = 20;  this is giving error as ROLLNO is intialise as final so can not be change
		st1.display();
		st2.display();

	}

}

class StudentData{
  String name;
  final int ROLLNO;
  
//  Uninitialized static final variable
  static final String school ;
  static {
	  school = "xyz";
  }
  
  StudentData( String name ,int rollno ){
	  this.name = name;
	  ROLLNO = rollno;
  }
  
  void display() {
	  System.out.println("Name: " + this.name );
	  System.out.println("Roll no: " + this.ROLLNO );
  }
}