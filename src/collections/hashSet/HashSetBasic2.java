package collections.hashSet;

import java.util.ArrayList;
import java.util.HashSet;


/* Initial capacity represents the initial data buckets allocated to HashSet, 
 * this automatically increases when HashSet gets full.*/

/* Load factor measures the load of HashSet, it represents how much the HashSet is full. 
 * A load factor of .60 means that when HashSet is 60% full, 
 * the capacity of HashSet is automatically increased.*/

/* Initial capacity : 16
 * Load factor : .75
 * */

public class HashSetBasic2 {

	public static void main(String[] args) {
	
		ArrayList<String> arrList=new ArrayList<>();
	    arrList.add("AA");
	    arrList.add("BB");
	    arrList.add("CC");
	  
//		Adding elements from other Collection
		HashSet<Integer> hset = new HashSet(arrList);
		System.out.println(hset); // [AA, BB, CC]
		
		hset.remove("AA");
		System.out.println(hset); // [BB, CC]
		
		

		

	}

}
