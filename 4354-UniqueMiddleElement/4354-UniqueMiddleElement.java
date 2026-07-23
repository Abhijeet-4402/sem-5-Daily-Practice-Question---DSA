// Last updated: 23/7/2026, 9:34:48 am
class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int i = 0; 
        int n = nums.length;
        int j = n-1;
        while(i < n/2 && j > n/2) if(nums[i++]==nums[n/2] || nums[j--]==nums[n/2]) return false;
        return true;
    }
}