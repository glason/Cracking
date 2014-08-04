public class c2q3{
	public static boolean deleteNode(Node node){
		if(node == null || node.next==null)
			return false;
		node.data=node.next.data;
		node.next=node.next.next;
		return true;
	}

	public static void main(String[] args){
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		n1.next = n2;
		n2.next = n3;
		System.out.println(deleteNode(n2));
		while(n1!=null){
			System.out.print(n1.data+"->");
			n1=n1.next;
		}
		System.out.print("\n");
	}
}

