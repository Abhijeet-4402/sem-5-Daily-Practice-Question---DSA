// Last updated: 27/7/2026, 11:01:26 am
1import java.util.Arrays;
2
3public class Solution {
4    private int[][] memo;
5
6    public int longestCommonSubsequence(String text1, String text2) {
7        int m = text1.length();
8        int n = text2.length();
9        
10        memo = new int[m][n];
11        for (int[] row : memo) {
12            Arrays.fill(row, -1);
13        }
14
15        return solve(text1, text2, 0, 0);
16    }
17
18    private int solve(String text1, String text2, int i, int j) {
19        if (i == text1.length() || j == text2.length()) {
20            return 0;
21        }
22        if (memo[i][j] != -1) {
23            return memo[i][j];
24        }
25
26        if (text1.charAt(i) == text2.charAt(j)) {
27            return memo[i][j] = 1 + solve(text1, text2, i + 1, j + 1);
28        }
29
30        int skipText1 = solve(text1, text2, i + 1, j);
31        int skipText2 = solve(text1, text2, i, j + 1);
32
33        return memo[i][j] = Math.max(skipText1, skipText2);
34    }
35}