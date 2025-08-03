// Last updated: 4/8/2025, 12:05:39 am
class Solution {
    public int splitArray(int[] nums, int k) {
        if(nums.length<k){
            return -1;
        }
        int end = 0;
        for(int i:nums){
            end+=i;
        }
        int ans=end;
        int st = 0;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(isValid(nums,nums.length,k,mid)){
                ans=Math.min(ans,mid);
                end=mid-1;
            } else {
                st=mid+1;
            }
        }
        return ans;
    }
    public boolean isValid(int[] arr,int n , int m ,int maxAllowed){
        int students = 1, pages = 0;
        for(int i:arr){
            if(i>maxAllowed){
                return false;
            }
            if(pages+i<=maxAllowed){
                pages+=i;
            } else {
                ++students;
                pages=i;
            }
        }
        return students>m?false:true;
    }
}