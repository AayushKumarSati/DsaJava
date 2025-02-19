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
    public boolean isBalanced(TreeNode root) {
        int height = getHeight(root);
        if (height == -1) {
            return false;
        } else {
            return true;
        }
    }

    // firstly we are calculate in the height of binary tree
    private int getHeight(TreeNode root) {
        if (root == null) {
            return 0;

        }

        int leftsubtreeHeight = getHeight(root.left);
        int rightsubtreeHeight = getHeight(root.right);

        // check the coddition
        if (leftsubtreeHeight == -1 || rightsubtreeHeight == -1) {
            return -1;
        }
        int difference = Math.abs(leftsubtreeHeight-rightsubtreeHeight);
        if (difference > 1) {
            return -1;
        } else {
            return Math.max(leftsubtreeHeight, rightsubtreeHeight) + 1;
        }

    }

}