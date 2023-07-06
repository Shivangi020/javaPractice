package collections.hashSet;

import java.util.HashSet;

/* This class implements the Set interface.
 * HashSet internally uses Hashtable data structure.
 * HashSet doesn’t maintain any kind of order of its elements
 * It does not guarantee the iteration order of the set. This means that the iteration order of Java HashSet elements doesn’t remain constant. 
 * This class permits the null element. 
 * doesn’t allow duplicates.
 * */

/** HashSet -> AbstractSet -> Set -> Collection -> Iterable */

public class HashSetBasic {

	public static void main(String[] args) {
		
		HashSet<Integer> hSet = new HashSet<>();
		
		hSet.add(2);
		hSet.add(2);
		hSet.add(8);
		hSet.add(7);
		hSet.add(22);
		
	      //Addition of null values
	      hSet.add(null);
	      hSet.add(null);

		System.out.println(hSet); // [null, 2, 22, 7, 8]: duplicate 2 and null is not added in hSet and also not in order the element were added
		
		
		
		
	}

}
