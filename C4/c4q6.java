public class c4q6{
	private int covers(BTree root,BTree p,BTree q){
		int conver = 0;
		if(root == null)
			return 0;
		if(root == p | root ==q)
			conver+=1;
		conver+=covers(root.left,p,q);
		if(conver==2)
			return 2;
		return conver+covers(root.right,p,q);
	}
	public BTree commonAncestor(BTree root,BTree p,BTree q){
		if(p==q)
			return p;
		if(root==null || root == p || root == q)
			return root;
		int left = covers(root.left,p,q);
		if(left==2)
			return commonAncestor(root.left,p,q);
		int right = covers(root.right,p,q);
		if(right==2)
			return commonAncestor(root.right,p,q);
		if(left==1&&right==1)
			return root;
		return null;
	}
}
