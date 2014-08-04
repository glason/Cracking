import java.util.List;
import java.util.ArrayList;
public class c3q3{
	List<Stack> stacks = new ArrayList<Stack>();
	public Stack getLastStack(){
		if(stacks.size()==0)
			return null;
		return stacks.get(stacks.size()-1);
	}
	public void push(Node node){
		Stack lastStack = getLastStack();
		if(lastStack==null||lastStack.isFull()){
			Stack stack = new Stack();
			stack.push(node);
			stacks.add(stack);
		}else{
			lastStack.push(node);
		}
	}
	public Node pop(){
		Stack lastStack = getLastStack();
		if(lastStack==null)
			return null;
		Node node= lastStack.pop();
		if(lastStack.top==null)
			stacks.remove(lastStack);
		return node;
	}
	public Node popAt(int index){
		if(index >= stacks.size())
			return null;
		Node node = stacks.get(index).pop();
		for(int i=index+1;i<stacks.size();i++){
			Node bottom = getBottom(stacks.get(i));
			stacks.get(i-1).push(bottom);
		}
		return node;
	}
	public Node getBottom(Stack stack){
		Node first = stack.top;
		Node second = null;
		while(first.next!=null){
			second=first;
			first=first.next;
		}
		if(second==null){
			stack.top=null;
		}else{
			second.next=null;
		}
		return first;
	}
				
}
	


