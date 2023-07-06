package inheritance;

/* It is a combination of more than one types of inheritance in a single program */
public class Hybrid {

	public static void main(String[] args) {
	          Aa a = new Aa();
	          Bb b = new Bb();
	          Cc c = new Cc();
	          Dd d = new Dd();
	          
	          a.methodA();
	          b.methodB();
	          c.methodC();
	          d.methodD();

	}

}


class Aa{
	 void methodA() {
		 System.out.println("I am base class and not extending any class");
	 }
}

class Bb extends Aa{
	 void methodB() {
		 System.out.println("I am base class for class C and class D and extending class A");
	 }
}

class Cc extends Bb{
	void methodC() {
		 System.out.println("I am extending class B");
	 }
}

class Dd extends Bb{
	void methodD() {
		 System.out.println("I extending class B");
	 }
}
