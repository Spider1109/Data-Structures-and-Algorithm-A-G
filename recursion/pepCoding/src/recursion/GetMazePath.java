package recursion;
import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePath {
	//Note: 
//	sr = source row 
//	sc = source column 
//	dr = destination row
//	dc = desitnation column
	public static ArrayList<String> getMazePath( int sr, int sc, int dr, int dc){
		//base case
		if(sr==dr &&sc == dc) {
			ArrayList<String> bres = new ArrayList<>();
			bres.add(" ");
			return bres;
		}
		ArrayList<String> heights = new ArrayList<>();
		ArrayList<String> widths = new ArrayList<>();
		//edge case: 
		if(sc<dc) {
			heights = getMazePath(sr,sc+1,dr, dc );
		}
		if(sr<dr) {
			widths = getMazePath(sr+1, sc, dr,dc);
		}
		
		ArrayList<String> path = new ArrayList<>();
		for(String height: heights) {
			path.add("h"+height);
		}
		for(String width: widths) {
			path.add("w"+width);
		}
		return path;
		
	}
		
	
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		int row = scan.nextInt();
		int col = scan.nextInt();
		ArrayList<String> result = getMazePath(0,0,row-1, col-1);
		System.out.println(result);
		scan.close();
		}
}
