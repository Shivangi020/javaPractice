package inter_face;

/* class implements interface but an interface extends another interface */

public class InterfaceClass  {
          public static void main(String args[])  {
        	InterfaceX obj = new demo();
        	obj.method1();
        	obj.method2();
        }
}

interface InterfaceX{
	void method1();
	void method2();
	
}

interface InterfaceY extends InterfaceX{
	
}
class demo implements InterfaceX{
	 public void method1() {
     	System.out.println("method1");
     }
     public void method2() {
     	System.out.println("method2");
     }
}



