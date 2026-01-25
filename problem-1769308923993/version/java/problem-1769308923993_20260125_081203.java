// Last updated: 25/1/2026, 8:12:03 am
1class Solution {
2    public int minimumPrefixLength(int[] nums) {
3        int c = 0;
4        for( int i = 1; i < nums.length; i++){
5            if(nums[i]<=nums[i-1]){
6                c = i;
7            }
8        }
9
10        return c;
11    }
12}