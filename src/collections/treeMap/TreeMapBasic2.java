package collections.treeMap;

import java.util.TreeMap;

public class TreeMapBasic2 {

	public static void main(String[] args) {
          TreeMap<Integer , String> map = new TreeMap<>();
      	  map.put(70, "cricket");
      	  map.put(41, "Badminton");
      	  map.put(20, "tennis");
      	  map.put(98, "chess");
      	  map.put(68, "volleyball");
      	  map.put(54, "basketball");
      	  
      	  System.out.println(map.ceilingEntry(10)); // 20=tennis
      	  
      	  System.out.println(map.floorEntry(45)); // 41=Badminton
      	  
      	  System.out.println(map.descendingMap()); // {98=chess, 70=cricket, 68=volleyball, 54=basketball, 41=Badminton, 20=tennis}
      	  System.out.println(map.descendingKeySet()); // [98, 70, 68, 54, 41, 20]
      	  
      	  

	}

}
