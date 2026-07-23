// Last updated: 23/7/2026, 9:34:55 am
class Solution {
    public int dominantIndices(int[] nums) {
        int n = nums.length;
        int[] suff = new int[n+1];
        for(int i = n-1;i>=0;i--) suff[i] = suff[i+1]+nums[i];
        int count = 0;

        for(int i  = 0;i < n;i++){
            if(nums[i]*(n-i-1)>suff[i+1]) count++;
        } 
        return count;
    }
}