// Last updated: 4/8/2025, 12:06:46 am
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int res = Integer.MAX_VALUE;
        int left = 0;
        int running_sum = 0;

        for(int i = 0;i<nums.length;i++){
            running_sum += nums[i];
            while(running_sum>=target){
                res=Math.min(res,i+1-left);
                running_sum-=nums[left++]; 
            }
        }
        return (res!=Integer.MAX_VALUE)?res:0;
    }
}