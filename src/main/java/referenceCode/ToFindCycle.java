package referenceCode;

public class ToFindCycle {

	public static void main(String[] args) {
		Node n7 = new Node(7, null);
		Node n6 = new Node(6, n7);
		Node n5 = new Node(5, n6);
		Node n4 = new Node(4, n5);
		Node n3 = new Node(3, n4);
		Node n2 = new Node(2, n3);
		Node ll1 = new Node(1, n2);
		displat(ll1);
		//Node reverseLL = reverseList(ll1);
		//displat(reverseLL);
	}
	
 public static void displat(Node head) {
		 
		 Node temp=head;
		 System.out.print("[ ");
			while (temp != null) {
				System.out.print(temp.data + "->");
				temp = temp.next;
			}
			System.out.print("Null ]");
			System.out.println();
			
	}

}
