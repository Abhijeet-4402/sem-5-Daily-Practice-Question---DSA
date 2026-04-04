// Last updated: 4/4/2026, 8:10:23 pm
1class Solution {
2    public static int tallestBillboard(int[] rods) {
3		long sum =0;
4		for(int x: rods) sum+=x;
5		sum/=2;
6		int[][] dp = new int[rods.length+1][10001];
7        for(int[] row: dp) Arrays.fill(row, -1);
8		return solve(0,0,rods, dp);
9	}
10	
11	private static int solve(int idx, int s1, int[] rods, int[][] dp) {
12		if(idx==rods.length) return s1 == 0 ? 0 : -10000;
13		if(dp[idx][s1+5000]!=-1) return dp[idx][s1+5000];
14		int take = rods[idx] + solve(idx+1, s1 + rods[idx], rods, dp);
15		int skip = solve(idx + 1, s1, rods, dp);
16		int notake = solve(idx + 1, s1 - rods[idx], rods, dp);
17		
18		return dp[idx][s1+5000] = Math.max(take, Math.max(skip, notake));
19	}
20}