// Last updated: 20/12/2025, 9:13:34 pm
1class Solution {
2    public long maximumScore(int[] nums, String s) {
3        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
4        long ans = 0;
5        for(int i = 0; i < nums.length; i++){
6            pq.offer(nums[i]);
7            if(s.charAt(i)=='1'){
8                ans+=pq.poll();
9            }
10        }
11
12        return ans;
13        
14    }
15}