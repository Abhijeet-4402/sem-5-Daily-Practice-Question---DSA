// Last updated: 13/10/2025, 11:12:53 pm
class Solution {
    public static int wiggleMaxLength(int[] arr) {
    if (arr.length == 1)
        return 1;

    int n = arr.length;
    int[][] dp = new int[n][3];
    for (int[] row : dp)
        Arrays.fill(row, 0);

    for (int i = n - 2; i >= 0; i--) {
        for (int diffIdx = 0; diffIdx < 3; diffIdx++) {
            int diff = (diffIdx == 0) ? 0 : (diffIdx == 1 ? 1 : -1);
            int j = i;
            while (j < n - 1 && arr[j] == arr[j + 1])
                j++;
            if (j == n - 1) {
                dp[i][diffIdx] = 0;
                continue;
            }

            int a = 0, b = 0;

            if (diff == 0) {
                if (arr[j] > arr[j + 1]) {
                    a = 1 + dp[j + 1][1];
                } else if (arr[j] < arr[j + 1]) {
                    a = 1 + dp[j + 1][2];
                }
            } else if ((diff == -1 && arr[j] > arr[j + 1]) || (diff == 1 && arr[j] < arr[j + 1])) {
                a = 1 + dp[j + 1][(diff == -1) ? 1 : 2];
            }

            b = dp[j + 1][diffIdx];
            dp[i][diffIdx] = Math.max(a, b);
        }
    }

    return 1 + dp[0][0];
}

}
