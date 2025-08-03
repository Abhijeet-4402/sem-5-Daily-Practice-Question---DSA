// Last updated: 4/8/2025, 12:00:31 am
class Solution {
    public int minOperations(int[] nums, int k) {
        return operation(nums,k);
    }
    public static int operation(int[] arr, int k){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum%k;
    }
}