// Last updated: 13/10/2025, 10:38:16 pm
class Solution {
    public static int wiggleMaxLength(int[] arr) {
        if (arr.length == 1)
            return 1;
        
        int[][] dp = new int[arr.length][3]; // second dimension: diff = 0, 1, -1
        for (int[] row : dp)
            Arrays.fill(row, -1);

        return 1 + wiggle(0, 0, 0, arr, dp);
    }

    private static int wiggle(int i, int diff, int len, int[] arr, int[][] dp) {
        while (i < arr.length - 1 && arr[i] == arr[i + 1])
            i++;

        if (i == arr.length - 1)
            return 0;

        int diffIdx = (diff == 0) ? 0 : (diff == 1 ? 1 : 2);

        if (dp[i][diffIdx] != -1)
            return dp[i][diffIdx];

        int a = 0, b = 0;

        if (diff == 0) {
            if (arr[i] > arr[i + 1]) {
                a = 1 + wiggle(i + 1, 1, len + 1, arr, dp);
            } else if (arr[i] < arr[i + 1]) {
                a = 1 + wiggle(i + 1, -1, len + 1, arr, dp);
            }
        } else if ((diff == -1 && arr[i] > arr[i + 1]) || (diff == 1 && arr[i] < arr[i + 1])) {
            a = 1 + wiggle(i + 1, -diff, len + 1, arr, dp);
        }

        b = wiggle(i + 1, diff, len, arr, dp);

        return dp[i][diffIdx] = Math.max(a, b);
    }
}
