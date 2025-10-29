// Last updated: 29/10/2025, 11:49:46 am
class Solution {
    static int [][] dp;
    public int maxSumDivThree(int[] arr) {
      dp = new int[arr.length][3];
		for (int[] row : dp)
			Arrays.fill(row, -1);

		return maxSumDivThree(arr, arr.length - 1, 0);
	}

	public static int maxSumDivThree(int[] nums, int idx, int rem) {

		if (idx == -1) {
			return (rem == 0) ? 0 : -1;
		}

		if (dp[idx][rem] != -1)
			return dp[idx][rem];

		int take = maxSumDivThree(nums, idx - 1, (rem + nums[idx]) % 3);
		if (take != -1)
			take += nums[idx];

		int noTake = maxSumDivThree(nums, idx - 1, rem);

		int ans = -1;

		if (take != -1)
			ans = Math.max(ans, take);
		if (noTake != -1)
			ans = Math.max(ans, noTake);

		dp[idx][rem] = ans;
		return ans;
	}
}