// Last updated: 17/5/2026, 5:35:52 pm
1import java.util.*;
2
3class Solution {
4
5    public void solve(int row, char[][] board, int n,
6                      int[] leftRow, int[] LeftDiagonal, int[] RightDiagonal,
7                      List<List<String>> res) {
8
9        if (row == n) {
10            List<String> temp = new ArrayList<>();
11            for (int i = 0; i < n; i++) {
12                temp.add(new String(board[i]));
13            }
14            res.add(temp);
15            return;
16        }
17
18        for (int col = 0; col < n; col++) {
19
20            if (leftRow[col] == 0 &&
21                RightDiagonal[row + col] == 0 &&
22                LeftDiagonal[n - 1 + col - row] == 0) {
23
24                board[row][col] = 'Q';
25
26                leftRow[col] = 1;
27                RightDiagonal[row + col] = 1;
28                LeftDiagonal[n - 1 + col - row] = 1;
29
30                solve(row + 1, board, n,
31                      leftRow, LeftDiagonal, RightDiagonal, res);
32
33                board[row][col] = '.';
34
35                leftRow[col] = 0;
36                RightDiagonal[row + col] = 0;
37                LeftDiagonal[n - 1 + col - row] = 0;
38            }
39        }
40    }
41
42    public List<List<String>> solveNQueens(int n) {
43
44        List<List<String>> res = new ArrayList<>();
45
46        char[][] board = new char[n][n];
47
48        for (char[] r : board) {
49            Arrays.fill(r, '.');
50        }
51
52        int[] leftRow = new int[n];
53
54        int[] RightDiagonal = new int[2 * n - 1];
55        int[] LeftDiagonal = new int[2 * n - 1];
56        solve(0, board, n,
57              leftRow, LeftDiagonal, RightDiagonal, res);
58
59        return res;
60    }
61}
62