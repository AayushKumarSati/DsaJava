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
    public boolean isValidBST(TreeNode root) {
        // base case
        return helperValid(root, Long.MIN_VALUE, Long.MAX_VALUE);

    }

    // create a valid helper methods
    private boolean helperValid(TreeNode root,long min,long max){
           if(root==null){
            return true;
        }
        //this is the invalid case
        if(root.val<=min || root.val>=max){
            return false;

        }
        //now call the left subtree and right subtree
        boolean LST= helperValid( root.left,min,root.val);
        boolean RST= helperValid( root.right,root.val,max);
        //if both are valid than return true
        return (LST && RST);
    }
}