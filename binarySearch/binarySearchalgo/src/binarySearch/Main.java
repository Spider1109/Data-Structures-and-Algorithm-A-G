package binarySearch;

import java.util.Scanner;

public class Main {
	public static int binarySearch(int n, int[] a, int k) {
		int low = 0;
		int high = n-1;
		while(low <= high) {
			int mid = low +(high-low)/2;
			if(a[mid]==k) return mid;
			else if(a[mid]>k) high= mid=1;
			else low = mid+1;
		}
		return -1;
		
	}
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter length of array: ");
		int n = scan.nextInt();
		int [] arr = new int [n];
		for(int i =0; i<n ; i++) {
			System.out.println("Enter the value at index " +i);
			arr[i]= scan.nextInt();
		}
		System.out.println("Enter target: ");
		int target = scan.nextInt();
		int result = binarySearch(n, arr, target);
		System.out.println("The result:"+result);
		
	}
}
