// Last updated: 20/12/2025, 9:29:21 pm
1class Solution {
2    public long lastInteger(long n) {
3       long start = 1;
4        long gap = 1;
5        boolean left = true;
6        while(n>1){
7            if(!left && (n%2==0)){
8                start+=gap;
9            }
10            gap<<=1;
11            n= (n+1)>>1;
12            left = !left;
13        }
14        return start;
15    }
16}