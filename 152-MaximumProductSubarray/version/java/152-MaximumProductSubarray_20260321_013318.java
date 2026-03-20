// Last updated: 21/3/2026, 1:33:18 am
1class Solution {
2    public int minimumTotal(List<List<Integer>> arr) {
3        int n = arr.size();
4        int[] dp = new int[n];
5        for (int i = 0; i < n; i++) {
6            dp[i] = arr.get(n - 1).get(i);
7        }
8        for (int row = n - 2; row >= 0; row--) {
9            for (int col = 0; col <= row; col++) {
10                dp[col] = arr.get(row).get(col) + Math.min(dp[col], dp[col + 1]);
11            }
12        }
13        return dp[0];
14    }
15}