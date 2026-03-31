// Last updated: 1/4/2026, 12:13:16 am
1class Solution {
2    public static int lastStoneWeightII(int[] stones) {
3        int total = 0;
4        for (int s : stones) total += s;
5        int target = total / 2;
6        boolean[] dp = new boolean[target + 1];
7        dp[0] = true;
8        int S1 = 0;
9        for (int s : stones) {
10            for (int j = target; j >= s; j--) {
11                if (dp[j - s]) {
12                    dp[j] = true;
13                    S1 = Math.max(S1, j);
14                }
15            }
16        }
17        return total - 2 * S1;
18	}
19}