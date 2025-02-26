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
    public boolean findTarget(TreeNode root, int k) {
        /*
         * // this approach is two pointer approach by same as the array two pointer
         * // approach and this is the first approach
         * // Time Complexity :O(N) and Space Complexity:O(N)
         * ArrayList<Integer> ans = new ArrayList<>();
         * inorderTraversal(root, ans);
         * int start = 0, end = ans.size() - 1;
         * while (start < end) {
         * int sum = ans.get(start) + ans.get(end);
         * if (sum < k) {
         * start++;
         * 
         * } else if (sum > k) {
         * end--;
         * 
         * } else {
         * return true;
         * }
         * }
         * return false;
         */

        /**
         * This is the second approach by using the preorder traveasl and hash set
         * time complexity : o(n) and space O(n)
         */
        HashSet<Integer> ans = new HashSet<>();

        return preorderTraversal(root, ans, k);

    }

    // 1st approach using two pointer
    public void inorderTraversal(TreeNode root, ArrayList<Integer> list) {
        if (root == null) {
            return;

        }
        // Left
        inorderTraversal(root.left, list);
        // root
        list.add(root.val);
        // Right
        inorderTraversal(root.right, list);
    }

    // 2nd approach by using hashset and preorder traversal
    private boolean preorderTraversal(TreeNode root, HashSet<Integer> ans, int k) {
        if (root == null) {
            return false;
        }
        if (ans.contains(k - root.val)) {
            return true;
        }
        ans.add(root.val);
        boolean leftsubtree = preorderTraversal(root.left, ans, k);
        boolean rightsubtree = preorderTraversal(root.right, ans, k);
        return leftsubtree || rightsubtree;
    }

}