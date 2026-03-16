// Last updated: 16/3/2026, 4:28:19 pm
1class Solution {
2    public int calculateMinimumHP(int[][] dungeon) {
3        int n = dungeon.length;
4        int m = dungeon[0].length;
5        int[][] dp = new int[n][m];
6        for (int[] x : dp)
7            Arrays.fill(x, -1);
8        return solve(0, 0, dungeon, dp);
9    }
10
11    private int solve(int i, int j, int[][] arr, int[][] dp) {
12        int n = arr.length;
13        int m = arr[0].length;
14        if (i == n - 1 && j == m - 1) {
15            return Math.max(1, 1 - arr[i][j]);
16        }
17        if (dp[i][j] != -1)
18            return dp[i][j];
19
20        int minHealth = Integer.MAX_VALUE;
21
22        if (i + 1 < n) {
23            minHealth = Math.min(minHealth, solve(i + 1, j, arr, dp));
24        }
25
26        if (j + 1 < m) {
27            minHealth = Math.min(minHealth, solve(i, j + 1, arr, dp));
28        }
29        return dp[i][j] = Math.max(1, minHealth - arr[i][j]);
30    }
31}