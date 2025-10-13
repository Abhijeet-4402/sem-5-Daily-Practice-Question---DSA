// Last updated: 14/10/2025, 1:38:37 am
class Solution {
    public static int findLongestChain(int[][] pairs) {
	    Arrays.sort(pairs, (a, b) -> a[0] - b[0]);
	    int n = pairs.length;
	    if (n == 0) {
	        return 0;
	    }

	    int[][] dp = new int[n][n + 1];

	    for (int prev = -1; prev < n; prev++) {
	        int a = 0;
	        if (prev == -1 || pairs[0][1] < pairs[prev][0]) {
	            a = 1;
	        }
	        int b = 0;
	        dp[0][prev + 1] = Math.max(a, b);
	    }

	    for (int curr = 1; curr < n; curr++) {
	        for (int prev = -1; prev < n; prev++) {
	            int a = 0;
	            if (prev == -1 || pairs[curr][1] < pairs[prev][0]) {
	                a = 1 + dp[curr - 1][curr + 1];
	            }
	            int b = dp[curr - 1][prev + 1];
	            dp[curr][prev + 1] = Math.max(a, b);
	        }
	    }
	    
	    return dp[n - 1][0];
	}
}