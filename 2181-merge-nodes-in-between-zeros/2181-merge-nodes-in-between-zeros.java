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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode current = head.next;
        ListNode ans = dummy;
        int sum = 0;
        while (current != null) {
            if (current.val != 0) {
                sum += current.val;
            } else {
                ListNode temp = new ListNode(sum);
                dummy.next = temp;
                dummy = dummy.next;// move the dummy pointer
                sum = 0;// sum is zero from next calculation

            }
            current = current.next;// move to the current pointer
        }
        return ans.next;
    }
}