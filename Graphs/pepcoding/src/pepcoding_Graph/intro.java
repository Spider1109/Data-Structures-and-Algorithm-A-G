package pepcoding_Graph;
import java.util.*;
import java.io.*;
public class intro {
	 static class Edge{
		 int src;
		 int nbr;
		 int wt;
		 Edge(int src, int nbr, int wt){
			 this.src = src;
			 this.nbr = nbr;
			 this.wt = wt;
		 }
	 }
	 public static void main(String [] args) throws Exception {
		 int vces = 7;
		 ArrayList<Edge>[] graph = new ArrayList<Edge>[7];
		 for(int i=0; i<vces; i++) {
			 graph[i]= new ArrayList<Edge>();
			 
		 }
		graph[0].add(new Edge(0,3,40));
		graph[0].add(new Edge(0,1,10));
		
	 }
}
