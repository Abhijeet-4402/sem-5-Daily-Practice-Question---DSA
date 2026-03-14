// Last updated: 14/3/2026, 11:04:06 am
1class Solution {
2    static final long MOD = (long) (1e9 + 7);
3
4    public static int numTilings(int n) {
5        long[][] dp = new long[n + 1][n + 1];
6        for (long[] arr : dp)
7            Arrays.fill(arr, -1);
8        return (int) (solve(n, n, dp) % MOD);
9    }
10
11    private static long solve(int r1, int r2, long[][] dp) {
12        if (r1 == 0 && r2 == 0)
13            return 1;
14        if (r1 < 0 || r2 < 0)
15            return 0;
16
17        if (dp[r1][r2] != -1)
18            return dp[r1][r2];
19        long ways = 0;
20
21        if (r1 == r2) {
22            ways = (ways+solve(r1 - 1, r2 - 1, dp))%MOD;
23            ways = (ways+solve(r1 - 2, r2 - 2, dp))%MOD;
24            ways = (ways+solve(r1 - 1, r2 - 2, dp))%MOD;
25            ways = (ways+solve(r1 - 2, r2 - 1, dp))%MOD;
26        } else if (r1 < r2) {
27            ways = (ways+solve(r1 - 1, r2 - 2, dp))%MOD;
28            ways = (ways+solve(r1, r2 - 2, dp))%MOD;
29        } else {
30            ways = (ways+solve(r1 - 2, r2 - 1, dp))%MOD;
31            ways = (ways+solve(r1 - 2, r2, dp))%MOD;
32        }
33        return dp[r1][r2] = ways%MOD;
34    }
35}