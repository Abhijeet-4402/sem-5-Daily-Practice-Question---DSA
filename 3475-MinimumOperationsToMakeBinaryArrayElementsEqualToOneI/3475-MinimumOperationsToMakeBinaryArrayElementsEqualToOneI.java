// Last updated: 23/7/2026, 9:35:56 am
class Solution {
    public int minOperations(int[] nums) {
        int c = 0;
        int n = nums.length;
        for(int i = 0; i <n-2;i++){
            if(nums[i]==0){
                c++;
                nums[i] ^= 1;
                nums[i + 1] ^= 1;
                nums[i + 2] ^= 1;
            }
        }
        if(nums[n-1]==0||nums[n-2]==0) return -1;

        return c;
    }
}