// Last updated: 11/3/2026, 12:01:18 pm
1class Solution {
2    public static int rob(int[] nums) {
3	    int n = nums.length;
4	    if (n == 1) return nums[0];
5	    return Math.max(solve(nums, 0, n - 2), solve(nums, 1, n - 1));
6	}
7
8	private static int solve(int[] nums, int start, int end) {
9	    int n = end - start + 1;
10	    if (n <= 0) return 0;
11	    if (n == 1) return nums[start];
12
13	    int[] dp = new int[n];
14	    dp[0] = nums[start];
15	    dp[1] = Math.max(nums[start], nums[start + 1]);
16
17	    for (int i = 2; i < n; i++) {
18	        dp[i] = Math.max(dp[i - 1], nums[start + i] + dp[i - 2]);
19	    }
20	    return dp[n - 1];
21	}
22}