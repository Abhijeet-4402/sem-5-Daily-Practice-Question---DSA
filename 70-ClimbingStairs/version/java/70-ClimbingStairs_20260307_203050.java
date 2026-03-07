// Last updated: 7/3/2026, 8:30:50 pm
1class Solution {
2    int[]dp;
3    public int climbStairs(int n) {
4        dp = new int[n+1];
5        Arrays.fill(dp,-1);
6        return c_Ways(n);
7    }
8    private int c_Ways(int n) {
9		if(n<3) return n;
10		if(dp[n]!=-1)return dp[n];
11		return dp[n] = c_Ways(n-1)+c_Ways(n-2);
12	}
13}