// Last updated: 29/7/2026, 10:21:24 pm
1#include <bits/stdc++.h>
2using namespace std;
3
4class Solution {
5public:
6    vector<int> twoSum(vector<int>& nums, int target) {
7        // Create array of pairs {value, index}
8        vector<pair<int,int>> arr;
9        for(int i = 0; i < nums.size(); i++) {
10            arr.push_back({nums[i], i});
11        }
12
13        // Sort by value
14        sort(arr.begin(), arr.end());
15
16        vector<int> ans(2);
17        int i = 0, j = nums.size() - 1;
18
19        while(i < j) {
20            int sum = arr[i].first + arr[j].first;
21            if(sum == target) {
22                return {arr[i].second,arr[j].second};
23                
24            } else if(sum > target) {
25                j--;
26            } else {
27                i++;
28            }
29        }
30        return {};
31    }
32};
33