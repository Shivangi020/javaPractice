package collections.linkedList;

import java.util.LinkedList;

// LinkedList is a linear data structure.
// LinkedList elements are not stored in continuous locations like arrays
// Each element of the LinkedList has the reference(address/pointer) to the next element of the LinkedList.

/* Each element in the LinkedList is called the Node. Each Node of the LinkedList contains two items: 
 * 1) Content of the element 
 * 2) Pointer/Address/Reference to the Next Node in the LinkedList. */

/* Head of the LinkedList only contains the Address of the First element of the List 
 * The Last element of the LinkedList contains null in the pointer part of the node because 
   it is the end of the List so it doesn’t point to anything.
   
 * */


public class LinkedListBasic {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		
//    Adding elements to the Linked list
	    list.add("Steve");
	    list.add("Carl");
	    list.add("Raj");
	    
	    System.out.println(list); // [Steve, Carl, Raj]
		
//    Adding an element to the first position
	     list.addFirst("Negan");
	     
//	  Adding an element to the last position
	     list.addLast("Rick");
	     
//    Adding an element to the 3rd position
	     list.add(2, "Glenn");

	     System.out.println(list); // [Negan, Steve, Glenn, Carl, Raj, Rick]

	}

}
