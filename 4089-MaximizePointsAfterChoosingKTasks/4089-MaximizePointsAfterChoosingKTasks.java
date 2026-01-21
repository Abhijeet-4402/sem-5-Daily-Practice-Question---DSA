// Last updated: 21/1/2026, 11:42:22 am
class Solution {
   public static long maxPoints(int[] t1, int[] t2, int k) {
        int len = t1.length;

        long base = 0;
        int[] gain = new int[len];

        for (int i = 0; i < len; i++) {
            base += t2[i];
            gain[i] = t1[i] - t2[i];
        }

        Arrays.sort(gain);

        long ans = base;

        for (int i = len - 1; i >= len - k; i--) {
            ans += gain[i];
        }

        for (int i = len - k - 1; i >= 0; i--) {
            if (gain[i] > 0) ans += gain[i];
            else break;
        }

        return ans;
    }
}