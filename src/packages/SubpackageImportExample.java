package packages;

import letmecalculate.subtract.Subtract;

// letmecalculate --> main package
// subtract ---> subpackage
//  Subtract ---> class

public class SubpackageImportExample {

	public static void main(String[] args) {
		Subtract s = new Subtract();
         System.out.println( s.sub(60, 10));
	}

}
