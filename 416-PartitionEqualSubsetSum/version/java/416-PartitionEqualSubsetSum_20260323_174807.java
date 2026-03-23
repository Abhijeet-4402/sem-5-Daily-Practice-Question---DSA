// Last updated: 23/3/2026, 5:48:07 pm
1class Solution {
2    public boolean canPartition(int[] nums) {
3        int sum = 0;
4        for (int val : nums)
5            sum += val;
6
7        if ((sum & 1) == 1)
8            return false;
9
10        int target = sum / 2;
11        boolean[] dp = new boolean[target + 1];
12        dp[0] = true;
13
14        for (int val : nums) {
15            for (int j = target; j >= val; j--) {
16                if (dp[j - val]) {
17                    dp[j] = true;
18                }
19            }
20            if (dp[target])
21                return true;
22        }
23        return dp[target];
24    }
25}
26