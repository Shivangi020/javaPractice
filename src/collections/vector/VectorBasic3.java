package collections.vector;

import java.util.Vector;

public class VectorBasic3 {

	public static void main(String[] args) {
		
		Vector<Integer> vec = new Vector<>(2,3);
		
		vec.add(1);
		vec.add(2);
		
		System.out.println("size " + vec.size()); // 2
		System.out.println("Capacity " + vec.capacity()); // 2
		
		vec.add(3);

		System.out.println("size " + vec.size()); // 3
		System.out.println("Capacity after increment " + vec.capacity()); // 5 : 2 + 3
		
		vec.add(5);
		vec.add(6);
		
		System.out.println("size " + vec.size()); // 5
		System.out.println("Capacity " + vec.capacity()); // 5 
		
		vec.add(8);
		
		
		System.out.println("size " + vec.size()); // 5
		System.out.println("Capacity after increament " + vec.capacity()); // 8 : 5 + 3
		

	}

}
