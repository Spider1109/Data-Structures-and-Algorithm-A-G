package striverTrees;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
class Node1 {
	int data; 
	Node1 left;
	Node1 right;
    public Node1(int data1, Node1 left1, Node1 right1) {
    	this.data = data1;
    	this.left = left1;
    	this.right = right1;
    }
    public Node1(int data1) {
    	this.data = data1;
    	this.left = null; 
    	this.right = null;
    }
    //Recursive approach:
    public static void preOrder(Node1 root) {
    	if(root == null) return ;
    	System.out.println(root.data);
    	preOrder(root.left);
    	preOrder(root.right);
    }
    
    //Iterative Approach: 
    public static List<Integer> preorder(Node1 root) {
        List<Integer> preOrder = new ArrayList<Integer>();
        if (root == null) return preOrder;

        Stack<Node1> st = new Stack<Node1>();
        st.push(root);

        while (!st.isEmpty()) {
            root = st.pop();
            preOrder.add(root.data);

            if (root.right != null) {
                st.push(root.right);
            }
            if (root.left != null) {
                st.push(root.left);
            }
        }
        return preOrder;
    }

    	
}
public class PreOrderTraversal {
	public static void main(String [] args) {
		  // Creating a sample binary tree
        Node1 root = new Node1(1);
        root.left = new Node1(2);
        root.left.right = new Node1(5);
        root.right = new Node1(3);
        root.left.left = new Node1(4);
        root.right.left = new Node1(6);
        root.right.right = new Node1(7);
        
        Node1.preOrder(root);
        System.out.println("interative code output");
       List<Integer> result = Node1.preorder(root);
       System.out.println(result);
	}
}
