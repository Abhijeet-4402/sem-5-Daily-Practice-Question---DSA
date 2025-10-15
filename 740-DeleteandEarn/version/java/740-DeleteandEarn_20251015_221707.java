// Last updated: 15/10/2025, 10:17:07 pm
class Solution {
    public static int deleteAndEarn(int[] arr) {
        int maxVal = 0;
        int[] freq = new int[10001];
        for (int num : arr) {
            freq[num] += num;
            maxVal = Math.max(maxVal, num);
        }

        int[] dp = new int[maxVal + 1];
        Arrays.fill(dp, -1);

        return earn(freq, maxVal, dp);
    }

    private static int earn(int[] freq, int idx, int[] dp) {
        if (idx < 0) return 0;
        if (dp[idx] != -1) return dp[idx];

        int pick = freq[idx] + earn(freq, idx - 2, dp);
        int skip = earn(freq, idx - 1, dp);            

        dp[idx] = Math.max(pick, skip);
        return dp[idx];
    }
}


