// Last updated: 22/3/2026, 11:11:26 pm
1class Solution {
2    public boolean canPartition(int[] nums) {
3        int sum = 0;
4        for(int val: nums)sum+=val;
5        if((sum & 1) == 1) return false;
6        int target = sum>>1;
7
8        int[][] dp = new int[nums.length][target + 1];
9        for (int[] row : dp) Arrays.fill(row, -1);
10
11        return solve(0, target, nums, dp);
12    }
13
14    private boolean solve(int idx, int sum, int[] arr, int[][] dp) {
15        if (sum == 0) return true;
16
17        if (idx >= arr.length || sum < 0) return false;
18
19        if (dp[idx][sum] != -1) return dp[idx][sum] == 1;
20
21        boolean take = solve(idx + 1, sum - arr[idx], arr, dp);
22        boolean noTake = solve(idx + 1, sum, arr, dp);
23
24        dp[idx][sum] = (take || noTake) ? 1 : 0;
25
26        return take || noTake;
27    }
28}