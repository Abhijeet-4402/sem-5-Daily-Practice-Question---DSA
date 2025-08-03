// Last updated: 4/8/2025, 12:06:45 am
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n-k];
    }
}