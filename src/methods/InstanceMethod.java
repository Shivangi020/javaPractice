package methods;

/* An instance method is a method that belongs to instances of a class, not to the class itself */

/* An instance method belong to a particular object. 
 * It can refer to instance variables and instance methods that belong to the same object directly. 
 * It can also use static variables and methods*/

public class InstanceMethod {
      int a ;
      int b;
      
//      Instance method --->
      int add() {
    	  return a+b;
      }
      
      public static void main(String args[]) {
    	  InstanceMethod obj = new InstanceMethod ();
    	  obj.a = 50;
    	  obj.b = 60;
    	  System.out.println(obj.add());
      }
}
