// Last updated: 5/7/2026, 11:05:48 pm
1class Solution {
2    public int maxValidPairSum(int[] nums, int k) {
3        int max = nums[0]; 
4        int ans = 0; 
5        for(int i = k; i < nums.length; i++){
6            ans = Math.max(ans, nums[i] + max);
7            max = Math.max(max, nums[i - k + 1]);
8        }
9
10        return ans;
11
12    }
13}