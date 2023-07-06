package access_Modifier;

/** Private access Modifier*/
/* Private Data members and methods are only accessible within the class
 * Class and Interface cannot be declared as private
 * If a class has private constructor then you cannot create the object of that class from outside of the class */

public class PrivateAccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		Dog d = new Dog();
		Animal q = new Dog();
		
//		a.display()  ---> this is giving error
//		coz display is private method inside a class and cannot be access outside of it
		
		a.show();
		d.show();
        q.show();
	}

}


class Animal{
	
	
	private void display() {
		System.out.println("This method have private access modifier");
	}
	
	void show() {
		display();
	}
}

class Dog extends Animal{
	private void display() {
		System.out.println("This method have private access modifier and overriden from parent class Animal ");
	}
	void show() {
		display();
	}
}