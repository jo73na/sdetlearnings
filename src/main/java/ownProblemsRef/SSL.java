package ownProblemsRef;



public class SSL  {
	public static class Node {
			int data;
			 Node next ;


		}
	public static void main(String[] args) {

		Node llist = null;
		int[] llistItem = { 1, 2, 3, 4, 5, 6 };
		int llistCount = llistItem.length;
		for (int i = 0; i < llistCount; i++) {
			Node llist_head = insertNodeAtTail(llist, llistItem[i]);
			llist = llist_head;
		}
		displayAll(llist);

	}

	private static Node insertNodeAtTail(Node head, int data) {
		Node temp = head;
		Node addTemp = new Node();
		if (head == null) {
			head = addTemp;
			return head;
		}
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = addTemp;
		return head;

	}

	public static void displayAll(Node l) {
		Node temp = new Node();
		temp = l;
		System.out.print("[ ");
		while (temp != null) {
			System.out.print(temp.data + ", ");
			temp = temp.next;
		}
		System.out.print("Null ]");
		System.out.println();

	}
	
	public static Node reverse(Node head) {
		Node temp=head;
		Node prev=null;
		Node cur=temp;
		
		while (cur!=null) {
			Node nxt=cur.next;
			cur.next=prev;
			prev=cur;
			
		}
		
		
		return temp;
		
	}
	
}
