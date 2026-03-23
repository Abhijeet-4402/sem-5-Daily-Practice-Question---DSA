// Last updated: 24/3/2026, 12:16:24 am
1class Solution {
2    public int combinationSum4(int[] nums, int target) {
3        int [] dp = new int[target+1];
4        dp[0] = 1;
5        for(int j = 1; j <=target; j++){
6            for(int val: nums){
7                if(j>=val)
8                    dp[j] += dp[j-val];
9            }
10        }
11        return dp[target];
12    }
13}