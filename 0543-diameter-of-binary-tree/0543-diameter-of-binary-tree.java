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
    // public int height(TreeNode node) {
    // if (node == null) {
    // return -1;
    // }
    // int leftheight = height(node.left);
    // int rightheight = height(node.right);
    // int totalheight = Math.max(leftheight, rightheight) + 1;
    // return totalheight;
    // }

    static class DiaPair {
        int height;
        int diameter;
    }

    public static DiaPair diameterTree1(TreeNode node) {
        // base case
        if (node == null) {
            DiaPair basepair = new DiaPair();
            basepair.height = -1;
            basepair.diameter = -1;
            return basepair;
        }
        DiaPair leftpair = diameterTree1(node.left);
        DiaPair rightPair = diameterTree1(node.right);
        DiaPair mypair = new DiaPair();
        mypair.height = Math.max(leftpair.height, rightPair.height) + 1;
        int factor = leftpair.height + rightPair.height + 2;
        mypair.diameter = Math.max(factor, Math.max(leftpair.diameter, rightPair.diameter));
        return mypair;

    }

    public int diameterOfBinaryTree(TreeNode node) {
        // base case
        // if (node == null) {
        // return 0;
        // }
        // // Leftdiameter=maximum distance between two nodes on the LHS
        // int leftdiameter = diameterOfBinaryTree(node.left);
        // // Rightdiameter=maximum distance between two nodes on the RHS
        // int rightdiameter = diameterOfBinaryTree(node.right);
        // // maximum distance beween left's deepest and the right deepest

        // int factor = height(node.left) + height(node.right) + 2;
        // int diameter = Math.max(factor, Math.max(leftdiameter, rightdiameter));
        // return diameter;

        /* 2nd approach: */
        DiaPair res = diameterTree1(node);
        int ans = res.diameter;
        return ans;

    }
}