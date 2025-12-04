// Last updated: 5/12/2025, 12:12:47 am
1class Solution {
2    public int countSubstrings(String s) {
3        char[] charArray = s.toCharArray();
4        int n = charArray.length;
5
6        int left = 0;
7        int right = 0;
8
9        int result = 0;
10
11        for (int i = 0; i < n; i++) {
12            left = i - 1;
13            right = i;
14
15            while (right < n - 1 && charArray[right] == charArray[right + 1]) {
16                right++;
17            }
18
19            result += ((right - left) * (right - left + 1)) / 2;
20
21            i = right;
22
23            right++;
24
25            while (left >= 0 && right < n && charArray[left] == charArray[right]) {
26                result++;
27                left--;
28                right++;
29            }
30        }
31
32        return result;
33    }
34}