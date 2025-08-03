// Last updated: 4/8/2025, 12:04:18 am
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        return subArrayProductCount(nums,k);
    }
    public int subArrayProductCount(int [] arr, int k){
        int pd = 1;
        int i=0;
        int j=0;
        int count = 0;
        while(j<arr.length){
            pd*=arr[j];


            while(pd>=k && i<=j){
                pd/=arr[i];
                i++;
            }

            count += j-i+1;
            j++;
        }
        return count;
    }
}