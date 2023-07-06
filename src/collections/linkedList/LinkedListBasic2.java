package collections.linkedList;

import java.util.LinkedList;

public class LinkedListBasic2 {

	public static void main(String[] args) {
	
		LinkedList<String> list = new LinkedList<>();
		
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		
		System.out.println(list); // [a, b, b, c, d, e]
		
//		indexOf() -->  returns the index of the specified item.
		System.out.println(list.indexOf("b"));
		
		
//		Removing first element 
		list.removeFirst();
		
//		Removing last element
		list.removeLast();
		
		System.out.println(list); // [b, b, c, d]
		
//		Removing element at particular index
		list.remove(1);
		System.out.println(list); // [b, c, d]

		
		
	}

}
