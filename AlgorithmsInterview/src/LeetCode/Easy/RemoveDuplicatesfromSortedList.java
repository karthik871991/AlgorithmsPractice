package LeetCode.Easy;

public class RemoveDuplicatesfromSortedList {

	// Given a sorted linked list, delete all duplicates such that each element
	// appear only once.
	//
	// For example,
	// Given 1->1->2, return 1->2.
	// Given 1->1->2->3->3, return 1->2->3.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        if(head==null)return null;
        if(head.next==null)return head;
        while(node.next!=null){
            if(node.val==node.next.val){
                node.next = node.next.next;
            }
            else{
                node = node.next;
            }
        }
        return head;
    }

}
