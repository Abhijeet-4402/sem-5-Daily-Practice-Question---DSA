// Last updated: 23/7/2026, 9:35:01 am
class Solution {
    public int minimumPrefixLength(int[] nums) {
        int c = 0;
        for( int i = 1; i < nums.length; i++){
            if(nums[i]<=nums[i-1]){
                c = i;
            }
        }

        return c;
    }
}