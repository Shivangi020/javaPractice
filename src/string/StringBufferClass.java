package string;

// Java StringBuffer class is used to create mutable (modifiable) String objects

public class StringBufferClass {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("Hello ");  
		sb.append("Java"); //original string is changed  
		System.out.println(sb); // Hello Java  

	}

}
