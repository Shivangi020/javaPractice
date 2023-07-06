package flowControl;

public class If_Else {

	static boolean isEven(int num) {
		if(num%2==0) {
			return true;
		}else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		
		boolean ans = isEven(27);
		System.out.println(ans);
		
//		isEven(27) --> false ; isEven(20) --> true;

	}

}
