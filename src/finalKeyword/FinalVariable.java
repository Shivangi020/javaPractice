package finalKeyword;

// final keyword is used to denote constants
/* final variables are nothing but constants. We cannot change the value of a final variable once it is initialized. */
/* It is considered as a good practice to have constant names in UPPER CASE(CAPS) */



public class FinalVariable {
	final int MAX = 50;
	  public  void changeMax(){
//		   MAX = 100;  ---> this line is giving error || can not change final variable
		   System.out.println(MAX);
	}
	public static void main(String[] args) {
		FinalVariable f = new FinalVariable();
	    f.changeMax();
	}
 

}
