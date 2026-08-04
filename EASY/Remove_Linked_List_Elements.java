
class Solution {
    public ListNode removeElements(ListNode head, int val) {

        ListNode sol = new ListNode(0,head);
        ListNode curr = sol;

        while(curr != null){
            while(  curr.next != null&& curr.next.val == val){
                curr.next = curr.next.next;
            }
            curr = curr.next;
        }
        return sol.next;
    }
}