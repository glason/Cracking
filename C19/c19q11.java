public class c19q11{
	public static void printPairs(int[] array,int sum){
		int first=0;
		int last = array.length-1;
		while(first<last){
			int tmp=array[first]+array[last];
			if(tmp==sum){
				System.out.println(array[first]+"+"+array[last]);
				first++;
				last--;
			}else if(tmp<sum){
				first++;
			}else{
				last--;
			}
		}
	}
	public static void main(String[] args){
		int[] array= new int[]{-2,-1,0,3,5,6,7,9,13,14};
		printPairs(array,11);
	}
}