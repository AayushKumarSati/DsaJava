/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        //By using the stack 
        //step1:push all the nodes in the stack
        //traverse from ll while poping from stack
        Stack<Integer>st=new Stack<>();
        ListNode node=head;
        //step1:
        while(node!=null){
            st.push(node.val);
            node=node.next;
        }
        //step2:
        ListNode ptr=head;
        while(st.size()>0){
            int val1=ptr.val;
            int val2=st.pop();
            if(val1!=val2){
                return false;

            }
            ptr=ptr.next;//move the pointer
        }
        return true;

        
    }
}