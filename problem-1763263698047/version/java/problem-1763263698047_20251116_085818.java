// Last updated: 16/11/2025, 8:58:18 am
class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        Arrays.sort(nums);
        int n  = nums.length;
        return nums[n-1]+nums[n-2]-nums[0];
        
    }
}