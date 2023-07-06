package inter_face;

/* We can implement more than one interfaces in your class */

public class Interface2 {
     public static void main(String args[]) {
    	 Example e = new Example();
    	 e.method1();
    	 e.method2();
    	 e.method3();
    	 e.method4();
     }
}


interface Inf1{
	void method1();
	void method2();
}

interface Inf2{
	void method2();
	void method3();
}

class Example implements Inf1 , Inf2{
	
	public void method1() {
		System.out.println("This is method 1 from Inf1");
	}
	public void method2() {
		System.out.println("This is method 2 from Inf1");
	}
	public void method3() {
		System.out.println("This is method 3 from Inf2");
	}
	public void method4() {
		System.out.println("This is method 4 from Inf2");
	}
	
}