package thisKeyword;

/* 1. Using the ‘this’ keyword to refer to current class instance variables. */
/* 2. Using this() to invoke current class constructor */
/* 3. Using ‘this’ keyword to return the current class instance */
/* 4. Using ‘this’ keyword as a method parameter */

public class ThisExample2 {

	public static void main(String[] args) {
		Test t = new Test();
		Test t2 = new Test(45,87);
		Test t3 = new Test(223);
		System.out.println(	t.get());
	    t.display(t2);
	    t3.getObj();
		

	}

}

class Test{
	int a;
	int b;
	
//	Default Constructor 
	Test(){
//		this() to invoke current class constructor
		this(10,20);
	}
    Test(int a){
    	this(a,a);
    }
    
// Parameterized constructor
	Test(int a , int b){
		this.a = a ;
		this.b = b;
	}
	
// Method that returns current class instance
    Test get() { return this; }
	
// Method that receives 'this' keyword as parameter
    void display(Test obj)
    {
        System.out.println("b = "+obj.a + " " +"b = " + obj.b);
    }
    
// Method that returns current class instance
    void getObj() { display(this); }
}