// Last updated: 6/2/2026, 3:19:56 am
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
12    public int getDecimalValue(ListNode head) {
13        int size = 0;
14        ListNode t = head;
15        while(t!=null){
16            size++;
17            t = t.next;
18        }
19        size--;
20        int num = 0;
21
22        while(head!=null){
23            if(head.val==1){
24                num+=(1<<size);
25            }
26            size--;
27            head = head.next;
28        }
29
30        return num;
31    }
32}