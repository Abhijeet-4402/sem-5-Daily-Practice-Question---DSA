// Last updated: 15/6/2026, 5:17:48 pm
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
12    public ListNode deleteMiddle(ListNode head) {
13        if (head == null || head.next == null)
14            return null;
15        ListNode fast = head;
16        ListNode slow = head;
17        ListNode prev = null;
18        while(fast!=null&&fast.next!=null){
19            prev = slow;
20            slow = slow.next;
21            fast = fast.next.next;
22        }
23
24        
25        prev.next = slow.next;
26        slow.next = null;
27
28        return head;
29    }
30}