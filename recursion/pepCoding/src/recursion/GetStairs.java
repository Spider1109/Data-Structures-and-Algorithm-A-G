package recursion;
import java.util.ArrayList;
import java.util.Scanner;
public class GetStairs {
	public static ArrayList<String> getStairPath(int n){
		//Base case:
		if(n==0) {
			ArrayList<String> bres = new ArrayList<>();
			bres.add(" ");
			return bres;
		}
		else if(n<0) {
			ArrayList<String> bres = new ArrayList<>();
			return bres; 
		}
		//working on faith:
		ArrayList<String> path1 = getStairPath(n-1);
		ArrayList<String> path2 = getStairPath(n-2);
		ArrayList<String> path3 = getStairPath(n-3);
		ArrayList<String> paths = new ArrayList<>();
		for(String path:path1 ) {
			paths.add(1+ path);
		}
		for(String path:path2 ) {
			paths.add(2+ path);
		}
		for(String path:path3 ) {
			paths.add(3+ path);
		}
		return paths;
		
	}
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<String> paths = getStairPath(n);
		System.out.println(paths);
		scan.close();
	}
}
