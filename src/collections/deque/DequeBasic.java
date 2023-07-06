package collections.deque;

import java.util.ArrayDeque;
import java.util.Deque;

/* Deque is a Queue in which you can add and remove elements from both sides. */
/* Deque is an interface and has two implementations: LinkedList and ArrayDeque */

/*
* We cannot create instance of a Deque as it is an
* interface, we can create instance of ArrayDeque or
* LinkedList and assign it to Deque
*/

public class DequeBasic {

	public static void main(String[] args) {
		 Deque<String> dq = new ArrayDeque<String>();
			dq.add("Glenn");
			dq.add("Negan");
			dq.addLast("Maggie");
			dq.addFirst("Rick");
			dq.add("Daryl");
			    
			System.out.println("Elements in Deque:"+dq); // [Rick, Glenn, Negan, Maggie, Daryl]
			
			/*
			 * We can remove element from Deque using remove() method,
			 * we can use normal remove() method which removes first 
			 * element or we can use removeFirst() and removeLast()
			 * methods to remove first and last element respectively.
			 */
			
			System.out.println("Removed element: "+dq.removeLast()); // Daryl
		    
			/*
			 * element() method - returns the head of the
			 * Deque. Head is the first element of Deque
			 */
			 System.out.println("Head: "+dq.element()); // Rick
			    
			/*
			 * pollLast() method - this method removes and returns the 
			 * tail of the Deque(last element). Returns null if the Deque is empty.
			 * We can also use poll() or pollFirst() to remove the first element of
			 * Deque.
			 */
			System.out.println("poll(): "+dq.pollLast()); // Maggie
			    
			/*
			 * peek() method - it works same as element() method,
			 * however it returns null if the Deque is empty. We can also use 
			 * peekFirst() and peekLast() to retrieve first and last element
			 */
			System.out.println("peek(): "+dq.peek()); // Rick
			    
			//Again printing the elements of Deque
			System.out.println("Elements in Deque:"+dq); // [Rick, Glenn, Negan]
	}

}
