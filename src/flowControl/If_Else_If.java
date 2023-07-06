package flowControl;

public class If_Else_If {

	
	static void noDigits(int num) {
		if(num<10) {
			System.out.println("It is one digit no");
		}else if(num>=10 && num <100) {
			System.out.println("It is two digit no");
		}else if(num>=100 && num <1000) {
			System.out.println("It is three digit no");
		}else {
			System.out.println("It is more than three digit no");
		}
	}
	public static void main(String[] args) {
		noDigits(50);
		noDigits(2);
		noDigits(1478);
		noDigits(145);

	}

}
