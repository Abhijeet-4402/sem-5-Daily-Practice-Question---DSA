// Last updated: 29/7/2026, 9:56:41 pm
1class Solution {
2public:
3    void sortColors(vector<int>& nums) {
4        int n = nums.size();
5        int l = 0;
6        int r = nums.size() - 1;
7        int i = 0;
8        while(i<n){
9            if (nums[i] == 2) {
10                if (i < r) {
11                    swap(nums[i], nums[r]);
12                    r--;
13                }else{
14                    i++;
15                }
16            } else if (nums[i] == 0) {
17                if (i > l) {
18                    swap(nums[i], nums[l]);
19                    l++;
20                }else{
21                    i++;
22                }
23            }else{
24                i++;
25            }
26        }
27    }
28};