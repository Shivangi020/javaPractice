package collections.arrayList;

/* can use size() method of ArrayList to find the number of elements in an ArrayList. */

import java.util.ArrayList;

public class ArrayListSize {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("ankita");
		list.add("shivangi");
		list.add("kuhu");
		list.add("axz");
		list.add("lmn");
		list.add("oip");
		
		System.out.println(list.size());  // 6
		

	}

}
