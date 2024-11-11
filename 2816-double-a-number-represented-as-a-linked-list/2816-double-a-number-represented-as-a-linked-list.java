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
    // reverse LL methods
    public ListNode reverseLL(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }

    public ListNode doubleIt(ListNode head) {
        // step1:reverse a linkedlist(original LinkedList)
        ListNode revhead = reverseLL(head);

        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy;
        int carry = 0;
        while (revhead != null) {
            // find the sum of last digits
            int sum = revhead.val + revhead.val + carry;
            int digit = sum % 10;
            carry = sum / 10;
            ListNode temp = new ListNode(digit);
            dummy.next = temp;
            dummy = dummy.next;// move the pointer
            revhead = revhead.next;
        }
        if (carry > 0) {
            ListNode temp = new ListNode(carry);
            dummy.next = temp;
        }
        ans = reverseLL(ans.next);// reverse the final LL
        return ans;

    }
}