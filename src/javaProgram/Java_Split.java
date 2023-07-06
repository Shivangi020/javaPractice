package javaProgram;

public class Java_Split {
	
	public static void main(String args[]) {
		
		String str="02-06-2023";
		
		String []str1=str.split("-");
		for(int i=str1.length-1;i>=0;i--) {
			System.out.println(str1[i]);
		}
	}

}


