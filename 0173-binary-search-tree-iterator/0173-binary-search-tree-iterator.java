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
class BSTIterator {
Stack<TreeNode>st;

    public BSTIterator(TreeNode root) {
        st=new Stack<>();
        //insert left subtree(left boundary)
        TreeNode node=root;
        while(node!=null){
            st.push(node);
            //move the pointer
            node=node.left;

        }
    }
    
    public int next() {
        TreeNode node =st.pop();
        int value= node.val;
        //shift right
        node =node.right;
        //again insert left
         while(node!=null){
            st.push(node);
            //move the pointer
            node=node.left;

        }
        return value;

    }
    
    public boolean hasNext() {
        if(st.size()>0){
            return true;

        }
        else{
            return false;
        }
        
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */