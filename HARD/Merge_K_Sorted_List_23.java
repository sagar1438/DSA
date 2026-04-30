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

//  class Solution {
//     public ListNode mergeKLists(ListNode[] lists) {
//         ListNode sol = new ListNode(-1);
//         PriorityQueue<ListNode> q = new PriorityQueue<>((a, b) -> a.val - b.val);

//         for(ListNode node : lists){
//             if(node != null){
//                 q.add(node);
//             }
//         }

//         ListNode curr = sol;

//         while (!q.isEmpty()) {
//             ListNode newnode = q.poll();
//             curr.next = newnode;
//             curr = curr.next;
//             if(newnode.next != null){
//                 q.add(newnode.next);
//             }
//         }

//         return sol.next;
//     }
// }
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) return null;
        return mergecall(lists,0,lists.length-1);
    }
    public ListNode mergecall(ListNode[] lists , int start , int end){
        if(start == end ) return lists[start];

        int mid = start + (end -start)/2;
        ListNode l1 = mergecall(lists,start,mid);
        ListNode l2 = mergecall(lists,mid+1 , end);
        return merge(l1,l2);
    }
    public ListNode merge(ListNode l1, ListNode l2){
        ListNode newlist = new ListNode(0);
        ListNode curr = newlist;

        while(l1 != null && l2 != null){

            if(l1.val <= l2.val){
                curr.next = l1;
                l1 = l1.next;
            }else{
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
         
        }
            if(l1 != null) curr.next = l1;
            if(l2 != null) curr.next = l2;
         return newlist.next;
    }
}