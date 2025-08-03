// Last updated: 4/8/2025, 12:02:03 am
class Solution {
    public int maxOperations(int[] nums, int k) {
        int start=0,end=nums.length-1,c=0;
        Arrays.sort(nums);
        while(start<end){
            if(nums[start]+nums[end]==k){
                c++;
                start++;
                end--;

            }
            else if(nums[start]+nums[end]<k){
                start++;
                

            }
            else{
                end--;
                

            }
        }
        return c;
        
        
    }
}