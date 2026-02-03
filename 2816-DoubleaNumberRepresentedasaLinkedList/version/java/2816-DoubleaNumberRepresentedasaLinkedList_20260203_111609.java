// Last updated: 3/2/2026, 11:16:09 am
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
16        ListNode dummy = new ListNode();
17        if(val/10!=0){
18            dummy.val = val/10;
19            dummy.next = head;
20            return dummy;
21        }
22
23        return head;
24
25    }
26    public int makeItDouble(ListNode head){
27        if(head==null) return 0;
28
29        int carry = makeItDouble(head.next);
30        int val = (head.val*2 + carry);
31        head.val = val%10;
32        return val/10;
33    }
34}