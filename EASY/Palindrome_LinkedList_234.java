
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head.next == null) return true;
        if(head.next.next == null) return head.val == head.next.val;

        ListNode slow = head;
        ListNode fast = head;
    
        while(fast.next != null && fast.next.next != null){
            if(fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            }
        }
        
        ListNode curr = slow.next;
        ListNode prev = null;
        slow.next = null;
        slow = head;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        while(slow != null && prev != null){
            if(slow.val != prev.val) return false;

            slow = slow.next;
            prev = prev.next;
        }
        return true;
         
    }
   
}