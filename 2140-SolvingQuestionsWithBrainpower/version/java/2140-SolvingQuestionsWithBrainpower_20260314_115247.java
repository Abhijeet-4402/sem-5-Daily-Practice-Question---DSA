// Last updated: 14/3/2026, 11:52:47 am
1class Solution {
2	public long mostPoints(int[][] questions) {
3        int n = questions.length;
4        long[] dp = new long[n];
5        Arrays.fill(dp, -1);
6		return solve(0, questions, dp);
7	}
8
9	private static long solve(int idx, int[][] arr, long[] dp) {
10		if (idx >= arr.length) return 0;
11
12        if(dp[idx] != -1) return dp[idx];
13
14		int coolDown = arr[idx][1];
15		long point = arr[idx][0];
16        //TAKE
17		long take = point + solve(idx + coolDown + 1, arr, dp);
18
19        //DONT TAKE
20		long dontTake = solve(idx + 1, arr, dp);
21
22        return dp[idx] = Math.max(take, dontTake);
23	}
24}