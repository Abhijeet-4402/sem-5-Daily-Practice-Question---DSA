// Last updated: 4/8/2025, 12:06:19 am
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int expected=n*(n+1)/2;
        int calculated=0;
        for(int i=0;i<nums.length;i++)
        calculated+=nums[i];
        return expected-calculated;
        
    }
}