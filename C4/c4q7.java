public class c4q7{
	public boolean containsTree(BTree t1,BTree t2){
		if(t1==null)
			return false;
		if(t2==null)
			return true;
		if(t1.data==t2.data&&matchTree(t1,t2))
			return true;
		return containsTree(t1.left,t2)||containsTree(t1.right,t2);
	}
	private boolean matchTree(BTree t1,BTree t2){
		if(t1==null && t2==null)
			return true;
		if(t1==null || t2==null)
			return false;
		if(t1.data!=t2.data)
			return false;
		return matchTree(t1.left,t2.left)&&matchTree(t1.right,t2.right);
	}
}
		
