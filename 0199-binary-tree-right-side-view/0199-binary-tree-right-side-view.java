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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        // calling the helperRightView Function

        helperRightView(root, ans, 0);
        // return ans
        return ans;

    }

    private void helperRightView(TreeNode root, List<Integer> list, int level) {
        if (root == null)
            return;
        // If this is the first node of this level, add it to the list
        if (level == list.size()) {
            list.add(root.val);
        }
        helperRightView(root.right, list, level + 1);
        helperRightView(root.left, list, level + 1);
    }
}