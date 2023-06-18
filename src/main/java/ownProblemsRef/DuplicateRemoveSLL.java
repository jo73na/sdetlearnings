package ownProblemsRef;

public class DuplicateRemoveSLL {

	public static void main(String[] args) {
		ListNode n6 = new ListNode(4, null);
		ListNode n5 = new ListNode(3, n6);
		ListNode ll2 = new ListNode(1, n5);
		ListNode n3 = new ListNode(4, null);
		ListNode n2 = new ListNode(2, n3);
		ListNode ll1 = new ListNode(1, n2);
		ListNode mer = mergeElements(ll1, ll2);
		display(mer);
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
	public static ListNode mergeElements(ListNode l1, ListNode l2) {

		ListNode head = new ListNode();
		ListNode temp = head;
		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				temp.next = l1;
				l1 = l1.next;
				temp = temp.next;
			} else {
				temp.next = l2;
				l2 = l2.next;
				temp = temp.next;
			}
		}
		temp.next = (l1 != null) ? l2 : l1;
		return head.next;
	}
	static void display(ListNode n) {
		ListNode temp = new ListNode();
		temp = n;
		System.out.print("[ ");
		while (temp != null) {
			System.out.print(temp.val + ", ");
			temp = temp.next;
		}
		System.out.print("Null ]");
	}
}
