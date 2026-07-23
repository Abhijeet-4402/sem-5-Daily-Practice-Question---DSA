// Last updated: 23/7/2026, 9:36:09 am
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
    public ListNode doubleIt(ListNode head) {
        int carry = makeItDouble(head.next);
        int val = (head.val*2+carry);
        head.val = val%10;
        
        if(val/10!=0){
            ListNode dummy = new ListNode();
            dummy.val = val/10;
            dummy.next = head;
            return dummy;
        }

        return head;

    }
    public int makeItDouble(ListNode head){
        if(head==null) return 0;

        int carry = makeItDouble(head.next);
        int val = (head.val*2 + carry);
        head.val = val%10;
        return val/10;
    }
}