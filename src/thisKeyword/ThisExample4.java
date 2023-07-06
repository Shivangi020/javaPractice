package thisKeyword;

/* this() constructor call should be used to reuse the constructor from the constructor. 
 * It maintains the chain between the constructors i.e. it is used for constructor chaining.*/

public class ThisExample4 {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		Calculator c2 = new Calculator(45,12);
		Calculator c3 = new Calculator(23,10,74);
		System.out.println(c.x + " " + c.y);
		System.out.println(c2.x + " " + c2.y + " "+c2.z);
		System.out.println(c3.x + " " + c3.y+" " + c3.z);

	}

}

class Calculator{
	int x;
	int y;
	int z;
	
	Calculator(){
		this(10,10);
	}
	
	Calculator(int x ,int y){
		this.x = x;
		this.y = y;
	}
	
	Calculator(int x ,int y,int z){
		this(x,y);
		this.z = z;
	}
}
