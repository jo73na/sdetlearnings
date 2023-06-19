package mandatoryHomeWork.week5.day1;

public class MiddleOfSLL2 {

	public static void main(String[] args) {
		ListNode n9 = new ListNode(9, null);
		ListNode n8 = new ListNode(8, n9);
		ListNode n7 = new ListNode(7, n8);
		ListNode n6 = new ListNode(6, null);
		ListNode n5 = new ListNode(5, null);
		ListNode n4 = new ListNode(4, n5);
		ListNode n3 = new ListNode(3, n4);
		ListNode n2 = new ListNode(2, n3);
		ListNode ll1 = new ListNode(1, n2);
		System.out.println("check ll: ");
		displayAll(ll1);
		displayAll(n6);
		// ListNode n = halfMethod(ll1);
		// System.out.println(n.val);
	}

	public static class ListNode {
		int val;
		ListNode next;
		ListNode() {		}
		ListNode(int val) {			this.val = val;		}
		ListNode(int val, ListNode next) {			this.val = val; 			this.next = next; 		}
	}

	public static ListNode halfMethod(ListNode head) {

		ListNode mid = new ListNode();
		ListNode p = head;
		ListNode q = head;
		if (head.next == null) {
			return head;
		}

		while (true) {
			p = p.next.next;
			if (p == null) {
				System.out.println("even");
				mid = q;
				break;
			}
			if (p.next == null) {
				System.out.println("odd");
				mid = q.next;
				break;
			}

			q = q.next;
		}
		return mid;

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
