package recursion;

import java.util.Scanner;

public class LinearPower {
	public static int linearPower(int x, int num) {
		if(x==0 || num ==0) return 1;
		int power = x * linearPower(x,num-1);
		return power;
	}
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the no:");
		int num = scan.nextInt();
		System.out.print("Enter the exponential:");
		int exp = scan.nextInt();
		int result =linearPower( num,exp);
		System.out.println(result);
		scan.close();
	}

}
