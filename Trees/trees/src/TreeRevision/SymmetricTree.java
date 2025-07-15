//package TreeRevision;
//
//class TreeNode{
//int value;
//TreeNode left;
//TreeNode right;
//public TreeNode(int data1, TreeNode left1, TreeNode right1) {
//	value = data1;
//	left = left1;
//	right = right1;
//}
//public TreeNode(int data1) {
//	value = data1;
//	left = null;
//	right = null;
//}
//public TreeNode () {
//	value = 0;
//	left = null;
//	right = null;
//}
//public static boolean symetricTree(TreeNode root) {
//	return checkTree(root.left, root.right);
//}
//private static boolean checkTree(TreeNode n1, TreeNode n2 ) {
//	if(n1== null || n2 == null) return false;
//	if(n1== null && n2 == null) return true;
//	else {
//		return n1.value == n2.value && checkTree(n1.left,n2.right)&& checkTree(n1.right,n2.left);;
//	}
//}
//public class SymmetricTree {
//	public static void main(String [] args) {
//		  // Creating a sample binary tree
//		TreeNode root = new TreeNode(1);
//		root.left = new TreeNode(2);
//		root.left.right = new TreeNode(5);
//		root.right = new TreeNode(3);
//		root.left.left = new TreeNode(4);
//		root.right.left = new TreeNode(6);
//		root.right.right = new TreeNode(7);
//		boolean result = TreeNode.symetricTree(root);
//		System.out.println(result);
//	}
//}
//
