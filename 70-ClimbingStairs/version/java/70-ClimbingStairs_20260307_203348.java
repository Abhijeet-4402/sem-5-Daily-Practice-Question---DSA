// Last updated: 7/3/2026, 8:33:48 pm
1class Solution {
2    
3    public int climbStairs(int n) {
4        if(n<3) return n;
5        int[]dp = new int[n];
6        dp[0] = 1;
7        dp[1] = 2;
8
9        for(int i =2; i<n;i++){
10            dp[i] = dp[i-1]+dp[i-2];
11        }
12
13        return dp[n-1];
14    }
15}