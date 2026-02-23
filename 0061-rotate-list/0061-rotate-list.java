/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    //step1:find the size of the Linked List
    public int sizeLL(ListNode head) {
        if (head == null) {
            return 0;
        }
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;

        }
        return count;
    }

    public ListNode rotateRight(ListNode head, int k) {
        //step2:apply login 
        if (head == null) {
            return null;

        } else if (k == 0) {
            return head;
        }
        int size = sizeLL(head);
        k = k % size;
        if (k == 0) {
            return head;
        }

        // Right rotate = size - k
        int move = size - k;

        ListNode ptr = head;

        // move till (move-1) position
        for (int i = 1; i < move; i++) {
            ptr = ptr.next;
        }
        ListNode nhead = ptr.next;
        ptr.next = null;
        ListNode ptr2 = nhead;
        while (ptr2.next != null) {
            ptr2 = ptr2.next;
        }
        ptr2.next = head;
        return nhead;
    }
}