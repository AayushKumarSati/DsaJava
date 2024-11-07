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
    public ListNode oddEvenList(ListNode head) {
        // handle the edges cases
        // if(head is empty or head is 1 or head is 2)
        if (head == null || head.next == null || head.next.next == null) {
            return head;
        }
        // create some node to identify the odd and even head

        ListNode oddHead = head;
        ListNode evenHead = head.next;
        ListNode evenHeadStart = evenHead;

        while (evenHead != null && evenHead.next != null) {
            oddHead.next = oddHead.next.next;
            evenHead.next = evenHead.next.next;
            // move the odd and even head is one bye one in next node
            oddHead = oddHead.next;
            evenHead = evenHead.next;

        }
        // to add the oddhead.next=evenHead
        oddHead.next = evenHeadStart;
        return head;

    }
}