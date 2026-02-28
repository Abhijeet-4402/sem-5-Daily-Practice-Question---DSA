// Last updated: 28/2/2026, 9:58:55 pm
1class Solution {
2    public int countPrimes(int n) {
3        if (n <= 2)
4            return 0;
5        boolean[] prime = new boolean[n];
6        Arrays.fill(prime, true);
7
8        prime[0] = prime[1] = false;
9
10        int count = n / 2;
11
12        for (int i = 3; i * i < n; i += 2) {
13            if (prime[i]) {
14                int num = i * 2;
15                for (int j = i * i; j < n; j += num) {
16                    if (prime[j]) {
17                        prime[j] = false;
18                        count--;
19                    }
20                }
21            }
22        }
23        return count;
24    }
25}