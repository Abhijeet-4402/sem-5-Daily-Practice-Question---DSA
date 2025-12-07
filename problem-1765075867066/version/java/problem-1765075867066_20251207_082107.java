// Last updated: 7/12/2025, 8:21:07 am
1class Solution {
2    public int[] sortByReflection(int[] a) {
3        int n = a.length;
4        int[][] pair = new int[n][2];
5
6        for (int i = 0; i < n; i++) {
7            pair[i][0] = reflect(a[i]);
8            pair[i][1] = a[i];
9        }
10
11        Arrays.sort(pair, (x, y) -> {
12            if (x[0] != y[0]) return x[0] - y[0];
13            return x[1] - y[1];
14        });
15
16        for (int i = 0; i < n; i++) {
17            a[i] = pair[i][1];
18        }
19
20        return a;
21    }
22
23    private int reflect(int x) {
24        int r = 0;
25        while (x > 0) {
26            r = (r << 1) | (x & 1);
27            x >>= 1;
28        }
29        return r;
30    }
31}