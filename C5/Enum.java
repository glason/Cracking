public enum Enum{
	Monday(1),Tuesday(2),Wedsday(3),Thursday(4),Friday(5),Saturday(6),Sunday(7);
	public int value;
	private Enum(int i){
		value=i;
	}
	
	public static void main(String[] args){
		System.out.println(Enum.Monday.value);
	}
}