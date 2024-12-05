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
    public ListNode sortList(ListNode head) {
        return mergeSort(head);
    }

    // find the middle of linked list ans divide code
    public ListNode mergeSort(ListNode head) {
        // handle edges cases
        if (head == null || head.next == null) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;// x speed
            fast = fast.next.next;// 2x speed
        }
        // seprate the both LL
        prev.next = null;
        ListNode head1 = mergeSort(head);
        ListNode head2 = mergeSort(slow);
        ListNode ans = merge(head1, head2);
        return ans;
    }

    // merge the LL
    public ListNode merge(ListNode head1, ListNode head2) {
        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy;
        while (head1 != null && head2 != null) {
            if (head1.val <= head2.val) {
                ListNode temp = new ListNode(head1.val);
                dummy.next = temp;
                head1 = head1.next;//move the pointer
            } else {
                ListNode temp = new ListNode(head2.val);
                dummy.next = temp;
                head2 = head2.next;//move the pointer

            }
            dummy = dummy.next;

        }
        // after the loops close some elements is remaining than
           // Attach the remaining nodes, if any
        while (head1 != null) {
            ListNode temp = new ListNode(head1.val);
            dummy.next = temp;
            head1 = head1.next;
            dummy = dummy.next;

        }

        while (head2 != null) {
            ListNode temp = new ListNode(head2.val);
            dummy.next = temp;
            head2 = head2.next;
            dummy = dummy.next;

        }
        return ans.next;

    }
}