// Last updated: 6/2/2026, 3:28:50 am
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
24        ListNode nxt = slow.next;
25        slow.next = null;
26        prev.next = nxt;
27
28        return head;
29    }
30}