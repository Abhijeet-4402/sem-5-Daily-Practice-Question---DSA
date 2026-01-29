// Last updated: 30/1/2026, 3:19:53 am
1class Solution {
2    public int findTheWinner(int n, int k) {
3        int winner = 0;
4        for (int i = 2; i <= n; i++) {
5            winner = (winner + k) % i;
6        }
7        return winner + 1;
8    }
9}