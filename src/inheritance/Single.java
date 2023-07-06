package inheritance;

/* When a class extends only one class then we  call it a single inheritance */

public class Single {
   
   public static void main(String args[]) {
	
	   Box b = new Box();
	   
	   b.length = 2;
	   b.breadth = 5;
	   b.area();
	   b.side();
   }
}

class Cardboard{
	int side = 4 ;
	int length;
	int breadth;
	
	void area() {
		System.out.println(length * breadth);
	}
}

class Box extends Cardboard{
	
	void side() {
		System.out.println(4);
	}
}