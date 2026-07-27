// Last updated: 27/7/2026, 10:30:22 am
1public class Solution {
2    public int minFallingPathSum(int[][] matrix) {
3        int n = matrix.length;
4        for (int r = 1; r < n; r++) {
5            for (int c = 0; c < n; c++) {
6                int left = (c > 0) ? matrix[r - 1][c - 1] : Integer.MAX_VALUE;
7                int above = matrix[r - 1][c];
8                int right = (c < n - 1) ? matrix[r - 1][c + 1] : Integer.MAX_VALUE;
9                matrix[r][c] += Math.min(left, Math.min(above, right));
10            }
11        }
12        int minSum = Integer.MAX_VALUE;
13        for (int val : matrix[n - 1]) {
14            minSum = Math.min(minSum, val);
15        }
16
17        return minSum;
18    }
19}