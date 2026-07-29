// Last updated: 29/7/2026, 9:57:34 pm
1class Solution {
2public:
3    void sortColors(vector<int>& nums) {
4        int n = nums.size();
5        int l = 0;
6        int r = nums.size() - 1;
7        int i = 0;
8        while (i < n) {
9            if (nums[i] == 2 && i < r) {
10
11                swap(nums[i], nums[r]);
12                r--;
13
14            } else if (nums[i] == 0 && i > l) {
15
16                swap(nums[i], nums[l]);
17                l++;
18
19            } else {
20                i++;
21            }
22        }
23    }
24};