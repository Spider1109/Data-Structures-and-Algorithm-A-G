package recursion;

import java.util.Scanner;

public class TargetSum {
	 public static void printTargetSum(int[] arr, int idx, String set, int sum, int tar) {
		 if(idx == arr.length) {
			 if(sum == tar) {
				 System.out.println(set);
			 }
			 return;
			 
		 }
		 printTargetSum(arr, idx+1, set+arr[idx]+",", sum+arr[idx],tar);
		 printTargetSum(arr, idx+1, set, sum, tar);
		 
	 }
	 public static void main(String [] args) {
		 Scanner scan = new Scanner(System.in);
		 int n = scan.nextInt();
		 int [] arr = new int [n];
		 
		 for(int i =0; i<n ; i++) {
			 arr[i] = scan.nextInt();
		 }
		 int tar = scan.nextInt();
		 printTargetSum(arr, 0, "",0, tar);
	 }
}
