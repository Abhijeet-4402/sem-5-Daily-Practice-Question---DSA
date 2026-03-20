// Last updated: 21/3/2026, 12:26:05 am
1class Solution {
2    public int minPathSum(int[][] grid) {
3        int n = grid.length;
4        int m = grid[0].length;
5        int[][] dp = new int[n][m];
6        dp[0][0] = grid[0][0];
7        for (int i = 1; i < n; i++) {
8            dp[i][0] = grid[i][0] + dp[i - 1][0];
9        }
10        for (int i = 1; i < m; i++) {
11            dp[0][i] = grid[0][i] + dp[0][i - 1];
12        }
13
14        for (int i = 1; i < n; i++) {
15            for (int j = 1; j < m; j++) {
16                dp[i][j] = grid[i][j] + Math.min(dp[i][j - 1], dp[i - 1][j]);
17            }
18        }
19        return dp[n - 1][m - 1];
20    }
21}