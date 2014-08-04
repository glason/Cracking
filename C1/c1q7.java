public class c1q7{
	public static void setZero(int[][] matrix){
		int[] rows = new int[matrix.length];
		int[] cols = new int[matrix[0].length];
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				if(matrix[i][j]==0){
					rows[i]=1;
					cols[j]=1;
				}
			}
		}
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				if(rows[i]==1||cols[j]==1){
					matrix[i][j]=0;
				}
			}
		}
	}
	public static void main(String[] args){
		int[][] matrix = new int[][]{{1,2,3},{4,0,6},{7,8,9}};
		setZero(matrix);
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
}
