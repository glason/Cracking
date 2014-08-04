/**
*Given an image represented by an NxN matrix, where each pixel in the image is 4 
*bytes, write a method to rotate the image by 90 degrees Can you do this in place?
*/
public class c1q6{
	public static void rotate(int[][] matrix, int n){
		for(int layer=0;layer<n/2;layer++){
			for(int i=0;i<n-layer*2-1;i++){
				int tmp=matrix[layer][layer+i];
				matrix[layer][layer+i]=matrix[n-layer-i-1][layer];
				matrix[n-layer-i-1][layer]=matrix[n-layer-1][n-layer-i-1];
				matrix[n-layer-1][n-layer-i-1]=matrix[layer+i][n-layer-1];
				matrix[layer+i][n-layer-1]=tmp;
			}
		}
	}
	public static void main(String[] args){
		int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		rotate(matrix,3);
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
}
			
