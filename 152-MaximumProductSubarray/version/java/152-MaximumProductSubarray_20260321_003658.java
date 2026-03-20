// Last updated: 21/3/2026, 12:36:58 am
1class Solution {
2	public static int uniquePathsWithObstacles(int[][] grid) {
3		int n = grid.length;
4		int m = grid[0].length;
5        if(grid[0][0]==1) return 0;
6		int[][] dp = new int[n+1][m+1];
7        dp[1][1] = 1;
8		for(int i = 1;i<=n;i++) {
9			for(int j = 1; j<=m;j++) {
10				if(i==1 && j==1) continue;
11				if(grid[i-1][j-1]==0) {
12					dp[i][j] = dp[i-1][j]+dp[i][j-1];
13				}else {
14					dp[i][j] = 0;
15				}
16			}
17		}
18		return dp[n][m];
19	}
20}