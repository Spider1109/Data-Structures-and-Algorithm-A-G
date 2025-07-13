package recursion;
import java.util.Scanner;
public class PrintIncreasingDecreasing {
	public static void incresaingNum(int num) {
		if(num==0) return;
		incresaingNum(num-1);
		System.out.println(num);
	}
	public static void decreasingNum(int num) {
		if(num<0) return;
		System.out.println(num);
		decreasingNum(num-1);
		
	}
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the no:");
		int num = scan.nextInt();
		
		decreasingNum(num);
		incresaingNum(num);
		scan.close();
	}
}
