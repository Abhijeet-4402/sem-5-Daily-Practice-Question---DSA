// Last updated: 4/8/2025, 12:06:26 am
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int col = matrix[0].length-1;
        int row = 0;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==target){
                return true;
            } else if(matrix[row][col]>target){
                col--;
            } else {
                row++;
            }
        }
        return false;
    }
}