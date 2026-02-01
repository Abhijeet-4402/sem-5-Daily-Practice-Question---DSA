// Last updated: 1/2/2026, 9:54:26 pm
1class Solution {
2    public int finalElement(int[] nums) {
3        return (int)Math.max(nums[0],nums[nums.length-1]);
4    }
5}