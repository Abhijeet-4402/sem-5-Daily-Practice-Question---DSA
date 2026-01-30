// Last updated: 30/1/2026, 1:17:35 pm
1public class Solution {
2    public static void main(String[] args) {
3        Scanner sc = new Scanner(System.in);
4        
5        int n = sc.nextInt();
6        int[] stations = new int[n];
7        for (int i = 0; i < n; i++) {
8            stations[i] = sc.nextInt();
9        }
10        int r = sc.nextInt();
11        int k = sc.nextInt();
12
13        System.out.println(maxPower(stations, r, k));
14    }
15
16    public static long maxPower(int[] stations, int r, int k) {
17        int n = stations.length;
18        long[] cnt = new long[n + 1];
19        for (int i = 0; i < n; i++) {
20            int left = Math.max(0, i - r);
21            int right = Math.min(n, i + r + 1);
22            cnt[left] += stations[i];
23            cnt[right] -= stations[i];
24        }
25
26        long minVal = stations[0];
27        long sumAll = 0;
28        for (int s : stations) {
29            minVal = Math.min(minVal, s);
30            sumAll += s;
31        }
32
33        long lo = minVal;
34        long hi = sumAll + k;
35        long res = 0;
36
37        while (lo <= hi) {
38            long mid = lo + (hi - lo) / 2;
39            if (check(mid, cnt, n, r, k)) {
40                res = mid;
41                lo = mid + 1;
42            } else {
43                hi = mid - 1;
44            }
45        }
46        return res;
47    }
48
49    private static boolean check(long val, long[] cnt, int n, int r, int k) {
50        long[] diff = Arrays.copyOf(cnt, n + 1);
51        long sum = 0;
52        long remaining = k;
53
54        for (int i = 0; i < n; i++) {
55            sum += diff[i];
56            if (sum < val) {
57                long add = val - sum;
58                if (remaining < add) {
59                    return false;
60                }
61                remaining -= add;
62                int end = Math.min(n, i + 2 * r + 1);
63                diff[end] -= add;
64                sum += add;
65            }
66        }
67        return true;
68    }
69}