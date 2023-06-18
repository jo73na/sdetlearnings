package mandatoryHomeWork.week4.day5;

public class ReverseLLThrePointer {

	public static void main(String[] args) {
		ListNode n7 = new ListNode(7, null);
		ListNode n6 = new ListNode(6, n7);
		ListNode n5 = new ListNode(5, n6);
		ListNode n4 = new ListNode(4, n5);
		ListNode n3 = new ListNode(3, n4);
		ListNode n2 = new ListNode(2, n3);
		ListNode ll1 = new ListNode(1, n2);
		ListNode reverseLL = reverseLL(ll1);

		
displayAll(reverseLL);
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

	public static ListNode reverseLL(ListNode head) {
		ListNode prev = null;
		ListNode cur = head;
		ListNode nxt = cur.next;
		while (cur != null) {
			cur.next = prev;
			prev = cur;
			cur = nxt;
			if (nxt != null) {
				nxt = nxt.next;
			}
			
			
			/*
			 * else { head=prev; System.out.println("else"); return nxt; }
			 */

		}
		displayAll(head);
		return prev;

		// return head;
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
