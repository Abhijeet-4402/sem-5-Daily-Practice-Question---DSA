// Last updated: 23/3/2026, 5:56:03 pm
1class Solution {
2    public int findTargetSumWays(int[] nums, int target) {
3        return sum(nums, target, 0);
4    }
5
6    public static int sum(int[] arr,int target, int idx) {
7        if (target == 0 && idx == arr.length) {
8            return 1;
9        }
10        if (idx == arr.length)
11            return 0;
12        int x = sum(arr, target + arr[idx], idx + 1);
13        int y = sum(arr, target - arr[idx], idx + 1);
14        return x + y;
15
16    }
17
18}