// Last updated: 21/3/2026, 12:28:39 am
1class Solution {
2    public int minPathSum(int[][] grid) {
3        int n = grid.length;
4        int m = grid[0].length;
5        for (int i = 1; i < n; i++) {
6            grid[i][0] = grid[i][0] + grid[i - 1][0];
7        }
8        for (int i = 1; i < m; i++) {
9            grid[0][i] = grid[0][i] + grid[0][i - 1];
10        }
11
12        for (int i = 1; i < n; i++) {
13            for (int j = 1; j < m; j++) {
14                grid[i][j] = grid[i][j] + Math.min(grid[i][j - 1], grid[i - 1][j]);
15            }
16        }
17        return grid[n - 1][m - 1];
18    }
19}