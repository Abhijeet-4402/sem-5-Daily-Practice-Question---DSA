// Last updated: 7/2/2026, 11:20:48 pm
1class Solution {
2    public int lengthOfLIS(int[] nums) {
3        int n = nums.length;
4        int[] d = new int[n + 1];
5        d[1] = nums[0];
6        int size = 1;
7        for (int i = 1; i < n; ++i) {
8            if (nums[i] > d[size]) {
9                d[++size] = nums[i];
10            } else {
11                int left = 1, right = size;
12                while (left < right) {
13                    int mid = (left + right) >> 1;
14                    if (d[mid] >= nums[i]) {
15                        right = mid;
16                    } else {
17                        left = mid + 1;
18                    }
19                }
20                int p = d[left] >= nums[i] ? left : 1;
21                d[p] = nums[i];
22            }
23        }
24        return size;
25    }
26}