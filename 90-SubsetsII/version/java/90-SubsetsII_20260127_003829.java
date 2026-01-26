// Last updated: 27/1/2026, 12:38:29 am
1class Solution {
2    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
3        List<List<Integer>> ans = new ArrayList<>();
4		List<Integer> ll = new ArrayList<Integer>();
5        Arrays.sort(candidates);
6		findCombinations(candidates, 0, target, ll, ans);
7		return ans;
8	}
9
10	private static void findCombinations(int[] nums, int idx, int target, List<Integer> ll,
11			List<List<Integer>> ans) {
12		// TODO Auto-generated method stub
13		if(target == 0) {
14			ans.add(new ArrayList(ll));
15			return;
16		}
17		if(idx == nums.length) return;
18		
19		for( int i = idx; i<nums.length;i++){
20            if(i>idx && nums[i]==nums[i-1])continue;
21            if(nums[i]<=target){
22                ll.add(nums[i]);
23                findCombinations(nums, i+1, target-nums[i], ll, ans);
24                ll.remove(ll.size()-1);
25            }
26        }
27	}
28}