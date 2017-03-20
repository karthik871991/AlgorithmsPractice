package LeetCode.Easy;

public class IntersectionofTwoLinkedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

		ListNode cheadA = headA;
		ListNode cheadB = headB;

		int a = 0;
		while (cheadA != null) {
			cheadA = cheadA.next;
			a++;
		}

		int b = 0;
		while (cheadB != null) {
			cheadB = cheadB.next;
			b++;
		}

		while (a > b) {
			headA = headA.next;
			a--;
		}
		while (b > a) {
			headB = headB.next;
			b--;
		}

		while (headA != headB) {
			headA = headA.next;
			headB = headB.next;
		}
		return headA;

	}

}
