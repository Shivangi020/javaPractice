package finalKeyword;

/* We cannot extend a final class */
//1) A constructor cannot be declared as final
//2) Local final variable must be initializing during declaration.
//3) All variables declared in an interface are by default final.

public class FinalClass {

	public static void main(String[] args) {


	}

}

final class XYZ{
	void display() {
		System.out.println("This is final class and no class can extends it");
	}
}

/** Below code giving error as class ABC can not extends final class XYZ */
//class ABC extends XYZ{
//	
//}