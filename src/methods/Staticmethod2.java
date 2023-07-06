package methods;

/*a static method cannot directly access non-static methods and variables, 
 * it can access them through an instance of the class by creating an object of that class */

public class Staticmethod2 {

	public static void main(String[] args) {
	
//		X x = new X();
//		x.a = 4; --> do not access static variable by a object || ERROR
//		x.b = 2;  --> do not access static variable by a object || ERROR
		
         X.a = 10;
         X.b = 10;
		System.out.println( X.multiply());
        
	}

}


class X{
	int x;
	int y;
	
	static int a ;
	static int b ;
	
    static int multiply() {
//    	return x * y; ----> can not acess x and y because they are non static variable
    	return a*b;
    }
}