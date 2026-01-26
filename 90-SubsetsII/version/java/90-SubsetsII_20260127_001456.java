// Last updated: 27/1/2026, 12:14:56 am
1class Solution {
2    public static List<List<Integer>> subsetsWithDup(int[] nums) {
3		List<List<Integer>> ans = new ArrayList<>();
4		List<Integer> ll = new ArrayList<>();
5		Arrays.sort(nums);
6		findSubsets(nums, 0, ll, ans);
7		return ans;
8	}
9
10	private static void findSubsets(int[] nums, int idx, List<Integer> ll, List<List<Integer>> ans) {
11		// TODO Auto-generated method stub
12		if(idx <= nums.length) {
13			ans.add(new ArrayList(ll));
14		}
15		
16		for(int i = idx; i < nums.length; i++) {
17			if(i>idx && nums[i]==nums[i-1])continue;
18			ll.add(nums[i]);
19			findSubsets(nums, i+1, ll, ans);
20			ll.remove(ll.size()-1);
21		}
22	}
23}