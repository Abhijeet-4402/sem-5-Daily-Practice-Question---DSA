// Last updated: 23/3/2026, 11:36:22 pm
1class Solution {
2    public int change(int amount, int[] coins) {
3        int []dp = new int [amount+1];
4        dp[0] = 1;
5        for(int val: coins){
6            for(int i = val; i<=amount; i++){
7                dp[i] += dp[i-val];
8            }
9        }
10        return dp[amount];
11    }
12}