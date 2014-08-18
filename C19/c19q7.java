public class c19q7{
	public static int maxSequence(int[] sequence){
		int maxSum=0;
		int sum =0;
		for(int i=0;i<sequence.length;i++){
			sum+=sequence[i];
			if(sum>maxSum)
				maxSum=sum;
			if(sum<0)
				sum=0;
		}
		return maxSum;
	}
	public static void main(String[] args){
		int[] sequence = new int[]{2,-8,3,-2,4,-10};
		System.out.println(maxSequence(sequence));
	}
}