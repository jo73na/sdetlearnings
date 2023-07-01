package ownProblemsRef;

public class PalindromeSLL extends ListNode{

	public static void main(String[] args) {
		ListNode n9 = new ListNode(1, null);
		ListNode n8 = new ListNode(1, null);
		ListNode n7 = new ListNode(7, null);
		ListNode n6 = new ListNode(1, null);
		ListNode n5 = new ListNode(5, n6);
		ListNode n4 = new ListNode(4, n5);
		ListNode n3 = new ListNode(1, n4);
		ListNode n2 = new ListNode(0, n3);
		ListNode ll1 = new ListNode(1, n2);
		System.out.println("check ll: ");
		displayAll(ll1);
		int maxTwin = halfMethod(ll1);
		System.out.println(maxTwin);
	}



	public static int halfMethod(ListNode head) {

		ListNode tem = head;
		ListNode secondLL = new ListNode();
		ListNode p = head;
		ListNode q = head;
		if (tem.next == null) {
			return tem.val;
		}

		while (true) {
			p = p.next.next;
			if (p == null) {
				secondLL = q.next;
				break;
			}
			if (p.next == null) {
				secondLL = q.next.next;
				break;
			}

			q = q.next;
		}
		q.next = null;

		ListNode reverse = reverse(secondLL);
		int max = 0;
		while (reverse != null && head != null) {
			int temp = (reverse.val + head.val);
			max = (max > temp) ? max : temp;
			reverse = reverse.next;
			head = head.next;
		}

		return max;
	}

	public static ListNode reverse(ListNode head) {
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

		}
		// displayAll(head);
		return prev;

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
