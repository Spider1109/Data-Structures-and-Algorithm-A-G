package striverTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node {
	int data;
	Node left;
	Node right;
	public Node(){
		data=0;
		left = null;
		right = null;
	}
	public Node(int val) {
		data = val;
		left = null;
		right = null;
	}
}
public class Zig_zagTraversal {
	public List<List<Integer>> zigzagTraversal(Node root){
		List<List<Integer>> result = new ArrayList<>();
		//Checked edge cases:
		if(root == null) return result;
		//Queue to perform 
		//level order traversal
		Queue<Node> nodesQueue = new LinkedList<>();
		nodesQueue.add(root);
		//Flag to determine the direction of traversal 
		boolean leftToRight = true;
		// continue traversal until queue is empty
		while(!nodesQueue.isEmpty()) {
			//get the number of nodes at the current level
			int size = nodesQueue.size();
			List<Integer>row = new ArrayList<>();
			
			//Traverse nodes at the current level
			for(int i=0; i<size; i++) {
				//get the front node from the queue
				Node node = nodesQueue.poll();
				//determine the index to insert the nodes value based on the traversal direction
				int index = leftToRight? i : (size-1-i);
				// Insert the node's value at the determined index
				row.add(index, node.data);
				//Enqueue the left and right children if they exist
				if(node.left != null) {
					nodesQueue.add(node.left);
				}
				if(node.right!=null) {
					nodesQueue.add(node.right);				
				}
			}
			//switch the traversal direction for the next level
			leftToRight = !leftToRight;
			result.add(row);
		}
		//return the final resul of the zigzag level order traversal 
		return result;
	}
	class Main {
	    static void printResult(List<List<Integer>> result) {
	        for (List<Integer> row : result) {
	            for (int val : row) {
	                System.out.print(val + " ");
	            }
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {
	        // Creating a sample binary tree
	        Node root = new Node(1);
	        root.left = new Node(2);
	        root.right = new Node(3);
	        root.left.left = new Node(4);
	        root.left.right = new Node(5);
	        root.right.left = new Node(6);
	        root.right.right = new Node(7);

	        Zig_zagTraversal solution = new Zig_zagTraversal();

	        // Get the zigzag level order traversal
	        List<List<Integer>> result = solution.zigzagTraversal(root);

	        // Print the result
	        printResult(result);
	    }
	}
}
