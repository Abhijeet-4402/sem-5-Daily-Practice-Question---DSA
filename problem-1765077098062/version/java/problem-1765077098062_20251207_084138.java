// Last updated: 7/12/2025, 8:41:38 am
1class Solution {
2    public long totalScore(int hp, int[] damage, int[] req) {
3        int n = damage.length;
4
5        int[] dmg = damage;
6
7        long[] pre = new long[n + 1];
8        for (int i = 1; i <= n; i++) pre[i] = pre[i - 1] + dmg[i - 1];
9
10        long ans = 0;
11
12        for (int k = 0; k < n; k++) {
13            long need = req[k] - (long) hp + pre[k + 1];
14            int idx = binSearch(pre, 0, k, need);
15            if (idx != -1) ans += (k - idx + 1);
16        }
17
18        return ans;
19    }
20
21    private int binSearch(long[] a, int l, int r, long x) {
22        int idx = -1;
23        while (l <= r) {
24            int m = (l + r) >> 1;
25            if (a[m] >= x) {
26                idx = m;
27                r = m - 1;
28            } else {
29                l = m + 1;
30            }
31        }
32        return idx;
33    }
34}