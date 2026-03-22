// Last updated: 22/3/2026, 8:48:13 pm
1class Solution {
2    public int minSteps(int n) {
3        if (n == 1) {
4            return 0;
5        }
6        int steps = 0;
7        for (int i = 2; i * i <= n; i++) { //Loop for getting primes
8            while (n % i == 0) { // add prime factor
9                steps += i;
10                n /= i;
11            }
12        }
13        if (n > 1) {
14            steps += n;
15        }
16        return steps;
17    }
18}
19