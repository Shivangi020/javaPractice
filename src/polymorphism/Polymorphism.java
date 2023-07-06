package polymorphism;

// Polymorphism is one of the OOPs feature that allows us to perform a single action in different ways.
// Two types of polymorphism in Java: compile-time polymorphism and runtime polymorphism
// We Can perform polymorphism in java by method overloading and method overriding

public class Polymorphism {
    
	public static void main(String[] args) {
	  Square sqr = new Square();
	  Circle crl = new Circle();
	  
	  sqr.draw();
	  crl.draw();

	}

}

class Shape{
	void draw() {
		System.out.println("Drawing Shape");
	}
}

class Square extends Shape{
//	Method overriding
	void draw() {
		System.out.println("Drwaing Square");
	}
}

class Circle extends Shape{
//	Method overriding
	void draw() {
		System.out.println("Drwaing Circle");
	}
}