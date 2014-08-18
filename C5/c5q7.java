import java.util.ArrayList;

public class c5q7{
	public static int fetch(int digit,int index){
		return (digit&(1<<index))>>index;
	}
	public static int findInteger(ArrayList<Integer> list, int bitLength){
		return findMissing(list,0,bitLength);
	}
	public static int findMissing(ArrayList<Integer> list,int column,int bitLength){
		if(column>=bitLength)
			return 0;
		ArrayList<Integer> oddList = new ArrayList<Integer>();
		ArrayList<Integer> evenList = new ArrayList<Integer>();
		for(Integer i:list){
			if(fetch(i,column)==1)
				oddList.add(i);
			else
				evenList.add(i);
		}
		if(oddList.size()<evenList.size())
			return findMissing(oddList,column+1,bitLength)<<1|1;
		else
			return findMissing(evenList,column+1,bitLength)<<1|0;
	}
	public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(4);
		System.out.println(findInteger(list,3));
	}
}