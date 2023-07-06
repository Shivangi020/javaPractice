package collections.linkedHashSet;

import java.util.LinkedHashSet;

/* Java LinkedHashSet class is a Hashtable and Linked list implementation of the Set interface. 
 * It inherits the HashSet class and implements the Set interface. */

/* LinkedHashSet maintains the insertion order. Elements gets sorted in the same sequence in which they have been added to the Set */

/* It guarantees that the elements in the set will be maintained in the order in which they were inserted. 
 * This means that when you iterate over the elements of a LinkedHashSet, 
 * they will be returned in the same sequence in which they were added*/

/**  Hierarchy */
/* The LinkedHashSet class extends the HashSet class, which implements the Set interface. 
 * The Set interface inherits Collection and Iterable interfaces in hierarchical order.*/

public class LinkedHashSetBasic1 {

	public static void main(String[] args) {
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		set.add(7);
		set.add(6);
		set.add(12);
		set.add(63);
		set.add(14);
		
		System.out.println(set); // [7, 6, 12, 63, 14] : printed in order elements were added
		
		
		
	}

}
