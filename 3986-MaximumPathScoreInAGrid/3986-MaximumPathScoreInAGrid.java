// Last updated: 21/1/2026, 11:42:34 am
class Solution {
    
    public int maxPathScore(int[][] grid, int k) {
	    int m = grid.length, n = grid[0].length;
	    Integer[][][] map = new Integer[m][n][k + 1];

	    int ans = findScore(0, 0, 0, k, grid, map);
	    return Math.max(-1, ans);
	}

	private int findScore(int i, int j, int cost, int k, int[][] grid, Integer[][][] map) {
	    if (cost > k) return Integer.MIN_VALUE;

	    if (map[i][j][cost] != null) return map[i][j][cost];

	    int val = grid[i][j];
	    int score = (val == 2 ? 2 : val);
	    int newCost = cost + (val == 0 ? 0 : 1);

	    int m = grid.length, n = grid[0].length;

	    if (i == m - 1 && j == n - 1) {
	        int res = (newCost <= k) ? score : Integer.MIN_VALUE;
	        map[i][j][cost] = res;
	        return res;
	    }

	    int best = Integer.MIN_VALUE;

	    if (i + 1 < m) best = Math.max(best, findScore(i + 1, j, newCost, k, grid, map));
	    if (j + 1 < n) best = Math.max(best, findScore(i, j + 1, newCost, k, grid, map));

	    int cur = (best == Integer.MIN_VALUE) ? Integer.MIN_VALUE : best + score;

	    map[i][j][cost] = cur;
	    return cur;
	}

}