package inheritance;

/* Inheritance allows a class to use the properties and methods of another class */
/* Inheritance is known as IS-A relationship between child and parent class */
/* instanceof keyword returns true, if an object belongs to the class or its parent class.*/
/* It allows a class to use the properties and methods of another class*/
/*  Types of Inheritance 
 *   1. Single
 *   2. Multiple // possible using only interface
 *   3. Multilevel 
 *   4. Hierarchial
 *   5. Hybrid  
 *   */

public class Inheritance {
	
	public static void main(String args[]) {
		ScienceTeacher obj = new ScienceTeacher();
		System.out.println(obj.designation);
		System.out.println(obj.mainSubject);
		obj.does();
		obj.syllabus();
		System.out.println(obj instanceof Teacher);  // true
		System.out.println(obj instanceof ScienceTeacher);  // true
	}

}

class Teacher{
	String designation = "Teacher";
	
	void does() {
		System.out.println("Teaching");
	}
	

}


class ScienceTeacher extends Teacher{
	String mainSubject = "Science";
	
	void syllabus() {
		System.out.println("Science Syllabus");
	}
}