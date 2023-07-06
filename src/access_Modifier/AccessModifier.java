package access_Modifier;



/* An access modifier restricts the access of a class, constructor, data member and method in another class */
/* we have four access modifiers -->  default , public , private , protected */


/** Default access Modifier */
/* When we do not mention any access modifier, it is called default access modifier. */
/* The scope of this modifier is limited to the package only */



public class AccessModifier {

	static void display() {
		System.out.println("This method have default access modifier as no modifier is mentioned");
	}
	public static void main(String[] args) {
	 
     display();
	}

}


