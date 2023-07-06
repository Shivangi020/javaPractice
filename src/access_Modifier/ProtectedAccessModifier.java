package access_Modifier;


/* Protected data member and method are only accessible by the classes of the same package 
 * and the subclasses present in any package. */

/* Classes cannot be declared protected. 
 * This access modifier is generally used in a parent child relationship. */

public class ProtectedAccessModifier {

	protected void method1() {
		System.out.println("This is protected method can be access by my subclass in any package");
	}
	
	public static void main(String[] args) {
		 ProtectedAccessModifier p = new  ProtectedAccessModifier();
		 p.method1();
	}

}
