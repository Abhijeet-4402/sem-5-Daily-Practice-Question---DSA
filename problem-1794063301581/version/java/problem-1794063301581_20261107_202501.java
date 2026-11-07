// Last updated: 7/11/2026, 8:25:01 pm
1class Solution {
2    public long countValidSubstrings(String s) {
3        int a = -1;
4        int ab = -1;
5        int abc = -1;
6        long ans  = 0;
7
8        for(int i = 0; i < s.length(); i++){
9            char c = s.charAt(i);
10            if(c=='a')a = i;
11            else if(c=='b') ab = Math.max(ab,a);
12            else if(c=='c') abc = Math.max(abc, ab);
13
14            ans += i-abc;
15        }
16
17        return ans;
18    }
19}