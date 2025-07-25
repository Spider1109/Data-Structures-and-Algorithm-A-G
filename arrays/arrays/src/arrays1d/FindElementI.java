package arrays1d;

import java.util.Scanner;

public class FindElementI {
	public static int findElement(int[]a, int target) {
		int n = a.length;
		for(int i=0; i<n; i++) {
			if(a[i]==target)
				return i;
		}
		return -1;
	}
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		int [] a = new int[len];
		for(int i= 0; i< len; i++) {
			a[i] = scan.nextInt();
		}
		int target = scan.nextInt();
		int result = findElement(a,target);
		System.out.println(result);
	}
}
