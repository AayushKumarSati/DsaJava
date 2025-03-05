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
    // find height of Binary Tree
    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftheight = height(root.left);
        int rightheight = height(root.right);
        return Math.max(leftheight, rightheight) + 1;

    }

    int ans = 0;

    public int deepestLeavesSum(TreeNode root) {
        int height = height(root);
        helper(root, height);
        return ans;

    }

    public void helper(TreeNode root, int height) {
        if (root == null) {
            return;
        }
        if (height == 1) {
            ans += root.val;
        }
        helper(root.left, height - 1);
        helper(root.right, height - 1);
    }
}