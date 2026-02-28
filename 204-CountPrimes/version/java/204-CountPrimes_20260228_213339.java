// Last updated: 28/2/2026, 9:33:39 pm
1import java.util.*;
2
3class Solution {
4    public int countPrimes(int n) {
5        if (n < 3) return 0;
6
7        boolean[] prime = new boolean[n];
8        Arrays.fill(prime, true);
9
10        prime[0] = prime[1] = false; 
11        int count = n / 2;           
12
13        for (int i = 3; i * i < n; i += 2) {
14            if (prime[i]) {
15                for (int j = i * i; j < n; j += 2 * i) {
16                    if (prime[j]) {
17                        prime[j] = false;
18                        count--;
19                    }
20                }
21            }
22        }
23
24        return count;
25    }
26}