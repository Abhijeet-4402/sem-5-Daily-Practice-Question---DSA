// Last updated: 28/2/2026, 10:04:13 pm
1class Solution {
2    public int[] countBits(int n) {
3        int[] ans = new int[n+1];
4        for (int i = 0; i <= n; i++) {
5            int count = 0;
6            for (int bit = 0; bit < 31; bit++) {
7                if ((i & (1 << bit)) != 0)
8                    count++;
9            }
10            ans[i] = count;
11        }
12        return ans;
13    }
14}