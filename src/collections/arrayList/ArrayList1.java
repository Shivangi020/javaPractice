package collections.arrayList;

import java.util.ArrayList;

/* Arraylist class implements List interface */
/* ArrayList in Java, is a resizable-array */
/* The main difference between array and arraylist is that arraylist can grow and shrink dynamically while an array cannot. */

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		
//		add the element at the end of the List 
		list.add(7);
		list.add(8);
		list.add(9);	
		list2.add("a");
		list2.add("c");
		list2.add("b");
		
		System.out.println(list); // [7, 8, 9]
		System.out.println(list2); // [a, c, b]
		
//		add the element at the specified location in ArrayList 
//		Remember it will not replace the element at that index but will move all element after that index by 1;
		
		list.add(0,1);
		list2.add(1, "u");
		
		System.out.println(list); // [1, 7, 8, 9]
		System.out.println(list2); // [a, u, c, b]
		
	}

}
