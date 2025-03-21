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
    int sum = 0;

    public TreeNode bstToGst(TreeNode root) {
        helper(root);
        return root;
    }

    // inorder traversal in reverse order
    public void helper(TreeNode root) {
        // base case
        if (root == null) {
            return;
        }
        helper(root.right);
        sum += root.val;
        root.val = sum;// update the value
        helper(root.left);

    }
}