// Last updated: 11/10/2025, 8:18:55 pm
class Solution {
    public static int longestSubarray(int[] nums) {
        int res = 2, len = 2, i = 0;
        while (i < nums.length - 2) {
            len = (nums[i] + nums[i + 1] == nums[i + 2]) ? len + 1 : 2;
            res = Math.max(res, len);
            i++;
        }
        return res;
    }
}