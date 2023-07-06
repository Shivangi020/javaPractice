package constructor;

public class ParameterizedConstructor {

	public static void main(String[] args) {
		Person p = new Person("Mini" , 20);
		System.out.println(p.name + " " + p.age);

	}

}


class Person{
	String name;
	int age;
	
	Person(String name , int age){
		this.name = name;
		this.age = age;
	}
	
}