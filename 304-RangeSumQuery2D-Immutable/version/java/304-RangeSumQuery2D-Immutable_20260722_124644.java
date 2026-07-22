// Last updated: 22/7/2026, 12:46:44 pm
1class NumMatrix {
2    int[][] matrix;
3
4    int[][] pmSum;
5
6    public void getMatrixPrefixSum(int[][] matrix) {
7
8        pmSum[0][0] = matrix[0][0];
9        for (int col = 1; col < matrix[0].length; col++) {
10            pmSum[0][col] = pmSum[0][col - 1] + matrix[0][col];
11        }
12        for (int row = 1; row < matrix.length; row++) {
13            pmSum[row][0] = pmSum[row - 1][0] + matrix[row][0];
14        }
15
16        for (int i = 1; i < matrix.length; i++) {
17            for (int j = 1; j < matrix[0].length; j++) {
18                pmSum[i][j] =
19                        pmSum[i - 1][j]
20                      + pmSum[i][j - 1]
21                      - pmSum[i - 1][j - 1]
22                      + matrix[i][j];
23            }
24        }
25    }
26    public int getValue(int row, int col) {
27        if (row < 0 || col < 0)
28            return 0;
29        return pmSum[row][col];
30    }
31
32    public NumMatrix(int[][] matrix) {
33        this.matrix = matrix;
34        pmSum = new int[matrix.length][matrix[0].length];
35        getMatrixPrefixSum(matrix);
36    }
37
38    public int sumRegion(int row1, int col1, int row2, int col2) {
39        int total = getValue(row2, col2);
40        int top = getValue(row1 - 1, col2);
41        int left = getValue(row2, col1 - 1);
42        int overlap = getValue(row1 - 1, col1 - 1);
43
44        return total - top - left + overlap;
45    }
46}