// Last updated: 14/1/2026, 12:09:39 pm
1class Solution {
2    public int[] singleNumber(int[] nums) {
3        int [] ans = new int[2];
4        int xor = 0;
5        for(int i : nums) xor^=i;
6        int mask = xor & -xor;
7        for(int i: nums){
8            if((i & mask) == 0) ans[0]^=i;
9        }
10        ans[1] = ans[0]^xor;
11        return ans;
12    }
13}