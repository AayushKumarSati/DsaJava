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

    int tilt = 0;

    public int total(TreeNode node) {
        if (node == null) {
            return 0;
        }

        // will return left sum and change tilt for left side
        int leftsum = total(node.left);

        // will return left sum and change tilt for left side
        int rightsum = total(node.right);
        int itilt = Math.abs(leftsum - rightsum);// difference of the subtree
        tilt += itilt;
        int totalsum = leftsum + rightsum + node.val;
        return totalsum;
    }

    public int findTilt(TreeNode node) {
        tilt = 0;
        total(node);
        return tilt;
    }
}