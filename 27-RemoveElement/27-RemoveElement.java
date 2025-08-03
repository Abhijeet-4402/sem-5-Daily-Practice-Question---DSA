// Last updated: 4/8/2025, 12:08:56 am
class Solution {
    public int removeElement(int[] nums, int val) {
       int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];  
                k++;  
            }
        }
        
        return k;
    }
}