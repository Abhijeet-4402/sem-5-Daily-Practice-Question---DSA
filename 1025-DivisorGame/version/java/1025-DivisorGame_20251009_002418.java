// Last updated: 9/10/2025, 12:24:18 am
class Solution {
    public boolean divisorGame(int n) {
        int[] dp = new int[n+1];
		Arrays.fill(dp, 5);
		int x = OP(n, dp);
		return x==-1?true:false;
	}

	private static int OP(int n, int[] dp) {
		// TODO Auto-generated method stub
		if(n==1 || n==-1) return 0;
		if(n==0)return -1;
		if(dp[n]!=5)return dp[n];
		int a = 0;
		for(int i =1;i*i<=n;i++) {
			if(n%i==0) a=Math.min(a, OP(OP(n-i,dp),dp));
		}
		return dp[n]= a;
	}
    
}