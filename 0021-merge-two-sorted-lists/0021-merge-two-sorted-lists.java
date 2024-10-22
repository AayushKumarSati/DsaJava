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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode();
        ListNode res=ans;
        while (list1 != null && list2 != null) {
            // compare l1 data is less than l2 data
            if (list1.val > list2.val) {
                res.next=list2;
                list2=list2.next;

            } else {
                // compare l2 val is less than l1 val
                res.next=list1;
                list1=list1.next;

            }
            res=res.next;
        }
        res.next=(list1!=null)?list1:list2;
      
        return ans.next;

    }
}