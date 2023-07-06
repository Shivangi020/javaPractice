package string;

/* used in authentication (by equals() method), 
 * sorting (by compareTo() method), 
 * reference matching (by == operator) */

/* equals() --> The String class equals() method compares the original content of the string
 * == operator --> The == operator compares references not values.
 * compareTo() -->  compares values lexicographically and 
 *                  returns an integer value that describes 
 *                  if first string is less than, equal to or greater than second string
 * */
public class StringCompare {

	public static void main(String[] args) {
		   String s1="Sachin";  
		   String s2="Sachin";  
		   String s3=new String("Sachin");  
		   String s4="Saurav";  

//		   System.out.println(s1.equals(s2));//true  
//		   System.out.println(s1.equals(s3));//true  
//		   System.out.println(s1.equals(s4));//false  
		   
		   System.out.println(s1==s2);//true (because both refer to same instance)  
		   System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)  
		   
		   System.out.println(s1.compareTo(s2));//0  
		   System.out.println(s1.compareTo(s4));//-18(because s1<s4)  
		   System.out.println(s4.compareTo(s1));//18(because s4 >s1 ) 
	}

}
