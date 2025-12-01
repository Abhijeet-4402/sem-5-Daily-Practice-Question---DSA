// Last updated: 1/12/2025, 2:04:08 pm
1class Solution {
2    public int minPatches(int[] nums, int n) {
3        long sum = 0;
4        int c = 0;
5        int i = 0;
6        while(i<nums.length && sum<n){
7            if(nums[i]<=(sum+1)) sum+=nums[i++];
8            else{
9                sum+=sum+1;
10                c++;
11            }
12        }
13
14        while(sum<n){
15            sum+=sum+1;
16            c++;
17        }
18
19        return c;
20    }
21}