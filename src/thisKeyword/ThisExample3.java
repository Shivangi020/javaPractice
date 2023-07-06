package thisKeyword;

/* 5. Using ‘this’ keyword to invoke the current class method */
/* 6. Using ‘this’ keyword as an argument in the constructor call */

/* Using this in a static context results in a compile-time error */

public class ThisExample3 {

	public static void main(String[] args) {
		

	}

}


class T {
	int x;
	int y;
	
	T(){
		this.x = 5;
		this.y = 7;
	}
	
	
	
	void show() {
// calling function display() using this 
		this.display();
		System.out.println("This is Show method , invoking  current class method using this keyword");
	}
	
	private void display() {
	   System.out.println("This is private method display");
	}
}