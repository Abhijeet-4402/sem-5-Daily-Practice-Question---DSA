// Last updated: 5/7/2026, 10:38:37 pm
1class Solution {
2    public boolean isMiddleElementUnique(int[] nums) {
3        int i = 0; 
4        int n = nums.length;
5        int j = n-1;
6        while(i < n/2 && j > n/2) if(nums[i++]==nums[n/2] || nums[j--]==nums[n/2]) return false;
7        return true;
8    }
9}