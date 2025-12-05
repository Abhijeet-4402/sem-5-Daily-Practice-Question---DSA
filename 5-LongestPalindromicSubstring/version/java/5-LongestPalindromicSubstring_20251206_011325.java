// Last updated: 6/12/2025, 1:13:25 am
1class Solution {
2    public String longestPalindrome(String s) {
3        if (s == null || s.length() == 0) return "";
4        
5        int l = 0, r = 0; 
6        
7        // Odd length check
8        for (int axis = 0; axis < s.length(); axis++) {
9            for (int orbit = 0; orbit < s.length(); orbit++) {
10                if (axis - orbit >= 0 &&
11                    axis + orbit < s.length() &&
12                    s.charAt(axis - orbit) == s.charAt(axis + orbit)) {
13                    
14                } else {
15                    int currL = axis - orbit + 1;
16                    int currR = axis + orbit - 1;
17                    
18                    if ((currR - currL) > (r - l)) {
19                        l = currL;
20                        r = currR;
21                    }
22                    break;
23                }
24            }
25        }
26
27        // Even length check
28        for (double axis = 0.5; axis < s.length(); axis++) {
29            for (double orbit = 0.5; orbit < s.length(); orbit++) {
30                if (axis - orbit >= 0 &&
31                    axis + orbit < s.length() &&
32                    s.charAt((int)(axis - orbit)) == s.charAt((int)(axis + orbit))) {
33                     
34                } else {
35                    int currL = (int)(axis - orbit) + 1;
36                    int currR = (int)(axis + orbit) - 1;
37
38                    if ((currR - currL) > (r - l)) {
39                        l = currL;
40                        r = currR;
41                    }
42                    break;
43                }
44            }
45        }
46        
47        return s.substring(l, r + 1);
48    }
49}