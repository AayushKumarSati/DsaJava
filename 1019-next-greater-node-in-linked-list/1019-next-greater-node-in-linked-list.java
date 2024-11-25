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
    // step1:reverse the Linkedlist because we are traversal in last node from the
    // LInkedlist
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode nbr = current.next;
            current.next = prev;
            prev = current;
            current = nbr;
        }
        return prev;
    }

    // Step2:find the size of LL
    public int sizeLL(ListNode head) {
        ListNode current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;

        }
        return count;
    }

    public int[] nextLargerNodes(ListNode head) {
        // find the size of LL
        int size = sizeLL(head);
        // After reverse The LinkedList
        ListNode nhead = reverse(head);
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[size];
        st.push(nhead.val);
        ListNode current = nhead.next;
        int ptr = size - 2;
        while (ptr >= 0) {
            int ele = current.val;
            current = current.next;// move the current pointer
            // check and pop
            while (st.size() > 0 && ele >= st.peek()) {
                st.pop();
            }
            // put in array
            if (st.size() == 0) {
                ans[ptr] = 0;
            } else {
                ans[ptr] = st.peek();
            }
            // push ele in stack
            st.push(ele);
            ptr--;
        }
        return ans;

    }
}