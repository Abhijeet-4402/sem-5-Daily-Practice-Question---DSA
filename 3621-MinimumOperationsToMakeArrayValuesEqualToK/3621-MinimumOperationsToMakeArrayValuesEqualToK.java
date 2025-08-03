// Last updated: 4/8/2025, 12:00:59 am
class Solution {
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int check = nums[0];
        if(k>check)
            return -1;

        int c = 1;
        int p = check;
        for(int i = 1; i<nums.length;i++){
            if(nums[i]!=p){
                p = nums[i];
                c++;
            }
        }
        if(check>k)
            return c;
        return c-1;
        
    }
}