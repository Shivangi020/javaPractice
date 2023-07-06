package superKeyword;

/* The super keyword in Java is a reference variable which is used to refer immediate parent class object. */

/* Whenever you create the instance of subclass, 
 * an instance of parent class is created implicitly which is referred by super reference variable. */



public class SuperExample {

	public static void main(String[] args) {
		Demo d = new Demo();
		d.show();

	}

}

/* super can be used to refer immediate parent class instance variable.  
 * It is used if parent class and child class have same variable name*/

class Example{
	String a = "Parent";
	int y;
	
	void display() {
		System.out.println("This is parent class");
	}
}


class Demo extends Example{
	String a = "Child";
	int x;
//	super.a ; --> giving error
	
	void show() {
		System.out.println("This is Child class");
		System.out.println("child class variable "+ this.a);
		System.out.println("parent class variable "+ super.a);
	}
}
