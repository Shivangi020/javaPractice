package methods;

/* All the methods of an interface are public abstract by default so do need to specify the methods using abstarct keyword */
// abstract method in interface --->

public class AbstractMethod2 {

	public static void main(String[] args) {
		ActMultiply obj = new ActMultiply();
		System.out.println(obj.square(5));
        System.out.println(obj.mulOfTwo(4, 5));
	}

}



interface Multiply{
//	Abstract methods
	public int square(int n);
	public int mulOfTwo(int n , int m);
}

class ActMultiply implements Multiply{
	public int square(int n) {
		return n*n;
	}
	public int mulOfTwo(int n , int m) {
		return n*m ;
	}
}