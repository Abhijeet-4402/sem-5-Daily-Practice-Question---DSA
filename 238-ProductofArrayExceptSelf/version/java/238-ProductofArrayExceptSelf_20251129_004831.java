// Last updated: 29/11/2025, 12:48:31 am
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int [] pre  = new int[nums.length];
4        int[] suf = new int[nums.length];
5        pre[0] = suf[nums.length-1] = 1;
6        for( int i = 1; i <nums.length;i++){
7            pre[i] = pre[i-1]*nums[i-1];
8        }
9        for( int i  = nums.length-2;i>-1;i--){
10            suf[i] = suf[i+1]*nums[i+1];
11        }
12
13        for( int i = 0; i < nums.length;i++){
14            pre[i]*=suf[i];
15        }
16        return pre;
17    }
18}