package thisKeyword;

/* ‘this’ is a reference variable that refers to the current object inside a method or a constructor.*/
/* this refers to the current object instance on which the method or constructor is being invoked. 
 * It can be used to access instance variables and methods of the current object. */

public class ThisExample {
   public static void main(String[] args) {
	  Person p = new Person("asdef" , 20);
	  p.introCall();
    }
}

class Person{
	String name;
	int age;
	
//	Using "this" for Ambiguity Variable Names
	Person(String name , int age) {
		this.name = name;
		this.age = age;
	}
	
	private String introMethod() {
		String intro = this.name +" "+ this.age;
		return intro;
	}
	
	public void introCall() {
		String res = this.introMethod();
		System.out.println(res);
	}
	
	
}