// Last updated: 28/2/2026, 9:55:15 pm
1import java.util.*;
2
3class Solution {
4    
5public int countPrimes(int n) {
6        if (n <= 2) return 0;
7        boolean[] prime = new boolean[n];
8        Arrays.fill(prime, true);
9
10        prime[0] = prime[1] = false; 
11
12        int count = n / 2;           
13
14        for (int i = 3; i * i < n; i += 2) {
15            if (prime[i]) {
16                int num = i*2;
17                for (int j = i * i; j < n; j += num) {
18                    if (prime[j]) {
19                        prime[j] = false;
20                        count--;
21                    }
22                }
23            }
24        }
25        return count;
26    }
27}