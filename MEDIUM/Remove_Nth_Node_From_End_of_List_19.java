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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return head;
        }
     int length = 0;
     ListNode curr = head;
     while(curr!=null){
        length++;
        curr = curr.next;
     }
    int target = length - n;
    if(target == 0){
        head = head.next;   
    }else{ 
    length = 0;
    curr = head;
    while(curr!=null){
        length++;
        if(length==target){
            curr.next = curr.next.next;
            break;
        }
        curr = curr.next;
    }
    }
    return head;
    }
}