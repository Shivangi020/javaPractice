package collections.priorityQueue;

import java.util.PriorityQueue;

/* A PriorityQueue is used when the objects are supposed to be processed based on the priority. */

/* The PriorityQueue is based on the priority heap.*/

/* The elements of the priority queue are ordered according to the natural ordering, 
 * or by a Comparator provided at queue construction time, depending on which constructor is used.   */

/* We can’t create a PriorityQueue of Objects that are non-comparable */


public class PriorityQueueBasic1 {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
//		Adding elements in priortiy queue
		pq.add(74);
		pq.add(25);
		pq.add(120);
		pq.add(98);
		pq.add(34);
		pq.add(14);
        
	    System.out.println(pq); // [14, 34, 25, 98, 74, 120]
	    
		// Printing the top element of PriorityQueue
        System.out.println(pq.peek()); // 14
        
        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(pq.poll());
        
        System.out.println(pq.peek()); // 25
        
        System.out.println(pq.isEmpty()); // false
        
        System.out.println(pq); // [25, 34, 120, 98, 74]

	}

}
