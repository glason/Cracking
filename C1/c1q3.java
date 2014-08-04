public class c1q3{
	public static void removeDuplicate(char[] str){
		if(str==null || str.length<2)
			return;
		int checker=0,newEnd=0;
		for(int i=0;i<str.length;i++){
			int c = str[i];
			if((checker&(1<<c))>0)
				continue;
			if(newEnd!=i)
				str[newEnd]=str[i];
			newEnd++;
			checker|=(1<<c);
		}
		if(newEnd<str.length)
			str[newEnd]=0;
	}
	public static void main(String[] args){
		char[] data0="abcd".toCharArray();
		char[] data1="aaaa".toCharArray();
		char[] data2="aaabbb".toCharArray();
		removeDuplicate(null);
		removeDuplicate(data0);
		removeDuplicate(data1);
		removeDuplicate(data2);
		System.out.println(data0);
		System.out.println(data1);
		System.out.println(data2);
	}
}
