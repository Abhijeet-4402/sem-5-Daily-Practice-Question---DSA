// Last updated: 29/11/2025, 12:03:51 am
1class Solution {
2    public int maxSubarraySumCircular(int[] nums) {
3        int total = 0, minAns = nums[0], maxAns = nums[0], maxSum = 0, minSum = 0;
4        for( int i :nums){
5            total+=i;
6            minSum+=i;
7            maxSum+=i;
8
9            minAns = Math.min(minAns, minSum);
10            maxAns = Math.max(maxAns, maxSum);
11
12            if(minSum>0) minSum = 0;
13            if(maxSum<0) maxSum = 0;
14        }
15        if(maxAns<0) return maxAns;
16        return Math.max(maxAns, total-minAns);
17        
18    }
19}