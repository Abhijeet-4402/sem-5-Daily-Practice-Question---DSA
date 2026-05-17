// Last updated: 17/5/2026, 5:23:30 pm
1class Solution {
2    public void solve(int col, char[][] board, int n,
3                      int[] leftRow, int[] upperDiagonal, int[] lowerDiagonal,
4                      List<List<String>> res) {
5
6        if (col == n) {
7            List<String> temp = new ArrayList<>();
8            for (int i = 0; i < n; i++) {
9                temp.add(new String(board[i]));
10            }
11            res.add(temp);
12            return;
13        }
14
15        for (int row = 0; row < n; row++) {
16            if (leftRow[row] == 0 && lowerDiagonal[row + col] == 0 &&
17                upperDiagonal[n - 1 + col - row] == 0) {
18
19                board[row][col] = 'Q';
20                leftRow[row] = 1;
21                lowerDiagonal[row + col] = 1;
22                upperDiagonal[n - 1 + col - row] = 1;
23
24                solve(col + 1, board, n, leftRow, upperDiagonal, lowerDiagonal, res);
25
26                board[row][col] = '.';
27                leftRow[row] = 0;
28                lowerDiagonal[row + col] = 0;
29                upperDiagonal[n - 1 + col - row] = 0;
30            }
31        }
32    }
33
34    public List<List<String>> solveNQueens(int n) {
35        List<List<String>> res = new ArrayList<>();
36        char[][] board = new char[n][n];
37        for (char[] row : board) Arrays.fill(row, '.');
38        int[] leftRow = new int[n];
39        int[] lowerDiagonal = new int[2 * n - 1];
40        int[] upperDiagonal = new int[2 * n - 1];
41        solve(0, board, n, leftRow, upperDiagonal, lowerDiagonal, res);
42        return res;
43    }
44}
45