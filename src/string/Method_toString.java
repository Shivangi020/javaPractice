package string;


/* If you want to represent any object as a string, toString() method comes into existence. */
/* toString() method returns the String representation of the object */
/* If you print any object, Java compiler internally invokes the toString() method on the object */

/* By overriding the toString() method of the Object class, 
 * we can return values of the object, so we don't need to write much code. */

public class Method_toString {

	public static void main(String[] args) {
		Student s1 = new Student(20 , "Anikta");
		Student s2 = new Student(30,"Shivangi");
		
		// without overriding toString() method we get the hashcode values of the objects
		System.out.println(s1);  // string.Student@4926097b
		System.out.println(s2);  // string.Student@39ed3c8d
		
		

	}

}


class Student{
	int rollno ;
	String name;
	
	Student(int rollno , String name ){
		this.rollno = rollno;
		this.name = name;
	}
	
	public String toString() {
		return  rollno +" "+ name;
	}
}