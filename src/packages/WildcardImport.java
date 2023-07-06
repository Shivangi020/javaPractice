package packages;

//The wild card import like package.* || import the whole package --> Be carefull

// All the classes and interfaces of this package
// will be accessible but not subpackages
import letmecalculate.* ; // only import class Calculator.java & CalculatorExample.java

import letmecalculate.subtract.*; // only import class Subtract.java

public class WildcardImport {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.add(2, 7);
		
		Subtract s = new Subtract();
		s.sub(8, 7);

	}

}
