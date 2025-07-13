package recursion;

import java.util.Scanner;

public class PrintFactorial {
	public static int printFactorial(int num) {
		if(num==1||num==0)return 1;
		int fact = num * printFactorial(num-1);
		return fact;
	}
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the no:");
		int num = scan.nextInt();
		int result = printFactorial( num);
		System.out.println(result);
		scan.close();
	}
}
