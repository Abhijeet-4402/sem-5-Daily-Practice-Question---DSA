// Last updated: 4/8/2025, 12:00:53 am
class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        return Sum(nums, l, r);
    }
    public int Sum(List<Integer> nums, int l, int r){
        int ans = Integer.MAX_VALUE;
        for(int len = l; len<=r && len<=nums.size(); len++){
           
            for(int j=len; j<=nums.size();j++){
                int sum=0;
                for(int i=j-len; i<j && i<nums.size(); i++){
                    
                    sum+= nums.get(i);
                }
                if(sum>0){
                    ans = Math.min(ans,sum);
                }
                
            }
        }
        if(ans==Integer.MAX_VALUE){
            return -1;
        }
        return ans;
    }
}