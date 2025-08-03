// Last updated: 4/8/2025, 12:01:04 am
class Solution {
    public int countDays(int days, int[][] mat) {
        int n = mat.length;
        Arrays.sort(mat, (a, b) -> Integer.compare(a[0], b[0]));
        int count = 0;
        int prev = 0;
        for (int i = 0; i < n; i++) {
            int start = mat[i][0];
            int end = mat[i][1];
            if (start > prev + 1) {
                count += start - (prev + 1);
            }
            prev = Math.max (prev, end);
        }
        if (prev < days) {
            count += days - prev;
     
        }
        return count;
    }
}