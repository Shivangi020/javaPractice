package string;

/* By + (String concatenation) operator
   By concat() method 
 */

/*The String concatenation operator can concatenate not only String but primitive values */
/* String concatenation is implemented through the StringBuilder (or StringBuffer) class and it's append method */

public class StringConcatenation {

	public static void main(String[] args) {

//		String concatenation operator --->
		String s = "Ankita"+" Singh";  
		String s1 = 50+30 +"Ankita"+ 40 + 40;  
	    System.out.println(s);  //Ankita Singh
	    System.out.println(s1);  // 80Ankita4040
	    
//	    by concat() method
	    String s3="Shivangi ";  
	    String s4="Singh";  
	    String s5=s3.concat(s4);  
	    System.out.println(s5);
	 
	}

}
