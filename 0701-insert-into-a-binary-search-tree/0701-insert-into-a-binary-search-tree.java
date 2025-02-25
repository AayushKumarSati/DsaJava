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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        /*
         * Recursive Approach
         * // base case
         * if (root == null) {
         * root = new TreeNode(val);
         * return root;
         * }
         * // if root.data < val than
         * if (root.val < val) {
         * root.right = insertIntoBST(root.right, val);
         * }
         * // if root.data > val than
         * else {
         * root.left = insertIntoBST(root.left, val);
         * }
         * return root;
         */
        /** By Using the itterative approach */
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }
        TreeNode current = root;
        while (current != null) {
            if (val < current.val) {
                // left subTree
                if (current.left == null) {

                    current.left = new TreeNode(val);
                    break;
                } else {
                    current = current.left;
                }
            } else {
                if (current.right == null) {

                    current.right = new TreeNode(val);
                    break;
                } else {
                    current = current.right;
                }
            }
        }
        return root;

    }
}