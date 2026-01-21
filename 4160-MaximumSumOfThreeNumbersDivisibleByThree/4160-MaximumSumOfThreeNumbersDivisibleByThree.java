// Last updated: 21/1/2026, 11:42:06 am
class Solution {
    public int maximumSum(int[] nums) {
        if (nums.length < 3)
            return 0;
        ArrayList<Integer> zero = new ArrayList<>();
        ArrayList<Integer> one = new ArrayList<>();
        ArrayList<Integer> two = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 3 == 0) {
                zero.add(nums[i]);
            } else if (nums[i] % 3 == 1) {
                one.add(nums[i]);
            } else {
                two.add(nums[i]);
            }
        }
        Collections.sort(zero, Collections.reverseOrder());
        Collections.sort(one, Collections.reverseOrder());
        Collections.sort(two, Collections.reverseOrder());

        int ans = 0;

        if (zero.size() >= 3) {
            ans = Math.max(ans, zero.get(0) + zero.get(1) + zero.get(2));
        }
        if (one.size() >= 3) {
            ans = Math.max(ans, one.get(0) + one.get(1) + one.get(2));
        }
        if (two.size() >= 3) {
            ans = Math.max(ans, two.get(0) + two.get(1) + two.get(2));
        }
        if (zero.size() >= 1 && one.size() >= 1 && two.size() >= 1) {
            ans = Math.max(ans, zero.get(0) + one.get(0) + two.get(0));
        }

        return ans;
    }
}