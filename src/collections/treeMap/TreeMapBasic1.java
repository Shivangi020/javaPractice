package collections.treeMap;

import java.util.TreeMap;

/* TreeMap is Red-Black tree based NavigableMap implementation. 
 * It is sorted according to the natural ordering of its keys.*/

/* TreeMap is sorted in the ascending order of its keys */
/* 	TreeMap cannot contain any null key */

/** Hirerachy*/
/* It implements the NavigableMap interface and extends AbstractMap class */




public class TreeMapBasic1 {

	public static void main(String[] args) {
		TreeMap<String,Integer> tmap = new TreeMap<>();
		
		tmap.put("apple", 50);
		tmap.put("papaya", 80);
		tmap.put("kiwi", 120);
		tmap.put("mango", 82);
		tmap.put("lichi", 56);
		
		System.out.println(tmap); // {apple=50, kiwi=120, lichi=56, mango=82, papaya=80} --> Sorted according to key
		
		TreeMap<Integer,String> map = new TreeMap<>();
		
		map.put(70, "cricket");
		map.put(41, "Badminton");
		map.put(20, "tennis");
		map.put(98, "chess");
		map.put(68, "volleyball");
		
		System.out.println(map); // {20=tennis, 41=Badminton, 68=volleyball, 70=cricket, 98=chess}

	}

}
