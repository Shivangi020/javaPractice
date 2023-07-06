package string;

/* The Java String is immutable which means it cannot be changed. Whenever we change any string, a new instance is created. 
 * For mutable strings, you can use StringBuffer and StringBuilder classes. */

/*
 * There are two ways to create String object:
 * By string literal
 * By new keyword
 * 
*/

/** string literal */
/* Each time you create a string literal, 
 * the JVM checks the "string constant pool" first. 
 * If the string already exists in the pool, a reference to the pooled instance is returned. 
 * If the string doesn't exist in the pool, a new string instance is created and placed in the pool*/

/** new keyword */
/* JVM will create a new string object in normal (non-pool) heap memory, 
 * and the literal "Welcome" will be placed in the string constant pool. 
 * The variable s will refer to the object in a heap (non-pool).*/

public class StringExample {

	public static void main(String[] args) {

//		This is string literal
		String s1="Welcome";  
//		String s2="Welcome"; || It doesn't create a new instance 
		
//		 This is by new keyword
        String s2 = new String("By new keyword");  
           
        char ch[]={'s','t','r','i','n','g','s'};    
        String s3=new String(ch);//converting char array to string  
        
           System.out.println(s1);
           System.out.println(s2);
           System.out.println(s3);

	}

}
