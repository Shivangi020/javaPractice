package collections.linkedList;

import java.util.LinkedList;

public class LinkedListLoop {

	public static void main(String[] args) {
      
		LinkedList<Integer> ll = new LinkedList<>();
		
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		ll.add(60);
		ll.add(70);
		
		for(int i = 0; i<ll.size() ;i++) {
			System.out.println(ll.get(i));
		}

	}

}
