// Last updated: 21/1/2026, 11:42:11 am
class Solution {

    private Pair[][][][][] dp;
    private String s;

    static class Pair {
        long c, sm;
        Pair(long c, long sm) { this.c = c; this.sm = sm; }
    }

    public long totalWaviness(long a, long b) {
        return calc(b) - calc(a - 1);
    }

    private long calc(long x) {
        if (x <= 0) return 0;

        s = Long.toString(x);
        int n = s.length();
        dp = new Pair[n][11][11][2][2];

        Pair res = fn(0, 10, 10, 1, 1);
        return res.sm;
    }

    private Pair fn(int i, int p, int pp, int t, int z) {

        if (i == s.length()) return new Pair(1, 0);

        Pair r = dp[i][p][pp][t][z];
        if (r != null) return r;

        long tc = 0, ts = 0;
        int lim = (t == 1) ? (s.charAt(i) - '0') : 9;

        for (int d = 0; d <= lim; d++) {

            int nt = (t == 1 && d == lim) ? 1 : 0;
            int nz = (z == 1 && d == 0) ? 1 : 0;

            int np = d;
            int npp = p;

            if (nz == 1) {
                np = 10;
                npp = 10;
            }

            Pair ch = fn(i + 1, np, npp, nt, nz);

            tc += ch.c;
            ts += ch.sm;

            if (z == 0 && p != 10 && pp != 10) {
                boolean pk = (p > pp && p > d);
                boolean vl = (p < pp && p < d);
                if (pk || vl) ts += ch.c;
            }
        }

        return dp[i][p][pp][t][z] = new Pair(tc, ts);
    }
}
