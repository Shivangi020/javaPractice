package collections.queue;

import java.util.LinkedList;
import java.util.Queue;

/* A Queue is designed in such a way so that the elements added to it are placed at the end of Queue 
 * and removed from the beginning of Queue */

/** FIFO (First In First Out) */

/* Queue interface in Java collections has two implementation: LinkedList and PriorityQueue */

/*NOTE : Queue is an interface so we cannot instantiate it, 
 * rather we create instance of LinkedList or PriorityQueue and assign it to the Queue */



public class QueueBasic1 {
	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		
//		Adding elements in the queue
		q.add("mango");
		q.add("grapes");
		q.add("banana");
		q.add("guava");
		q.add("lichi");
		q.add("cherry");
		
		System.out.println("Elements in Queue:"+q); //Elements in Queue:[mango, grapes, banana, guava, lichi, cherry]
		
//		Removing elements from the queue
//		this would remove the first element from the Queue 
		q.remove();
		System.out.println(q); // [grapes, banana, guava, lichi, cherry]
		
	
	}
}
