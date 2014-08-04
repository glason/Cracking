public class c4q1{
	public static int maxDepth(BTree root){
		if(root == null)
			return 0;
		return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
	}

	public static int minDepth(BTree root){
		if(root == null)
			return 0;
		return 1+Math.min(minDepth(root.left),minDepth(root.right));
	}
	public static boolean isBalanced(BTree root){
		return maxDepth(root)-minDepth(root)<=1;
	}
}

