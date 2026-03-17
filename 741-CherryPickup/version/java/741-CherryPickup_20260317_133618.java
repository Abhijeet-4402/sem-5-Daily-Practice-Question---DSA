// Last updated: 17/3/2026, 1:36:18 pm
1class Solution {
2    public int cherryPickup(int[][] grid) {
3        int n = grid.length;
4		int [][][] dp = new int[2*n-1][n][n];
5		for (int[][] x : dp) {
6	        for (int[] a : x) {
7	            Arrays.fill(a, -1);
8	        }
9	    }
10		int ans = solve(0, 0, 0, n, grid, dp);
11        return ans==Integer.MIN_VALUE?0:ans;
12	}
13	
14	private int solve(int t, int r1, int r2, int n, int [][] arr, int[][][]dp) {
15		int c1 = t-r1;
16		int c2 = t-r2;
17		
18		if(r1>=n||c1>=n||r2>=n||c2>=n|| arr[r1][c1]==-1 || arr[r2][c2]==-1) return Integer.MIN_VALUE;
19		if(t==2*n-2) return arr[n-1][n-1];
20		if(dp[t][r1][r2]!=-1) return dp[t][r1][r2];
21		
22		int cherries = 0;
23		if(r1==r2 && c1==c2) {
24			cherries = arr[r1][c1];
25		}else {
26			cherries = arr[r1][c1] + arr[r2][c2];
27		}
28		
29		int next = Math.max(
30				Math.max(
31						solve(t+1, r1, r2, n, arr, dp), 
32						solve(t+1, r1+1, r2, n, arr, dp)
33						),
34				Math.max(solve(t+1, r1, r2+1, n, arr, dp),
35						solve(t+1, r1+1, r2+1, n, arr, dp)
36						)
37				);
38		
39		if(next == Integer.MIN_VALUE) return dp[t][r1][r2] = Integer.MIN_VALUE;
40		return dp[t][r1][r2] = cherries+next;
41	}
42
43}