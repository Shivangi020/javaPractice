package letmecalculate;

// In this class we do not need to import Calculator as Calculator class and Calculator Example are in same package

/*  If classes belong to the same package, there is no need to import them explicitly to use them within that package. 
 *  Classes within the same package have access to each other without the need for import statements */

public class CalculatorExample {

	public static void main(String[] args) {
	Calculator obj = new Calculator();
	System.out.println(obj.add(5, 10));

	}

}
