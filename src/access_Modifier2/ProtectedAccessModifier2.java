package access_Modifier2;

import access_Modifier.*;


public class ProtectedAccessModifier2 extends ProtectedAccessModifier {
    
	void method2() {
		method1(); // protected method from parent class
		System.out.println("This is child class method accessing parent class protected method");
	}
	
	public static void main(String[] args) {
		ProtectedAccessModifier2 p = new ProtectedAccessModifier2();
		p.method2();
	}

}
