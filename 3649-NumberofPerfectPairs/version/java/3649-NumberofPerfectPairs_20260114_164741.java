// Last updated: 14/1/2026, 4:47:41 pm
1class Solution {
2    public long perfectPairs(int[] nums) {
3        int n = nums.length;
4        long[] absVals = new long[n];
5        long[] original = new long[n];
6        for (int i = 0; i < n; i++) {
7            absVals[i] = Math.abs((long) nums[i]);
8            original[i] = nums[i];
9        }
10
11        Arrays.sort(absVals);
12
13        long ans = 0;
14        int r = 0;
15        for (int l = 0; l < n; l++) {
16            if (r < l + 1) r = l + 1;
17            while (r < n && absVals[r] <= 2 * absVals[l]) r++;
18            ans += (r - l - 1);
19        }
20
21        return ans;
22    }
23}