public class Stack{
	Node top=null;
	int capacity=100,count=0;
	public boolean isEmpty(){
		return top==null;
	}
	public void push(Node node){
		if(isEmpty()){
			node.next=null;
			top=node;
		}
		else{
			node.next=top;
			top=node;
		}
		count++;
	}
	public Node pop(){
		if(isEmpty())
			return null;
		Node node = top;
		top=top.next;
		count--;
		return node;
	}
	public int peek(){
		return top.value;
	}
	public boolean isFull(){
		return count>=capacity;
	}
}
