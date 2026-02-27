// Last updated: 27/2/2026, 10:29:32 pm
1class Solution {
2    public int countPrimes(int n) {
3        if(n<2) return 0;
4        boolean prime[] = new boolean[n];
5        prime[0] = prime[1] = true;    // true -> not prime  / flase -> prime
6        int c = 0;
7        for( int i = 2; i <n;i++){
8            if(!prime[i]){
9                c++;
10                for(int j = i*2; j < n; j += i) prime[j] = true;
11            }
12        }
13
14        return c;
15    }
16}