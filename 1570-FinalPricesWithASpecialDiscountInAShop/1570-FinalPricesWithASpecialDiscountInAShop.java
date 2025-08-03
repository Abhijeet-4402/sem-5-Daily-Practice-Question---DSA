// Last updated: 4/8/2025, 12:02:25 am
class Solution {
    public int[] finalPrices(int[] prices) {
      int n = prices.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (prices[j] <= prices[i]) {
                    prices[i] -= prices[j];
                    break;
                }
            }
        }
        return prices;   
    }
}