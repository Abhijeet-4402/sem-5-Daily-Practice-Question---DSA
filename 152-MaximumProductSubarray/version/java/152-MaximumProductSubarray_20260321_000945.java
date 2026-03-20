// Last updated: 21/3/2026, 12:09:45 am
1class Solution {
2    public int maxProduct(int[] nums) {
3        int max = nums[0];
4        int min = nums[0];
5        int res = nums[0];
6
7        for (int i = 1; i < nums.length; i++) {
8            int mx = max;
9            max = Math.max(nums[i], Math.max(nums[i] * mx, nums[i] * min));
10            min = Math.min(nums[i], Math.min(nums[i] * mx, nums[i] * min));
11            res = Math.max(res, max);
12        }
13        return res;
14    }
15}