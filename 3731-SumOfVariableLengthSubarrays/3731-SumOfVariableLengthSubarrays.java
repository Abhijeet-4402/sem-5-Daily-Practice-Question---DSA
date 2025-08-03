// Last updated: 4/8/2025, 12:00:41 am
class Solution {
    public int subarraySum(int[] nums) {
        int sum = 0 ;
        for(int i=0;i<nums.length;i++){
            int st = Math.max(0,i-nums[i]);
            for(;st<=i;st++){
                sum+=nums[st];
            }
        }
        return sum;
    }
}