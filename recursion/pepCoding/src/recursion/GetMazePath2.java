package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePath2 {
	public static ArrayList<String> getMazePath2(int sc, int sr, int dc , int dr){
		//edge case
		if(sr == dr && sc == dc) {
			ArrayList<String> bres = new ArrayList<>();
			bres.add("");
			return bres;
			
		}
		//main logic
		ArrayList<String> path = new ArrayList<>();
		//Horizontal traversal 
		for(int ms = 1; ms<=dc-sc; ms++) {
			ArrayList<String> hpaths = getMazePath2(sr, sc+ms, dr, dc);
			for(String hpath: hpaths) {
				path.add("h"+hpath);
			}
		}
		
		//vertical traversal
		for(int ms =1; ms <dr -sr; ms++) {
			ArrayList<String> vpaths = getMazePath2(sr+ms, sc+ms, dr, dc);
			for(String vpath : vpaths ) {
				path.add("v"+vpath);
			}
		}
		
		for(int ms = 1; ms<=dr-sr && ms<= dc-sc ;ms++ ) {
			ArrayList<String> dpaths = getMazePath2(sr+ms, sc+ms, dr,dc);
			for(String dpath: dpaths) {
				path.add("d"+ms+dpath);
			}
		}
		return path;
	}
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int row = scan.nextInt();
		int col = scan.nextInt();
		ArrayList<String> result = 	getMazePath2(1,1,row,col);
		System.out.println (result);
	}
}
