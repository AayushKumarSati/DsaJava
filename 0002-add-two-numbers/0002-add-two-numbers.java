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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // handle the edges cases
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }
        // create dummy node
        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy;
        ListNode ptr1 = l1;
        ListNode ptr2 = l2;
        int carry = 0;
        while (ptr1 != null || ptr2 != null) {
            // we find the val1 and val2 from the l1 and l2 LL
            int val1 = ptr1 != null ? ptr1.val : 0;
            int val2 = ptr2 != null ? ptr2.val : 0;
            int sum = val1 + val2 + carry;
            int digit = sum % 10;// find the last digits of after sum
            carry = sum / 10;// carry find
            // add the sum in the new node from new LL
            ListNode temp = new ListNode(digit);
            dummy.next = temp;
            dummy = dummy.next;

            // move the ptr1 and ptr2
            ptr1 = ptr1 != null ? ptr1.next : null;
            ptr2 = ptr2 != null ? ptr2.next : null;

        }
        // if after the loops close sum carry is remaning than
        if (carry > 0) {
            ListNode temp = new ListNode(carry);
            dummy.next = temp;
            dummy = dummy.next;
        }
        return ans.next;

    }
}