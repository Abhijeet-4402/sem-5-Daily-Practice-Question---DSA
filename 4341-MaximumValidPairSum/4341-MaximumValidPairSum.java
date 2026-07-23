// Last updated: 23/7/2026, 9:34:52 am
class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int max = nums[0]; 
        int ans = 0; 
        for(int i = k; i < nums.length; i++){
            ans = Math.max(ans, nums[i] + max);
            max = Math.max(max, nums[i - k + 1]);
        }

        return ans;

    }
}