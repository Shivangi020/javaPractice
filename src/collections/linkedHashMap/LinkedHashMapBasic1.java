package collections.linkedHashMap;


/* LinkedHashMap is a Hash table and linked list implementation of the Map interface, 
 * with predictable iteration order */

/* LinkedHashMap maintains the insertion order. */
import java.util.LinkedHashMap;

public class LinkedHashMapBasic1 {

	public static void main(String[] args) {
		LinkedHashMap<Integer , String> map = new LinkedHashMap<>();
		
		map.put(70, "cricket");
		map.put(41, "Badminton");
		map.put(20, "tennis");
		map.put(98, "chess");
		map.put(68, "volleyball");
		
		System.out.println(map); // {70=cricket, 41=Badminton, 20=tennis, 98=chess, 68=volleyball} : Printed in order element were added
		
		

		
		

	}

}
