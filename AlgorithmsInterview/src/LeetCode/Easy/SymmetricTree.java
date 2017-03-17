package LeetCode.Easy;

public class SymmetricTree {

	// Given a binary tree, check whether it is a mirror of itself (ie,
	// symmetric around its center).
	//
	// For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
	//
	// 1
	// / \
	// 2 2
	// / \ / \
	// 3 4 4 3
	// But the following [1,2,2,null,3,null,3] is not:
	// 1
	// / \
	// 2 2
	// \ \
	// 3 3

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// public boolean isSymmetric(TreeNode root) {
	// if(root == null)return true;
	//
	// return mirrorTree(root.left, root.right);
	//
	// }
	//
	// private boolean mirrorTree(TreeNode p, TreeNode q){
	// if(p==null&&q==null)return true;
	//
	// if(p==null||q==null)return false;
	//
	// if(p.val!=q.val)return false;
	//
	// return mirrorTree(p.left, q.right) && mirrorTree(p.right, q.left);
	// }

}
