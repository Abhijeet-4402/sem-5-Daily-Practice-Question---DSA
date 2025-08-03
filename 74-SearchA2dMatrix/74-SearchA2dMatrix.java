// Last updated: 4/8/2025, 12:07:56 am
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int l = 0, r = m * n - 1, mid = 0;
        while (l <= r) {
            mid = l + (r - l) / 2;
            int row = mid / n, col = mid % n;
            if (matrix[row][col] == target) return true;
            else if (matrix[row][col] > target) r = mid - 1;
            else l = mid + 1;
        }
        return false;
    }
}