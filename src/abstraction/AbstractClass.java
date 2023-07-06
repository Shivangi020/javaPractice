package abstraction;

/* It can have abstract and non-abstract methods (method with the body) both */

/*If a non-abstract (concrete) class extends an abstract class, 
 * then the class must implement all the abstract methods of that abstract class. 
 * If not the concrete class has to be declared as abstract as wel*/

public class AbstractClass {

	public static void main(String[] args) {
		   Shape sqr = new Square();
    	   sqr.display("Sqaure");
    	   sqr.angle();
    	   
    	   Shape trngl = new Triangle();
    	   trngl.display("Triangle");
    	   trngl.angle();
	}

}

abstract class Shape { 
	
//	   Constructor
	   Shape(){
		   System.out.println("This is a Shape");
	   }
	   
//	   Abstract method
	   abstract void angle();
	   
//	   Non Abstract method (static & instance both)
	   void display(String name ) {
		   System.out.println(name);
	   }
	   
	  
}

class Square extends Shape{
	   void angle() {
		   System.out.println(4);
	   }
}
class Triangle extends Shape{
	   void angle() {
		   System.out.println(3);
	   }
}
