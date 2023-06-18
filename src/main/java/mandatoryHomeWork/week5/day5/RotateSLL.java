package mandatoryHomeWork.week5.day5;

public class RotateSLL {

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
		ListNode rotateRight = rotateRight(ll1, 5);
		displayAll(rotateRight);
	}

	public static ListNode rotateRight(ListNode head, int k) {

		// return head if it is null or it has single node as it does not affect the
		// list
		if (head == null || head.next == null) {
			return head;
		}

		// finalHead is returned as head of rotated list
		ListNode temp = head, finalHead = null, last = null;

		// to count the number of nodes in the list
		int totalCount = 0;

		// loop to count the number of nodes in the list
		while (temp != null) {
			totalCount++;
			last = temp;
			temp = temp.next;
		}

		// if list has 'N' nodes and it is rotated 'N' times, it will be the same list.
		// Ex. : 2 -> 3 -> 4 -> 5 rotated '4' times will give the same list as :
		// For rotation 1, list : 5 -> 2 -> 3 -> 4
		// For rotation 2, list : 4 -> 5 -> 2 -> 3
		// For rotatin 3, list : 3 -> 4 -> 5 -> 2
		// For roation 4, list : 2 -> 3 -> 4 -> 5
		// So it will eliminate the number of rotations required to be applied
		k = k % totalCount;

		// simply return list if k i.e no. of roations required is zero
		if (k == 0) {
			return head;
		}

		// treavere to the node that will become last node of rotated list or to the
		// node located before head of rotated list
		int rc = totalCount - k - 1;
		temp = head;
		while (rc > 0) {
			temp = temp.next;
			rc--;
		}

		// assign temp1 to temp.next which will be head for final list
		ListNode temp1 = temp.next;

		// make the current node as last node of list by assigning null
		temp.next = null;

		// assign temp1 to finalHead
		finalHead = temp1;

		// connect last node to head
		last.next = head;
		return finalHead;

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
