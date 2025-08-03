// Last updated: 4/8/2025, 12:02:23 am
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr=new int[nums.length];
        int j=0;
        for(int i=0;i<n;i++){
            arr[j++]=nums[i];
            arr[j++]=nums[i+n];
        }
        return arr;
    }

}

