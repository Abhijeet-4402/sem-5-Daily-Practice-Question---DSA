// Last updated: 12/2/2026, 2:48:40 am
1class Solution {
2    public int maxCapacity(int[] costs, int[] capacity, int budget) {
3        int n = costs.length;
4        
5        if (n == 0) return 0;
6
7        int[][] machine = new int[n][2];
8        for (int i = 0; i < n; i++) {
9            machine[i][0] = costs[i];
10            machine[i][1] = capacity[i];
11        }
12
13        Arrays.sort(machine, (a, b) -> (a[0] == b[0]) ? b[1] - a[1] : a[0] - b[0]);
14
15        int[] pre = new int[n];
16        pre[0] = machine[0][1];
17        for (int i = 1; i < n; i++) {
18            pre[i] = Math.max(pre[i - 1], machine[i][1]);
19        }
20
21        long ans = 0;
22
23        for (int i = 0; i < n; i++) {
24            int cost = machine[i][0];
25            int cap = machine[i][1];
26            if (cost < budget) {
27                ans = Math.max(ans, cap);
28            } else {
29                break; 
30            }
31
32            int rem = budget - cost;
33            
34            if (rem >= 0) { 
35                int idx = BS(machine, i - 1, rem);
36                if (idx != -1) {
37                    ans = Math.max(ans, (long) cap + pre[idx]);
38                }
39            }
40        }
41
42        return (int)ans;
43    }
44
45    private int BS(int[][] machine, int right, int limit) {
46        int left = 0, res = -1;
47
48        while (left <= right) {
49            int mid = left + (right - left) / 2;
50            if (machine[mid][0] < limit) {
51                res = mid;
52                left = mid + 1;
53            } else {
54                right = mid - 1;
55            }
56        }
57        return res;
58    }
59}