// Last updated: 23/7/2026, 9:35:08 am
class Solution {
    public int minimumK(int[] nums) {
        long hi = 0;
        for(int x: nums) hi+=x;

        long lo = 1;
        while(lo<hi){
            long mid = lo+(hi-lo)/2;
            if((double)check(nums, mid)/mid<=mid){
                hi = mid;
            }else{
                lo = mid+1;
            }
        }
        return (int)lo;
    }
    public int check(int[] nums, long mid){
        int ans = 0;
        for( int i = 0;i<nums.length;i++){
            ans+=(nums[i]/mid)+((nums[i]%mid==0)?0:1);
        }
        return ans;
    }
}