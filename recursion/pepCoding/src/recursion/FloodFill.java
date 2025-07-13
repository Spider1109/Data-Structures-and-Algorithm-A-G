package recursion;

import java.util.Scanner;

public class FloodFill {
	
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int [][] arr = new int [n][m];
		
		for(int i =0; i<n ; i++) {
			for(int j =0; j<arr[0].length ; j++) {
				arr[i][j]= scan .nextInt();
			}
		}
	}
}
