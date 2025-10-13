// Last updated: 14/10/2025, 2:13:50 am
class Solution {
    public int wiggleMaxLength(int[] arr) {
        if (arr.length <= 1) {
            return arr.length;
        }

        int[][] dp = new int[arr.length][3];

        for (int i = 1; i < arr.length; i++) {
            for (int diff = -1; diff <= 1; diff++) {
                int diffIdx = (diff == 0) ? 0 : (diff == 1 ? 1 : 2);
                int a = 0;
                int b = 0;

                if (diff == 0) {
                    if (arr[i - 1] > arr[i]) {
                        a = 1 + dp[i - 1][1];
                    } else if (arr[i - 1] < arr[i]) {
                        a = 1 + dp[i - 1][2];
                    }
                } else if ((diff == -1 && arr[i - 1] > arr[i]) || (diff == 1 && arr[i - 1] < arr[i])) {
                    int prevDiffIdxForA = (diff == -1) ? 1 : 2;
                    a = 1 + dp[i - 1][prevDiffIdxForA];
                }
                
                b = dp[i - 1][diffIdx];
                
                dp[i][diffIdx] = Math.max(a, b);
            }
        }

        return 1 + dp[arr.length - 1][0];
    }
}
