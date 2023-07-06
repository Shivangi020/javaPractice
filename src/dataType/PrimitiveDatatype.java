package dataType;

/* Java is statically typed */
/* Data type defines the values that a variable can take */ 
/* we have eight primitive data types: boolean, char, byte, short, int, long, float and double */

// byte --> -128 to 127 || size = 1 byte
// short --> -32,768 to 32767  || size = 2 bytes
// int --> -2,147,483,648 to 2,147,483,647 || size = 4 bytes
// long --> -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 || size = 8 bytes
// float --> upto 7 decimal digits  ||  size = 4 bytes
// decimal --> upto 16 decimal digits || size = 8 bytes
// char --> hold characters || size = 2 bytes
// boolean --> holds either true or false 

public class PrimitiveDatatype {

	
	public static void main(String args[]) {
		
		byte num =100 ;
        short num1 = 30000;
		int num2 = 2000000000;
		long num3 = 254484L;
		float num4 = 4.254789f;
		double num5 = 4.355453532;
		char c   = 'A';
		boolean b = true;
		
		System.out.println("byte " + num);
		System.out.println("short " + num1);
		System.out.println("int " + num2);
		System.out.println("long " + num3);
		System.out.println("float " + num4);
		System.out.println("double " + num5);
		System.out.println("char " + c);
		System.out.println("boolean " + b);
		
		
	}

}
