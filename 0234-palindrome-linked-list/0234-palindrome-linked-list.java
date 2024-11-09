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
    // find the middle node of the list
    ListNode middle(ListNode head) {
        ListNode temp = head;
        if (head == null) {
            return head;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    // reverse the list
    ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nbr = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nbr;

        }
        return prev;

    }

    public boolean isPalindrome(ListNode head) {
        /*
         * Approach 1: //By using the stack
         * //step1:push all the nodes in the stack
         * //traverse from ll while poping from stack
         * Stack<Integer>st=new Stack<>();
         * ListNode node=head;
         * //step1:
         * while(node!=null){
         * st.push(node.val);
         * node=node.next;
         * }
         * //step2:
         * ListNode ptr=head;
         * while(st.size()>0){
         * int val1=ptr.val;
         * int val2=st.pop();
         * if(val1!=val2){
         * return false;
         * 
         * }
         * ptr=ptr.next;//move the pointer
         * }
         * return true;
         */

        /*
         * Approach 2: find the middle from the linked list and than reverse the LL and
         * check palindrome O(N) time complexity and O(1) space-complexity
         */
        if (head == null || head.next == null) {
            return true;
        }
        // find mid
        ListNode mid = middle(head);
        // reverse the head
        ListNode shead = reverse(mid);
        // check the is palindrome or not
        ListNode fhead = head;
        while (shead != null) {
            if (fhead.val != shead.val) {
                return false;

            }
            fhead = fhead.next;
            shead = shead.next;
        }
        return true;

    }

}