package recursion;

public class FirstOccurance {
	public static int firstOccurance(int[] arr,int indx ,int num) {
		if(indx> arr.length -1 ) return -1;
		int fisa = firstOccurance(arr, indx+1 , num);
		if(arr[indx]==num) return indx;
		else return fisa;
		
		
		
	}
	public static void main(String[] args) {
		int [] arr = {10,20,30,0,40,30};
		int indx =0;
		int num = 0;
		int result =firstOccurance(arr, indx,num);
		System.out.println(result);
	}
}
