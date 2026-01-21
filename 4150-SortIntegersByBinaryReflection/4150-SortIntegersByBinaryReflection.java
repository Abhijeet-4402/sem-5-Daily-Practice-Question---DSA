// Last updated: 21/1/2026, 11:42:07 am
class Solution {
    public int[] sortByReflection(int[] a) {
        int n = a.length;
        int[][] pair = new int[n][2];

        for (int i = 0; i < n; i++) {
            pair[i][0] = reflect(a[i]);
            pair[i][1] = a[i];
        }

        Arrays.sort(pair, (x, y) -> {
            if (x[0] != y[0]) return x[0] - y[0];
            return x[1] - y[1];
        });

        for (int i = 0; i < n; i++) {
            a[i] = pair[i][1];
        }

        return a;
    }

    private int reflect(int x) {
        int r = 0;
        while (x > 0) {
            r = (r << 1) | (x & 1);
            x >>= 1;
        }
        return r;
    }
}