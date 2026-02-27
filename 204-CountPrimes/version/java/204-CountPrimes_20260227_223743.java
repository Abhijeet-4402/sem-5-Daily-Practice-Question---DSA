// Last updated: 27/2/2026, 10:37:43 pm
1class Solution {
2    public int countPrimes(int n) {
3        if(n<2) return 0;
4        boolean prime[] = new boolean[n];
5        Arrays.fill(prime, true);
6        prime[0] = prime[1] = false;    // true -> prime  / false -> not prime
7        int c = 0;
8        for( int i = 2; i <n;i++){
9            if(prime[i]){
10                c++;
11                for(int j = i*2; j < n; j += i) prime[j] = false;
12            }
13        }
14
15        return c;
16    }
17}