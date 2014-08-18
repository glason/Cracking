public class c8q8{
	private static  int[] arrange = new int[8];
	public static boolean checkRow(int row){
		for(int i=0;i<row;i++){
			int diff = Math.abs(arrange[row]-arrange[i]);
			if(diff==0||diff==row-i)
				return false;
		}
		return true;
	}
	public static void placeQueen(int row){
		if(row==8){
			for(int i=0;i<8;i++){
				for(int j=0;j<8;j++){
					if(arrange[i]==j)
						System.out.print("Q");
					else
						System.out.print("+");
				}
				System.out.println();
			}
			System.out.println("////////");
			return;
		}
		for(int i=0;i<8;i++){
			arrange[row]=i;
			if(checkRow(row))
				placeQueen(row+1);
		}
	}
	public static void main(String[] args){
		placeQueen(0);
	}
}