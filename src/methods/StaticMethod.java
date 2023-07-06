package methods;

/* A static method is a method that belongs to a class rather than an instance of a class */
/* Static Methods can access class variables(static variables) without using object(instance) of the class */
/*  A static method can only use and call other static methods or static data members */

// IMPORTANT --->
/*  Static methods can not be overridden, since they are resolved using static binding by the compiler at compile time.
 *  However, we can have the same name methods declared static in both superclass and subclass, 
 * but it will be called Method Hiding as the derived class method will hide the base class method. */


public class StaticMethod {

	static void display() {
		System.out.println("This is static method");
	}
	
	static int add(int x ,int y) {
		return x+y;
	}
	
	public static void main(String args[]) {
		StaticMethod.display(); // accessing display without instance of classs 
		System.out.println(StaticMethod.add(4,5));  // similarly accessing add without instance of class
	}
}

