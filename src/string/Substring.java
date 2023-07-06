package string;

// A part of String is called substring
// startIndex: inclusive
// endIndex: exclusive

public class Substring {

	public static void main(String[] args) {
          String s = "hello world";
          System.out.println(s.substring(0,5));
          System.out.println(s.substring(6,11));
          
          
//          Using String.split() method --> It accepts arguments in the form of a regular expression
          String s1 = "hello-world";
          System.out.println(s1.split("-"));
          

	}

}
