package constructor;

/* Constructor is a block of code that initializes the newly created object */ 
/* it doesn’t have a return type */
/* Constructor has same name as the class */

public class DefaultConstructor {
 
	String name ;
	
	DefaultConstructor(){
		name = "asdfg";
	}
	
	
	
	public static void main(String[] args) {
		DefaultConstructor obj = new DefaultConstructor();
		System.out.println(obj.name);

	}

}
