package collections.queue;

import java.util.LinkedList;
import java.util.Queue;

/*
 * 	element() method - this returns the head of the
 * 	Queue. Head is the first element of Queue
 * 
 *  poll() method - this removes and returns the 
 *  head of the Queue. Returns null if the Queue is empty
 *  
 *  peek() method - it works same as element() method,
 *  however it returns null if the Queue is empty
 * 
 */
public class QueueBasic2 {

	public static void main(String[] args) {
		
		Queue<String> q = new LinkedList<>();
		
//		Adding elements in the queue
		q.add("mango");
		q.add("grapes");
		q.add("banana");
		q.add("guava");
		q.add("lichi");
		q.add("cherry");
		
		System.out.println(q); // [mango, grapes, banana, guava, lichi, cherry]
		System.out.println("Head " + q.element()); // mango
		
		System.out.println(q.poll()); // mango
		System.out.println(q); // [grapes, banana, guava, lichi, cherry]
		
		System.out.println(q.peek()); // grapes
	}

}
