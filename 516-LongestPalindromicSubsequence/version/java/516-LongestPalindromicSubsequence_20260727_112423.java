// Last updated: 27/7/2026, 11:24:23 am
1import java.util.Arrays;
2
3public class Solution {
4    private int[][] memo;
5
6    public int longestPalindromeSubseq(String s) {
7        int n = s.length();
8        memo = new int[n][n];
9        for (int[] row : memo) {
10            Arrays.fill(row, -1);
11        }
12
13        return solve(s, 0, n - 1);
14    }
15
16    private int solve(String s, int i, int j) {
17
18        if (i > j) {
19            return 0;
20        }
21        
22        if (i == j) {
23            return 1;
24        }
25
26        if (memo[i][j] != -1) {
27            return memo[i][j];
28        }
29
30        if (s.charAt(i) == s.charAt(j)) {
31            return memo[i][j] = 2 + solve(s, i + 1, j - 1);
32        }
33
34        int skipLeft = solve(s, i + 1, j);
35        int skipRight = solve(s, i, j - 1);
36
37        return memo[i][j] = Math.max(skipLeft, skipRight);
38    }
39}