// Last updated: 11/3/2026, 4:11:24 pm
1class Solution {
2    public static int numDecodings(String s) {
3		int [] dp = new int[s.length()];
4		Arrays.fill(dp, -1);
5		return solve(0,s, dp);
6	}
7	private static int solve(int idx, String s, int[] dp) {
8		if(idx==s.length()) return 1;
9		if(s.charAt(idx)=='0') return 0;
10		
11		if(dp[idx]!=-1) return dp[idx];
12		int ways = solve(idx+1, s, dp);
13		
14		if(idx+1<s.length()) {
15			int temp = ((s.charAt(idx)-'0'))*10 + ((s.charAt(idx+1)-'0'));
16			if(temp>=10 && temp<=26) ways+=solve(idx+2, s, dp);
17		}
18		return dp[idx] = ways;
19	}
20}