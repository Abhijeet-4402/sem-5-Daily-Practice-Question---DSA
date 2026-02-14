// Last updated: 14/2/2026, 8:45:15 pm
1class Solution {
2    public long rob(int[] nums, int[] colors) {
3        long prev = 0, ans = 0;
4
5        for(int i = 0 ; i< nums.length; i++){
6            long temp = 0;
7            
8            if(i>0 && colors[i]==colors[i-1]){
9                temp = Math.max(prev + nums[i], ans); 
10            }else{
11                temp=ans+nums[i];
12            }
13            prev = ans;
14            ans = temp;
15        }
16        return ans;
17    }
18}