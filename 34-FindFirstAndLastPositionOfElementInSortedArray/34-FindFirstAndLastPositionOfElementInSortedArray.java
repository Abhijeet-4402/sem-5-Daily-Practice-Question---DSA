// Last updated: 4/8/2025, 12:08:46 am
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] result = {-1,-1};
        int left=0;
        int right=nums.length-1;
        if(nums.length!=0){
            result[0]=first_index(nums,target,left,right);
            result[1]=last_index(nums,target,left,right);
        }
        return result;
    }
    public int first_index(int[] arr,int target,int left , int right){
        int pos = -1;
        while(left<=right){
            int mid = (left+right)>>1;
            if (arr[mid]==target){
                pos=mid;
                right=mid-1;
            } else if(arr[mid]>target) {
                right=mid-1;
            } else {
                left = mid+1;
            }
        }
        return pos;
    }

    public int last_index(int[] arr,int target,int left , int right){
        int pos = -1;
        while(left<=right){
            int mid = (left+right)>>1;
            if (arr[mid]==target){
                pos=mid;
                left=mid+1;
            } else if(arr[mid]>target) {
                right=mid-1;
            } else {
                left = mid+1;
            }
        }
        return pos;
    }
}