public class c2q2{
	public static Node nthLast(Node head,int n){
		Node p,q;
		p=head;
		q=null;
		int count=0;
		while(p.next!=null){
			if(count==n-1){
				q=head;
			}
			count++;
			p=p.next;
			if(q!=null){
				q=q.next;
			}
		}
		return q;
	}

	public static void main(String[] args){
		Node n1 = new Node(4);
		Node n2 = new Node(3);
		Node n3 = new Node(2);
		Node n4 = new Node(1);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		Node nth = nthLast(n1,3);
		System.out.println(nth.data);
	}
}
