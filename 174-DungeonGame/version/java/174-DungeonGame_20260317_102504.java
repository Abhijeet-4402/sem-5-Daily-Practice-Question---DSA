// Last updated: 17/3/2026, 10:25:04 am
1class Solution {
2    public int calculateMinimumHP(int[][] arr) {
3		int n = arr.length;
4		int m = arr[0].length;
5		int[][] dp = new int[n][m];
6		dp[n - 1][m - 1] = Math.max(1, 1 - arr[n - 1][m - 1]);
7		for (int i = n - 1; i >= 0; i--) {
8			for (int j = m - 1; j >= 0; j--) {
9				if (i == n - 1 && j == m - 1)
10					continue;
11				int minHealth = Integer.MAX_VALUE;
12				if(i+1<n) {
13					minHealth = Math.min(minHealth, dp[i+1][j]);
14				}
15				if(j+1<m) {
16					minHealth = Math.min(minHealth, dp[i][j+1]);
17				}
18				dp[i][j] = Math.max(1, minHealth - arr[i][j]);
19			}
20		}
21
22		return dp[0][0];
23	}
24
25}