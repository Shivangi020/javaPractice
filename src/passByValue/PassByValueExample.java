package passByValue;

public class PassByValueExample {

	public static void main(String[] args) {
//		This is passing by value
		int a = 500;
		System.out.println(a);
		
		int b;
		b = a;
		System.out.println(b);
		
//		Now lets change the value of b
		b = 1000;
		
		System.out.println("a: " + a); // 500
		System.out.println("b: " +b); // 1000
		
//		Note : Changing the value of b does not change the value of a because the value of a and b are not passed by reference
//		but passed by value

	}

}
