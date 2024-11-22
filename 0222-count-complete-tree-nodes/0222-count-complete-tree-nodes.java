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
    public int countNodes(TreeNode root) {
        // base case
        if (root == null) {
            return 0;
        }
        // left side node count
        int leftcount = countNodes(root.left);
        // right side node count
        int rightcount = countNodes(root.right);
        // leftside count +rightside count +1(root node);
        int totalcount = leftcount + rightcount + 1;
        return totalcount;

    }
}