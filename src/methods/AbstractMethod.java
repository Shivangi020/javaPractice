package methods;

/* A method without body (no implementation) is known as abstract method */
/* A method must always be declared in an abstract class  
 * means if a class has an abstract method, it should be declared abstract as well */
// abstract methods do not have curly braces
// abstract method in an abstract class ----> 

public class AbstractMethod {
	   
 public static void main(String args[]) {
	 SumFunc s = new SumFunc();
	 s.disp();
	 System.out.println( s.sumOfThree(2, 7, 10));
	 System.out.println( s.sumOfTwo(4, 7));
	
	 
 }
}

abstract class Sum{
//	 Below two methods are abstract methods -->
	  public abstract int sumOfTwo(int n1, int n2);
	  public abstract int sumOfThree(int n1, int n2, int n3);
	  
//	  Below is regular method -->
	  void disp() {
		  System.out.println("This is an abstract class");
	  }
}

class SumFunc extends Sum{
	
/* If I don't provide the implementation of these two methods, the
 * program will throw compilation error.*/
	
	 public int sumOfTwo(int num1, int num2){
			return num1+num2;
		   }
	 public int sumOfThree(int num1, int num2, int num3){
			return num1+num2+num3;
}
}