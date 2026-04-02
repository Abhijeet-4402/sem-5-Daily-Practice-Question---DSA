// Last updated: 2/4/2026, 5:06:07 pm
1class Solution {
2    private static final int MOD = (int) (1e9 + 7);
3
4    public int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {
5        int[][] dp = new int[n + 1][minProfit + 1];
6        for(int i = 0; i <=n; i++){
7            dp[i][0] = 1;
8        }
9
10        for(int i = group.length - 1; i >= 0; i--){
11            for(int men = n; men > 0; men--){
12                for(int p = minProfit ; p>=0; p--){
13                    int p_idx = Math.max(0, p-profit[i]);
14                    if(men-group[i]>=0)
15                        dp[men][p] = (dp[men][p] + dp[men-group[i]][p_idx])%MOD;
16                }
17            }
18        }
19
20        return dp[n][minProfit];
21    }
22}