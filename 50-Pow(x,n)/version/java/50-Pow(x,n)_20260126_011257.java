// Last updated: 26/1/2026, 1:12:57 am
1class Solution {
2    public static double myPow(double x, long n) {
3        if(n==0) return 1;
4		if(n==1) return x;
5		if(n<0) {
6			n *= -1;
7			x=1/x;
8		}
9		double half = myPow(x, n/2);
10		double ans = half*half;
11		if((n&1)==1) {
12			ans*=x;
13		}
14		return ans;
15	}
16}