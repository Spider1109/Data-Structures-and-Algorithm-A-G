package recursion;

public class LastOccurance {
	public static int lastOccurance(int[] arr,int indx ,int num){
		if(indx<0) return -1;
		int fisa =lastOccurance(arr, indx-1 , num);
		if(arr[indx]==num) return indx;
		else return fisa;
	}
	public static void main(String[] args) {
		int [] arr = {10,20,30,0,40,30};
		int indx =arr.length-1;
		int num = 30;
		int result =lastOccurance(arr, indx,num);
		System.out.println(result);
	}
}
