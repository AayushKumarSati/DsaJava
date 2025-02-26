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
    public TreeNode deleteNode(TreeNode root, int key) {
        // base case
        if (root == null) {
            return root;

        }
        if (root.val < key) {
            root.right = deleteNode(root.right, key);
        } else if (root.val > key) {
            root.left = deleteNode(root.left, key);
        } else {
            // root.val==key
            // case1:only leaf node
            if (root.left == null && root.right == null) {
                return null;

            }
            // case2:only single child
            if (root.left == null) {
                return root.right;

            } else if (root.right == null) {
                return root.left;

            } else {
                // case3:two child
                // we are find two way(inorder successor and inorder preccessor)
                TreeNode inorderPreccessor = findPrecessor(root.left);
                // shift the node in root
                root.val = inorderPreccessor.val;
                // delete inorderPreccessor.val
               root.left= deleteNode(root.left, inorderPreccessor.val);

            }
        }

        return root;
    }

    private TreeNode findPrecessor(TreeNode root) {
        while (root.right != null) {
            root = root.right;

        }
        return root;
    }
}