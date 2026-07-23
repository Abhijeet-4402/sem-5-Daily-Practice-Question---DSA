// Last updated: 23/7/2026, 9:35:16 am
class Solution {
    public int finalElement(int[] nums) {
        return (int)Math.max(nums[0],nums[nums.length-1]);
    }
}