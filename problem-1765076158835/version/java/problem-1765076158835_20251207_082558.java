// Last updated: 7/12/2025, 8:25:58 am
1class Solution {
2    public int largestPrime(int n) {
3    if (n < 2) return 0;
4
5    boolean[] prime = new boolean[n + 1];
6    Arrays.fill(prime, true);
7    prime[0] = prime[1] = false;
8
9    for (int p = 2; p * p <= n; p++) {
10        if (prime[p]) {
11            for (int i = p * p; i <= n; i += p) prime[i] = false;
12        }
13    }
14
15    int limit = n;
16    int sum = 0;
17    int ans = 0;
18
19    for (int i = 2; i <= limit; i++) {
20        if (prime[i]) {
21            sum += i;
22            if (sum > limit) break;
23            if (prime[sum]) ans = sum;
24        }
25    }
26
27    return ans;
28}
29}