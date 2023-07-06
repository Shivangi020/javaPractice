package passByValue;

import java.util.Arrays;

/* Call by Reference means calling a method with a parameter as a reference. 
 * Through this, the argument reference is passed to the parameter */

/* in the call by reference, 
 * the modification done to the parameter passed are persistent and changes are reflected in the caller's scope.*/

public class CallByRefrenceExample {

	
	static void change(int[] arr) {
		arr[0] = 10;
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int[] b = {5,8};
		
		change(b); // [10 , 8 ]
		System.out.println(Arrays.toString(b)); // [10 , 8 ]
		
//		In this example we are passing array "b" in a method chnage() 
//		which is non primitive data type and being passed as a reference
//		So any change inside a function will also affect the local array "b" which is being passed in change()
//		method as a refernce
		

	}

}
