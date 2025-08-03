// Last updated: 4/8/2025, 12:08:19 am
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        // OR
        // Arrays.sort(intervals, (a, b) -> a[0]-b[0]); 
         //if a[0]-b[0] is -ve i.e a is smaller n b should come first ,if +ve therefore b is smaller and a should come first,if zero then they are same order doesn't matter.....
        
        List<int[]> merged = new ArrayList<>();
        
        for (int[] interval : intervals) {
            //if new array is empty or intervals are not overlapping that means end of i is less then end of i+1 interval 
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                merged.add(interval);
            } else {
                // if overlapping that is  end of i is grater than end of i+1 interval than max is taken and assigned that value in new array or list...
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            }
        }
        
        return merged.toArray(new int[merged.size()][]);
    }
        
}