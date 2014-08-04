import java.util.ArrayList;
public class c4q8{
	public static void findSum(BTree<Integer> root,ArrayList<Integer> list,int sum){
		if(root == null)
			return;
		list.add(root.data);
		int tmp=0;
		for(int i=list.size()-1;i>=0;i--){
			tmp+=list.get(i);
			if(tmp==sum)
				print(list,i);
		}
		ArrayList<Integer> l1=(ArrayList<Integer>)list.clone();
		ArrayList<Integer> l2=(ArrayList<Integer>)list.clone();
		findSum(root.left,l1,sum);
		findSum(root.right,l2,sum);
	}
	public static void print(ArrayList<Integer> list,int start){
		for(int i=start;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
}

