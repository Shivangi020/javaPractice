package string;

// Java StringBuilder class is used to create mutable (modifiable) String
// StringBuilder is mutable class which means values stored in StringBuilder objects can be updated or changed.

public class StringBuilderClass {

	public static void main(String[] args) {
		
	       StringBuilder s1 = new StringBuilder("Hello");    //String 1  
	        StringBuilder s2 = new StringBuilder(" World");    //String 2  
	        StringBuilder s = s1.append(s2);   //String 3 to store the result  
	        System.out.println(s.toString());  //Displays result   

	}

}

