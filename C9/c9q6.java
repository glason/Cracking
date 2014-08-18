public class c9q6{
	public static boolean findElement(int[][] matrix,int element,int m,int n){
		int row = 0;
		int col=n-1;
		while(row<m&&col>=0){
			if(matrix[row][col]==element)
				return true;
			if(element<matrix[row][col])
				col--;
			else
				row++;
		}
		return false;
	}
}