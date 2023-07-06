package collections.linkedList;

import java.util.LinkedList;

// public void push(E e): Inserts the element at the front of the list.

// public E pop(): Removes and returns the first element of the list.

public class LinkedListPushPop {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("f");
		list.add("e");

		
		System.out.println(list);  // [a, b, c, d, f, e]
		
		list.push("z");
		System.out.println(list);  // [z, a, b, c, d, f, e]
		
		list.pop();
		System.out.println(list);  // [a, b, c, d, f, e]
	}

}
