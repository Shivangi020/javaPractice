package polymorphism;

/* Method overloading is the process that can create multiple methods of the 
 * same name in the same class, and all the methods work in different ways.*/

/* Method overloading occurs when there is more than one method of the same name in the class. */

/* Method Overloading allows different methods to have the same name, but different signatures */

/* Method overloading is also known as Compile-time Polymorphism, Static Polymorphism */

/* Changing the Number of Parameters.
 * Changing Data Types of the Arguments.
 * Changing the Order of the Parameters of Methods */


public class MethodOverloading {
	
	static void display() {
		System.out.println("hello world");
	}
	
	static void display(String name) {
		System.out.println("hello "+ name);
	}
	
	static int display(int age) {
		return age;
	}
	
	public static void main(String[] args) {
            display();
            display("ankita");
            System.out.println(display(50));
	}
}
