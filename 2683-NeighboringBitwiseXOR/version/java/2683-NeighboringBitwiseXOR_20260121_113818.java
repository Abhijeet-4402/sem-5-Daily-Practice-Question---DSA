// Last updated: 21/1/2026, 11:38:18 am
1class Solution {
2    public int xorAllNums(int[] nums1, int[] nums2) {
3        int n = nums1.length;
4        int m = nums2.length;
5        int xor = 0;
6        if((m&1)==1){
7            for(int i : nums1) xor^=i;
8        }
9        if((n&1)==1){
10            for( int i : nums2) xor^=i;
11        }
12
13        return xor;
14    }
15}