package collections.vector;

import java.util.Vector;

public class VectorBasic2 {

	public static void main(String[] args) {
		Vector<Integer> vec = new Vector<>(2);
		
		vec.add(1);
		vec.add(2);
		
		System.out.println("size " + vec.size()); // 2
		System.out.println("Capacity " + vec.capacity()); // 2
		
		vec.add(5);
		System.out.println("size " + vec.size()); // 3
		System.out.println("Capacity after increment " + vec.capacity()); // 4

	}

}
