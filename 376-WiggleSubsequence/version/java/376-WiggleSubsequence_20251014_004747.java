// Last updated: 14/10/2025, 12:47:47 am
class Solution {
    public int wiggleMaxLength(int[] nums) {
        int lo =1, hi=1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i]>nums[i-1]) hi = lo+1;
            else if(nums[i]<nums[i-1]) lo = hi +1;
        }
        return Math.max(lo,hi);
    }
}
