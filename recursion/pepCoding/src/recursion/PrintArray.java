package recursion;

public class PrintArray {
	public static void printArray(int[] arr, int indx) {
		if(indx>arr.length-1) return ;
		System.out.println(arr[indx]);
		printArray(arr, indx+1);
	}
	public static void printArrayLast(int[] arr, int indx) {
		if(indx<0) return ;
		
		printArrayLast(arr, indx-1);
		System.out.println(arr[indx]);
	}
	public static void printReverseArrayLast(int[] arr, int indx) {
		if(indx<0) return ;
		System.out.println(arr[indx]);
		printArrayLast(arr, indx-1);
		
	}
	public static void main(String[] args) {
		int [] arr= {10,20,30, 40};
		int indx =0;
		int last = arr.length-1;
		printArray(arr, indx);
		printArrayLast(arr, last);
		 printReverseArrayLast(arr, last);
	}
}
