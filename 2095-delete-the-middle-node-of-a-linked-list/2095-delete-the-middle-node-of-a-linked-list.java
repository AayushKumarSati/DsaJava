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
    public ListNode deleteMiddle(ListNode head) {
        // we are use the two pointer approach by using the slow and fast pointer
        // edges cases if only one node than
        if (head.next == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = slow;
        while (fast != null && fast.next != null) {
            prev = slow;
            fast = fast.next.next;// 2x speed
            slow = slow.next;// x speed
        }
        // prev is move mid-1 element and mid is remove than the prev next is mid next
        // elements
        prev.next = prev.next.next;
        // prev.next = slow.next;
        return head;
    }
}