package letmecalculate;

import letmecalculate.subtract.Subtract;

public class Calculator {

	public int add(int a , int b) {
		return a+b;
	}
	
	public int multiply(int a , int b) {
		return a*b;
	}
	
	public static int squareproduct(int a) {
		return a*a;
	}
	
	public static void main(String[] args) {
		Calculator obj = new Calculator();
		Subtract obj2 = new Subtract();
		System.out.println(obj.add(10, 20));
		System.out.println(obj2.sub(10, 20));
	}

}
