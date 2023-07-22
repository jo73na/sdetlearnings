package mandatoryHomeWork.week13.day3;

import java.util.HashSet;

import ownProblemsRef.ListNode;

public class LinkedListHashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public boolean hasCycle(ListNode head) {
	        if(head==null || head.next==null){
	            return false;
	        }
	        HashSet<ListNode> s = new HashSet<>();
	        ListNode currNode = head;
	        for(;currNode!=null;currNode = currNode.next){
	            if(!s.add(currNode))
	                return true;
	        }
	        return false;
	    }

}
