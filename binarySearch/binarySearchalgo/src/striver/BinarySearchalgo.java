package striver;

import java.util.Scanner;

public class BinarySearchalgo {
	public static int binarySearchAlgo(int[] arr, int target) {
		int n = arr.length;
		int low = 0 , high = n-1;
		while(low<high) {
			int mid = low + high -low /2;
			if(arr[mid]==target) return mid;
			else if(arr[mid]>target) return high = mid-1;
			else low = mid+1;	
		}
		return -1;
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
		int result = binarySearchAlgo( arr, target);
		System.out.println(result);
	}
}
