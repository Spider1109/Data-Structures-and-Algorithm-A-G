package bitManipulation;

public class Swap2Numbers {
	//swaping numbers using xor operations:
	public static void swap2Numbers(int n1, int n2) {
		n1 = n1^n2;
		n2 = n1^n2;
		n1 = n1^n2;
		System.out.println("number exchanged: "+ n1 + ","+n2);
	}
	public static void main(String [] args) {
		int n1 =10;
		int n2 = 20;
		swap2Numbers(10,20);
		
	}
}
