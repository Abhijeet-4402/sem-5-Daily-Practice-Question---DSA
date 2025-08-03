// Last updated: 4/8/2025, 12:08:20 am
class Solution {
    public boolean canJump(int[] nums) {
        int i = 0;
        for(int j = 0;i<nums.length && i<=j;i++){
            j=Math.max(j,i+nums[i]);
        }
        return i==nums.length;
    }
}