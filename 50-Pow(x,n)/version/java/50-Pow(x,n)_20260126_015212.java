// Last updated: 26/1/2026, 1:52:12 am
1class Solution {
2    public static int kthGrammar(int n, int k) {
3		return kthgrammar(k-1);
4	}
5	private static int kthgrammar(int k) {
6		if (k == 0 || k==1)
7			return k;
8		
9		if((k&1)==1) return kthgrammar((k/2))^1;
10		else return kthgrammar(k/2);
11	}
12}