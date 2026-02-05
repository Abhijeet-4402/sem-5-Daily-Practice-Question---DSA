// Last updated: 6/2/2026, 3:29:47 am
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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode hare=head;
        ListNode tort=head;
        ListNode prev=null;
        while(hare!=null && hare.next!=null){
            hare=hare.next.next;
            prev=tort;
            tort=tort.next;
        }
        prev.next=tort.next;
        tort=null;
        return head;
    }
}