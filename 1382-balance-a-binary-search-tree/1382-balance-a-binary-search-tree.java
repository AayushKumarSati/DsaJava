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
    // inorder travesal
    public void inorderTraversal(TreeNode root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left, list);
        list.add(root.val);
        inorderTraversal(root.right, list);

    }

    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        inorderTraversal(root, list);
        // Apply two pointer Approach
        return MakeBst(list, 0, list.size() - 1);

    }

    // make a bst in using list
    public TreeNode MakeBst(ArrayList<Integer> list, int start, int end) {
        // base case
        if (start > end) {
            return null;
        }
        int mid = start + (end - start) / 2;
        // make root in mid value
        TreeNode root = new TreeNode(list.get(mid));
        root.left = MakeBst(list, start, mid - 1);
        root.right = MakeBst(list, mid + 1, end);
        return root;
    }
}