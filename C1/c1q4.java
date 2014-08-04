public class c1q4{
	public static boolean anagram(String s1, String s2){
		if(s1==null || s2==null || s1.length()==0 || s2.length()==0)
			return false;
		int[] letters = new int[256];
		int count=0;
		for(int i=0;i<s1.length();i++){
			int c = s1.charAt(i);
			if(letters[c]==0)
				count++;
			letters[c]++;
		}
		int i=0;
		for(;i<s2.length()&&count>0;i++){
			int c = s2.charAt(i);
			if(letters[c]==0)
				return false;
			letters[c]--;
			if(letters[c]==0)
				count--;
		}
		if(count!=0 || i!=s2.length())
			return false;
		return true;
	}
	public static void main(String[] args){
		System.out.println("anagram('abc','cba')="+anagram("abc","cba"));
		System.out.println("anagram('abc','ab')="+anagram("abc","ab"));
		System.out.println("anagram('abcde','bcad')="+anagram("abcde","bcad"));
		System.out.println("anagram('abcd','bcade')="+anagram("abcd","bcade"));
		System.out.println("anagram('abcd','bacd')="+anagram("abcd","bacd"));
	}
}
