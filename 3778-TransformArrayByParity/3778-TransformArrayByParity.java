// Last updated: 4/8/2025, 12:00:30 am
class Solution {
    public int[] transformArray(int[] nums) {
        int [] ans = new int[nums.length];
        int c = 0;
        for(int i =0 ;i<nums.length;i++){
            if(nums[i]%2==0)c++;
        }
        for(int j = c;j<ans.length;j++){
            ans[j]=1;
        }
        return ans;
    }
}