// Last updated: 14/3/2026, 12:14:55 pm
1class Solution {
2	public long mostPoints(int[][] questions) {
3		int n = questions.length;
4		long[] dp = new long[n+1];
5		for (int i = n-1; i >=0; i--) {
6			long pnts = questions[i][0];
7			int next = (i+questions[i][1])>n-1 ? n-1: i+questions[i][1];
8			
9			long take = pnts+dp[next+1];
10			long dont = dp[i+1];
11			
12			dp[i] = Math.max(take, dont);
13		}
14		
15		return dp[0];
16	}
17}