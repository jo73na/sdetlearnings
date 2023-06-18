package mandatoryHomeWork.week6.day2;

import mandatoryHomeWork.week6.day1.ReverseLLThrePointer.ListNode;

public class SwapPairSLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n7 = new ListNode(7, null);
		ListNode n6 = new ListNode(6, n7);
		ListNode n5 = new ListNode(5, n6);
		ListNode n4 = new ListNode(4, n5);
		ListNode n3 = new ListNode(3, n4);
		ListNode n2 = new ListNode(2, n3);
		ListNode ll1 = new ListNode(1, n2);
		displayAll(ll1);
		ListNode reverseLL = swapPairs(ll1);

		displayAll(reverseLL);
	}

	public static ListNode swapPairs(ListNode head) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode pre = dummy;
		ListNode curr = pre.next;

		while (curr != null && curr.next != null) {
			pre.next = curr.next;
			curr.next = pre.next.next;
			pre.next.next = curr;

			pre = curr;
			curr = pre.next;
		}
		return dummy.next;
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
