// Last updated: 5/12/2025, 12:17:01 am
1class Solution {
2    public int countSubstrings(String s) {
3        int odd = 0;
4        for (int axis = 0; axis < s.length(); axis++)
5            for (int orbit = 0; orbit < s.length(); orbit++)
6                if (axis - orbit >= 0 &&
7                    axis + orbit < s.length() &&
8                    s.charAt(axis - orbit) == s.charAt(axis + orbit))
9                    odd++;
10                else
11                    break;
12
13        int even = 0;
14        for (double axis = 0.5; axis < s.length(); axis++)
15            for (double orbit = 0.5; orbit < s.length(); orbit++)
16                if (axis - orbit >= 0 &&
17                    axis + orbit < s.length() &&
18                    s.charAt((int)(axis - orbit)) == s.charAt((int)(axis + orbit)))
19                    even++;
20                else
21                    break;
22
23        return odd + even;
24    }
25}
26