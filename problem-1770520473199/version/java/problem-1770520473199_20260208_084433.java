// Last updated: 8/2/2026, 8:44:33 am
1class Solution {
2    public List<Long> mergeAdjacent(int[] nums) {
3        Deque<Long> dq = new ArrayDeque<>();
4        for(int num: nums){
5            long curr = (long) num;
6            while(!dq.isEmpty() && dq.peekLast()==curr){
7                curr+=dq.pollLast();
8            }
9            dq.offer((long)curr);
10            
11        }
12        return new ArrayList<>(dq);
13    }
14}