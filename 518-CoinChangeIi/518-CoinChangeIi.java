// Last updated: 4/8/2025, 12:04:56 am
class Solution {
    public int change(int amount, int[] coins) {
        int[] dp=new int[amount+1];
        dp[0]=1;
        for(int coin:coins){
            for(int i=coin;i<=amount;i++){
                dp[i]=dp[i]+dp[i-coin];
            }
        }
        return dp[amount];
        
    }
}