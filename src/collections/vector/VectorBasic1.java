package collections.vector;

import java.util.Vector;

/* Vector implements List Interface. 
 * Like ArrayList it also maintains insertion order but it is rarely used in non-thread environment as it is synchronized 
 * and due to which it gives poor performance in searching, adding, delete and update of its elements. */

// NOTE --> There are three ways we can create vector
/*
 * 1. Vector vec = new Vector();
 * 2. Vector object= new Vector(int initialCapacity)
 * 3. Vector object= new vector(int initialcapacity, capacityIncrement)
 * */

public class VectorBasic1 {

	public static void main(String[] args) {
//		below code creates an empty Vector with the default initial capacity of 10 , By default vector doubles its size
		Vector<String> vec = new Vector<String>();
		
//		Adding element in vector
		vec.add("Ankita");
		vec.add("Shiva");
		vec.add("kuhu");
		vec.add("krishu");
		
	    System.out.println(vec);	
	
//	      check size and capacityIncrement
	      System.out.println("Size is: "+vec.size());
	      System.out.println("Default capacity increment is: "+vec.capacity());
	      
	      
	}

}
