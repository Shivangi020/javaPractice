package throwAndThrows;


/* When an exception occurs in a try block, it is caught by a catch block inside the same method.
 * The same exception object out from the catch block can be rethrown explicitly using throw keyword. 
 * This is called rethrowing of exception in Java.*/

public class RethrowingExample {

	public static void main(String[] args) {
		 A a = new A();
		 try
		 {
		   a.m1();
		 }
		// Rethrown exception is caught by below catch block. 
		 catch(StringIndexOutOfBoundsException se) {
		     System.out.println("Rethrow exception is caught here: " +se);	 
		 }
	}

}



class A {
void m1()
{
try {
   String str = "Ankita";
   char ch = str.charAt(10); // Exception is thrown because there is no index with value 10.
   System.out.println(ch);
}
catch(StringIndexOutOfBoundsException se) {
  System.out.println("String index out of range");
  throw se; // Rethrow the same exception.
  }
 }
}