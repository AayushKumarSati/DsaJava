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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>list=new ArrayList<>();
        //call the helper function(methods) 
        //Preorder=Node(Root)->Left->Right;
        helper(root,list);
        return list;
    }
    public void helper(TreeNode root,List<Integer>list){
        //base case if root is null than 
        if(root==null){
            return;
        }
        //Preorder Data(root data)
        list.add(root.val);
        //Left Sub-Tree
        helper(root.left,list);
        //Right Sub-Tree

        helper(root.right,list);

    
    }
}