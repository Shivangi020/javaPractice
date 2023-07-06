/* Both package declaration and package import should be the first statement in your java program */

/* If we create a class inside a package while importing another package 
 * then the package declaration should be the first statement, followed by package import.  */
package packages;
import letmecalculate.Calculator;

public class CalculatorImportExample {

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		System.out.println(obj.add(4, 5));
		System.out.println(obj.multiply(4, 5));

//		Accessing static method from class Calculator of package letmecalculator ->
		System.out.println(Calculator.squareproduct(3));

	}

}
