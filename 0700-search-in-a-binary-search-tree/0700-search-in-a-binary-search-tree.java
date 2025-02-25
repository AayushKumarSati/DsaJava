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
    public TreeNode searchBST(TreeNode root, int val) {
        //base case
        if(root==null || root.val==val){
            return root;

        }
        TreeNode ans=null;

        if(root.val>val){
            //left subtree
            ans= searchBST(root.left,val);
        }
        else{
            //right subtree
            ans= searchBST(root.right,val);
        }
        return ans;
       

    }
}