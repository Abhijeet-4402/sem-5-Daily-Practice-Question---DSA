// Last updated: 23/7/2026, 9:36:17 am
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] stations = new int[n];
        for (int i = 0; i < n; i++) {
            stations[i] = sc.nextInt();
        }
        int r = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(maxPower(stations, r, k));
    }

    public static long maxPower(int[] stations, int r, int k) {
        int n = stations.length;
        long[] cnt = new long[n + 1];
        for (int i = 0; i < n; i++) {
            int left = Math.max(0, i - r);
            int right = Math.min(n, i + r + 1);
            cnt[left] += stations[i];
            cnt[right] -= stations[i];
        }

        long minVal = stations[0];
        long sumAll = 0;
        for (int s : stations) {
            minVal = Math.min(minVal, s);
            sumAll += s;
        }

        long lo = minVal;
        long hi = sumAll + k;
        long res = 0;

        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;
            if (check(mid, cnt, n, r, k)) {
                res = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return res;
    }

    private static boolean check(long val, long[] cnt, int n, int r, int k) {
        long[] diff = Arrays.copyOf(cnt, n + 1);
        long sum = 0;
        long remaining = k;

        for (int i = 0; i < n; i++) {
            sum += diff[i];
            if (sum < val) {
                long add = val - sum;
                if (remaining < add) {
                    return false;
                }
                remaining -= add;
                int end = Math.min(n, i + 2 * r + 1);
                diff[end] -= add;
                sum += add;
            }
        }
        return true;
    }
}