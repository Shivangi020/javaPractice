package polymorphism;


/* Overriding is a feature that allows a subclass or child class to provide a specific implementation of a 
 * method that is already provided by one of its super-classes or parent classes. */

/* Method overriding is the process when the subclass or a child class has the
 * same method as declared in the parent class */

/* Method overriding is one of the ways by which Java achieves Run Time Polymorphism */

/* it is the type of the object being referred to  not the type of the reference variable */

/* if the static method is redefined by a derived class, then it is not overriding, it is hiding */

/* The overriding method must have the same return type (or subtype) */

/*  we can’t achieve Runtime polymorphism via data members. In short, a method is overridden, not the data members. */

public class MethodOverriding {
	public static void main(String[] args) {
           Animal a = new Animal();
           Animal d = new Dog();
           Dog s = new Dog();
           
           a.sound();
           d.sound();
           s.sound();
	}
}

class Animal{
	void sound() {
		System.out.println("all animal have sound");
	}
}

class Dog extends Animal{
	void sound() {
		System.out.println("dog barks");
	}
}







