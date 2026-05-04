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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null) return head;

        ListNode curr = head;
        ListNode next = null;
        ListNode prev = null;

        while(curr != null){
            ListNode kthNode = getkthNode(curr,k);

            if(kthNode == null){
                prev.next = curr;
                break;
            }

            next = kthNode.next;
            kthNode.next = null;

            kthNode = reverse(curr);

            if(curr==head){
                head = kthNode;
            }else{
                prev.next = kthNode;
            }

            prev = curr;
            curr = next;
        }
        return head;
    }
    public ListNode getkthNode(ListNode head,int k){
        k--;

        ListNode curr = head;
        while(k-->0&&curr != null){
            curr = curr.next;
        }
        return curr;
    }
    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}