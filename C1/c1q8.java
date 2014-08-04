public class c1q8{
	public static boolean isRotation(String s1,String s2){
		if(s1==null || s2==null ||s1.length()!=s2.length())
			return false;
		String s1s1 = s1+s1;
		return isSubString(s2,s1s1);
	}
	public static boolean isSubString(String s1,String s2){
		return true;
	}
}
