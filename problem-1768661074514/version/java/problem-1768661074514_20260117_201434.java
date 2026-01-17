// Last updated: 17/1/2026, 8:14:34 pm
1class Solution {
2    public int[] bestTower(int[][] towers, int[] center, int radius) {
3        long x = center[0];
4        long y = center[1];
5
6        Arrays.sort(towers,(a,b)->a[0]==b[0]?a[1]-b[1]:a[0]-b[0]);
7        long best = Integer.MIN_VALUE;
8        int [] ans = new int[]{-1, -1};
9
10        for(int[] curr : towers){
11            if(Math.abs(curr[0]-x) + Math.abs(curr[1]-y)<=radius){
12                if(best<curr[2]){
13                    best = curr[2];
14                    ans[0] = curr[0];
15                    ans[1] = curr[1];
16                }
17            }
18        }
19        return ans;
20    }
21}