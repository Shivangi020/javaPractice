package finalKeyword;

/* A final method cannot be overridden. 
 * Which means even though a sub class can call the final method of parent class without any issues 
 * but it cannot override it*/

public class FinalMethod {

	public static void main(String[] args) {
		Demo d = new Demo();
		d.method2();

		Example e = new Example();
		e.method3(2, 5);
	}

}

class Example{
	final void method1() {
		System.out.println("This is final method in parent class and can not be overridden by child class");
	}
	
	void method3(int num , final int MAX ) {
		num = num+10; // allowed
//		MAX = MAX+10; ----> NOT ALLOWED , cannot modify final variable
		System.out.println(num*MAX);
	}
}

class Demo extends Example{
	
//	Getting ERROR as can not be overridden
//	void method1() {
//		System.out.println(" can not be overridden by child class and giving error");
//	}
	
//	final methods can be called by child class
	void method2() {
		super.method1();
	}
	
	

}