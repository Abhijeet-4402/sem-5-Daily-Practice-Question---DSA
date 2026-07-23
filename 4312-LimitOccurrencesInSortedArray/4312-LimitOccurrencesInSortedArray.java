// Last updated: 23/7/2026, 9:34:51 am
class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        if (nums.length == 0)
			return nums;
		List<Integer> ll = new ArrayList<Integer>();
		int c = 1;
		ll.add(nums[0]);
		for(int i = 1; i<nums.length;i++) {
			if(nums[i]==nums[i-1]) {
				if(c<k) {
					ll.add(nums[i]);
					c++;
				}
			}else {
				c = 1;
				ll.add(nums[i]);
			}
		}
		int [] ans = ll.stream().mapToInt(Integer::intValue).toArray();
		return ans;
    }
}