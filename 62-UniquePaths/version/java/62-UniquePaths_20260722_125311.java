// Last updated: 22/7/2026, 12:53:11 pm
1class Solution {
2    public int uniquePaths(int m, int n) {
3        int N = m + n - 2;
4        int K = Math.min(m - 1, n - 1);
5        
6        long ans = 1;
7
8        for (int i = 1; i <= K; i++) {
9            ans = ans * (N - K + i) / i;
10        }
11        
12        return (int) ans;
13    }
14}