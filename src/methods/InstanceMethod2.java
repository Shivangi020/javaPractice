package methods;

/* Instance method can be overridden since they are resolved using dynamic binding at run time */

public class InstanceMethod2 {
      public static void main(String args[]) {
    	  Calc obj = new Calc();
    	  obj.add(5, 14);
    	  obj.subtract(14, 7);
      }
}

class Calc{
	
	 void add(int a , int b) {
		 System.out.println(a+b);
	 }
	 
	 void subtract(int a , int b) {
		 System.out.println(a-b); 
	 }
	 
}
