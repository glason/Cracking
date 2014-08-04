public class S1_1{
	public static boolean unique(String words){
		boolean[] isPresent = new boolean[256];
		for(int i=0;i<words.length();i++){
			int word = words.charAt(i);
			if(isPresent[word])
				return false;
			isPresent[word]=true;
		}
		return true;
	}
	
	public static void main(String[] args){
		System.out.println(unique("abc"));
		System.out.println(unique("abca"));
	}
}
