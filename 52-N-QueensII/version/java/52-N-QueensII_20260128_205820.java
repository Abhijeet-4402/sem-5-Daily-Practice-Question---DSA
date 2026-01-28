// Last updated: 28/1/2026, 8:58:20 pm
1class Solution {
2    public int totalNQueens(int n) {
3        boolean[][] board = new boolean[n][n];
4        return countQueens(board, 0);
5    }
6
7    private int countQueens(boolean[][] board, int row) {
8        if (row == board.length) {
9            return 1; // Found a valid solution
10        }
11
12        int count = 0;
13        for (int col = 0; col < board.length; col++) {
14            if (isSafe(board, row, col)) {
15                board[row][col] = true;
16                count += countQueens(board, row + 1); // Recurse
17                board[row][col] = false; // Backtrack
18            }
19        }
20
21        return count;
22    }
23
24    private boolean isSafe(boolean[][] board, int row, int col) {
25        // Check column
26        for (int i = 0; i < row; i++) {
27            if (board[i][col]) return false;
28        }
29
30        // Check top-left diagonal
31        for (int i = 1; row - i >= 0 && col - i >= 0; i++) {
32            if (board[row - i][col - i]) return false;
33        }
34
35        // Check top-right diagonal
36        for (int i = 1; row - i >= 0 && col + i < board.length; i++) {
37            if (board[row - i][col + i]) return false;
38        }
39
40        return true;
41    }
42}