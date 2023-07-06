package collections.hashMap;

import java.util.HashMap;

/* HashMap is a Map based collection class that is used for storing Key & value pairs 
 * It permits nulls(null values and null key).
 * It is not an ordered collection which means it does not return the keys and values in the same order in which they have been inserted into the HashMap
 * It does not sort the stored keys and values.
 * keys should be unique. If you try to insert the duplicate key, it will replace the element of the corresponding key.
 * It is denoted as HashMap<Key, Value> or HashMap<K, V>. 
 * */

/** Hierarchy */
/* HashMap class extends AbstractMap class and implements Map interface */

public class HashMapBasic1 {

	public static void main(String[] args) {
		HashMap<String,Integer> hmap = new HashMap<String,Integer>();
		
//		Adding Elements in HashMap
		hmap.put("One", 1);
		hmap.put("Two", 2);
		hmap.put("Three", 3);
		hmap.put("Four", 4);
		hmap.put("Five", 5);
		
		System.out.println(hmap); // {Five=5, One=1, Four=4, Two=2, Three=3} : Not in order the elements were added
		
//		Checking duplicate key insertion in HashMap
		hmap.put("Six", 6);
		hmap.put("Six", 6);
		System.out.println(hmap); // {Five=5, Six=6, One=1, Four=4, Two=2, Three=3} : No duplicate key
		
//		Instead of adding the duplicate element hashmap updates the value of key
		hmap.put("Six", 7);
		System.out.println(hmap); // {Five=5, Six=7, One=1, Four=4, Two=2, Three=3} : updated the key "Six" value to 7
		
//		Removing elements 
		hmap.remove("Six");
		System.out.println(hmap); // {Five=5, One=1, Four=4, Two=2, Three=3} : removed the key "Six"
		
//		get the value associated with key
		System.out.println(hmap.get("Four")); // 4
		
		
		
		
		
	}

}
