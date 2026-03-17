// Last updated: 17/3/2026, 4:16:35 pm
1class Solution {
2    static final int INF = (int)1e9;
3    public int minFallingPathSum(int[][] arr) {
4        int n = arr.length;
5        int m = arr[0].length;
6        int ans = Integer.MAX_VALUE;
7        int[][] dp = new int[n][m];
8        for(int[] x : dp) Arrays.fill(x, Integer.MIN_VALUE); 
9
10        for (int i = 0; i < m; i++) {
11            ans = Math.min(ans, solve(0, i, arr, dp));
12        }
13        return ans;
14    }
15
16    private int solve(int r, int c, int[][] arr, int[][] dp) {
17
18        if (c < 0 || c >= arr[0].length)
19            return INF;
20        
21        if (r == arr.length - 1)
22            return arr[r][c];
23
24        if (dp[r][c] != Integer.MIN_VALUE) return dp[r][c];
25
26        int ans = Math.min(solve(r + 1, c - 1, arr, dp), solve(r + 1, c, arr, dp));
27        ans = Math.min(ans,solve(r + 1, c + 1, arr, dp));
28
29        return dp[r][c] = arr[r][c] + ans;
30    }
31}