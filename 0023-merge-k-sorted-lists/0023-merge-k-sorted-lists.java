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
    /*
     * Approach number 1:by using the merge two sorted linked list.
     * public ListNode sortedMerge(ListNode head1, ListNode head2) {
     * // This is a "method-only" submission.
     * // You only need to complete this method
     * // handle the edges cases
     * if (head1 == null) {
     * return head2;
     * } else if (head2 == null) {
     * return head1;
     * } else if (head1 == null && head2 == null) {
     * return null;
     * }
     * // implements the actual code for this program
     * // create two pointer
     * ListNode p1 = head1;
     * ListNode p2 = head2;
     * ListNode dummy = new ListNode(-1);
     * ListNode ans = dummy;
     * while (p1 != null && p2 != null) {
     * if (p1.val <= p2.val) {
     * dummy.next = p1;
     * p1 = p1.next;
     * // dummy=dummy.next;
     * 
     * } else {
     * dummy.next = p2;
     * p2 = p2.next;
     * // dummy=dummy.next;
     * }
     * dummy = dummy.next;
     * }
     * // p1 and p2 mai se koe bhi ak null hua tb
     * if (p1 == null) {
     * // may be elements present in p2
     * dummy.next = p2;
     * 
     * } else if (p2 == null) {
     * // may be elements present in p1
     * dummy.next = p1;
     * }
     * return ans.next;
     * 
     * }
     * 
     * public ListNode mergeKLists(ListNode[] lists) {
     * if (lists.length == 0) {
     * return null;
     * } else if (lists.length == 1) {
     * return lists[0];
     * 
     * } else {
     * ListNode ans = sortedMerge(lists[0], lists[1]);
     * for (int i = 2; i < lists.length; i++) {
     * ans = sortedMerge(ans, lists[i]);
     * }
     * return ans;
     * }
     * }
     * 
     * 
     * 
     */

    public ListNode mergeKLists(ListNode[] lists) {
        // handle the edges cases
        // approach 2: by using the priority queue (heap)
        if (lists.length == 0) {
            return null;
        } else if (lists.length == 1) {
            return lists[0];
        }
        // more than one linked list than
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
        // add the all nodes in the heap
        for (int i = 0; i < lists.length; i++) {
            ListNode temphead = lists[i];
            while (temphead != null) {

                pq.add(temphead);
                temphead = temphead.next;// move the temphead
            }
        }

        // one by one remove the node in the pq and merge one by one in sorted order
        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy;
        while (pq.size() > 0) {
            ListNode temp = pq.remove();// remove the in pq
            dummy.next = temp;
            dummy = dummy.next;// move the dummy node
        }
        dummy.next=null;//last node
        return ans.next;
    }
}