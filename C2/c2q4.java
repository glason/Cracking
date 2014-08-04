public class c2q4{
	public static Node addList(Node p, Node q){
		if(p ==null || q==null)
			return null;
		int carry = 0;
		Node head = null;
		Node current = null;
		while(p!=null || q!=null){
			Node next = new Node(0);
			if(head ==null){
				head=next;
				current=next;
			}
			else{
				current.next=next;
				current=next;
			}
			int sum=0;
				if(p==null)
					sum= q.data+carry;
				else if(q==null)
					sum= p.data+carry;
				else
					sum=p.data+q.data+carry;
			next.data = sum%10;
			carry = sum/10;
			if(p!=null)
				p=p.next;
			if(q!=null)
				q=q.next;
		}
		return head;
	}
	public static void main(String[] args){
		Node p1=new Node(3);
		Node p2=new Node(1);
		Node p3=new Node(5);
		p1.next = p2;
		p2.next = p3;

		Node q1=new Node(5);
		Node q2=new Node(9);
		Node q3=new Node(2);
		q1.next = q2;
		q2.next = q3;

		Node sum = addList(p1,q1);
		while(sum!=null){
			System.out.print(sum.data+"->");
			sum=sum.next;
		}
		System.out.print("\n");
	}
}


