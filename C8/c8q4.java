import java.util.ArrayList;

public class c8q4{
	public static ArrayList<String> getPermu(String s){
		if(s==null)
			return null;
		ArrayList<String> result = new ArrayList<String>();
		if(s.length()==1){
			result.add(s);
			return result;
		}
		char first = s.charAt(0);
		String substring = s.substring(1);
		ArrayList<String> permu = getPermu(substring);
		for(String string:permu){
			for(int i=0;i<=string.length();i++){
				result.add(insertCharAt(string,first,i));
			}
		}
		return result;
	}
	public static String insertCharAt(String s,char c,int i){
		return s.substring(0,i)+c+s.substring(i,s.length());
	}
	public static void main(String[] args){
		ArrayList<String> result = getPermu("abc");
		for(String s:result)
			System.out.println(s);
	}
}