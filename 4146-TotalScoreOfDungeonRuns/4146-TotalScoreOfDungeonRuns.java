// Last updated: 21/1/2026, 11:42:09 am
class Solution {
    public long totalScore(int hp, int[] damage, int[] req) {
        int n = damage.length;

        int[] dmg = damage;

        long[] pre = new long[n + 1];
        for (int i = 1; i <= n; i++) pre[i] = pre[i - 1] + dmg[i - 1];

        long ans = 0;

        for (int k = 0; k < n; k++) {
            long need = req[k] - (long) hp + pre[k + 1];
            int idx = binSearch(pre, 0, k, need);
            if (idx != -1) ans += (k - idx + 1);
        }

        return ans;
    }

    private int binSearch(long[] a, int l, int r, long x) {
        int idx = -1;
        while (l <= r) {
            int m = (l + r) >> 1;
            if (a[m] >= x) {
                idx = m;
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return idx;
    }
}