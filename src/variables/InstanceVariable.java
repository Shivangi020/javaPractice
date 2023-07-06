package variables;

public class InstanceVariable {
     String x = "Hello";
     static int y = 70;
     
     public static void main(String args[]) {
    	 InstanceVariable obj = new InstanceVariable();
    	 InstanceVariable obj2 = new InstanceVariable();
    	 
         obj2.x = "Hello world";
    	 System.out.println(obj.x);
    	 System.out.println(obj2.x);
    	 
    	 System.out.println(y);
     }

}
