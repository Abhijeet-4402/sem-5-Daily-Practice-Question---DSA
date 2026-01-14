// Last updated: 14/1/2026, 4:31:37 pm
1class Solution {
2    public static int[] singleNumber(int[] arr) {
3		int[] ans = new int[2];
4		int xor = 0;
5		for (int i : arr) {
6			xor ^= i;
7		}
8		
9		int mask = xor & -xor; 
10		//int mask = xor & (~(xor-1)); 
11
12		for (int i : arr) {
13			if ((i & mask) == 0) {
14				ans[0] ^= i;
15			}
16		}
17		ans[1] = xor ^ ans[0];
18		return ans;
19
20	}
21}