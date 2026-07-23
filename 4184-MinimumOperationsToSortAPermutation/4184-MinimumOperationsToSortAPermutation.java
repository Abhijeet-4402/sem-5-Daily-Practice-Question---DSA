// Last updated: 23/7/2026, 9:35:05 am
class Solution {
    public int minOperations(int[] nums) {
      int i = -1;
		int n = nums.length;
		for (int j = 0; j < n; j++) {
			if (nums[j] == 0) {
				i = j;
				break;
			}
		}

		boolean rotated = true;
		boolean reverseRotated = true;
		for (int j = 0; j < n; j++) {
			if (nums[(i + j) % n] != j) {
				rotated = false;
				break;
			}
		}

		for (int j = 0; j < n; j++) {
			if (nums[(i - j + n) % n] != j) {
				reverseRotated = false;
				break;
			}
		}

		if (!rotated && !reverseRotated) {
			return -1;
		}

		int ans = Integer.MAX_VALUE;

		if (rotated) {
			ans = Math.min(ans, i);
			ans = Math.min(ans, n - i + 2);
		}

		if (reverseRotated) {
			ans = Math.min(ans, n - i);
			ans = Math.min(ans, i + 2);
		}

		return ans;
	}
}