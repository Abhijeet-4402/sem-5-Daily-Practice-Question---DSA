// Last updated: 13/3/2026, 3:44:16 pm
1class Solution {
2    public static int numDecodings(String s) {
3		if(s.charAt(0)=='0') return 0;
4		int n = s.length();
5		int[] dp = new int[n+1];
6		dp[0] = dp[1] = 1;
7		
8		for(int i = 2; i <= n; i++) {
9			
10			if(s.charAt(i-1)!='0') dp[i] += dp[i-1];
11			int temp = ((s.charAt(i-2)-'0'))*10 + ((s.charAt(i-1)-'0'));
12			if(temp>=10 && temp<=26) {
13				dp[i]+=dp[i-2];
14			}
15		}
16		
17		return dp[n];
18		
19	}
20
21}