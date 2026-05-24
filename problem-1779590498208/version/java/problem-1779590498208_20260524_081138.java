// Last updated: 24/5/2026, 8:11:38 am
1class Solution {
2    public int[] limitOccurrences(int[] nums, int k) {
3        if (nums.length == 0)
4			return nums;
5		List<Integer> ll = new ArrayList<Integer>();
6		int c = 1;
7		ll.add(nums[0]);
8		for(int i = 1; i<nums.length;i++) {
9			if(nums[i]==nums[i-1]) {
10				if(c<k) {
11					ll.add(nums[i]);
12					c++;
13				}
14			}else {
15				c = 1;
16				ll.add(nums[i]);
17			}
18		}
19		int [] ans = ll.stream().mapToInt(Integer::intValue).toArray();
20		return ans;
21    }
22}