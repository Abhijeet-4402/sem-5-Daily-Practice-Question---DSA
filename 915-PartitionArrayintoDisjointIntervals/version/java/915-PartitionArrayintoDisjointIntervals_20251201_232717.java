// Last updated: 1/12/2025, 11:27:17 pm
1class Solution {
2    public int partitionDisjoint(int[] nums) {
3        int[] pre  = new int[nums.length];
4        pre[0] = nums[0];
5        for(int i = 1; i <nums.length;i++){
6            pre[i] = Math.max(pre[i-1],nums[i]);
7        }
8
9        int suff = nums[nums.length-1];
10        int ans = nums.length;
11        for( int i = nums.length-2;i>-1;i--){
12            if(pre[i]<=suff) ans = i;
13            suff = Math.min(suff,nums[i]);
14        }
15        return ans+1;
16    }
17}