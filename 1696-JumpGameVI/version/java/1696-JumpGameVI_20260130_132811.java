// Last updated: 30/1/2026, 1:28:11 pm
1class Solution {
2    public int maxResult(int[] nums, int k) {
3        int n = nums.length;
4        int[] dp = new int[n];
5        Deque<Integer> dq = new ArrayDeque<>();
6        dp[0] = nums[0];
7        dq.add(0);
8        for (int i = 1; i < n; i++) {
9            while (!dq.isEmpty() && dq.peekFirst() < i - k) dq.pollFirst();
10            dp[i] = nums[i] + dp[dq.peekFirst()];
11            while (!dq.isEmpty() && dp[dq.peekLast()] <= dp[i]) dq.pollLast();
12            dq.offer(i);
13        }
14        return dp[n - 1];
15    }
16}
17