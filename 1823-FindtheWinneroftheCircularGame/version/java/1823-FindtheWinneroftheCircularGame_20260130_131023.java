// Last updated: 30/1/2026, 1:10:23 pm
1class Solution {
2    public int findTheWinner(int n, int k) {
3        return solve(n,k)+1;
4
5    }
6    public static int solve(int n,int k){
7        if(n==1){
8            return 0;
9        }
10        int a=solve(n-1,k);
11        return (a+k)%n;
12    }
13}