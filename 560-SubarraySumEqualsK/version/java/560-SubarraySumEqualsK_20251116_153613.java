// Last updated: 16/11/2025, 3:36:13 pm
import java.util.*;

class Solution {
    public int subarraySum(int[] arr, int k) {
        Map<Integer, Integer> mpp = new HashMap<>();
        mpp.put(0, 1);

        int preSum = 0, cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            preSum += arr[i];
            int remove = preSum - k;

            cnt += mpp.getOrDefault(remove, 0);
            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
        }

        return cnt;
    }
}
