// Last updated: 13/3/2026, 4:20:22 pm
1class Solution {
2    static final int MOD = (int)(1e9+7);
3    public static int numDecodings(String s) {
4        Long[] dp = new Long[s.length()];
5        return (int) solve(0, s, dp);
6    }
7
8    private static long solve(int idx, String s, Long[] dp) {
9        if (idx == s.length()) {
10            return 1;
11        }
12
13        if (s.charAt(idx) == '0') {
14            return 0;
15        }
16
17        if (dp[idx] != null) {
18            return dp[idx];
19        }
20
21        long ways = (s.charAt(idx) == '*' ? 9 : 1) * solve(idx + 1, s, dp);
22        ways %= MOD;
23
24        if (idx + 1 < s.length()) {
25            ways += countDouble(s.charAt(idx), s.charAt(idx + 1)) * solve(idx + 2, s, dp);
26            ways %= MOD;
27        }
28
29        return dp[idx] = ways;
30    }
31
32    private static long countDouble(char c1, char c2) {
33        if (c1 == '*' && c2 == '*') {
34            return 15;
35        } else if (c1 == '*') {
36            return (c2 >= '0' && c2 <= '6') ? 2 : 1;
37        } else if (c2 == '*') {
38            if (c1 == '1') return 9;
39            if (c1 == '2') return 6;
40            return 0;
41        } else {
42            int val = (c1 - '0') * 10 + (c2 - '0');
43            return (val >= 10 && val <= 26) ? 1 : 0;
44        }
45    }
46}
47