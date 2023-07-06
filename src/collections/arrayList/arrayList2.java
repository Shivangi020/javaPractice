package collections.arrayList;

import java.util.ArrayList;

/* can use the set method to change an element in ArrayList */
/* can use remove() method to remove elements from an ArrayList */
public class arrayList2 {

	public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<>();
	list.add("ankita");
	list.add("shivangi");
	list.add("kuhu");
	list.add("axz");
	list.add("lmn");
	list.add("oip");
	
	System.out.println(list); // [ankita, shivangi, kuhu, axz, lmn, oip]
	list.set(1,"Krishu");
	System.out.println(list); // [ankita, Krishu, kuhu, axz, lmn, oip]
	

	list.remove("axz");
	System.out.println(list); // [ankita, Krishu, kuhu, lmn, oip]
	
	list.remove(3);
	System.out.println(list); // [ankita, Krishu, kuhu, oip]
	}

}
