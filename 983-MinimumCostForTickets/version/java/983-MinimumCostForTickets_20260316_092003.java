// Last updated: 16/3/2026, 9:20:03 am
1class Solution {
2    private static int solve(int n, int m, int[][] grid, int[][] dp) {
3		if (n < 0 || m < 0 || grid[n][m] == 1)
4			return 0;
5		if (n == 0 && m == 0)
6			return 1;
7		if(dp[n][m]!=-1)return dp[n][m];
8		return dp[n][m] = solve(n, m-1, grid, dp) + solve(n-1, m, grid, dp);
9	}
10	public static int uniquePathsWithObstacles(int[][] grid) {
11		int n = grid.length;
12		int m = grid[0].length;
13        if(grid[0][0]==1) return 0;
14
15		int[][] dp = new int[n+1][m+1];
16        dp[1][1] = 1;
17		for(int i = 1;i<=n;i++) {
18			for(int j = 1; j<=m;j++) {
19				if(i==1 && j==1) continue;
20				if(grid[i-1][j-1]==0) {
21					dp[i][j] = dp[i-1][j]+dp[i][j-1];
22				}else {
23					dp[i][j] = 0;
24				}
25			}
26		}
27		return dp[n][m];
28	}
29}