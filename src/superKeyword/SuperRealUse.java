package superKeyword;

public class SuperRealUse {

	public static void main(String[] args) {
		Employer e = new Employer(00,"ankita",25014.7f);
		e.display();

	}

}


/* super is used to call a parent class constructor: 
 * When a subclass is created, its constructor must call the constructor of its parent class. 
 * This is done using the super() keyword, which calls the constructor of the parent class.*/

/* super cannot be used in a static context */

/** super() is used to call Base class’s constructor(i.e, Parent’s class) 
 *  while this() is used to call the current class’s constructor. */

class Person{
      int id;
      String name;
      
      Person(int id){
    	  this.id = id;
      }
      Person(int id,String name){  
    	  this.id=id;  
    	  this.name=name;  
    }  
}

class Employer extends Person{

	float salary;  
	
	Employer(int id){
	 super(id)	;
	}
	
	Employer(int id,String name ,float salary){
		super(id,name); // intialising this.id = id and this.name = name
		this.salary = salary;
	}
	void display(){
		System.out.println(id+" "+name+" "+salary);
		}  
}