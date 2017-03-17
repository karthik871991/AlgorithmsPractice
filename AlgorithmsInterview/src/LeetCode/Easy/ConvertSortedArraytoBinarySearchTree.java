//package LeetCode.Easy;
//
//public class ConvertSortedArraytoBinarySearchTree {
//
//	// Given an array where elements are sorted in ascending order, convert it
//	// to a height balanced BST.
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//	public class TreeNode {
//		int val;
//		TreeNode left;
//		TreeNode right;
//
//		TreeNode(int x) {
//			val = x;
//		}
//	}
//
//	public static TreeNode sortedArrayToBST(int[] nums) {
//		if (nums.length == 0) {
//			return null;
//		}
//
//		TreeNode head = sortedArrayToBST(nums, 0, nums.length - 1);
//		return head;
//
//	}
//
//	public static TreeNode sortedArrayToBST(int[] nums, int start, int end) {
//		if (start > end) {
//			return null;
//		}
//		int middle = (start + end) / 2;
//
//		TreeNode node = new TreeNode(nums[middle]);
//
//		node.left = sortedArrayToBST(nums, start, middle - 1);
//		node.right = sortedArrayToBST(nums, middle + 1, end);
//
//		return node;
//	}
//
//}
