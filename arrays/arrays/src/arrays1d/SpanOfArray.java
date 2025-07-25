package arrays1d;

import java.util.Scanner;

public class SpanOfArray {
	public static int spanOfArray(int[] nums, int n) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i=0 ; i<n; i++) {
			if(nums[i]>max) {
				max = Math.max(max, nums[i]);
			}
			if(nums[i]<min) {
				min = Math.min(min, nums[i]);
			}
		}
		int result = max- min;
		return result;
	}
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int [] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		int result= spanOfArray(arr, n);
		System.out.println(result);
	}
}
