// Last updated: 2/2/2026, 12:41:08 pm
1class Solution {
2    public String makeGood(String s) {
3        Stack<Character> st = new Stack<>();
4
5        for (char ch : s.toCharArray()) {
6            if (!st.isEmpty() && Math.abs(st.peek() - ch) == 32) {
7                st.pop();
8            } else {
9                st.push(ch);
10            }
11        }
12
13        StringBuilder out = new StringBuilder();
14
15        while (!st.isEmpty()) {
16            out.insert(0, st.pop());
17        }
18
19        return out.toString();
20    }
21}
22