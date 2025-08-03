// Last updated: 4/8/2025, 12:05:26 am

class Solution {
        public int[] findRightInterval(int[][] intervals) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        // min and max of the intervals
        for(int[] interval : intervals) {
            min = Math.min(min, interval[0]);
            max = Math.max(max, interval[1]);
        }
        int[] range = new int[max - min + 1];
        Arrays.fill(range, -1);
        // Track the index of each element
        for(int index = 0; index < intervals.length; index++) {
            range[intervals[index][0] - min] = index;
        }
        // fill the range from right to left for the index
        for(int index = range.length - 2; index >=0; index--) {
            if(range[index] == -1) {
                range[index] = range[index + 1];
            }
        }

        // for each interval - get the results
        int[] result = new int[intervals.length];
        for(int index = 0; index < intervals.length; index++) {
            result[index] = range[intervals[index][1] - min];
        }
        return result;
    }
}