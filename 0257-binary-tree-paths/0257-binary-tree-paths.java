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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        // base case
        if (root == null) {
            return ans;
        }
        // if only root present
        if (root.left == null && root.right == null) {
            ans.add("" + root.val);
            return ans;
        }
        // find left ans and right ans
        List<String> leftAns = binaryTreePaths(root.left);
        List<String> rightAns = binaryTreePaths(root.right);
        // add leftAns
        for (String str : leftAns) {
            ans.add(root.val + "->" + str);
        }
        // add RightAns
        for (String str : rightAns) {
            ans.add(+ root.val + "->" + str);
        }
        return ans;

    }
}