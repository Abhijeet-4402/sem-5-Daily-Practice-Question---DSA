// Last updated: 23/3/2026, 11:01:47 pm
1class Solution {
2    public int findMaxForm(String[] strs, int m, int n) {
3        int[][] arr = new int[strs.length][2];
4        for (int i = 0; i < strs.length; i++) {
5            String s = strs[i];
6            int zeros = 0;
7            int ones = 0;
8            for (char c : s.toCharArray())
9                if (c == '0')
10                    zeros++;
11                else
12                    ones++;
13            arr[i][0] = zeros;
14            arr[i][1] = ones;
15        }
16
17        return solve(arr, m, n);
18    }
19
20    private int solve(int[][] arr, int m, int n) {
21        int[][] dp = new int[m + 1][n + 1];
22
23        for (int[] elem : arr) {
24            int zeros = elem[0];
25            int ones = elem[1];
26
27            for (int i = m; i >= zeros; i--) {
28                for (int j = n; j >= ones; j--) {
29                    dp[i][j] = Math.max((1 + dp[i - zeros][j - ones]), dp[i][j]);
30                }
31            }
32        }
33        return dp[m][n];
34    }
35}