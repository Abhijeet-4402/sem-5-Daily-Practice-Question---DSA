// Last updated: 13/10/2025, 1:23:27 am
class Solution {
    public static int findLongestChain(int[][] pairs) {
		// TODO Auto-generated method stub
        Arrays.sort(pairs, (a, b) -> a[0] - b[0]);
        
        int[][] dp = new int[pairs.length][pairs.length + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        
        return longestChain(pairs, 0, -1, dp);
    }

    private static int longestChain(int[][] pairs, int curr, int prev, int[][] dp) {
    		// TODO Auto-generated method stub
        if (curr == pairs.length) {
            return 0;
        }

        if (dp[curr][prev + 1] != -1) {
            return dp[curr][prev + 1];
        }

        int a = 0;
        if (prev == -1 || pairs[prev][1] < pairs[curr][0]) {
            a = 1 + longestChain(pairs, curr + 1, curr, dp);
        }

        int b = longestChain(pairs, curr + 1, prev, dp);

        return dp[curr][prev + 1] = Math.max(a, b);
    }
}