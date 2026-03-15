// Last updated: 15/3/2026, 3:50:57 pm
1class Solution {
2    public static int maxProfit(int[] prices) {
3		int[][] dp = new int[prices.length][2];
4		for(int[]x:dp)Arrays.fill(x,  -1);
5		return solve(0, 0, prices, dp);
6	}
7	
8	private static int solve(int idx, int hold, int[] price, int[][]dp) {
9		if(idx>=price.length) return 0;
10		
11		if(dp[idx][hold]!=-1) return dp[idx][hold];
12		int buy = 0, sell = 0, skip = 0;
13		if(hold==1) {
14			sell = price[idx]+ solve(idx+2, 0, price, dp);
15			skip = solve(idx+1, 1, price, dp);
16		}else {
17			buy = -price[idx] + solve(idx+1, 1, price, dp);
18			skip = solve(idx+1, 0, price, dp);
19		}
20		
21		return dp[idx][hold] = Math.max(skip, Math.max(buy, sell));
22	}
23}