// Last updated: 31/7/2026, 10:14:24 pm
1class Solution {
2public:
3    vector<vector<int>> threeSum(vector<int>& nums) {
4
5        vector<vector<int>> ans;
6
7        sort(nums.begin(), nums.end());
8
9        for (int i = 0; i < nums.size() - 2; i++) {
10            // if(i > 0 && nums[i]==nums[i-1]) continue;
11            while( i > 0 && i < nums.size()-2 && nums[i]==nums[i-1])i++;
12
13            int l = i + 1;
14            int r = nums.size() - 1;
15
16            while (l < r) {
17                int sum = nums[i] + nums[l] + nums[r];
18
19                if (sum == 0) {
20                    ans.push_back({nums[i], nums[l], nums[r]});
21                    l++;
22                    r--;
23                    while (l < r && nums[l] == nums[l - 1])
24                        l++;
25                    while (l < r && nums[r] == nums[r + 1])
26                        r--;
27                } else if (sum < 0) {
28                    l++;
29                } else {
30                    r--;
31                }
32            }
33        }
34
35        return ans;
36    }
37};