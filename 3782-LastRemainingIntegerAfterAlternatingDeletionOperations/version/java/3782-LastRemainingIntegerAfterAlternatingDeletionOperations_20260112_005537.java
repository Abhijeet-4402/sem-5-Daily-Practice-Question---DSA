// Last updated: 12/1/2026, 12:55:37 am
1class Solution {
2    public String convert(String s, int numRows) {
3        // If only one row or string length is less than numRows, return original string
4        if (numRows == 1 || s.length() <= numRows) {
5            return s;
6        }
7
8        // Create an array of StringBuilder for each row
9        StringBuilder[] rows = new StringBuilder[numRows];
10        // Initialize each StringBuilder
11        for (int i = 0; i < numRows; i++) {
12            rows[i] = new StringBuilder();
13        }
14
15        // Current row index
16        int currentRow = 0;
17        // Direction flag: true means moving down, false means moving up
18        boolean goingDown = false;
19
20        // Iterate over each character in the string
21        for (char c : s.toCharArray()) {
22            // Append character to the current row
23            rows[currentRow].append(c);
24            // Change direction if we reach the top or bottom row
25            if (currentRow == 0 || currentRow == numRows - 1) {
26                goingDown = !goingDown;
27            }
28            // Move up or down
29            currentRow += goingDown ? 1 : -1;
30        }
31
32        // Combine all rows into one string
33        StringBuilder result = new StringBuilder();
34        for (StringBuilder row : rows) {
35            result.append(row);
36        }
37
38        // Return the final converted string
39        return result.toString();
40    }
41}