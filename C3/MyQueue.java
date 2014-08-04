public class MyQueue{
	private Stack s1,s2;
	public MyQueue(){
		s1=new Stack();
		s2=new Stack();
	}
	public void enqueue(int v){
		s1.push(new Node(v));
	}
	public int peek(){
		if(s2.isEmpty()){
			while(!s1.isEmpty()){
				s2.push(s1.pop());
			}
		}
		return s2.peek();
	}
	public int dequeue(){
		if(s2.isEmpty()){
			while(!s1.isEmpty()){
				s2.push(s1.pop());
			}
		}
		return s2.pop().value;
	}
}
