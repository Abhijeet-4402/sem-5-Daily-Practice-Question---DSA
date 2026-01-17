// Last updated: 17/1/2026, 8:32:08 pm
1class Solution {
2    public int minOperations(int[] nums, int[] target) {
3        int ops = 0;
4        int n = nums.length;
5        boolean[] used = new boolean[100005];
6
7        for( int i = 0; i < n ;i++){
8            if(nums[i]!=target[i]){
9                if(!used[nums[i]]){
10                    used[nums[i]] = true;
11                    ops++;
12                }
13            }
14        }
15        return ops;
16    }
17    
18}