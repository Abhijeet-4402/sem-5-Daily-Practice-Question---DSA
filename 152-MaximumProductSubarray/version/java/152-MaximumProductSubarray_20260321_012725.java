// Last updated: 21/3/2026, 1:27:25 am
1class Solution {
2    public static int minimumTotal(List<List<Integer>> arr) {
3        int n = arr.size();
4        if (arr.size() == 1)
5            return arr.get(0).get(0);
6
7        int[][] dp = new int[n][n];
8        for (int[] row : dp)
9            Arrays.fill(row, Integer.MIN_VALUE);
10        return arr.get(0).get(0) + Math.min(solve(1, 0, arr, dp), solve(1, 1, arr, dp));
11    }
12
13    private static int solve(int row, int col, List<List<Integer>> arr, int[][] dp) {
14        if (row == arr.size() - 1)
15            return arr.get(row).get(col);
16
17        if (dp[row][col] != Integer.MIN_VALUE)
18            return dp[row][col];
19
20        int curr = arr.get(row).get(col) + solve(row + 1, col, arr, dp);
21        int nxt = arr.get(row).get(col) + solve(row + 1, col + 1, arr, dp);
22
23        return dp[row][col] = Math.min(curr, nxt);
24    }
25}