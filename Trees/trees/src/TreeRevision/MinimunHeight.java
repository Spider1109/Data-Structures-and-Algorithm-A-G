//package TreeRevision;
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
//public static int minimumHeight(TreeNode root) {
//	if(root == null) return 0;
//	if(root.left == null) return minimumHeight(root.right)+1;
//	if(root.right == null) return minimumHeight(root.left)+1;
//	return Math.min(minimumHeight(root.right), minimumHeight(root.left))+1;
//}
//}
//public class MinimunHeight {
//	public static void main(String [] args) {
//		  // Creating a sample binary tree
//  TreeNode root = new TreeNode(1);
//  root.left = new TreeNode(2);
//  root.left.right = new TreeNode(5);
//  root.right = new TreeNode(3);
//  root.left.left = new TreeNode(4);
//  root.right.left = new TreeNode(6);
//  root.right.right = new TreeNode(7);
//  int result = TreeNode.minimumHeight(root);
//  System.out.println(result);
//	}
//}
