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
    static{
        for (int i=0;i<500;i++){
            addTwoNumbers(new ListNode(0), new ListNode(0));
        }

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0, null);

        ListNode ptr1 = l1;
        ListNode ptr2 = l2;
        ListNode res = ans;

        int remainder = 0;
        while (ptr1 != null || ptr2 != null) {
            int sum = remainder;
            if (ptr1!=null){
                sum+= ptr1.val;//add val1 if present and move ptr1
                ptr1 = ptr1.next;
            }

            if (ptr2!=null){
                sum+= ptr2.val;//add val1 if present and move ptr2
                ptr2 = ptr2.next;
            }
            remainder = sum / 10;
            res.next = new ListNode(sum % 10);
            res = res.next;
        }
        if (remainder != 0){ //add remainder node if present
            res.next = new ListNode(remainder);
        }
        return ans.next;

    }
}