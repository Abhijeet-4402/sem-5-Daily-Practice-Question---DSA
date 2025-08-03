// Last updated: 4/8/2025, 12:00:49 am
class Solution {
    public int countSubarrays(int[] nums) {
        return CountArray(nums);
    }
    public int CountArray(int[]arr){
        int i=0;
        int j=2;
        int count = 0;
        while(j<arr.length){
            int sum = arr[i]+arr[j];
            int mid = arr[i+1];
            if(2*sum==mid){
                count++;
            }
            i++;
            j++;
        }
        return count;
    }
}