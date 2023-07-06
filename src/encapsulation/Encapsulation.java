package encapsulation;

/* Encapsulation simply means binding object state(fields) and behaviour(methods) together */

/* Encapsulation in Java is a mechanism of wrapping the data (variables) 
 * and code acting on the data (methods) together as a single unit */

/* Encapsulation is also known as "data Hiding" */

/* User would not be knowing what is going on behind the scene. 
 * They would only be knowing that to update a field call set method and 
 * to read a field call get method but what these set and get methods are doing is purely hidden from them. */

/* Encapsulation can be achieved by Declaring all the variables in the class as private 
 * and writing public methods in the class to set and get the values of variables. */

public class Encapsulation {
	
	public static void main(String args[]) {
		EncapsulationDemo obj = new EncapsulationDemo();
		
//		Cannot access id , name , isActive as they are private variable
//		obj.id;
//		obj.name;
//		obj.isActive 
		
		obj.setId(20);
		obj.setName("abc");
		obj.setIsActive(true);
		
		System.out.println("Id: "+obj.getId());
		System.out.println("Name: " + obj.getName());
		System.out.println("Is active: " + obj.getIsActive());
		
	}

}


class EncapsulationDemo{
	private int id;
	private String name;
	private boolean isActive;
	
	EncapsulationDemo(){
		id = 0;
		name = "xyz";
		isActive = false;
	}
	
//	Getter method
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public boolean getIsActive() {
		return isActive;
	}
	
//	Setter method
	public void setId(int num) {
		id = num;
	}
	
	public void setName(String str) {
		name = str;
	}
	
	public void setIsActive(boolean b) {
		isActive = b;
	}
	
}
