public class c2q1{
	public static void deleteDuplicate(Node head){
		if(head == null)
			return;
		Node p = head;
		while(p.next!=null){
			Node q = head;
			while(q!=p.next){
				if(p.next.data==q.data){
					p.next=p.next.next;
					break;
				}
				q=q.next;
			}
			if(q==p.next){
				p=p.next;
			}
		}
	}
	
	public static void main(String[] args){
		Node n1= new Node();
		Node n2= new Node();
		Node n3= new Node();
		Node n4= new Node();
		n1.data=1;
		n1.next=n2;
		n2.data=2;
		n2.next=n3;
		n3.data=3;
		n3.next=n4;
		n4.data=3;
		deleteDuplicate(n1);
		while(n1!=null){
			System.out.print(n1.data+"->");
			n1=n1.next;
		}
	}
}
				
