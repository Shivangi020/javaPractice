package string;

public class ImmutableString {

	public static void main(String[] args) {
		   String s="Sachin";  
		   s.concat(" Tendulkar");
		   System.out.println(s); //will print Sachin because strings are immutable objects  
//		   Sachin is not changed but a new object is created with Sachin Tendulkar
	}

}

/** Why String objects are immutable in Java? */
/* As Java uses the concept of String literal. Suppose there are 5 reference variables, 
 * all refer to one object "Sachin". If one reference variable changes the value of the object, 
 * it will be affected by all the reference variables. 
 * That is why String objects are immutable in Java.*/
