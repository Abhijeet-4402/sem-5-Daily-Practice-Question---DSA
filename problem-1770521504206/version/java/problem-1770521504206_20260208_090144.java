// Last updated: 8/2/2026, 9:01:44 am
1class Solution {
2    public long countSubarrays(int[] nums, long k) {
3        Deque<Integer> max = new ArrayDeque<>();
4        Deque<Integer> min = new ArrayDeque<>();
5        long ans = 0;
6        int l = 0;
7        for(int r = 0; r<nums.length;r++){
8            while(!max.isEmpty() && nums[max.peekLast()]<=nums[r]) max.pollLast();
9            max.offer(r);
10
11            while(!min.isEmpty() && nums[min.peekLast()]>=nums[r]) min.pollLast();
12            min.offer(r);
13
14
15            while(l<=r){
16                long diff = (long)nums[max.peekFirst()] - nums[min.peekFirst()];
17                if(diff*(r-l+1L)<=k) break;
18                if(max.peekFirst() == l)max.pollFirst();
19                if(min.peekFirst() == l)min.pollFirst();
20                l++;
21            }
22
23            ans+=(r-l+1);
24                
25        }
26
27        return ans;
28    }
29}