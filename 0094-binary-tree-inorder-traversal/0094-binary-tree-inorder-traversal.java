/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>list=new ArrayList<>();
        //call the helper function(methods) 
        helper(root,list);
        return list;
    }
    public void helper(TreeNode root,List<Integer>list){
        //base case if root is null than 
        if(root==null){
            return;
        }
        //Left Sub-Tree
        helper(root.left,list);
        //Inorder Data(root data)
        list.add(root.val);
        //Right Sub-Tree

        helper(root.right,list);

    }
}