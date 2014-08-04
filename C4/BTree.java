public class BTree<T>{
	public T data;
	public BTree<T> parent;
	public BTree<T> left;
	public BTree<T> right;
	public BTree(T t){
		data = t;
		parent = null;
		left = null;
		right = null;
	}
}
