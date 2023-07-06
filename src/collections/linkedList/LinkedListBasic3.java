package collections.linkedList;

import java.util.LinkedList;

public class LinkedListBasic3 {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(29);
		list.add(25);
		list.add(30);
		list.add(37);
		
		System.out.println(list);  // [5, 10, 15, 29, 25, 30, 37]
 
		System.out.println(list.size()); // 7
		
		list.set(3, 20);
		list.set(6, 35);
		
		System.out.println(list);  // [5, 10, 15, 20, 25, 30, 35]
		
	}

}
