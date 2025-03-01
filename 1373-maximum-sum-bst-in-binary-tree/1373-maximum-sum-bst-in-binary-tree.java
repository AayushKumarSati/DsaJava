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
    int ans;

    public int maxSumBST(TreeNode root) {
        ans = 0;
        dfs(root);
        return ans;
    }

    // arr->min,max,sum
    private int[] dfs(TreeNode root) {
        if (root == null) {
            return new int[] { Integer.MAX_VALUE, Integer.MIN_VALUE, 0 };
        }
        int leftsubtree[] = dfs(root.left);
        int rightsubtree[] = dfs(root.right);
        // check if current subtree is Bst
        if (root.val > leftsubtree[1] && root.val < rightsubtree[0]) {
            int currentSum = leftsubtree[2] + rightsubtree[2] + root.val;
            ans = Math.max(ans, currentSum);
            int minVal = Math.min(root.val, leftsubtree[0]);
            int maxVal = Math.max(root.val, rightsubtree[1]);
            return new int[] { minVal, maxVal, currentSum };
        } // not BST Than
        int maxSum = Math.max(leftsubtree[2], rightsubtree[2]);
        return new int[] { Integer.MIN_VALUE, Integer.MAX_VALUE, maxSum };
    }
}