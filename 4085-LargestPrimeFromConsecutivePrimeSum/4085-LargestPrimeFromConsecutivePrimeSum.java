// Last updated: 21/1/2026, 11:42:23 am
class Solution {
    public int largestPrime(int n) {
    if (n < 2) return 0;

    boolean[] prime = new boolean[n + 1];
    Arrays.fill(prime, true);
    prime[0] = prime[1] = false;

    for (int p = 2; p * p <= n; p++) {
        if (prime[p]) {
            for (int i = p * p; i <= n; i += p) prime[i] = false;
        }
    }

    int limit = n;
    int sum = 0;
    int ans = 0;

    for (int i = 2; i <= limit; i++) {
        if (prime[i]) {
            sum += i;
            if (sum > limit) break;
            if (prime[sum]) ans = sum;
        }
    }

    return ans;
}
}