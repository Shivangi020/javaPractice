package superKeyword;

/*  super can be used to invoke parent class method . 
 *  It should be used if subclass contains the same method as parent class. 
 *  In other words, it is used if method is overridden.*/

public class SuperExample2 {

	public static void main(String[] args) {
	       B b = new B();
	       b.display();
	}

}

class A{
	String a = "This is parent class";
	
	void display() {
		System.out.println(a);
	}
}

class B extends A{
	String b = "This is child class";
	
	void display() {
		super.display(); // --> This will called display() method of parent class
		System.out.println(b);
	}
}
