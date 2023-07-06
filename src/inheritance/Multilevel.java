package inheritance;

/* When there is a chain of inheritance, it is known as multilevel inheritance 
 * eg. class B is extending class A and class C is extending class B */

public class Multilevel {

	public static void main(String[] args) {
	   A a = new A();
	   B b = new B();
	   C c = new C();
	   a.methodA();
	   b.methodB();
	   c.methodC();
	
	  
	   
	}

}

class A{
	
	void methodA() {
		System.out.println("I am base class and not extending any class");
	}
}

class B extends A{
	
	void methodB() {
		System.out.println("I am extending class A");
	}
}

class C extends B{
	
	void methodC() {
		System.out.println("I am extending class B");
	}
}

