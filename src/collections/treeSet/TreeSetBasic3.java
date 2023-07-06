package collections.treeSet;

import java.util.TreeSet;

public class TreeSetBasic3 {

	public static void main(String[] args) {

	    TreeSet<Integer> set = new TreeSet<Integer>();

        set.add(88);
        set.add(7);
        set.add(101);
        set.add(0);
        set.add(3);
        set.add(222);
        
        System.out.println(set); // [0, 3, 7, 88, 101, 222]
        
        System.out.println(set.descendingSet()); // [222, 101, 88, 7, 3, 0] : returns the elements in reverse order
        
        System.out.println(set.headSet(88,true)); // [0, 3, 7, 88] : It returns the group of elements that are less than or equal to(if, inclusive is true) the specified element.
	
	    System.out.println(set.tailSet(88,true)); // [88, 101, 222] :It returns a set of elements that are greater than or equal to (if, inclusive is true) the specified element.
	     
	    System.out.println(set.subSet(3, 88)); // [3, 7] : 	It returns a set of elements that lie between the given range which includes fromElement and excludes toElement.


	}

}
