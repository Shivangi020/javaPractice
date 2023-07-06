package collections.arrayList;

import java.util.ArrayList;
import java.util.Collections;

/*  can use the sort() method of the Collections utility class to sort an ArrayList */

public class ArrayListSort {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(7);
		list.add(9);
		list.add(5);
		list.add(10);
		list.add(8);
		list.add(2);
		
		System.out.println(list);  // [7, 9, 5, 10, 8, 2]
		
		Collections.sort(list);
		
		System.out.println(list);  // [2, 5, 7, 8, 9, 10]
	}

}
