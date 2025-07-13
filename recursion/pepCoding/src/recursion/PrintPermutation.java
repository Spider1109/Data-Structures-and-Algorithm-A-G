package recursion;

import java.util.Scanner;

public class PrintPermutation {
	public static void printPermutation(String str,String asf) {
		//edge case 
		if(str.length()==0) {
			System.out.println(asf);
			return;
		}
		for(int i =0 ; i<str.length() ; i++) {
			
			char ch = str.charAt(i);
			String qlPart = str.substring(0,i);
			String qrPart = str.substring(i+1);
			String ros = qlPart + qrPart; 
			printPermutation (ros,asf+ch);
		}
	}
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		String str= scan.next();
		printPermutation(str, "");
	}
}
