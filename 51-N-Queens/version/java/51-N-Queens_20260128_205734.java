// Last updated: 28/1/2026, 8:57:34 pm
1import java.util.*;
2
3public class Solution {
4
5    private boolean isSafe(List<String> board, int row, int col, int n) {
6        // Horizontal Check
7        for (int j = 0; j < n; j++) {
8            if (board.get(row).charAt(j) == 'Q') {
9                return false;
10            }
11        }
12
13        // Vertical Check
14        for (int i = 0; i < n; i++) {
15            if (board.get(i).charAt(col) == 'Q') {
16                return false;
17            }
18        }
19
20        // Left Diagonal Check
21        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
22            if (board.get(i).charAt(j) == 'Q') {
23                return false;
24            }
25        }
26
27        // Right Diagonal Check
28        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
29            if (board.get(i).charAt(j) == 'Q') {
30                return false;
31            }
32        }
33
34        return true;
35    }
36
37    private void nQueen(List<String> board, int row, int n, List<List<String>> ans) {
38        if (row == n) {
39            ans.add(new ArrayList<>(board));
40            return;
41        }
42
43        for (int j = 0; j < n; j++) {
44            if (isSafe(board, row, j, n)) {
45                char[] rowChars = board.get(row).toCharArray();
46                rowChars[j] = 'Q';
47                board.set(row, new String(rowChars));
48
49                nQueen(board, row + 1, n, ans);
50
51                rowChars[j] = '.';
52                board.set(row, new String(rowChars));
53            }
54        }
55    }
56
57    public List<List<String>> solveNQueens(int n) {
58        List<String> board = new ArrayList<>();
59        for (int i = 0; i < n; i++) {
60            board.add(".".repeat(n));
61        }
62
63        List<List<String>> ans = new ArrayList<>();
64        nQueen(board, 0, n, ans);
65        return ans;
66    }
67}
68