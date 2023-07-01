package mandatoryHomeWork.week4.day3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class RemoveLinkedListElements {

	public static void main(String[] args) {

		ListNode n7 = new ListNode(7, null);
		ListNode n6 = new ListNode(6, n7);
		ListNode n5 = new ListNode(5, n6);
		ListNode n4 = new ListNode(4, n5);
		ListNode n3 = new ListNode(3, n4);
		ListNode n2 = new ListNode(2, n3);
		ListNode ll1 = new ListNode();
		ll1.setNext(n2);
		ll1.setVal(1);
		

		//ListNode n2 = new ListNode(1);
		//ListNode ll1 = new ListNode(6, n2);

		//ListNode deleteValues = removeValues(ll1, 6);
		ListNode temp = new ListNode();
		temp = n2;
		System.out.print("[ ");
		while (temp!= null) {
			System.out.print(temp.val + ", ");
			temp = temp.next;
		}
		System.out.print("Null ]");
	}
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int val) {
			this.val = val;
		}

		

		

	
	}
	public static void name() {
		
	}

	public static ListNode removeValues(ListNode head, int val) {
		ListNode temp = head;
		while (temp != null) {
			if (temp.next == null) {
				if (temp.val == val) {
					head = null;
				}
				break;
			} else if (temp.val == val) {
				head = temp.next;
			}
			if (temp.next.val == val) {
				temp.next = temp.next.next;
			} else {
				temp = temp.next;
			}
			if (temp.val == val && temp.next == null) {
				head = null;
			}
		}
		return head;
	}
}
