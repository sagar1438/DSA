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
    public ListNode swapPairs(ListNode head) {
        if(head == null ) return head;
        if(head.next == null ) return head;

        ListNode sol = new ListNode(0);
        sol.next = head;
        ListNode prev = sol;
        ListNode curr = head;

        while(curr.next != null){
            ListNode next = curr.next;
            curr.next = next.next;
            prev.next = next;
            next.next = curr;

            prev = curr;
            if(curr.next != null) curr = curr.next;

        }
        return sol.next;
    }
}