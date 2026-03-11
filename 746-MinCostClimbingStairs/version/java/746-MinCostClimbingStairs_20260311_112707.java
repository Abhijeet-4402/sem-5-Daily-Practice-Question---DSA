// Last updated: 11/3/2026, 11:27:07 am
1class Solution {
2    public static int rob(int[] nums) {
3		// TODO Auto-generated method stub
4		if(nums.length == 1) return nums[0];
5		if(nums.length == 2) return Math.max(nums[1], nums[0]);
6		if(nums.length == 3) return Math.max(nums[1], nums[0]+nums[2]);
7		int [] dp = new int[nums.length+1];
8		Arrays.fill(dp,-1);
9		return solve(nums.length-1, nums, dp);
10	}
11	
12	private static int solve(int idx, int[] nums, int[] dp) {
13		// TODO Auto-generated method stub
14		if(idx < 0) return 0;
15		
16		if(dp[idx]!=-1) return dp[idx];
17		int take  = nums[idx]+solve(idx-2, nums, dp);
18		int dont = solve(idx-1, nums, dp);
19		return dp[idx] = Math.max(take, dont);
20	}
21
22}