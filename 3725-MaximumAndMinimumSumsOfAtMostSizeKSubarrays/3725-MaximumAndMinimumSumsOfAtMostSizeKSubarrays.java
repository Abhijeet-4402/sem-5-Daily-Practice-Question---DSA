// Last updated: 21/1/2026, 11:43:12 am
class Solution {

    public long minMaxSubarraySum(int[] nums, int k) {
        return computeSum(nums, k, true) + computeSum(nums, k, false);
    }

    private long computeSum(int[] nums, int k, boolean isMin) {
        int n = nums.length;
        long total = 0L;

        LinkedList<Integer> st = new LinkedList<>();
        st.addFirst(-1);

        for (int i = 0; i <= n; i++) {
            while (st.peekFirst() != -1 &&
                  (i == n ||
                  (isMin && nums[st.peekFirst()] >= nums[i]) ||
                  (!isMin && nums[st.peekFirst()] <= nums[i]))) {

                int mid = st.removeFirst();
                int left = st.peekFirst() + 1;
                int right = i - 1;

                int minLeft = Math.max(left, mid - k + 1);
                int maxRight = Math.min(mid + k - 1, right);

                long count = 0L;

                if (maxRight - minLeft < k) {
                    count = (mid - minLeft + 1L) * (maxRight - mid + 1L);
                } else {
                    if (mid - minLeft < maxRight - mid) {
                        for (int l = minLeft; l <= mid; l++) {
                            int r = Math.min(right, l + k - 1);
                            count += Math.max(r - mid + 1, 0);
                        }
                    } else {
                        for (int r = mid; r <= maxRight; r++) {
                            int l = Math.max(r - k + 1, left);
                            count += Math.max(mid - l + 1, 0);
                        }
                    }
                }

                total += count * nums[mid];
            }
            st.addFirst(i);
        }

        return total;
    }
}
