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
    public ListNode detectCycle(ListNode head) {
        // edges cases
        if (head == null) {
            return null;
        }
        // we are use slow and fast pointer and check the cycle present or not
        // if the cycle is present than create a new pointer ptr to head and move one by
        // one ptr and slow if the slow and ptr is meet than return than node data;
        ListNode slow = head;
        ListNode fast = head;
        ListNode ptr = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;// x speed
            fast = fast.next.next;// 2x speed
            // meet the slow and fast in LL
            if (fast == slow) {
                while (ptr != slow) {
                    
                    ptr = ptr.next;
                    slow = slow.next;
                }
                return ptr;
            }
        }
        return null;

    }
}