import java.util.ArrayList;

public class c8q3{
	public static ArrayList<ArrayList<Integer>> getSubArrayLists(ArrayList<Integer> ArrayList){
		ArrayList<ArrayList<Integer>> subArrayLists = new ArrayList<ArrayList<Integer>>();
		int max = 1<<ArrayList.size();
		for(int i=0;i<max;i++){
			ArrayList<Integer> newArrayList = new ArrayList<Integer>();
			int k=i;
			int index=0;
			while(k>0){
				if((k&1)>0){
					newArrayList.add(ArrayList.get(index));
				}
				k=k>>1;
				index++;
			}
			subArrayLists.add(newArrayList);
		}
		return subArrayLists;
	}
	public static void main(String[] args){
		ArrayList<Integer> ArrayLists = new ArrayList<Integer>();
		ArrayLists.add(0);
		ArrayLists.add(1);
		ArrayLists.add(2);
		ArrayLists.add(3);
		ArrayList<ArrayList<Integer>> result = getSubArrayLists(ArrayLists);
		for(ArrayList<Integer> ArrayList:result){
			for(Integer i:ArrayList){
				System.out.print(i+",");
			}
			System.out.println();
		}
	}
}
				