// Last updated: 12/2/2026, 2:56:10 am
1class Solution {
2    public int maxCapacity(int[] costs, int[] capacity, int budget) {
3
4        int n = costs.length;
5        int[][] machine = new int[n][2];
6
7        for (int i = 0; i < n; i++) {
8            machine[i][0] = costs[i];
9            machine[i][1] = capacity[i];
10        }
11
12        Arrays.sort(machine, (a, b) -> a[0] - b[0]);
13
14        int[] pre = new int[n];
15        int mx = 0;
16        for (int i = 0; i < n; i++) {
17            mx = Math.max(mx, machine[i][1]);
18            pre[i] = mx;
19        }
20
21        int ans = 0;
22        int j = n - 1;
23
24        for (int i = 0; i < n; i++) {
25            int cost = machine[i][0];
26            int cap = machine[i][1];
27
28            if (cost < budget) {
29                ans = Math.max(ans, cap);
30            }
31
32            while (j >= 0 && machine[j][0] >= budget - cost) {
33                j--;
34            }
35
36            int k = Math.min(i - 1, j);
37            if (k >= 0) {
38                ans = Math.max(ans, cap + pre[k]);
39            }
40        }
41
42        return ans;
43    }
44}
45
46
47