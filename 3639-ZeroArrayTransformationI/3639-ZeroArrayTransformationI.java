// Last updated: 4/8/2025, 12:00:54 am
class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int [] d = new int[n+1];

        for(int [] i: queries){
            int st = i[0];
            int end = i[1];
            d[st]--;
            if(end+1< n){
                d[end+1]++;
            }
        }

        int c= 0;
        for(int i = 0;i<n;i++){
            c+=d[i];
            nums[i]+=c;
            if(nums[i]<0){
                nums[i]=0;
            }
        }

        for(int i : nums){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}