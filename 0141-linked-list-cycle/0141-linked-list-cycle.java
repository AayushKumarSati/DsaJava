/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // we are use the two pointer slow and fast and the slow is increases x speed
        // and fast is increases 2x speed if slow and fast pointer is meet(cross) than
        // the
        // cycle is present else not present ;
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            // meet the slow and fast pointer
            if (fast == slow) {
                return true;
            }

        }
        return false;

    }
}