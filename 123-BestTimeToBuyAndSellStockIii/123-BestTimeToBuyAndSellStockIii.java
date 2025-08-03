// Last updated: 4/8/2025, 12:07:29 am
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int[] leftMaxProfit = new int[prices.length];

        for (int i = 1; i < prices.length; i++) {
            leftMaxProfit[i] = Math.max(leftMaxProfit[i - 1], prices[i] - minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }

        int maxProfit = 0;
        int profit = 0;
        int maxPrice = 0;

        for (int i = prices.length - 1; i >= 0; i--) {
            maxProfit = Math.max(maxProfit, profit + leftMaxProfit[i]);
            profit = Math.max(profit, maxPrice - prices[i]);
            maxPrice = Math.max(maxPrice, prices[i]);

        }

        return maxProfit;
        
    }
}
