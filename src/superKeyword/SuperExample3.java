package superKeyword;


/* The super keyword can also be used to invoke the parent class constructor */

/** super() is added in each class constructor automatically by compiler if there is no super() or this(). */
/* default constructor is provided by compiler automatically if there is no constructor. 
 * But, it also adds super() as the first statement. */

public class SuperExample3 {

	public static void main(String[] args) {

		Dog d = new Dog();

	}

}

class Animal{
	
	Animal(){
		System.out.println("Animal is created");
	}
}

class Dog extends Animal{
	
	Dog(){  
		super();  // no need to add this compiler add this automatically
		System.out.println("dog is created");  
    }

}

