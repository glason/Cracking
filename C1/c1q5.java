public class c1q5{
	public static void replace(char[] str, int len){
		int space=0;
		for(int i=0;i<len;i++){
			if(str[i]==' ')
				space++;
		}
		int newLen = len+2*space;
		str[newLen--]='\0';
		for(int i=len-1;i>=0;i--){
			if(str[i]==' '){
				str[newLen--]='0';
				str[newLen--]='2';
				str[newLen--]='%';
			}else{
				str[newLen--]=str[i];
			}
		}
	}
	public static void main(String[] args){
		char[] str1= "abcdefg".toCharArray();
		char[] str2= "abc de fg".toCharArray();
		System.out.print(str1+"->");
		replace(str1,str1.length);
		System.out.print(str1+"\n");
		System.out.print(str2+"->");
		replace(str2,str2.length);
		System.out.print(str2+"\n");
	}
}
