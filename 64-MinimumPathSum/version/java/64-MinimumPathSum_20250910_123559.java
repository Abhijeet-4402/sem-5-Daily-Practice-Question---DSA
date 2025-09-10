// Last updated: 10/9/2025, 12:35:59 pm
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
		
		if(cr==matrix.length-1) return matrix[cr][cc];
		
		if(dp[cr][cc]!=Integer.MIN_VALUE) return dp[cr][cc];
		int ans = Integer.MAX_VALUE;
		for(int i = 0; i<matrix [0].length; i++){
            if(i!=cc){
                ans = Math.min(ans, Minimum_Falling_Path(matrix, cr+1,i,dp));
            }
        }
		
		return dp[cr][cc] =ans+matrix[cr][cc];
	}
}