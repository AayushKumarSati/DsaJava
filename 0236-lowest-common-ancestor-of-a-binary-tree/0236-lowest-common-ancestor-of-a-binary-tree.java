/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;

        }
        // DFS Apply
        TreeNode leftChild = lowestCommonAncestor(root.left, p, q);
        TreeNode rightChild = lowestCommonAncestor(root.right, p, q);
        // case 1:
        if (leftChild == null) {
            return rightChild;
        }
        // case 2:
        else if (rightChild == null) {
            return leftChild;

        }
        // case 3:
        else {
            return root;
        }
    }
}