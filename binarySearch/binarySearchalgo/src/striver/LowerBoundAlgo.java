package striver;

import java.util.Scanner;

public class LowerBoundAlgo {
	public static int lowerBoundAlgo(int[] arr, int target) {
		int n = arr.length;
		int low =0, high = n-1;
		int ans =0;
		while(low<high) {
			int mid = low + high-low/2;
			if(arr[mid]>=target) {
				ans = mid;
				high = mid-1;
			}
			else low = mid+1;
		}
		return ans;
	}
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length of array :");
		int n = scan.nextInt();
		int arr[]= new int [n];
		for(int i=0; i<n; i++) {
			System.out.print("Enter the value at "+ i +": ");
			arr[i]= scan.nextInt();
			
		}
		System.out.print("Enter the Traget Value");
		int target = scan.nextInt();
		int result = lowerBoundAlgo( arr, target);
		System.out.println(result);
	}
}
