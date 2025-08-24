// Last updated: 24/8/2025, 10:50:47 pm
class Solution {
    public long maxProfit(int[] prices, int[] strategy, int k) {
        int n = prices.length;
        if (k > n) return baseProfit(prices, strategy); // no valid window

        // 1) base profit
        long base = 0;
        for (int i = 0; i < n; ++i) base += (long) strategy[i] * prices[i];

        // 2) build A and B
        long[] A = new long[n]; // effect when become 0
        long[] B = new long[n]; // effect when become 1
        for (int i = 0; i < n; ++i) {
            A[i] = - (long) strategy[i] * prices[i];        // new - old  when new=0
            B[i] = (1L - strategy[i]) * prices[i];         // new - old  when new=1
        }

        // 3) prefix sums of A and B
        long[] prefA = new long[n + 1];
        long[] prefB = new long[n + 1];
        for (int i = 0; i < n; ++i) {
            prefA[i + 1] = prefA[i] + A[i];
            prefB[i + 1] = prefB[i] + B[i];
        }

        // 4) slide windows and compute best gain
        int half = k / 2;
        long bestGain = Long.MIN_VALUE;
        for (int l = 0; l + k <= n; ++l) {
            long gain = (prefA[l + half] - prefA[l])      // first half converted to 0
                      + (prefB[l + k] - prefB[l + half]); // second half converted to 1
            if (gain > bestGain) bestGain = gain;
        }
        if (bestGain < 0) bestGain = 0;

        return base + bestGain;
    }

    private long baseProfit(int[] prices, int[] strategy) {
        long s = 0;
        for (int i = 0; i < prices.length; ++i) s += (long) strategy[i] * prices[i];
        return s;
    }
}
