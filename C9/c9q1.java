public class c9q1{
	public static void merge(int[] a,int m,int[] b,int n){
		int k = m+n-1;
		int i=m-1;
		int j=n-1;
		while(i>=0&&j>=0){
		if(a[i]>b[j])
			a[k--]=a[i--];
		else
			a[k--]=b[j--];
		}
		while(i>=0)
			a[k--]=a[i--];
	}
}