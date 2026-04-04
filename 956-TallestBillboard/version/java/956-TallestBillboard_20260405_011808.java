// Last updated: 5/4/2026, 1:18:08 am
1class Solution {
2    public static int tallestBillboard(int[] rods) {
3        int[] dp = new int[5001];
4        Arrays.fill(dp, -1);
5        dp[0] = 0;
6        for (int r : rods) {
7            int[] nxt = dp.clone();
8            for (int i = 0; i <= 5000; i++) {
9                if (nxt[i] == -1)
10                    continue;
11                // plus
12                if (i + r <= 5000)
13                    dp[i + r] = Math.max(dp[i + r], nxt[i]);
14                // minus
15                int diff = Math.abs(i - r);
16                dp[diff] = Math.max(dp[diff], nxt[i] + Math.min(i, r));
17            }
18        }
19        return dp[0];
20    }
21}