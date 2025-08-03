// Last updated: 4/8/2025, 12:06:13 am
class Solution {
    public void moveZeroes(int[] nums) {
        int left=0;
        int right=0;
        while(right<nums.length){
            if(nums[right]!=0){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
            }
            
            right++;
        }

        
    }
}