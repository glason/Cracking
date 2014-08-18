public class c19q4{
	public static int max(int a,int b){
		int c = a-b;
		int k= (c>>31)&0x1;
		return a-k*c;
	}
	public static void main(String[] args){
		System.out.println("max of 2 and 3 is "+max(2,3));
	}
}