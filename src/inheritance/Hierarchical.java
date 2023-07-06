package inheritance;

/* when a single class is inherit by two or more class */

public class Hierarchical {

	public static void main(String args[]) {
		Square s = new Square();
		s.intro("Square");
		s.side();
		
		Circle c = new Circle();
		c.intro("Circle");
		c.diameter();
	}
	
}

class Shape{
	
	void intro(String name) {
		System.out.println("I am " + name);
	}
}

class Square extends Shape{
	void side() {
	  System.out.println("My all sides are same");
	}
}


class Circle extends Shape{
	void diameter() {
		System.out.println("I have diameter");
	}
}

