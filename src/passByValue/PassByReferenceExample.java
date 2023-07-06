package passByValue;


// When we are talking about reference means we are talking about object


public class PassByReferenceExample {

	public static void main(String[] args) {
       Car a = new Car();
       a.name="BMW";
       a.mileage = 5.5f;
       a.cost = 75;
       
       System.out.println(a.name);
       System.out.println(a.mileage);
       System.out.println(a.cost);
       
       Car b; // This is just creating reference because there is not new keyword
       b = a; // this will actually pass the memomry address of object of a to b 
//               So any changes in b will reflect in a also
       b.name = "farari";
       b.cost = 85;
       
       System.out.println(b.name);
       System.out.println(b.mileage);
       System.out.println(b.cost);
       
       
       System.out.println(a.name);
       System.out.println(a.mileage);
       System.out.println(a.cost);
       
       

	}

}

class Car{
	String name;
	float mileage;
	int cost;
}

/** Java is purely pass by value --> UNDERSTAND */
/* 
 In Java, the language itself is pass-by-value, meaning that when you pass a variable to a 
 method or assign it to another variable, a copy of the variable's value is passed or assigned. 
 However, when dealing with objects, it's important to understand how references work.

In the code , you have two variables, `a` and `b`, 
both of which are references to objects of the `Car` class. 
When you assign `b = a`, you are not creating a new object;
rather, you are making `b` refer to the same object that `a` refers to. 
This means that both `a` and `b` are pointing to the same object in memory.

When you modify the object's properties using `b`, 
such as `b.name = "farari";` or `b.cost = 85;`, 
the changes are reflected in the object that both `a` and `b` are referencing. 
This is because both `a` and `b` hold the memory address (reference) of the object.

So, in the context of Java, the variables `a` and `b` are still passed by value, 
but the value being passed is a reference to an object. 
This can sometimes give the impression of pass-by-reference behavior, 
but fundamentally, Java itself is pass-by-value.

*/

