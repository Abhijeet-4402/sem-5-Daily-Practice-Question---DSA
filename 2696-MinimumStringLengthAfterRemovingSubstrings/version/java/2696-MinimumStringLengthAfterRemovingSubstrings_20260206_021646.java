// Last updated: 6/2/2026, 2:16:46 am
1class Solution {
2    public int minLength(String s) {
3        Stack<Character> st = new Stack<>();
4        for(char ch:s.toCharArray()){
5            if(!st.isEmpty() && ((st.peek()=='A' && ch=='B') || (st.peek()=='C' && ch=='D'))) st.pop();
6            else st.push(ch);
7        }
8
9        return st.size();
10    }
11}