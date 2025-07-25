package basics;
import java.util.Scanner;

public class FrequencyCounter {
	public static int frequencyCounter(int[] arr, int num) {
		int n = arr.length;
		int count = 0;
		for(int i=0; i<n; i++) {
			if(arr[i]== num) count++;
			
		}
		return count;
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int [] arr = new int [length];
		for(int i=0; i<length; i++) {
			arr[i]= sc.nextInt();
			
		}
		int target = sc.nextInt();
		int result = frequencyCounter(arr, target);
		System.out.println(result);
		sc.close();
	}
}
