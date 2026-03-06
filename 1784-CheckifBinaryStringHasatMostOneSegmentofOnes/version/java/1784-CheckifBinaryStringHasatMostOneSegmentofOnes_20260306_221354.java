// Last updated: 6/3/2026, 10:13:54 pm
1class Solution {
2    public boolean checkOnesSegment(String s) {
3        int n = s.length();
4        boolean found = false;
5        for (int i = 0; i < n; i++) {
6            if(s.charAt(i)=='1'){
7                if(found) return false;
8                else{
9                    found = true;
10                    while(i<n && s.charAt(i)=='1')i++;
11                }
12            }
13        }
14        return true;
15    }
16}