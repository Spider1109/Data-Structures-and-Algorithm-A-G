package bitManipulation;

public class DecimalToBinary {
	public static int decimalToBinary(String str) {
		int len = str.length();
		int num =0;
		int power =1;
		for(int i =len-1; i>=0; i--) {
			int digit = str.charAt(i);
			if(digit == '1' ) {
				num = num + power;
				power *=2;
			}
		}
		return num;
	}
	public static void main(String [] args) {
		String str = "101111";
		int result = decimalToBinary(str);
		System.out.println(result);
		
	}
}
