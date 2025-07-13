package recursion;

public class MaximunArray {
	public static int maximumArray(int[]arr, int indx) {
		if(indx==arr.length-1)return arr[indx] ;
		int misa = maximumArray(arr, indx+1);
		if(misa>arr[indx]) return misa;
		else return arr[indx];
		
	}
	public static void main(String[] args) {
		int [] arr = {10,20,30,0};
		int indx =0;
		int result =maximumArray(arr, indx);
		System.out.println(result);
	}
}
