import java.util.ArrayList;

public class c8q5{
	public static ArrayList<String> getCombi(int left,int right){
		ArrayList<String> result = new ArrayList<String>();
		if(left==0&&right==0){
			result.add("");
			return result;
		}
		if(left>0){
			ArrayList<String> next = getCombi(left-1,right+1);
			for(String s:next){
				result.add("("+s);
			}
		}
		if(right>0){
			ArrayList<String> next = getCombi(left,right-1);
			for(String s:next){
				result.add(")"+s);
			}
		}
		return result;
	}
	public static void main(String[] args){
		ArrayList<String> result = getCombi(3,0);
		for(String s:result)
			System.out.println(s);
	}
}