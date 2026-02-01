// Last updated: 1/2/2026, 9:42:01 pm
1class Solution {
2    public static int countMonobit(int n) {
3		int c = 0;
4		int num = 0;
5		long tp = 1;
6		while(num<=n) {
7			c++;
8			num+=tp;
9			tp*=2;
10		}
11		return c;
12	}
13}