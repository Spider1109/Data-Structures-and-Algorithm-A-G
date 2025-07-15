package TreeRevision;

//class TreeNode{
//	int value;
//	TreeNode left;
//	TreeNode right;
//	public TreeNode(int data1, TreeNode left1, TreeNode right1) {
//		value = data1;
//		left = left1;
//		right = right1;
//	}
//	public TreeNode(int data1) {
//		value = data1;
//		left = null;
//		right = null;
//	}
//	public TreeNode () {
//		value = 0;
//		left = null;
//		right = null;
//	}
//	public static int maximumHeight(TreeNode root) {
//		if(root == null) return 0;
//		int left = maximumHeight(root.left);
//		int right = maximumHeight(root.right);
//		int max = Math.max(left, right);
//		return 1+max;
//	}
//}
//public class MaximumHeight {
//	public static void main(String [] args) {
//		  // Creating a sample binary tree
//    TreeNode root = new TreeNode(1);
//    root.left = new TreeNode(2);
//    root.left.right = new TreeNode(5);
//    root.right = new TreeNode(3);
//    root.left.left = new TreeNode(4);
//    root.right.left = new TreeNode(6);
//    root.right.right = new TreeNode(7);
//    int result = TreeNode.maximumHeight(root);
//    System.out.println(result);
//	}
//}
