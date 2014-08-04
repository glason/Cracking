public class c2q5{
	public static Node findLoopBegin(Node head){
		Node slow = head;
		Node fast = head;
		while(fast!=null && fast.next!=null){
			slow = slow.next;
			fast = fast.next.next;
			if(fast==slow)
				break;
		}
		if(fast==null || fast.next==null)
			return null;
		slow = head;
		while(fast!=slow){
			fast=fast.next;
			slow=slow.next;
		}
		return fast;
	}
	public static void main(String[] args){
		Node n1=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(3);
		Node n4=new Node(4);
		Node n5=new Node(5);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n3;
		Node begin = findLoopBegin(n1);
		System.out.println(begin.data);
	}
}
