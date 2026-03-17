// Last updated: 17/3/2026, 10:44:39 am
1class Solution {
2    public int calculateMinimumHP(int[][] arr) {
3		int n = arr.length;
4		int m = arr[0].length;
5		int[][] dp = new int[n][m];
6		dp[n - 1][m - 1] = Math.max(1, 1 - arr[n - 1][m - 1]);
7        for(int i = 2; i <= n ; i++){
8            dp[n-i][m-1] = Math.max(1,dp[n-i+1][m-1] - arr[n-i][m-1]);
9        }
10        for(int i = 2; i <= m ; i++){
11            dp[n-1][m-i] = Math.max(1,dp[n-1][m-i+1] - arr[n-1][m-i]);
12        }
13		for (int i = n - 2; i >= 0; i--) {
14			for (int j = m - 2; j >= 0; j--) {
15				int minHealth = Math.min(dp[i][j+1], dp[i+1][j]);
16				dp[i][j] = Math.max(1, minHealth - arr[i][j]);
17			}
18		}
19
20		return dp[0][0];
21	}
22
23}