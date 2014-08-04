public class Tower{
	public Stack plates;
	public int index;
	public Tower(int i){
		index=i;
		plates = new Stack();
	}
	public void add(int p){
		if(!plates.isEmpty()&&plates.peek()<=p){
			System.out.println("add plate error");
		}else{
			plates.push(new Node(p));
		}
	}
	public void moveTopTo(Tower des){
		int top = plates.pop().value;
		des.add(top);
		System.out.println("Move disk "+top+" from Tower"+index+" to Tower"+des.index);
	}
	public void moveCountTo(int count,Tower des,Tower buffer){
		if(count>0){
			moveCountTo(count-1,buffer,des);
			moveTopTo(des);
			buffer.moveCountTo(count-1,des,this);
		}
	}
	public static void main(String[] args){
		Tower t1 = new Tower(1);
		t1.add(3);
		t1.add(2);
		t1.add(1);
		Tower t2 = new Tower(2);
		Tower t3 = new Tower(3);
		t1.moveCountTo(3,t3,t2);
	}
}
				
