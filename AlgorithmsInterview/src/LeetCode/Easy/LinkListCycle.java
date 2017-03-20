package LeetCode.Easy;

public class LinkListCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean hasCycle(ListNode head) {
        if(head==null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return true;
            }
            
        }
        return false;
    }

}
