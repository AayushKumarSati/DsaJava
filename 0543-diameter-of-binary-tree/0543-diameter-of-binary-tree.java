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
    /*
     * find the height of the Binary Tree
     */
    public int height(TreeNode node) {
        if (node == null) {
            return -1;
        }
        int leftheight = height(node.left);
        int rightheight = height(node.right);
        int totalheight = Math.max(leftheight, rightheight) + 1;
        return totalheight;
    }

    public int diameterOfBinaryTree(TreeNode node) {
        // base case
        if (node == null) {
            return 0;
        }
        // Leftdiameter=maximum distance between two nodes on the LHS
        int leftdiameter = diameterOfBinaryTree(node.left);
        // Rightdiameter=maximum distance between two nodes on the RHS
        int rightdiameter = diameterOfBinaryTree(node.right);
        // maximum distance beween left's deepest and the right deepest

        int factor = height(node.left) + height(node.right) + 2;
        int diameter = Math.max(factor, Math.max(leftdiameter, rightdiameter));
        return diameter;
    }
}