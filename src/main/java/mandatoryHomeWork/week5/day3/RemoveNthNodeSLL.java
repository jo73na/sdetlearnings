package mandatoryHomeWork.week5.day3;

import mandatoryHomeWork.week4.day4.RemoveLinkedListElements.ListNode;

public class RemoveNthNodeSLL {

	public static void main(String[] args) {

		ListNode n7 = new ListNode(7, null);
		ListNode n6 = new ListNode(6, n7);
		ListNode n5 = new ListNode(5, n6);
		ListNode n4 = new ListNode(4, n5);
		ListNode n3 = new ListNode(3, n4);
		ListNode n2 = new ListNode(2, n3);
		ListNode ll1 = new ListNode(1, n2);
		displayAll(ll1);
		removeNthFromEnd(ll1, 5);
		displayAll(ll1);
	}

	public static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public static ListNode removeNthFromEnd(ListNode head, int n) {
		if (head.next == null)
			return head.next;
		ListNode root = new ListNode(0);
		root.next = head;
		ListNode f = root;
		ListNode s = root;
		for (int i = 0; i < n; i++) {
			f = f.next;
		}
		while (f != null && f.next != null) {
			f = f.next;
			s = s.next;
		}
		s.next = s.next.next;

		return root.next;

	}
	public static void displayAll(ListNode l) {
		ListNode temp = new ListNode();
		temp = l;
		System.out.print("[ ");
		while (temp != null) {
			System.out.print(temp.val + ", ");
			temp = temp.next;
		}
		System.out.print("Null ]");
		System.out.println();
		
	}

}
