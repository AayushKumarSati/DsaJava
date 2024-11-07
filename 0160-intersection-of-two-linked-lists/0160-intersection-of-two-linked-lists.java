/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    // find the size of both linked list
    public int sizeLL(ListNode head) {
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;

    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // if both linkedlist is null than
        if (headA == null || headB == null) {
            return null;
        }
        // step1:find the size of both linked list and find the difference of both LL
        int size1 = sizeLL(headA);
        int size2 = sizeLL(headB);
        int diff = size1 - size2;
        ListNode ptr1 = headA;
        ListNode ptr2 = headB;
        if (diff > 0) {
            // LL1 is having greater size and positive value
            while (diff > 0) {

                ptr1 = ptr1.next;
                diff--;
            }

        } else {
            // LL2 is having greater size and negative value
            while (diff < 0) {

                ptr2 = ptr2.next;
                diff++;
            }
        }
        // than find the intersection points
        while (ptr1 != ptr2) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return ptr1;
    }
}