public class c4q5{
	public static BTree inOrderSuc(BTree node){
		if(node ==null)
			return null;
		if(node.parent == null || node.right !=null)
			return leftMost(node.right);
		BTree p = node.parent;
		while(p!=null){
			if(p.left==node)
				return p;
			node = p;
			p=node.parent;
		}
		return null;
	}
	public static BTree leftMost(BTree node){
		if(node == null)
			return null;
		while(node.left!=null)
			node=node.left;
		return node;
	}
}


