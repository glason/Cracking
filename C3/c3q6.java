public class c3q6{
	public static Stack sortStack(Stack origin){
		Stack sorted = new Stack();
		while(!origin.isEmpty()){
			Node top = origin.pop();
			while(!sorted.isEmpty()&&sorted.peek()>top.value){
				origin.push(sorted.pop());
			}
			sorted.push(top);
		}
		return sorted;
	}

	public static void main(String[] args){
		Stack s1 = new Stack();
		s1.push(new Node(3));
		s1.push(new Node(1));
		s1.push(new Node(2));
		Stack s2=null;
		s2=sortStack(s1);
		while(!s2.isEmpty())
			System.out.println(s2.pop().value);
	}
}

