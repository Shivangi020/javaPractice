package collections.hashMap;

import java.util.HashMap;

public class HashMapBasic2 {

	public static void main(String[] args) {
		HashMap<Integer , String> hmap = new HashMap<Integer , String>();
		hmap.put(11, "Mango");
		hmap.put(20, "Banana");
		hmap.put(7, "Guava");
		hmap.put(25, "Lichi");
		hmap.put(32, "Kiwi");
		
		System.out.println(hmap); // {32=Kiwi, 20=Banana, 7=Guava, 25=Lichi, 11=Mango}
		
		hmap.replace(7, "cherry");
		System.out.println(hmap); // {32=Kiwi, 20=Banana, 7=cherry, 25=Lichi, 11=Mango}
		
		System.out.println(hmap.containsKey(11)); // true
		System.out.println(hmap.containsValue("pineapple")); // false
		
		System.out.println(hmap.keySet()); // [32, 20, 7, 25, 11] : returns the Set of the keys fetched from the map.
		
		System.out.println(hmap.values()); // [Kiwi, Banana, cherry, Lichi, Mango] : returns a collection of values of map.
	

		
	}

}
