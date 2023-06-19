package mandatoryHomeWork.week4.day2;

public class DuplicateRemoveSLL {

	public static void main(String[] args) {
		ListNode n7 = new ListNode(6, null);
		ListNode n6 = new ListNode(5, n7);
		ListNode n5 = new ListNode(4, n6);
		ListNode n4 = new ListNode(3, n5);
		ListNode n3 = new ListNode(6, n4);
		ListNode n2 = new ListNode(2, n3);
		ListNode ll1 = new ListNode(1, n2);
		ListNode deleteDuplicates = deleteDuplicates(ll1);
		ListNode temp = new ListNode();
		temp = deleteDuplicates;
		System.out.print("[ ");
		while (temp != null) {
			System.out.print(temp.val + ", ");
			temp = temp.next;
		}
		System.out.print("Null ]");
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
	public static  ListNode removeElements(ListNode head, int val) {
		ListNode temp= head;
		while(temp!=null) {
			if(temp.next==null) {
			break;
			}
			if(temp.next.val==val) {
				temp.next=temp.next.next;
			}else {
				temp=temp.next;
			}
		}
		
		
		return head;
	        
	    }
	public static ListNode deleteDuplicates(ListNode head) {
 ListNode tempList = head;
         
         while(tempList != null) {
        	 if (tempList.next == null) {
        		 break;
        	 }
        	 if (tempList.val == tempList.next.val) {
        		 tempList.next = tempList.next.next;
        	 }
           else {
        		 tempList = tempList.next;
        	 }
         }
         
         return head;  
    }
	}


