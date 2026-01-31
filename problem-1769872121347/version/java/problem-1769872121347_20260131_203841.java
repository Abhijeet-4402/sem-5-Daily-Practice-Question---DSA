// Last updated: 31/1/2026, 8:38:41 pm
1class Solution {
2    public int minimumK(int[] nums) {
3        long hi = 0;
4        for(int x: nums) hi+=x;
5
6        long lo = 1;
7        while(lo<hi){
8            long mid = lo+(hi-lo)/2;
9            if((double)check(nums, mid)/mid<=mid){
10                hi = mid;
11            }else{
12                lo = mid+1;
13            }
14        }
15        return (int)lo;
16    }
17    public int check(int[] nums, long mid){
18        int ans = 0;
19        for( int i = 0;i<nums.length;i++){
20            ans+=(nums[i]/mid)+((nums[i]%mid==0)?0:1);
21        }
22        return ans;
23    }
24}