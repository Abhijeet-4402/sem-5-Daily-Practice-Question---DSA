// Last updated: 2/4/2026, 4:33:47 pm
1class Solution {
2    private static final int MOD = (int)(1e9+7);
3    public int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {
4        int[][][] dp = new int[group.length + 1][n + 1][minProfit + 1];
5        for (int[][] row : dp)
6            for (int[] col : row)
7                Arrays.fill(col, -1);
8        return solve(0, n, minProfit, group, profit, dp);
9    }
10
11    private static int solve(int idx, int rem_men, int req_profit, int[] group, int[] profit, int[][][] dp) {
12        if (idx == group.length) {
13            return req_profit == 0 ? 1 : 0;
14        }
15        if (dp[idx][rem_men][req_profit] != -1)
16            return dp[idx][rem_men][req_profit];
17        int take = 0;
18        if (rem_men >= group[idx]) {
19            int nextProfit = Math.max(0, req_profit - profit[idx]);
20            take = solve(idx + 1, rem_men - group[idx], nextProfit, group, profit, dp);
21        }
22        int notake = solve(idx + 1, rem_men, req_profit, group, profit, dp);
23        return dp[idx][rem_men][req_profit] = (take + notake)%MOD;
24    }
25}