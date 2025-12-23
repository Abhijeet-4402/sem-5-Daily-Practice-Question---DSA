// Last updated: 23/12/2025, 2:19:59 pm
1import java.util.*; // Import utility classes
2
3class Solution {
4    public int maxTwoEvents(int[][] events) {
5        // Sort events by start time
6        Arrays.sort(events, (a, b) -> a[0] - b[0]); // Sort by start time
7
8        int n = events.length; // Number of events
9        int[] maxFrom = new int[n + 1]; // maxFrom[i] stores max value from i to n-1
10        maxFrom[n] = 0; // No events after n
11
12        // Fill maxFrom array from the end
13        for (int i = n - 1; i >= 0; --i) {
14            maxFrom[i] = Math.max(maxFrom[i + 1], events[i][2]); // Max value from i to end
15        }
16
17        int res = 0; // Result for max sum
18
19        for (int i = 0; i < n; ++i) {
20            int end = events[i][1]; // End time of current event
21
22            // Binary search for the first event that starts after current event ends (strictly greater)
23            int l = i + 1, r = n;
24            while (l < r) {
25                int m = (l + r) / 2; // Middle index
26                if (events[m][0] <= end) l = m + 1; // If event starts at or before end, move right
27                else r = m; // Otherwise, move left
28            }
29
30            // l is the first event that starts after current event ends
31            res = Math.max(res, events[i][2] + maxFrom[l]); // Update result with sum of current and next max
32        }
33
34        // Also consider the case where only one event is attended
35        for (int i = 0; i < n; ++i) {
36            res = Math.max(res, events[i][2]); // Update result with single event value
37        }
38
39        return res; // Return the maximum sum
40    }
41}