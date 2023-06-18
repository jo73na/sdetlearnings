package mandatoryHomeWork.week4.day2;

public class MergeTwoList {

	public static void main(String[] args) {
		ListNode n9 = new ListNode(9, null);
		ListNode n8 = new ListNode(8, n9);
		ListNode n7 = new ListNode(7, n8);
		ListNode ll2 = new ListNode(6, n7);
		ListNode n5 = new ListNode(5, null);
		ListNode n4 = new ListNode(4, n5);
		ListNode n3 = new ListNode(3, n4);
		ListNode n2 = new ListNode(2, n3);
		ListNode ll1 = new ListNode(1, n2);
		ListNode mergeTwoLists = mergeTwoLists(ll1, ll2);
		displayAll(mergeTwoLists);
	}

	// * Definition for singly-linked list.
	public static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		public void add(String string) {

		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	ListNode res = new ListNode();
	ListNode temp = res;

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode tempL1 = l1;
		ListNode tempL2 = l2;

		ListNode tempNew = new ListNode();
		ListNode tempAns = tempNew;
		while (tempL1 != null && tempL2 != null) {
			if (tempL1.val < tempL2.val) {
				tempNew.next = tempL1;
				tempNew = tempL1;
				tempL1 = tempL1.next;
			} else if (tempL1.val >= tempL2.val) {

				tempNew.next = tempL2;
				tempNew = tempL2;
				tempL2 = tempL2.next;

			}

		}
		while (tempL1 != null) {
			tempNew.next = tempL1;
			tempNew = tempL1;
			tempL1 = tempL1.next;
		}
		while (tempL2 != null) {
			tempNew.next = tempL2;
			tempNew = tempL2;
			tempL2 = tempL2.next;
		}

		return tempAns.next;

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
