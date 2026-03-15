// Last updated: 15/3/2026, 10:10:32 pm
1class Solution {
2    public static int maxProfit(int[] prices) {
3		int preHold = -prices[0];
4		int preRest = 0;
5		int preSell = 0;
6		int sell = 0;
7		int hold = 0;
8		int rest = 0;
9
10		for (int i = 1; i < prices.length; i++) {
11			hold = Math.max(preHold,  preRest - prices[i]);
12			sell = preHold+prices[i];
13			rest = Math.max(preRest, preSell);
14			preHold = hold;
15			preSell = sell;
16			preRest = rest;
17			
18		}
19		return Math.max(sell, rest);
20
21	}
22}