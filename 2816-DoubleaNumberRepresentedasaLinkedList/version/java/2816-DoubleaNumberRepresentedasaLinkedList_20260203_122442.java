// Last updated: 3/2/2026, 12:24:42 pm
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
12    public int[] nextLargerNodes(ListNode head) {
13        int n = 0;
14        ListNode t = head;
15        while (t != null) {
16            n++;
17            t = t.next;
18        }
19
20        int[] ans = new int[n];
21
22        Stack<Integer> st = new Stack<>();
23        solve(head, 0, st, ans);
24
25        return ans;
26    }
27
28    private void solve(ListNode head, int i, Stack<Integer> st, int[] ans) {
29
30        if (head == null) return;
31        solve(head.next, i + 1, st, ans);
32
33        while (!st.isEmpty() && st.peek() <= head.val) {
34            st.pop();
35        }
36        ans[i] = st.isEmpty() ? 0 : st.peek();
37        st.push(head.val);
38    }
39}
40