package basics;
import java.util.Scanner;
public class DigitFrequency {
	public static int digitFrequency(int num, int target) {
		int no = num;
		int count =0;
		while(no!=0) {
			int digit = no %10;
			if(digit == target) count++;
			no = no/10;
		}
		return count;
	}
	public static void main(String [] args) {
		Scanner scan= new Scanner(System.in);
		int num = scan.nextInt();
		int target = scan.nextInt();
		int result = digitFrequency(num, target);
		System.out.println(result);
		scan.close();
	}
}
