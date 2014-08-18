import java.util.ArrayList;

public class c9q5{
	public static int findString(ArrayList<String> list,String given){
		if(list==null || given ==null)
			return -1;
		if("".equals(given)){
			for(int i=0;i<list.size();i++){
				if("".equals(list.get(i)))
					return i;
			}
		}
		return search(list,given,0,list.size()-1);
	}
	public static int search(ArrayList<String> list,String given,int left,int right){
		if(left>right)
			return -1;
		while("".equals(list.get(right)))
			right--;
		int middle = (left+right)/2;
		while("".equals(list.get(middle)))
			middle++;
		int comp = given.compareTo(list.get(middle));
		if(comp==0)
			return middle;
		if(comp<0)
			right=middle-1;
		else
			left=middle+1;
		return search(list,given,left,right);
	}
	public static void main(String[] args){
		ArrayList<String> list=new ArrayList<String>();
		list.add("at");
		list.add("");
		list.add("");
		list.add("");
		list.add("ball");
		list.add("");
		list.add("");
		list.add("car");
		list.add("");
		list.add("");
		list.add("dad");
		list.add("");
		list.add("");
		System.out.println(findString(list,"ball"));
		System.out.println(findString(list,"ballcar"));
	}
}