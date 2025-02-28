/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    int position = 0;

    public int kthSmallest(TreeNode root, int k) {
        TreeNode node = inorderTraversal(root, k);
        // k is larger
        if (node == null) {
            return -1;
        }
        return node.val;

    }

    private TreeNode inorderTraversal(TreeNode root, int k) {
        // base case
        if (root == null) {
            return root;
        }
        // left call
        TreeNode left = inorderTraversal(root.left, k);
        if (left != null) {
            return left;
        }
        position++;
        // target achieved
        if (position == k) {
            return root;
        }
        // right call
        TreeNode right = inorderTraversal(root.right, k);
        if (right != null) {
            return right;
        }
        return null;
    }

}