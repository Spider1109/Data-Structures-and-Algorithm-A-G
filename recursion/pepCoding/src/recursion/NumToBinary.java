package recursion;
public class NumToBinary {
    public static int numToBinary(int num) {
        if (num == 0) return 0;
        if (num == 1) return 1;
        
        if (num > 0) {
            return numToBinary(num / 2) * 10 + (num % 2);
        } else {
            return -numToBinary(-num / 2) * 10 - (-num % 2);
        }
    }
    
    public static void main(String[] args) {
        int num = 20;
        int result = numToBinary(num);
        System.out.println(result);  // Output: 10100
    }
}