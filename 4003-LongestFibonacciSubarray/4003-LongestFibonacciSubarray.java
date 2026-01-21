// Last updated: 21/1/2026, 11:42:33 am
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