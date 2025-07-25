package arrays1d;

import java.util.Scanner;

public class SumOfTwoArray {
	public static int[] sumOfTwoArray(int[] nums1, int [] nums2) {
		int n1 = nums1.length;
		int n2 = nums2.length;
		
		int max = Math.max(n1, n2);
		int [] arr = new int[max];
		for(int i=max-1; i>0; i--) {
			arr[i]= nums1[i]+nums2[i];
		}
		
		return arr;
	}
	
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int [] nums1 = new int[n1];
		for(int i=0; i<n1; i++) {
			nums1[i] = scan.nextInt();
		}
		int n2 = scan.nextInt();
		int [] nums2 = new int [n2];
		for(int i=0; i<n2; i++) {
			nums2[i]= scan.nextInt();
		}
		
		int [] arr = sumOfTwoArray(nums1, nums2);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
