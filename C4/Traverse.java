public class Traverse{
	public static void inOrder(BTree root){
		if(root==null)
			return;
		BTree[] stack = new BTree[100];
		int top = -1;
		BTree p=root;
		while(p!=null ||top !=-1){
			while(p!=null){
				stack[++top]=p;
				p=p.left;
			}
			p=stack[top--];
			System.out.println(p.data);
			p=p.right;
		}
	}
	public static void preOrder(BTree root){
		if(root==null)
			return;
		BTree[] stack = new BTree[100];
		int top = -1;
		BTree p=root;
		while(p!=null ||top !=-1){
			while(p!=null){
				stack[++top]=p;
				System.out.println(p.data);
				p=p.left;
			}
			p=stack[top--];
			p=p.right;
		}
	}
	public static void postOrder(BTree root){
		if(root==null)
			return;
		BTree[] stack = new BTree[100];
		BTree p = root;
		int[] flags = new int[100];
		int flag=0,top=-1;
		while(top!=-1 || p!=null){
			while(p!=null){
				stack[++top]=p;
				flags[top]=0;
				p=p.left;
			}
			if(flags[top]==0){
				p=stack[top].right;
				flags[top]=1;
			}else{
				System.out.println(stack[top].data);
				top--;
			}
		}
	}

	public static void main(String[] args){
		BTree<Integer> root = new BTree<Integer>(2);
		BTree<Integer> left = new BTree<Integer>(1);
		BTree<Integer> right = new BTree<Integer>(3);
		root.left=left;
		root.right=right;
		System.out.println("inOrder:");
		inOrder(root);
		System.out.println("preOrder:");
		preOrder(root);
		System.out.println("postOrder:");
		postOrder(root);
	}
}


