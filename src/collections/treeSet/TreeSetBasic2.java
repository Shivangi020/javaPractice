package collections.treeSet;

import java.util.TreeSet;

public class TreeSetBasic2 {

	public static void main(String[] args) {

        TreeSet<Integer> tset2 = new TreeSet<Integer>();

        tset2.add(88);
        tset2.add(7);
        tset2.add(101);
        tset2.add(0);
        tset2.add(3);
        tset2.add(222);
        System.out.println(tset2); // [0, 3, 7, 88, 101, 222]
        
        System.out.println(tset2.pollFirst()); // lowest element
        System.out.println(tset2.pollLast());  // highest element
        
        System.out.println(tset2.ceiling(5)); // It returns the equal or closest greatest element  : 7
        System.out.println(tset2.floor(5));  //  It returns the equal or closest least element  : 3

        
        System.out.println(tset2.higher(5)); // same as ceiling
        System.out.println(tset2.lower(5)); // same as floor
	}

}
