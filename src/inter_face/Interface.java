package inter_face;

/* We can’t instantiate an interface in java. That means we cannot create the object of an interface */

/* Interface provides full abstraction as none of its methods have body and also multiple inheritance */

/* All the interface methods are by default abstract and public  
 * Variables declared in interface are public, static and final by default*/

/* While providing implementation in class of any method of an interface, it needs to be mentioned as public */

/* The class that implements interface must implement all the methods of that interface. */



public class Interface {
	public static void main(String args[]) {
		Vehicle car1 = new Car();
		Vehicle bike1 = new Bike();
		car1.wheel();
		bike1.wheel();
	}
}

// Interface Vehicle ---->
interface Vehicle{
	public void wheel();
	public void speed();
}



class Car implements Vehicle{
	public void wheel() {
		System.out.println(4);
	}
	
	public void speed() {
		System.out.println(60);
	}
}


class Bike implements Vehicle{
	public void wheel() {
		System.out.println(2);
	}
	
	public void speed() {
		System.out.println(30);
	}
}