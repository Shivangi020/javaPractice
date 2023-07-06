package collections.arrayList;

import java.util.ArrayList;

public class ArrayListLoop {

	public static void main(String[] args) {
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		arrlist.add(14);
	    arrlist.add(7);
	    arrlist.add(39);
	    arrlist.add(40);
	    
	    for (int i = 0; i < arrlist.size(); i++) { 		      
	          System.out.println(arrlist.get(i)); 		
	      }  

	}

}
