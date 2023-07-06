package collections.hashTable;

import java.util.Hashtable;

/* The Hashtable class extends Dictionary and implements map interface, which maps keys to values. 
 * Any non-null object can be used as a key or as a value. 
 * To successfully store and retrieve objects from a hashtable, 
 * the objects used as keys must implement the hashCode method and the equals method*/

/** Working of HashTable */
/* In Hashtable we specify an object that is used as a key, and the value we want to associate to that key. 
 * The key is then hashed, 
 * and the resulting hash code is used as the index at which the value is stored within the table. */

/* the Hashtable class is synchronized, 
 * which can result in slower performance compared to other implementations of the Map interface.*/


public class HashTableBasic1 {

	public static void main(String[] args) {
		Hashtable<String , Integer> htable = new Hashtable<>();
          
//	   Adding elements in hashtable
	   htable.put("A", 1);
	   htable.put("B", 2);
	   htable.put("C", 3);
	   htable.put("D", 4);
	   htable.put("E", 5);
	   htable.put("F", 6);
	   
	   System.out.println(htable); // {A=1, F=6, E=5, D=4, C=3, B=2}
	   
//	   Updating the the value
	   htable.put("A", 0);
	   System.out.println(htable); // {A=0, F=6, E=5, D=4, C=3, B=2}
	   
//	   Removing the element
	   htable.remove("D");
	   System.out.println(htable); // {A=0, F=6, E=5, C=3, B=2}
	   
//	   Get the value of specific key
	   System.out.println(htable.get("E")); // 5
	   
//	   .hashcode() --> returns returns the hash code value for the Map
	   System.out.println(htable.hashCode()); // 321
	   
	}

}
