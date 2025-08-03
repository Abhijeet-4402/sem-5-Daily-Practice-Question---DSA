// Last updated: 4/8/2025, 12:04:46 am
class Solution {
    public int arrayNesting(int[] nums) {
        int maxLength = 0;
        boolean[] visited = new boolean[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (!visited[i]) {
                int start = i;
                int count = 0;

                while (!visited[start]) {
                    visited[start] = true;
                    start = nums[start];
                    count++;
                }

                maxLength = Math.max(maxLength, count);
            }
        }

        return maxLength;
    }
}