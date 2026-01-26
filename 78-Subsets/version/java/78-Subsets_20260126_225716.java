// Last updated: 26/1/2026, 10:57:16 pm
1class Solution {
2   public static List<List<Integer>> subsets(int[] nums) {
3		List<List<Integer>> ans = new ArrayList<>();
4		List<Integer> ll =new ArrayList<>();
5		findSubsets(nums, 0, ll, ans);
6		return ans;
7	}
8
9	private static void findSubsets(int[] nums, int i, List<Integer> ll, List<List<Integer>> ans) {
10		// TODO Auto-generated method stub
11		if(i==nums.length) {
12			ans.add(new ArrayList(ll));
13			return;
14		}
15		//Not Take
16		findSubsets(nums, i+1, ll, ans);
17		
18		//Take
19		ll.add(nums[i]);
20		findSubsets(nums, i+1, ll, ans);
21		ll.remove(ll.size()-1);
22	}
23}