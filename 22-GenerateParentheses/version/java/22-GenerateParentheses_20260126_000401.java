// Last updated: 26/1/2026, 12:04:01 am
1class Solution {
2    public static List<String> generateParenthesis(int n) {
3		// TODO Auto-generated method stub
4		List<String> ll = new ArrayList<>();
5		generate(n,0,0,ll,"");
6		return ll;
7	}
8
9	private static void generate(int n, int open, int close, List<String> ll, String s) {
10		// TODO Auto-generated method stub
11		if(close>open || open>n) return;
12		if(open==n && close==n) {
13			ll.add(s);
14			return;
15		}
16		//open
17		generate(n, open+1, close, ll, s+"(");
18		//close
19		generate(n, open, close+1, ll, s+")");
20	}
21}