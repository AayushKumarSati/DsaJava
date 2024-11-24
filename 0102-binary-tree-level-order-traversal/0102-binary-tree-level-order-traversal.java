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
    public List<List<Integer>> levelOrder(TreeNode root) {
        // Level Order Traversal is also known as BFS
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> currentAns = new ArrayList<>();
        // base case
        if (root == null) {
            return ans;
        }
        Queue<TreeNode> mainq = new ArrayDeque<>();
        Queue<TreeNode> helperq = new ArrayDeque<>();
        mainq.add(root);
        while (mainq.size() > 0) {
            // RPA:Remove,Add,Print
            TreeNode currentNode = mainq.poll();
            currentAns.add(currentNode.val);
            if (currentNode.left != null) {
                helperq.add(currentNode.left);
            }
            if (currentNode.right != null) {
                helperq.add(currentNode.right);

            }
            // if mainq.size is empty than level complete and start new level
            if (mainq.size() == 0) {
                ans.add(currentAns);
                currentAns = new ArrayList<>();
                // swapp now mainq and helperq
                mainq = helperq;
                helperq = new ArrayDeque<>();
            }

        }
        return ans;

    }
}