package CrackingTheCodingInterview.ArraysandStrings;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class BinaryTreeLevelOrderTraversalII {
	// Given a binary tree, return the bottom-up level order traversal of its
	// nodes' values. (ie, from left to right, level by level from leaf to
	// root).
	//
	// For example:
	// Given binary tree [3,9,20,null,null,15,7],
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public static List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> result = new LinkedList<List<Integer>>();
		if (root == null) {
			return result;
		}

		Queue<TreeNode> queue = new LinkedList<TreeNode>();

		queue.add(root);

		while (queue.size() > 0) {
			int length = queue.size();
			List<Integer> list = new LinkedList<Integer>();
			for (int i = 0; i < length; i++) {
				TreeNode node = queue.poll();

				list.add(node.val);
				if (node.left != null) {
					queue.add(node.left);
				}
				if (node.right != null) {
					queue.add(node.right);
				}
			}
			result.add(0, list);
		}
		return result;
	}

}
