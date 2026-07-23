// Last updated: 23/7/2026, 9:35:26 am
class Solution {
    public long rob(int[] nums, int[] colors) {
        long prev = 0, ans = 0;

        for(int i = 0 ; i< nums.length; i++){
            long temp = 0;
            
            if(i>0 && colors[i]==colors[i-1]){
                temp = Math.max(prev + nums[i], ans); 
            }else{
                temp=ans+nums[i];
            }
            prev = ans;
            ans = temp;
        }
        return ans;
    }
}