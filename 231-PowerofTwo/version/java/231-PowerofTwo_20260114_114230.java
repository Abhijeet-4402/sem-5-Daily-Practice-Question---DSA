// Last updated: 14/1/2026, 11:42:30 am
1class Solution {
2    public boolean isPowerOfTwo(int n) {
3       if(n==0 || n == -2147483648) return false;
4       return (n & ( n-1 )) == 0;
5    }
6}