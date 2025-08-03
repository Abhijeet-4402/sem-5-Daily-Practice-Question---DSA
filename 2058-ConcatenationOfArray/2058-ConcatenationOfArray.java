// Last updated: 4/8/2025, 12:01:47 am
class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr=new int[2*nums.length];
        int n=nums.length;
        for(int i=0;i<n;i++){
            arr[i]=nums[i];
            arr[i+n]=nums[i];
        }
        return arr;
    }
}