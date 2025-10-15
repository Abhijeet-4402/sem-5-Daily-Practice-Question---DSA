// Last updated: 15/10/2025, 10:53:10 pm
class Solution {
    public static int deleteAndEarn(int[] arr) {
        int maxVal = 0;
        int[] freq = new int[10001];
        for (int num : arr) {
            freq[num] += num;
            maxVal = Math.max(maxVal, num);
        }

        int[] dp = new int[maxVal + 1];

//        return earn(freq, maxVal, dp);
        return earnBU(freq,maxVal);
    }
    
    private static int earnBU(int[] freq, int max) {
    	int[] dp = new int[max + 1];
        dp[0] = 0;
        dp[1] = freq[1];

        for (int i = 2; i <= max; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + freq[i]);
        }

        return dp[max];
		
	}
}


