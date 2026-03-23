// Last updated: 23/3/2026, 7:11:16 pm
1class Solution {
2    public int findTargetSumWays(int[] arr, int target) {
3        int total = 0;
4        for(int val : arr) total+=val;
5
6        if (Math.abs(target) > total || (total - target) % 2 != 0) return 0;
7
8        int sum = (total-target)/2;
9        int[] dp = new int[sum + 1];
10        dp[0] = 1;
11
12        for (int val : arr) {
13            for (int j = sum; j >= val; j--) {
14                dp[j] += dp[j - val];
15            }
16        }
17        return dp[sum];
18    }
19}