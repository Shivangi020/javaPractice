package collections.treeSet;

import java.util.TreeSet;

/* TreeSet is similar to HashSet except that it sorts the elements in the ascending order 
 * while HashSet doesn’t maintain any order. 
 * TreeSet does not allow null value
 * */



public class TreeSetBasic1 {

	
//	TreeSet is one of the most important implementations of the SortedSet interface in Java that uses a Binary search Tree for storage.
//	It can also be ordered by a Comparator provided at set creation time, depending on which constructor is used
	
	public static void main(String[] args) {
		
		TreeSet<String> tset = new TreeSet<String>();
		
        // Adding elements to TreeSet<String>
        tset.add("ABC");
        tset.add("String");
        tset.add("Test");
        tset.add("Pen");
        tset.add("Ink");
        tset.add("Jack");
        
        System.out.println(tset); // [ABC, Ink, Jack, Pen, String, Test] --> Sorted
        

        TreeSet<Integer> tset2 = new TreeSet<Integer>();
        // Adding elements to TreeSet<Integer>
        tset2.add(88);
        tset2.add(7);
        tset2.add(101);
        tset2.add(0);
        tset2.add(3);
        tset2.add(222);
        System.out.println(tset2); // [0, 3, 7, 88, 101, 222]


	}

}
