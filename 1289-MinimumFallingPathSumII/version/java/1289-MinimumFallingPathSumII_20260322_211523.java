// Last updated: 22/3/2026, 9:15:23 pm
1class Solution {
2    public int minFallingPathSum(int[][] grid) {
3        int n = grid.length;
4        if (n == 1) return grid[0][0];
5
6        int prevMin1 = Integer.MAX_VALUE, prevMin2 = Integer.MAX_VALUE;
7        int prevMin1Idx = -1;
8
9        // find the two minimums in the last row
10        for (int j = 0; j < n; j++) {
11            if (grid[n - 1][j] < prevMin1) {
12                prevMin2 = prevMin1;
13                prevMin1 = grid[n - 1][j];
14                prevMin1Idx = j;
15            } else if (grid[n - 1][j] < prevMin2) {
16                prevMin2 = grid[n - 1][j];
17            }
18        }
19
20        // moving upward just check if the first minimum from the row below
21        // lies in the same column and add accordingly while doing so 
22        // find the minimums from the curr row so that we can use it later.
23        
24        for (int r = n - 2; r >= 0; r--) {
25            int currMin1 = Integer.MAX_VALUE, currMin2 = Integer.MAX_VALUE;
26            int currMin1Idx = -1;
27
28            for (int c = 0; c < n; c++) {
29                int bestBelow = (c != prevMin1Idx) ? prevMin1 : prevMin2;
30                grid[r][c] += bestBelow;
31
32                int val = grid[r][c];
33                if (val < currMin1) {
34                    currMin2 = currMin1;
35                    currMin1 = val;
36                    currMin1Idx = c;
37                } else if (val < currMin2) {
38                    currMin2 = val;
39                }
40            }
41
42            prevMin1 = currMin1;
43            prevMin2 = currMin2;
44            prevMin1Idx = currMin1Idx;
45        }
46        return prevMin1;
47    }
48}