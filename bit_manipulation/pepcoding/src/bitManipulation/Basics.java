package bitManipulation;

import java.util.Scanner;

public class Basics {
	public static void main(String [] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int i = scn. nextInt();
		int j = scn.nextInt();
		int k = scn.nextInt();
		
		//conversion: 
		int onmask = (1<<i);
		int offmask= ~((1<<j));
		int task = (i<<k);
		int cmask = (1<< m);
		
		//print
		System.out.println(n|onmask);
		System.out.println(n& offmask);
		System.out.println(n^task);
		System.out.println((n&cmask)==0? false: true);		
	}
}
