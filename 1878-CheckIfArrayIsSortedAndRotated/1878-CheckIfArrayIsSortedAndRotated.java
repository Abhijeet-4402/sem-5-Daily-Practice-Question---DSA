// Last updated: 15/9/2025, 11:59:08 pm
class Solution {
    public boolean check(int[] nums) {
        int count=0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i]<nums[i-1]) count++;
        }
        if(count==0) return true;
        if(count==1 && nums[0]>=nums[nums.length-1]) return true;
        return false;
    }
}