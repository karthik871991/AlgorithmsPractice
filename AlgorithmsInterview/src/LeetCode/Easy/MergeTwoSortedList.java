package LeetCode.Easy;

public class MergeTwoSortedList {
//	Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		ListNode l2 = new ListNode(1);
		mergeTwoLists(l1, l2);
	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null && l2 == null) {
			return null;
		}
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		
		ListNode result = new ListNode(0);
		ListNode iter = result;

		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				iter.next = l1;
				l1 = l1.next;
			} 
			else {
				iter.next = l2;
				l2 = l2.next;
			}
			iter = iter.next;
		}
		if(l1!=null){
			iter.next = l1;
		}
		if(l2!=null){
			iter.next = l2;
		}
		
		return result.next;
	}
}