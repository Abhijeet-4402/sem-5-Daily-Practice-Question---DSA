// Last updated: 11/3/2026, 10:51:11 am
1class Solution {
2    public static int minCostClimbingStairs(int[] cost) {
3		for(int i = cost.length-3;i>=0; i--) {
4			cost[i] += Math.min(cost[i+1], cost[i+2]);
5		}
6		return Math.min(cost[0], cost[1]);
7	}
8}