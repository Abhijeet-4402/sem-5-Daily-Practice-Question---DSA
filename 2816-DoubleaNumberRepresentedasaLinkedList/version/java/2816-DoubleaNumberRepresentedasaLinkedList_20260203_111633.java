// Last updated: 3/2/2026, 11:16:33 am
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode doubleIt(ListNode head) {
13        int carry = makeItDouble(head.next);
14        int val = (head.val*2+carry);
15        head.val = val%10;
16        
17        if(val/10!=0){
18            ListNode dummy = new ListNode();
19            dummy.val = val/10;
20            dummy.next = head;
21            return dummy;
22        }
23
24        return head;
25
26    }
27    public int makeItDouble(ListNode head){
28        if(head==null) return 0;
29
30        int carry = makeItDouble(head.next);
31        int val = (head.val*2 + carry);
32        head.val = val%10;
33        return val/10;
34    }
35}