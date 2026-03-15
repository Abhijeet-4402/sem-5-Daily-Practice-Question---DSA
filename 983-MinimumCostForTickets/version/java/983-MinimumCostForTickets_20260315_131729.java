// Last updated: 15/3/2026, 1:17:29 pm
1class Solution {
2    public static int mincostTickets(int[] days, int[] costs) {
3		int n = days.length - 1;
4		int[] dp = new int[n+1];
5		Arrays.fill(dp,  -1);
6		return solve(n, days, costs, dp);
7	}
8
9	private static int solve(int idx, int[] days, int[] cost, int [] dp) {
10		if (idx < 0)
11			return 0;
12		
13		// Pre-Computed
14		if(dp[idx]!=-1) return dp[idx];
15		
16		//1-Days Pass
17		int day = cost[0] + solve(idx - 1, days, cost, dp);
18		
19		//7-Days Pass
20		int prev = days[idx] - 7;
21		int j = idx;
22		while (j >= 0 && days[j] > prev)
23			j--;
24		int week = cost[1] + solve(j, days, cost, dp);
25		
26		//30-Days Pass
27		prev = days[idx] - 30;
28		j = idx;
29		while (j >= 0 && days[j] > prev)
30			j--;
31		int month = cost[2] + solve(j, days, cost, dp);
32
33		return dp[idx]=Math.min(day, Math.min(week, month));
34
35	}
36}