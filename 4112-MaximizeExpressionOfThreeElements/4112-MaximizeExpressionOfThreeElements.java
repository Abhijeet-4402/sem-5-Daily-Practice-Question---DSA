// Last updated: 21/1/2026, 11:42:17 am
class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        Arrays.sort(nums);
        int n  = nums.length;
        return nums[n-1]+nums[n-2]-nums[0];
        
    }
}