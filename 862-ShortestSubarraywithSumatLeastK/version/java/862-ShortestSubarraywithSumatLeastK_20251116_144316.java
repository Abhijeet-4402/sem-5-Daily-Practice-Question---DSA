// Last updated: 16/11/2025, 2:43:16 pm
import java.util.*;

class Solution {
    public int shortestSubarray(int[] nums, int k) {
        int n = nums.length;
        long res = Long.MAX_VALUE;
        long prefixSum = 0;

        Deque<long[]> dq = new ArrayDeque<>();
        // pair → {prefix_sum, index}
        dq.addLast(new long[]{0, -1});

        for (int i = 0; i < n; i++) {
            prefixSum += nums[i];
            while (!dq.isEmpty() && prefixSum <= dq.peekLast()[0]) {
                dq.pollLast();
            }

            long checker = prefixSum - k;

            while (!dq.isEmpty() && checker >= dq.peekFirst()[0]) {
                res = Math.min(res, i - dq.peekFirst()[1]);
                dq.pollFirst();
            }

            dq.addLast(new long[]{prefixSum, i});
        }

        return res != Long.MAX_VALUE ? (int) res : -1;
    }
}
