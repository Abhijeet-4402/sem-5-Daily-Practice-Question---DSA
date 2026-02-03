// Last updated: 3/2/2026, 12:45:51 pm
1class Solution {
2    public int minOperations(int[] nums) {
3        int c = 0;
4        int n = nums.length;
5        for(int i = 0; i <n-2;i++){
6            if(nums[i]==0){
7                c++;
8                nums[i] ^= 1;
9                nums[i + 1] ^= 1;
10                nums[i + 2] ^= 1;
11            }
12        }
13        if(nums[n-1]==0||nums[n-2]==0) return -1;
14
15        return c;
16    }
17}