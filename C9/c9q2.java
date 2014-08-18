import java.util.Comparator;
import java.util.Arrays;

public class c9q2 implements Comparator<String>{
	public String sortString(String s){
		char[] chars = s.toCharArray();
		Arrays.sort(chars);
		return new String(chars);
	}
	@Override
	public int compare(String o1,String o2){
		return sortString(o1).compareTo(sortString(o2));
	}
}