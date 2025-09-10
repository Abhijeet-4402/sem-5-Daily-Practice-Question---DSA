// Last updated: 10/9/2025, 12:23:19 pm
class Solution {
    public int minFallingPathSum(int[][] matrix) {
     int ans = Integer.MAX_VALUE;
		int[][] dp = new int [matrix.length][matrix[0].length];
		for(int [] x : dp)Arrays.fill(x, Integer.MIN_VALUE);
		for(int col = 0; col<matrix[0].length;col++) {
			ans = Math.min(ans, Minimum_Falling_Path(matrix, 0, col, dp));
		}
		return ans;

	}

	private static int Minimum_Falling_Path(int[][] matrix, int cr, int cc,int[][] dp) {
		// TODO Auto-generated method stub
		if(cc<0 || cc>=matrix[0].length) return Integer.MAX_VALUE;
		
		if(cr==matrix.length-1) return matrix[cr][cc];
		
		if(dp[cr][cc]!=Integer.MIN_VALUE) return dp[cr][cc];
		
		int ld = Minimum_Falling_Path(matrix, cr+1, cc-1,dp);
		int rd = Minimum_Falling_Path(matrix, cr+1, cc+1,dp);
		int d = Minimum_Falling_Path(matrix, cr+1, cc,dp);
		
		return dp[cr][cc] = Math.min(rd,  Math.min(ld, d))+matrix[cr][cc];
	}

}
