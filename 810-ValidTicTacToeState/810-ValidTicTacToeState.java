// Last updated: 4/8/2025, 12:03:59 am
class Solution {
    private String[] board;

    public boolean validTicTacToe(String[] board) {
        this.board = board;
        int x = count('X'), o = count('O');
        if (x != o && x - 1 != o) {
            return false;
        }
        if (win('X') && x - 1 != o) {
            return false;
        }
        return !(win('O') && x != o);
    }

    private boolean win(char x) {
    // Check rows and columns
    for (int i = 0; i < 3; i++) {
        if ((board[i].charAt(0) == x && board[i].charAt(1) == x && board[i].charAt(2) == x) ||
            (board[0].charAt(i) == x && board[1].charAt(i) == x && board[2].charAt(i) == x)) {
            return true;
        }
    }
    // Check diagonals
    return (board[0].charAt(0) == x && board[1].charAt(1) == x && board[2].charAt(2) == x) ||
           (board[0].charAt(2) == x && board[1].charAt(1) == x && board[2].charAt(0) == x);
    }

    private int count(char x) {
        int cnt = 0;
        for (var row : board) {
            for (var c : row.toCharArray()) {
                if (c == x) {
                    ++cnt;
                }
            }
        }
        return cnt;
    }
}