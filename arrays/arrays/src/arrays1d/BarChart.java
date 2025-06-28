
/*questions: 
	desc: A bar chart of astreiks representing value of array a
	constraints : 1<=n<=30
	              0<=n1, n2, ..n elements <=10
	sampleInput: 
		5
		3
		1
		0
		7
		5
	sampleoutput: 
		     *
		     *
		     * *
		     * *
		*    * *
		*    * *
		* *  * *  
		
		*/
package arrays1d;
import java.util.Scanner;
public class BarChart {
	public static void printBarChart(int[] arr, int length) {
	    // Initialize max to smallest possible value
	    int max = Integer.MIN_VALUE;
	    
	    // Find the maximum value in the array
	    for (int i = 0; i < length; i++) {
	        if (arr[i] > max) {
	            max = arr[i];
	        }
	    }
	    
	    // Print each bar
	    for (int i = max; i > 0; i--) {
	       for(int j = 0 ; j<arr.length; i++) {
	    	   if(arr[j]> i) {
	    		   System.out.print("*\t");
	    	   }
	    	   else {
	    		   System.out.print("\t");
	    	   }
	       }
	        
	        // Move to next line for next bar
	        System.out.println();
	    }
	}
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		int [] arr = new int [length];
		for(int i=0; i<length; i++) {
			arr[0] = scan.nextInt();
		}
		printBarChart(arr, length);
		scan.close();
	}
}
