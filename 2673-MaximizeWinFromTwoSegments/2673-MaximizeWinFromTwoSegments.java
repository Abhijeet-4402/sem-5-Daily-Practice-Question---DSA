// Last updated: 23/7/2026, 9:36:15 am
class Solution {
    public int maximizeWin(int[] arr, int k) {
        int res = 0, n = arr.length, j = 0, dp[] = new int[n + 1];
        for (int i = 0; i < n; ++i) {
            while (arr[j] < arr[i] - k)
                j++;
            dp[i + 1] = Math.max(dp[i], i - j + 1);
            res = Math.max(res, i - j + 1 + dp[j]);
        }
        return res;
    }
}