package passByValue;


/* Call by Value means calling a method with a parameter as value. 
 * Through this, the argument value is passed to the parameter. */

/* In call by value, the modification done to the parameter passed does not reflect in the caller's scope  */

public class CallByValueExample {

	static int change(int a) {
		a = a+20;
		return a;
	}
	
	public static void main(String[] args) {
	int x = 5;
	int ans = change(x); // here we are just copying the value of x in change method so any change to that value inside
//	the function will not affect the value of x here
	
	System.out.println(ans); // 25
	System.out.println(x); // 5

	}

}
