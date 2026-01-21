// Last updated: 21/1/2026, 11:43:50 am
import java.util.*; // Import utility classes

class Solution {
    public int maxTwoEvents(int[][] events) {
        // Sort events by start time
        Arrays.sort(events, (a, b) -> a[0] - b[0]); // Sort by start time

        int n = events.length; // Number of events
        int[] maxFrom = new int[n + 1]; // maxFrom[i] stores max value from i to n-1
        maxFrom[n] = 0; // No events after n

        // Fill maxFrom array from the end
        for (int i = n - 1; i >= 0; --i) {
            maxFrom[i] = Math.max(maxFrom[i + 1], events[i][2]); // Max value from i to end
        }

        int res = 0; // Result for max sum

        for (int i = 0; i < n; ++i) {
            int end = events[i][1]; // End time of current event

            // Binary search for the first event that starts after current event ends (strictly greater)
            int l = i + 1, r = n;
            while (l < r) {
                int m = (l + r) / 2; // Middle index
                if (events[m][0] <= end) l = m + 1; // If event starts at or before end, move right
                else r = m; // Otherwise, move left
            }

            // l is the first event that starts after current event ends
            res = Math.max(res, events[i][2] + maxFrom[l]); // Update result with sum of current and next max
        }

        // Also consider the case where only one event is attended
        for (int i = 0; i < n; ++i) {
            res = Math.max(res, events[i][2]); // Update result with single event value
        }

        return res; // Return the maximum sum
    }
}