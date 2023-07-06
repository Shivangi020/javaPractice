package inter_face;


/* Interface variables must be initialized at the time of declaration otherwise compiler will throw an error*/

public class Interface3 {

	public static void main(String[] args) {
		

	}

}


interface W{
//	int  x; ---> This will throw compile time error
	
	int x = 10;
	int y = 20;
	
	void M();
	void N();
}

class X implements W{
	
	public void  M() {
		
	}
	public void N() {
		
	}
}