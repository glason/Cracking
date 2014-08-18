public class c8q7{
	public static int makeChange(int n,int denom,String way){
		int nextDenom = 0;
		int count=0;
		switch(denom){
			case 25:
				nextDenom = 10;
				break;
			case 10:
				nextDenom = 5;
				break;
			case 5:
				nextDenom = 1;
				break;
			case 1:
				System.out.println(way+n+"*1");
				return 1;
		}
		for(int i=0;i*denom<=n;i++){
			count+=makeChange(n-i*denom,nextDenom,i+"*"+denom+"+");
		}
		return count;
	}
	public static void main(String[] args){
		System.out.println("total:"+makeChange(100,25,""));
	}
}