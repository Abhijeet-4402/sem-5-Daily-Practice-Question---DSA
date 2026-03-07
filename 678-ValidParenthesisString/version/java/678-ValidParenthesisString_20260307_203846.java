// Last updated: 7/3/2026, 8:38:46 pm
1class Solution {
2    public boolean checkValidString(String s) {
3        Stack<Integer> open = new Stack<>();
4        Stack<Integer> star = new Stack<>();
5        for (int i = 0; i < s.length(); i++) {
6            char ch = s.charAt(i);
7            if (ch == '(') {
8                open.push(i);
9            } else if (ch == '*') {
10                star.push(i);
11            } else {
12                if (open.isEmpty() && star.isEmpty()) {
13                    return false;
14                }
15                if (!open.isEmpty()) {
16                    open.pop();
17                } else {
18                    star.pop();
19                }
20            }
21        }
22        while (!open.isEmpty() && !star.isEmpty()) {
23            if (open.pop() > star.pop()) {
24                return false;
25            }
26        }
27        return open.isEmpty();
28    }
29}