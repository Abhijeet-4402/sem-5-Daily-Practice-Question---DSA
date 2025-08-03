// Last updated: 4/8/2025, 12:06:53 am
class Solution {
    public int rob(int[] nums) {
        int prev = 0;
        int ans = 0;

        for (int i : nums) {
            int temp = Math.max(ans, prev + i);
            prev = ans;
            ans = temp;
        }

        return ans;        
    }
}