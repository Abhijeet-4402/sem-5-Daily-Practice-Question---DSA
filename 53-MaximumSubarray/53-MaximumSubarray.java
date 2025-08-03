// Last updated: 4/8/2025, 12:08:23 am
class Solution {
    public int maxSubArray(int[] nums) {
        int mx_sum = Integer.MIN_VALUE, sum = 0; // Time Complexity ===> N
        for (int i : nums) {
            sum += i;
            if (sum > mx_sum)
                mx_sum = sum;
            if (sum < 0)
                sum = 0;
        }
        return mx_sum;
    }
}