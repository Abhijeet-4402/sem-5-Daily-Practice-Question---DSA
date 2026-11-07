// Last updated: 7/11/2026, 8:06:46 pm
1class Solution {
2    public long countValidSubstrings(String s) {
3        int last = -1;
4        long ans = 0;
5
6        for(int i = 0; i<s.length(); i++){
7            if(i>1 && s.charAt(i-2) == 'a' && s.charAt(i-1)=='b' && s.charAt(i) =='c') last = i-2;
8            ans+=i-last;
9        }
10        return ans;
11    }
12}