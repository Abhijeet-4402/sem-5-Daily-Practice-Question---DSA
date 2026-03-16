// Last updated: 16/3/2026, 9:07:32 am
1class Solution {
2    public static int uniquePathsWithObstacles(int[][] grid) {
3		int n = grid.length;
4		int m = grid[0].length;
5		int[][] dp = new int[n][m];
6		for(int[]x: dp) Arrays.fill(x, -1);
7		return solve(n-1, m-1, grid, dp);
8	}
9
10	private static int solve(int n, int m, int[][] grid, int[][] dp) {
11		if (n < 0 || m < 0 || grid[n][m] == 1)
12			return 0;
13        
14        if (n == 0 && m == 0)
15			return 1;
16		
17		
18		if(dp[n][m]!=-1) return dp[n][m];
19		
20		return dp[n][m] = solve(n, m-1, grid, dp) + solve(n-1, m, grid, dp);
21	}
22}