package striverTrees;
import java.util.List;
import java.util.Stack;
import java.util.ArrayList;
class TreeNode{
	int data; 
	TreeNode left; 
	TreeNode right;
	public TreeNode (int data1, TreeNode left1, TreeNode right1) {
		data = data1;
		left = left1;
		right = right1;
	}
	public TreeNode(int data1) {
		data = data1;
		left = null; 
		right = null;
	}
	public TreeNode() {
		data = 0;
		left = null;
		right = null;
	}
	//Recursive approach:
//	public postOrder
	//Interative approach:
	// using 2 stack problem
	public static List<Integer> postOrderTraversal2stack(TreeNode root){
		Stack<TreeNode> st1 = new Stack<TreeNode>();
		Stack<TreeNode> st2 = new Stack<TreeNode>();
		List<Integer> postOrder = new ArrayList<>();
		if(root == null) return postOrder;
		st1.push(root);
		while(!st1.isEmpty()) {
			root = st1.pop();
			st2.add(root);
			if(root.left != null) st1.push(root.left);
			if(root.right != null) st2.push(root.right);
		}
		while(!st2.isEmpty()) {
			postOrder.add(st2.pop().data);
		}
		return postOrder;
	}
}

public class PostOrderTraversal {
	public static void main(String [] args) {
		  // Creating a sample binary tree
      TreeNode root = new TreeNode(1);
      root.left = new TreeNode(2);
      root.left.right = new TreeNode(5);
      root.right = new TreeNode(3);
      root.left.left = new TreeNode(4);
      root.right.left = new TreeNode(6);
      root.right.right = new TreeNode(7);
      List<Integer> result = TreeNode.postOrderTraversal2stack(root);
      System.out.println(result);
	}
}
