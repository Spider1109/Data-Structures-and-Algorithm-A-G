package striverTrees;

import java.util.ArrayList;
import java.util.List;

 class Node{
	int data;
	Node left;
	Node right;
	public Node(int val) {
		data = val;
		left = null;
		right = null;
	}
	public Node() {
		data = 0;
		left = null;
		right = null;
	}
}

public class BoundaryOrderTraversal {
	boolean isLeaf(Node root) {
		return root.left == null && root.right == null;
	}
	
	void addLeftBoundary(Node root, List<Integer>res) {
		Node curr = root.left;
		while(curr != null) {
			//if the current Node is not a leaf, add its value to the result
			if(!isLeaf(curr)) {
				res.add(curr.data);
			}
			//Move to the left child if if exists, otherwise move to the right child
			if(curr.left!=null) {
				curr = curr.left;
			}
			else {
				curr = curr.right;
			}
		}
	}
	//function to add the right boundary of the tree
	void addRightBoundary(Node root, List<Integer>res) {
		Node curr = root.right;
		List<Integer> temp = new ArrayList<>();
		while(curr != null) {
			// if the current node is not a leaf, add its value to a temporary list
			if(!isLeaf(curr)) {
				temp.add(curr.data);
			}
			//Move to the right child if it exists otherwise move to the left child
			if(curr.right= null) {
				curr = curr.right;
			}else {
				curr = curr.left;
			}
		}
		//Reverse and add the values form the temporary list to the result
		for(int i = temp.size()-1; i>0; --i) {
			res.add(temp.get(i));
		}
	}
	//Function to add the leaves 
	void addLeaves(Node root, List<Integer>res) {
		if(isLeaf(root)) {
			res.add(root.data);
			return ;
		}
		
		//Recursive add leaves of the left and right subtrees
		if(root.left != null) {
			addLeaves(root.left,res);
		}
		if(root.right != null) {
			addLeaves(root.right, res);
		}
	}
	// Main function to perform the
    // boundary traversal of the binary tree
    List<Integer> printBoundary(Node root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        // If the root is not a leaf,
        // add its value to the result
        if (!isLeaf(root)) {
            res.add(root.data);
        }

        // Add the left boundary, leaves,
        // and right boundary in order
        addLeftBoundary(root, res);
        addLeaves(root, res);
        addRightBoundary(root, res);

        return res;
    }

    // Helper function to
    // print the result
    void printResult(List<Integer> result) {
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
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

        BoundaryOrderTraversal solution = new BoundaryOrderTraversal();

        // Get the boundary traversal
        List<Integer> result = solution.printBoundary(root);

        // Print the result
        System.out.print("Boundary Traversal: ");
        solution.printResult(result);
    }
}
                   

