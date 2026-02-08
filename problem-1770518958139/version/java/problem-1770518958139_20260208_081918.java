// Last updated: 8/2/2026, 8:19:18 am
1class Solution {
2    public int dominantIndices(int[] nums) {
3        int n = nums.length;
4        int[] suff = new int[n+1];
5        for(int i = n-1;i>=0;i--) suff[i] = suff[i+1]+nums[i];
6        int count = 0;
7
8        for(int i  = 0;i < n;i++){
9            if(nums[i]*(n-i-1)>suff[i+1]) count++;
10        } 
11        return count;
12    }
13}